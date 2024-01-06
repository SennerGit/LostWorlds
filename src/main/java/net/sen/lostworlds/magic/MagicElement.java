//package net.sen.lostworlds.magic;
//
//import net.minecraft.resources.ResourceLocation;
//import net.sen.lostworlds.util.ScanMagicElement;
//import net.sen.lostworlds.util.ScanningManager;
//
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//
//public class MagicElement {
//    String tag;
//    MagicElement[] components;
//    int colour;
//    private String chatColour;
//    ResourceLocation image;
//    int blend;
//
//    public static HashMap<Integer, MagicElement> mixList = new HashMap<Integer, MagicElement>();
//
//    public MagicElement(String tag, int colour, MagicElement[] components, ResourceLocation image, int blend) {
//        if (magicElements.containsKey(tag)) throw new IllegalArgumentException(tag + " already registered!");
//        this.tag = tag;
//        this.components = components;
//        this.colour = colour;
//        this.image = image;
//        this.blend = blend;
//        magicElements.put(tag, this);
//        ScanningManager.addScannableThing(new ScanMagicElement(this));
//        if (components != null) {
////            int h = (components[0].getTag() + components[1].getTag()).hashCode();
////            mixList.put(h, this);
//        }
//    }
//
//    public static LinkedHashMap<String, MagicElement> magicElements = new LinkedHashMap<String, MagicElement>();
//}
