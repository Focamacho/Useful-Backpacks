package info.u_team.useful_backpacks.integration.curios.init;

import info.u_team.u_team_core.api.integration.*;
import info.u_team.u_team_core.util.registry.BusRegister;
import info.u_team.useful_backpacks.UsefulBackpacksMod;

@Integration(modid = UsefulBackpacksMod.MODID, integration = "curios")
public class CuriosIntegrationCommonConstruct implements IModIntegration {
	
	@Override
	public void construct() {
		BusRegister.registerMod(CuriosIntegrationModComms::registerMod);
		BusRegister.registerMod(CuriosIntegrationNetwork::registerMod);
		
		BusRegister.registerForge(CuriosIntegrationCapabilities::registerForge);
	}
	
}
