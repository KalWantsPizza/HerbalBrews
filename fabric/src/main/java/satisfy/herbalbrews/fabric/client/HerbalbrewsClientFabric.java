package satisfy.herbalbrews.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import satisfy.herbalbrews.client.HerbalbrewsClient;
import satisfy.herbalbrews.registry.ObjectRegistry;

public class HerbalbrewsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HerbalbrewsClient.preInitClient();
        HerbalbrewsClient.initClient();

        ArmorRenderer.register(new HatArmorRenderer(), ObjectRegistry.TOP_HAT.get(), ObjectRegistry.WITCH_HAT.get());
    }
}
