package net.sen.lostworlds.util.tools;

public class SlotsVector {
    private int slotId;
    private int posX;
    private int posY;

    public SlotsVector(int slotId, int posX, int posY) {
        this.slotId = slotId;
        this.posX = posX;
        this.posY = posY;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
