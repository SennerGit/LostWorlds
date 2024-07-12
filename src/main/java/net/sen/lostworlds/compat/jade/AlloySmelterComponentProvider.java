//package net.sen.lostworlds.compat.jade;
//
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.nbt.ListTag;
//import net.minecraft.nbt.Tag;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.phys.Vec2;
//import net.sen.lostworlds.api.LostWorldsApi;
//import snownee.jade.api.BlockAccessor;
//import snownee.jade.api.IBlockComponentProvider;
//import snownee.jade.api.IServerDataProvider;
//import snownee.jade.api.ITooltip;
//import snownee.jade.api.config.IPluginConfig;
//import snownee.jade.api.ui.IElement;
//import snownee.jade.api.ui.IElementHelper;
//
//public enum AlloySmelterComponentProvider implements IBlockComponentProvider, IServerDataProvider<BlockAccessor> {
//    INSTANCE;
//
//    public static final ResourceLocation UID = LostWorldsApi.modLoc("alloy_smelter");
//
//    @Override
//    public void appendTooltip(ITooltip iTooltip, BlockAccessor blockAccessor, IPluginConfig iPluginConfig) {
//        CompoundTag data = blockAccessor.getServerData();
//
//        if (data.contains("progress")) {
//            IElementHelper elements = iTooltip.getElementHelper();
//            IElement icon = elements.item(new ItemStack(Items.CLOCK), 0.5f).size(new Vec2(10, 10)).translate(new Vec2(0, -1));
//            icon.message(null);
//            iTooltip.add(icon);
//            iTooltip.append(Component.translatable("lostworlds.alloy.fuel", data.getInt("progress")));
//        }
//    }
//
//    @Override
//    public ResourceLocation getUid() {
//        return UID;
//    }
//
//    @Override
//    public void appendServerData(CompoundTag compoundTag, BlockAccessor blockAccessor) {
//
//    }
//}
