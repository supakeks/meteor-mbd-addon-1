package meteordevelopment.addons.mountbypassdupe;

import minegame159.meteorclient.MeteorAddon;
import minegame159.meteorclient.MeteorClient;
import minegame159.meteorclient.systems.modules.Modules;

public class MountBypassDupeAddon extends MeteorAddon {

	@Override
	public void onInitialize() {
		MeteorClient.LOG.info("Initializing Mount Bypass Dupe Addon");
		Modules.get().add(new AutoMountBypassDupe());
	}

}