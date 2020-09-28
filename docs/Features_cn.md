- # TISCM 特性列表

------

[English](https://github.com/TISUnion/TISCarpet113/blob/TIS-Server/docs/Features.md)

**注意**：此处的功能列表并不完整，可能有原版 carpet 或者正在开发中的功能没有增加

------

# 功能

> `/carpet <CommandName> <Value>`

## commandPing

启用`/ping`指令来获取你的ping值

默认值： `true`

选项：`false`, `true`

分类：creative

## dragonCrashFix

修复了末影龙 AI 中导致崩服的无限循环

默认值： `false`

选项：`false`, `true`

分类：bugfix

## optimizeVoxelCode

优化了 voxel 部分的代码

默认值： `false`

选项：`false`, `true`

分类：optimization

## chunkCache

由 PhiPro 写的区块缓存代码

默认值： `false`

选项：`false`, `true`

分类：optimization

## entityMomentumLoss

关闭/启用加载区块时速度超过 10m/gt 实体的速度丢失

默认值： `true`

选项：`false`, `true`

分类：experimental

## stainedGlassNoMapRendering

关闭地图上渲染染色玻璃

默认值： `false`

选项：`false`, `true`

分类：experimental

## cacheExplosions

爆炸缓存，对珍珠炮等情况优化巨大

默认值： `false`

选项：`false`, `true`

分类：optimization

## missingLightFix

将光照变化过的子区块视作非空子区块，以修复浮空建筑下的黑影等bug

默认值： `false`

选项：`false`, `true`

分类：experimental, BUGFIX

## newLight

由 PhiPro 写的更好的光照代码，即 NewLight mod

由 Salandora 移植到 1.13！

默认值： `false`

选项：`false`, `true`

分类：experimental, optimization

## portalSuperCache

目前最高效的地狱门优化

**对 fillUpdate=false 时创建的地狱门方块无效**

默认值： `false`

选项：`false`, `true`

分类：experimental, optimization

## microtick

**仅在分支 `MicroTick-Logger` 中，[build152](https://github.com/TISUnion/TISCarpet113/releases/tag/build152) 是最后的具有其的构建**

启用 `/log microtick` 的功能

使用羊毛块来输出红石元件的动作与方块更新

使用 `/log microtick` 来启动记录

末地烛会检测方块更新，红石元件会输出它们的动作

- 侦测器、活塞、末地烛：指向羊毛块

- 中继器、比较器、铁轨、按钮等：放置在羊毛块上

默认值： `false`

选项：`false`, `true`

分类：command, creative

## structureBlockLimit

覆写结构方块的大小限制

当相对位置的值大于 32 时客户端里结构的位置可能会错误地显示

默认值： `32`

选项：`32`, `64`, `96`, `128`

分类：creative

## optimizedInventories

优化漏斗与投掷器跟箱子的互动

感谢: skyrising (Quickcarpet)

默认值: `false`

选项: `false`, `true`

分类: experimental, optimization

## xpTrackingDistance

修改经验球检测并追踪玩家的距离

将其调至 0 以禁用追踪

默认值: `8`

选项: `0`, `1`, `8`, `32`

分类: creative

## elytraDeploymentFix

优化鞘翅的展开

代码来自 1.15，这是 `MC-111444` 的修复

默认值: `false`

选项: `false`, `true`

分类: experimental, bugfix

## explosionRandomSizeRatio

将 `doExplosionA` 中爆炸射线的随机比率设为一个固定值

根据原版表现，这个值应该在 `0.7` 至 `1.3` 间。将它设为 `-1` 以禁用比率覆盖

默认值: `-1`

选项: `-1`, `0.7`, `1`, `1.3`

分类: creative

## totallyNoBlockUpdate

禁止方块更新

默认值: `false`

选项: `false`, `true`

分类: creative

## commandEPSTest

启用用于性能测试的 `/epsTest`

默认值: `false`

选项: `false`, `true`

分类: command


## blockEventPacketRange

设置会在方块事件成功执行后收到数据包的玩家范围

对于活塞而言，这一个数据包是用于显示活塞移动的话。把这个值调小以减小客户端卡顿

默认值: `64`

选项: `0`, `16`, `64`, `128`

分类: optimization

## tntFuseDuration

覆盖 TNT 的默认点燃时长

这也会影响被爆炸点燃的 TNT 的点燃时长

默认值: `80`

选项: `0`, `80`, `32767`

分类: creative

## opPlayerNoCheat

禁用部分指令以避免op玩家意外地作弊

影响的指令列表：`/gamemode`, `/tp`, `/teleport`, `/give`, `/setblock`, `/summon`

默认值: `false`

选项: `false`, `true`

选项: survival

## hopperCountersUnlimitedSpeed

当漏斗指向羊毛方块时，漏斗将拥有无限的物品吸取以及传输速度

仅当hopperCounters开启时有效

Default: `false`

Options: `false`, `true`

Categories: creative

## YEET

**Warn**: all yeet options will change vanilla behaviour, they WILL NOT behave like vanilla

**警告**：所有的yeet选项都会改变原版的特性，它们的行为不会表现得跟原版一致！

### yeetFishAI

去掉实体鱼造成巨大卡顿的followGroupLeaderAI

默认值： `false`

选项：`false`, `true`

分类：yeet

### yeetGolemSpawn

跳过铁傀儡生成使小墨的14k刷铁塔堆叠更快

默认值： `false`

选项：`false`, `true`

分类：yeet

### yeetVillagerAi

去掉部分村民ai使14k刷铁塔堆叠更快

默认值： `false`

选项：`false`, `true`

分类：yeet

### yeetKickedForSpam

去掉当玩家发送消息过快时，玩家被因滥发消息而踢出游戏的特性

默认值： `false`

选项：`false`, `true`

分类：yeet

------

# 记录器

- 保存记录器状态信息，以便在重启服务器后自动加载未关闭的记录器

> `/log <LoggerName> [<Option>]`

## projectiles

增加撞击点显示

选项：`brief`, `full`, `visualize`

### visualize

投掷物可视化记录器

## chunkdebug

区块加载/卸载记录器

选项：无

##  villagecount

于 tab 列表中显示村庄数量

选项：无

## tileentitylist

**仅在分支 `MicroTick-Logger` 中**

方块实体列表记录器，记录方块实体从 `World` 的 `loadedTileEntityList` 中添加或删除

选项：无

## microtick

**仅在分支 `MicroTick-Logger` 中**

使用羊毛方块来记录红石元件的动作以及方块更新。输入 `/carpet microTick` 以获得更多信息

选项：`all`, `unique`

### all

输出所有信息，默认状态

### unique

仅输出不同的信息，如果你不想被红石粉刷屏的话可以开

## autosave

在自动保存触发时告知玩家

选项：无

------

# 指令

## epsTest

触发一个长为 2 分钟的基于爆炸的性能测试。完成时将会输出服务器每秒可处理的爆炸数，也就是 Explosion per Second (EPS)


使用 `/carpet commandEPSTest` 来启用 / 禁用此命令

------

# 特性

## 破基岩统计项

在一个基岩被活塞或粘性活塞破除时触发，为十米内离被破坏的基岩最近的玩家的该统计项 +1

统计项名为 `custom` 分类下的 `break_bedrock`

------

# 修复

对原版 CarpetMod 的修复

- 修复了使用 `/player` 指令时没有限制名字长度的问题（过长的名字会使所有人都不能进入服务器）
- 移除仙人掌扳手修改拉杆的功能

-----

# Lithium mod 移植

移植并启用了部分的 [Lithium mod](https://github.com/jellysquid3/lithium-fabric) 的实现：

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
