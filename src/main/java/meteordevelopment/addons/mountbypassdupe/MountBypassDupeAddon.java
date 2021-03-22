package meteordevelopment.addons.mountbypassdupe;

import minegame159.meteorclient.MeteorAddon;
import minegame159.meteorclient.MeteorClient;
import minegame159.meteorclient.modules.Category;
import minegame159.meteorclient.modules.Modules;
import minegame159.meteorclient.modules.world.AutoMountBypassDupe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MountBypassDupeAddon extends MeteorAddon {

	@Override
	public void onInitialize() {
		MeteorClient.LOG.info("Initializing Mount Bypass Dupe Addon");
		Modules.get().add(new AutoMountBypassDupe());
	}

}