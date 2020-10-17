package carpet.microtick.enums;

import carpet.microtick.MicroTickLoggerManager;

public enum TickStage
{
	SPAWNING("Spawning", true),
	CHUNK_UNLOADING("ChunkUnloading", true),
	SPAWNING_SPECIAL("SpawningSpecial", true),
	WORLD_BORDER("WorldBorder", true),
	TILE_TICK("TileTick", true),
	PLAYER_CHUNK_MAP("PlayerChunkMap", true),
	VILLAGE("Village", true),
	PORTAL_FORCER("PortalForcer", true),
	NEW_LIGHT("NewLight", true),
	RAID("Raid", true),
	WANDERING_TRADER("WanderingTrader", true),
	BLOCK_EVENT("BlockEvent", true),
	ENTITY("Entity", true),
	RANDOMTICK_CLIMATE("RandomTick&Climate", true),
	TILE_ENTITY("TileEntity", true),
	AUTO_SAVE("AutoSave", false),
	PLAYER_ACTION("PlayerAction", false),
	COMMAND_FUNCTION("CommandFunction", false),
	NETWORK("Network", false);

	private final String name;
	private final boolean insideWorld;

	TickStage(String name, boolean insideWorld)
	{
		this.name = name;
		this.insideWorld = insideWorld;
	}

	@Override
	public String toString()
	{
		return this.getName();
	}

	public String getName()
	{
		return name;
	}

	public String tr()
	{
		return MicroTickLoggerManager.tr("stage." + this.name, this.name);
	}

	public boolean isInsideWorld()
	{
		return insideWorld;
	}
}