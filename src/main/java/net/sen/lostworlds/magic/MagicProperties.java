package net.sen.lostworlds.magic;

public class MagicProperties {
    MagicElementTypeEnum[] magicElementTypeEnum;

    MagicProperties(MagicProperties.Builder builder) {
        this.magicElementTypeEnum = builder.magicElementTypeEnum;
    }

    public static class Builder {
        MagicElementTypeEnum[] magicElementTypeEnum;
        int count;

        public MagicProperties.Builder addMagicType(MagicElementTypeEnum magicElementTypeEnum) {
            this.magicElementTypeEnum[count] = magicElementTypeEnum;
            count++;
            return this;
        }

        public MagicProperties build() {
            return new MagicProperties(this);
        }
    }
}
