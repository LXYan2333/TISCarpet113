# TISCM Features

------

[中文](https://github.com/TISUnion/TISCarpet113/blob/TIS-Server/docs/Features_cn.md)

**Notice**: Features here maybe incomplete, some features in original carpet or developing features may not appear here

------

# Features

> `/carpet <CommandName> <Value>`

## commandPing

Enables `/ping` command to see your ping

Default: `true`

Options: `false`, `true`

Categories: creative

## dragonCrashFix

fix infinite loop in dragon AI causing server crash

Default: `false`

Options: `false`, `true`

Categories: bugfix

## optimizeVoxelCode

optimizes the voxel code which is used by e.g. the entity movement

Default: `false`

Options: `false`, `true`

Categories: optimization

## chunkCache

Improved chunk caching by PhiPro

Default: `false`

Options: `false`, `true`

Categories: optimization

## entityMomentumLoss

Disable/Enable the entity momentum cancellation if its above 10 blocks per gametick when reading the data out of disk

Default: `true`

Options: `false`, `true`

Categories: experimental

## stainedGlassNoMapRendering

Disable the rendering of stained glass on maps

Default: `false`

Options: `false`, `true`

Categories: experimental

## cacheExplosions

Caching explosions, useful for situations eg pearl cannon

Default: `false`

Options: `false`, `true`

Categories: optimization

## missingLightFix

Treat any subchunk with light changes as a not-empty subchunk to solve the missing sky / block light in empty subchunk after reloading the chunk

no more ghost shadows below giant floating buildings

Default: `false`

Options: `false`, `true`

Categories: experimental, BUGFIX

## newLight

Uses alternative lighting engine by PhiPros. AKA NewLight mod

Now Ported to 1.13 by Salandora!

Default: `false`

Options: `false`, `true`

Categories: experimental, optimization

## portalSuperCache

Greatly improve the efficiency of nether portal by LucunJi

Most powerful portal optimization ever, 10000 times faster!

**DOES NOT WORK with portals created/destroyed when fillUpdate is false**

Default: `false`

Options: `false`, `true`

Categories: experimental, optimization

## microtick

**Only in `MicroTick-Logger` branch, [build152](https://github.com/TISUnion/TISCarpet113/releases/tag/build152) is the latestet release with it**

Enable the function of `/log micirotick`

Display actions of redstone components and blockupdates with wool block

Use `/log microtick` to start logging

endrods will detect block updates and redstone components will show their actions

- observer, piston, endrod: pointing towards wool

- repeater, comparator, rail, button, etc.: placed on wool

Default: `false`

Options: `false`, `true`

Categories: command, creative

## structureBlockLimit

Overwrite the size limit of structure block

Relative position might display wrongly on client side if it's larger than 32

Default: `32`

Options: `32`, `64`, `96`, `128`

Categories: creative

## optimizedInventories

Optimizes hoppers and droppers interacting with chests

Credits: skyrising (Quickcarpet)

Default: `false`

Options: `false`, `true`

Categories: experimental, optimization

## xpTrackingDistance

Overwrite the tracking distance of xp orb

Change it to 0 to disable tracking

Default: `8`

Options: `0`, `1`, `8`, `32`

Categories: creative

## elytraDeploymentFix

Optimized Elytra deployment

Code from 1.15. Fixes MC-111444

Default: `false`

Options: `false`, `true`

Categories: experimental, bugfix

## explosionRandomSizeRatio

Set the random size ratio in `doExplosionA` to a fixed value

The value should be between 0.7 and 1.3 as vanilla behavior. Set it to -1 to disable overriding

Default: `-1`

Options: `-1`, `0.7`, `1`, `1.3`

Categories: creative

## totallyNoBlockUpdate

Ban block updates

Default: `false`

Options: `false`, `true`

Categories: creative

## commandEPSTest

Enables `/epsTest` for performance tests

Default: `false`

Options: `false`, `true`

Categories: command

## blockEventPacketRange

Set the range where player will receive a block event packet after a block event fires successfully
            
For piston the packet is used to render the piston movement animation. Decrease it to reduce client's lag

Default: `64`

Options: `0`, `16`, `64`, `128`

Categories: optimization

## tntFuseDuration

Overwrite the default fuse duration of TNT
            
This might also affects the fuse duration of TNT ignited in explosion

Default: `80`

Options: `0`, `80`, `32767`

Categories: creative

## opPlayerNoCheat

Disable some command to prevent accidentally cheating

Affects command list: `/gamemode`, `/tp`, `/teleport`, `/give`, `/setblock`, `/summon`

Default: `false`

Options: `false`, `true`

Categories: survival

## hopperCountersUnlimitedSpeed

Make hopper pointing towards wool has infinity speed to suck in or transfer items

Only works when hopperCounters option in Carpet Mod is on

Default: `false`

Options: `false`, `true`

Categories: creative

## YEET

**Warn**: all yeet options will change vanilla behaviour, they WILL NOT behave like vanilla

### yeetFishAI

yeet fish followGroupLeaderAI for less lag

Default: `false`

Options: `false`, `true`

Categories: yeet

### yeetGolemSpawn

yeet Golems spawning at village for faster stacking at 14k iron farm test

Default: `false`

Options: `false`, `true`

Categories: yeet

### yeetVillagerAi

yeet villager ai for faster stacking at 14k iron farm test

Default: `false`

Options: `false`, `true`

Categories: yeet

### yeetKickedForSpam

yeet kicking players from the server from spamming messages

Default: `false`

Options: `false`, `true`

Categories: yeet

------

# Loggers

- Store logger status to automatically load unclosed loggers after reboot

> `/log <LoggerName> [<Option>]`

## projectiles

added hit point

Options: `brief`, `full`, `visualize`

### visualize

visual logger for projectiles

## chunkdebug

Log chunk loading / unloading

Options: none

##  villagecount

log village count on tab list

Options: none

## tileentitylist

**Only in `MicroTick-Logger` branch**

log when a tile entity is added to or removed from `World`'s `loadedTileEntityList`

Options: none

## microtick

**Only in `MicroTick-Logger` branch**

Display actions of redstone components and blockupdates with wool block. Type `/carpet microTick` for more detail

Options: `all`, `unique`

### all

Output all messages, default stats

### unique

Only output unique messages. Turn it on if you don't want to be spammed by redstone dusts

## autosave

Inform the player when the auto save trigger

Options: none

------

# Features

## Stat for breaking bedrock

When a bedrock is deleted by piston or sticky piston, the nearest player to the bedrock with 10m will +1 stat

The stat name is `break_bedrock` in `custom` catalogory

------

# Commands

## epsTest

`/epsTest [<duration>]`

Trigger a `<duration>` (default: `30`) seconds long explosion performance test. When it finishes it will output the number of explosions which the server can process every second, aka Explosion per Second (EPS)

Use `/carpet commandEPSTest` to enable / disable this command

------

# Fixes

Fixes for original CarpetMod

- fix no username length limit with `/player` command (long name will make everyone cannot enter the server) 
- remove lever modification ability from flippinCactus

-----

# Lithium mod porting

Ports and enable part of implementations of [Lithium mod](https://github.com/jellysquid3/lithium-fabric):

- alloc.entity_tracker
- alloc.enum_values
- block.piston_shapes
- cached_hashcode
- math.fast_util
- shapes.precompute_shape_arrays
- shapes.shape_merging
- world.block_entity_ticking
- world.explosions
- world.tick_scheduler
