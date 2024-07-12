package net.sen.lostworlds.item.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.gameevent.GameEvent;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.ModEntities;
import net.minecraft.world.level.material.Fluid;
import net.sen.lostworlds.entity.variant.ClownfishVariant;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/*
Alex Mods
https://github.com/AlexModGuy/AlexsMobs/blob/c466c07ad10e7f906293b39f0d56e39b75099e51/src/main/java/com/github/alexthe666/alexsmobs/item/ItemModFishBucket.java#L33
 */
public class ModFishBucket extends BucketItem {
    private static final MapCodec<TropicalFish.Variant> VARIANT_FIELD_CODEC = TropicalFish.Variant.CODEC.fieldOf("BucketVariantTag");
    private final EntityType<?> type;
    private final SoundEvent emptySound = SoundEvents.BUCKET_EMPTY_FISH;
    public ModFishBucket(EntityType<?> type, Fluid pContent, Properties builder) {
        super(pContent, builder.stacksTo(1));
        this.type = type;
    }

    @Override
    public void checkExtraContent(@javax.annotation.Nullable Player pPlayer, Level pLevel, ItemStack pContainerStack, BlockPos pPos) {
        if (pLevel instanceof ServerLevel) {
            this.spawn((ServerLevel)pLevel, pContainerStack, pPos);
            pLevel.gameEvent(pPlayer, GameEvent.ENTITY_PLACE, pPos);
        }
    }

    @Override
    protected void playEmptySound(@Nullable Player pPlayer, LevelAccessor pLevel, BlockPos pPos) {
        pLevel.playSound(pPlayer, pPos, this.emptySound, SoundSource.NEUTRAL, 1.0F, 1.0F);
    }

    private void spawn(ServerLevel pServerLevel, ItemStack pBucketedMobStack, BlockPos pPos) {
        if (this.type.spawn(pServerLevel, pBucketedMobStack, null, pPos, MobSpawnType.BUCKET, true, false) instanceof Bucketable bucketable) {
            CustomData customdata = pBucketedMobStack.getOrDefault(DataComponents.BUCKET_ENTITY_DATA, CustomData.EMPTY);
            bucketable.loadFromBucketTag(customdata.copyTag());
            bucketable.setFromBucket(true);
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (this.type == EntityType.TROPICAL_FISH) {
            CustomData customdata = pStack.getOrDefault(DataComponents.BUCKET_ENTITY_DATA, CustomData.EMPTY);
            if (customdata.isEmpty()) {
                return;
            }

            Optional<TropicalFish.Variant> optional = customdata.read(VARIANT_FIELD_CODEC).result();
            if (optional.isPresent()) {
                TropicalFish.Variant tropicalfish$variant = optional.get();
                ChatFormatting[] achatformatting = new ChatFormatting[]{ChatFormatting.ITALIC, ChatFormatting.GRAY};
                String s = "color.minecraft." + tropicalfish$variant.baseColor();
                String s1 = "color.minecraft." + tropicalfish$variant.patternColor();
                int i = TropicalFish.COMMON_VARIANTS.indexOf(tropicalfish$variant);
                if (i != -1) {
                    pTooltipComponents.add(Component.translatable(TropicalFish.getPredefinedName(i)).withStyle(achatformatting));
                    return;
                }

                pTooltipComponents.add(tropicalfish$variant.pattern().displayName().plainCopy().withStyle(achatformatting));
                MutableComponent mutablecomponent = Component.translatable(s);
                if (!s.equals(s1)) {
                    mutablecomponent.append(", ").append(Component.translatable(s1));
                }

                mutablecomponent.withStyle(achatformatting);
                pTooltipComponents.add(mutablecomponent);
            }
        }
    }
}
