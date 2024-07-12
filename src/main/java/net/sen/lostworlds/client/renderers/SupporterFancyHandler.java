//package net.sen.lostworlds.client.renderers;
//
//import com.google.gson.JsonParser;
//import com.google.gson.stream.JsonReader;
//
//import net.neoforged.api.distmarker.Dist;
//import net.neoforged.api.distmarker.OnlyIn;
//import net.neoforged.bus.api.SubscribeEvent;
//import net.neoforged.neoforge.common.NeoForge;
//import net.neoforged.neoforge.event.tick.PlayerTickEvent;
//import net.sen.lostworlds.LostWorlds;
//import net.sen.lostworlds.api.LostWorldsApi;
//
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.util.HashMap;
//import java.util.Map;
//
//@OnlyIn(Dist.CLIENT)
//public class SupporterFancyHandler {
//    public static final Map<String, FancyInfo> FANCY_INFOS = new HashMap<>();
//
//    public SupporterFancyHandler() {
//        new FetchThread();
//        NeoForge.EVENT_BUS.register(this);
//    }
//
//    @SubscribeEvent
//    public void onPlayerTick(PlayerTickEvent event) {
//
//    }
//
//    public record FancyInfo(int tier, int colour) {
//    }
//
//    public static class FetchThread extends Thread {
//        public FetchThread() {
//            this.setName(LostWorldsApi.MODID + "_support_fetcher");
//            this.setDaemon(true);
//            this.start();
//        }
//
//        @Override
//        public void run() {
//            try {
//                var url = new URL("");
//                var reader = new JsonReader(new InputStreamReader(url.openStream()));
//                var main = JsonParser.parseReader(reader).getAsJsonObject();
//
//                for (var entry : main.entrySet()) {
//                    var object = entry.getValue().getAsJsonObject();
//                    var tier = object.get("tier").getAsInt();
//                    var colour = object.has("colour") ? Integer.parseInt(object.get("colour").getAsString(), 16) : 0;
//                    SupporterFancyHandler.FANCY_INFOS.put(entry.getKey(), new FancyInfo(tier, colour));
//                }
//
//                reader.close();
//            } catch (Exception e) {
//                LostWorlds.LOGGER.warn("Fetching supporter information failed", e);
//            }
//        }
//    }
//}
