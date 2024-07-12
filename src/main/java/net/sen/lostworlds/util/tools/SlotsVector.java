package net.sen.lostworlds.util.tools;

public class SlotsVector {
    private int slotId;
    private String name;
    private int posX;
    private int posY;

    public SlotsVector(int slotId, int posX, int posY) {
        this.slotId = slotId;
//        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
