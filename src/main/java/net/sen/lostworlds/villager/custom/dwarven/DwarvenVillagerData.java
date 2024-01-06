package net.sen.lostworlds.villager.custom.dwarven;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.registries.BuiltInRegistries;

public class DwarvenVillagerData {
    public static final int MIN_VILLAGER_LEVEL = 1;
    public static final int MAX_VILLAGER_LEVEL = 5;
    private static final int[] NEXT_LEVEL_XP_THRESHOLDS = new int[]{0, 10, 70, 150, 250};
    public static final Codec<DwarvenVillagerData> CODEC = RecordCodecBuilder.create((p_258961_) -> {
//        return p_258961_.group(BuiltInRegistries.VILLAGER_TYPE.byNameCodec().fieldOf("type").orElseGet(() -> {
//            return DwarvenVillagerType.PLAINS;
//        }).forGetter((p_150024_) -> {
//            return p_150024_.type;
//        }), BuiltInRegistries.VILLAGER_PROFESSION.byNameCodec().fieldOf("profession").orElseGet(() -> {
//            return DwarvenVillagerProfessionsFactory.NONE;
//        }).forGetter((p_150022_) -> {
//            return p_150022_.profession;
//        }), Codec.INT.fieldOf("level").orElse(1).forGetter((p_150020_) -> {
//            return p_150020_.level;
//        })).apply(p_258961_, DwarvenVillagerData::new);
        return null;
    });
    private final DwarvenVillagerType type;
    private final DwarvenVillagerProfessionsFactory profession;
    private final int level;

    public DwarvenVillagerData(DwarvenVillagerType p_35557_, DwarvenVillagerProfessionsFactory p_35558_, int p_35559_) {
        this.type = p_35557_;
        this.profession = p_35558_;
        this.level = Math.max(1, p_35559_);
    }

    public DwarvenVillagerType getType() {
        return this.type;
    }

    public DwarvenVillagerProfessionsFactory getProfession() {
        return this.profession;
    }

    public int getLevel() {
        return this.level;
    }

    public DwarvenVillagerData setType(DwarvenVillagerType pType) {
        return new DwarvenVillagerData(pType, this.profession, this.level);
    }

    public DwarvenVillagerData setProfession(DwarvenVillagerProfessionsFactory pProfession) {
        return new DwarvenVillagerData(this.type, pProfession, this.level);
    }

    public DwarvenVillagerData setLevel(int pLevel) {
        return new DwarvenVillagerData(this.type, this.profession, pLevel);
    }

    public static int getMinXpPerLevel(int pLevel) {
        return canLevelUp(pLevel) ? NEXT_LEVEL_XP_THRESHOLDS[pLevel - 1] : 0;
    }

    public static int getMaxXpPerLevel(int pLevel) {
        return canLevelUp(pLevel) ? NEXT_LEVEL_XP_THRESHOLDS[pLevel] : 0;
    }

    public static boolean canLevelUp(int pLevel) {
        return pLevel >= 1 && pLevel < 5;
    }
}
