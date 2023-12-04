package net.sen.lostworlds.entity.ai;

/*
From AlexModGuy
https://github.com/AlexModGuy/AlexsMobs/blob/1.20/src/main/java/com/github/alexthe666/alexsmobs/entity/ai/AquaticMoveController.java#L11
 */
public interface ISemiAquatic {
    boolean shouldEnterWater();

    boolean shouldLeaveWater();

    boolean shouldStopMoving();

    int getWaterSearchRange();
}
