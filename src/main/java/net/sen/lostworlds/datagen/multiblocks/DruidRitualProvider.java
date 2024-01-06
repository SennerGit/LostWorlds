/*
 * MIT License
 *
 * Copyright 2021 vemerion
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

/*
CODE INSPIRED AND SOME TAKEN FROM:
    Klikli-dev
    Occultism
    https://github.com/klikli-dev/occultism/blob/version/1.20.1/src/main/java/com/klikli_dev/occultism/datagen/PentacleProvider.java
 */

package net.sen.lostworlds.datagen.multiblocks;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.ResourceLocation;
import com.klikli_dev.modonomicon.data.MultiblockDataManager;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
public class DruidRitualProvider implements DataProvider {
    private static final Logger LOGGER = LogManager.getLogger();

    private final Map<String, JsonElement> toSerialize = new HashMap<>();
    private final DataGenerator generator;

    public DruidRitualProvider(DataGenerator generator) {
        this.generator = generator;
    }

    private void start() {
        this.addRitual("test",
                this.createPattern(
                        "",
                        ""
                ),
                new MappingBuilder()
                        .define('d', ModBlocks.CRIMSON_COBBLESTONE_SLAB.get())
                        .build()
        );
    }

    private List<String> createPattern(String... rows) {
        List<String> pattern = new ArrayList<>();

        for (String row : rows) {
            pattern.add(row.replace(" ", "_"));
        }

        return pattern;
    }

    private void addRitual(String name, List<String> pattern, Map<Character, JsonElement> mappings) {
        this.addRitual(LostWorldsConstants.modLoc("name"), pattern, mappings);
    }

    private void addRitual(ResourceLocation resourceLocation, List<String> pattern, Map<Character, JsonElement> mappings) {
        JsonObject json = new JsonObject();

        json.addProperty("type", "modonomicon:dense");

        JsonArray outerPattern = new JsonArray();
        JsonArray innerPattern = new JsonArray();

        for (String row : pattern)
            innerPattern.add(row);
        outerPattern.add(innerPattern); //modonomicon multiblocks may have multiple layers, but we use only one

        JsonArray ground = new JsonArray();
        for (int i = 0; i < pattern.size(); i++) {
            var row = "";
            for (int j = 0; j < pattern.get(i).length(); j++) {
                //create a checkerbord, alternatively adding "*" and "+" to the row
                if ((i + j) % 2 == 0)
                    row += "*";
                else
                    row += "+";
            }
            ground.add(row);
        }
        outerPattern.add(ground);

        json.add("pattern", outerPattern);

        JsonObject jsonMapping = new JsonObject();
        for (Entry<Character, JsonElement> entry : mappings.entrySet())
            jsonMapping.add(String.valueOf(entry.getKey()), entry.getValue());
        json.add("mapping", jsonMapping);

        this.toSerialize.put(resourceLocation.getPath(), json);
    }

    @Override
    public CompletableFuture<?> run(CachedOutput pOutput) {
        List<CompletableFuture<?>> futures = new ArrayList<>();

        Path folder = this.generator.getPackOutput().getOutputFolder();

        this.start();

        this.toSerialize.forEach((name, json) -> {
            Path path = folder.resolve("data/" + LostWorldsConstants.MODID + "/" + name + ".json");
            futures.add(DataProvider.saveStable(pOutput, json, path));
        });

        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    @Override
    public String getName() {
        return "druid_rituals: " + LostWorldsConstants.MODID;
    }

    private static class MappingBuilder {
        private final Map<Character, JsonElement> mappings = new HashMap<>();

        public MappingBuilder() {
            this.ground(); //always map ground
        }

        private MappingBuilder element(char c, JsonElement e) {
            this.mappings.put(c, e);
            return this;
        }

        private Map<Character, JsonElement> build() {
            return this.mappings;
        }

        private MappingBuilder block(char c, Supplier<? extends Block> b) {
            JsonObject json = new JsonObject();
            json.addProperty("type", "modonomicon:block");
            json.addProperty("block", ForgeRegistries.BLOCKS.getKey(b.get()).toString());

            return this.element(c, json);
        }

        private MappingBuilder blockDisplay(char c, Supplier<? extends Block> b, Supplier<? extends Block> display) {
            JsonObject json = new JsonObject();
            json.addProperty("type", "modonomicon:block");
            json.addProperty("block", ForgeRegistries.BLOCKS.getKey(b.get()).toString());
            json.addProperty("display", ForgeRegistries.BLOCKS.getKey(display.get()).toString());

            return this.element(c, json);
        }

        private MappingBuilder display(char c, Supplier<? extends Block> display) {
            JsonObject json = new JsonObject();
            json.addProperty("type", "modonomicon:block");
            json.addProperty("display", ForgeRegistries.BLOCKS.getKey(display.get()).toString());

            return this.element(c, json);
        }

        private MappingBuilder tag(char c, TagKey<Block> tag) {
            JsonObject json = new JsonObject();

            json.addProperty("type", "modonomicon:tag");
            json.addProperty("tag", "#" + tag.location());
            return this.element(c, json);
        }

        private MappingBuilder ground() {
            return this.display('+', () -> Blocks.STONE);
        }

        private MappingBuilder define(Character c, Block b) {
            return this.block(c, () -> b);
        }
    }
}
