package net.sen.lostworlds.magic;

import java.util.ArrayList;
import java.util.List;

public class MagicProperties {
     List<MagicElementTypeEnum> magicElementTypeEnum;

    MagicProperties(MagicProperties.Builder builder) {
        this.magicElementTypeEnum = builder.magicElementTypeEnum;
    }

    public List<MagicElementTypeEnum> getMagicElementTypeEnum() {
        return magicElementTypeEnum;
    }

    public static class Builder {
        List<MagicElementTypeEnum> magicElementTypeEnum = new ArrayList<>();

        public MagicProperties.Builder addMagicType(MagicElementTypeEnum magicElementTypeEnum) {
            this.magicElementTypeEnum.add(magicElementTypeEnum);
            return this;
        }

        public List<MagicElementTypeEnum> getMagicElementTypeEnum() {
            return magicElementTypeEnum;
        }

        public void setMagicElementTypeEnum(List<MagicElementTypeEnum> magicElementTypeEnum) {
            this.magicElementTypeEnum = magicElementTypeEnum;
        }

        public int getMagicElementTypeSize() {
            return getMagicElementTypeEnum().size();
        }

        public MagicProperties build() {
            return new MagicProperties(this);
        }
    }
}
