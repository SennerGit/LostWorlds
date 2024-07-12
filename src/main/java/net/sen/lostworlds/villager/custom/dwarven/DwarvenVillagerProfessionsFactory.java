package net.sen.lostworlds.villager.custom.dwarven;

import com.google.common.collect.ImmutableSet;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.PoiTypeTags;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class DwarvenVillagerProfessionsFactory {
    String name;
    Predicate<Holder<PoiType>> heldJobSite;
    Predicate<Holder<PoiType>> acquirableJobSite;
    ImmutableSet<Item> requestedItems;
    ImmutableSet<Block> secondaryPoi;
    SoundEvent workSound;
    public DwarvenVillagerProfessionsFactory(String name, Predicate<Holder<PoiType>> heldJobSite, Predicate<Holder<PoiType>> acquirableJobSite, ImmutableSet<Item> requestedItems, ImmutableSet<Block> secondaryPoi, @Nullable SoundEvent workSound) {
        this.name = name;
        this.heldJobSite = heldJobSite;
        this.acquirableJobSite = acquirableJobSite;
        this.requestedItems = requestedItems;
        this.secondaryPoi = secondaryPoi;
        this.workSound = workSound;
    }

    public static final Predicate<Holder<PoiType>> ALL_ACQUIRABLE_JOBS = (p_238239_) -> {
        return p_238239_.is(PoiTypeTags.ACQUIRABLE_JOB_SITE);
    };

    public String toString() {
        return this.name;
    }

//    private static DwarvenVillagerProfessionsFactory register(String pName, ResourceKey<PoiType> pJobSite, @Nullable SoundEvent pWorkSound) {
//        return register(pName, (p_219668_) -> {
//            return p_219668_.is(pJobSite);
//        }, (p_219640_) -> {
//            return p_219640_.is(pJobSite);
//        }, pWorkSound);
//    }
//
//    private static DwarvenVillagerProfessionsFactory register(String pName, Predicate<Holder<PoiType>> pHeldJobSite, Predicate<Holder<PoiType>> pAcquirableJobSites, @Nullable SoundEvent pWorkSound) {
//        return register(pName, pHeldJobSite, pAcquirableJobSites, ImmutableSet.of(), ImmutableSet.of(), pWorkSound);
//    }
//
//    private static DwarvenVillagerProfessionsFactory register(String pName, ResourceKey<PoiType> pJobSite, ImmutableSet<Item> pRequestedItems, ImmutableSet<Block> pSecondaryPoi, @Nullable SoundEvent pWorkSound) {
//        return register(pName, (p_238234_) -> {
//            return p_238234_.is(pJobSite);
//        }, (p_238237_) -> {
//            return p_238237_.is(pJobSite);
//        }, pRequestedItems, pSecondaryPoi, pWorkSound);
//    }
//
//    private static DwarvenVillagerProfessionsFactory register(String pName, Predicate<Holder<PoiType>> pHeldJobSite, Predicate<Holder<PoiType>> pAcquirableJobSites, ImmutableSet<Item> pRequestedItems, ImmutableSet<Block> pSecondaryPoi, @Nullable SoundEvent pWorkSound) {
//        return Registry.register(
//                ModDwarvenVillagers.DWARVEN_VILLAGER_PROFESSIONS.getRegistryKey(),
//                new ResourceLocation(pName),
//                new DwarvenVillagerProfessionsFactory(
//                        pName,
//                        pHeldJobSite,
//                        pAcquirableJobSites,
//                        pRequestedItems,
//                        pSecondaryPoi,
//                        pWorkSound
//                )
//        );
//    }
}
