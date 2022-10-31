# 0.16.3  
Gave Palladium Natural Fire Resistance, reducing damage taken from fire sources.  
Removed outdated Lumi Lights compat, which was causing a crash (#124).  
Fixed missing raw ore tags (#126).  
Added a recipe for Flint and Steel... using Steel.  

# 0.16.2
Prevent players from dropping more experience when being killed with Experience Boost.  
Added Korean Translations (thanks gyular!).  
Fixed crashes with Terralith installed.  

# 0.16.1  
Fixes a crash on launch related to Accessors.  

# 0.16.0  
## Config changes
Configuration has changed internally.
Mythic Metals now uses owo-config, which means you no longer need Cloth as a dependency.  
Variant Configs were also removed. Since the new config file is JSON5, the new config should not break, 
although your old configuration values are not transferred.  
Please check your configuration file in order to prevent errors when updating!  

### Stormyx Re-work
Stormyx has recieved a re-work, focusing a lot more on magic protection.  
Stormyx Ore now drops a __Stormyx Shell__, which has a single use right now.  
It can be crafted into a **Stormyx Shield**. A much more durable shield which protects you slightly against Magic damage.  
You can also now put a Stormyx Block in the Carmot Staff.  
This produces a **forcefield**, which protects you and whoever is close by reflecting any projectiles.  

### Added Star Platinum Arrows  
These arrows act as stronger arrows of harming, dealing a *minimum* of 18 damage to players, and 18 healing damage towards undead.  

### Carmot Nuke Core  
You can now make a Nuke Core out of Carmot.  
Instead of destroying all the blocks in its radius, it will exclude any ores in the blast radius.
Thanks to BasiqueEvangelist for this feature!

### Orichalcum Hammer
A simple but strong mining tool, which allows you to mine blocks in a 3x3x2 area.

### Balancing Changes  
Platinum is now slightly less common in caves (discard chance up).  
Slightly increased the spawn chance of Calcite Kyber.  
Legendary Banglum Armor is now repaired with ingots instead of chunks.  
Copper Armor is now more conductible. Please be careful in thunderstorms.  
Reduced the mining level required for most storage blocks.  
Re-added Carmot to the alt recipe of Celestium Ingots.  
Increased the experience gained from smelting and blasting ores (0.2 XP -> Range between 0.7, 1.0, 1.5, 2.0 XP per smelt).  
Midas Gold can now be smelted in a regular furnace.  
Added some weight to rolls to improve Midas Gold Bartering.  
Unobtainium can now be found in Ancient City Chests.  
Palladium Boots now let you stand on top of Powder Snow.  

Increased the durability of the following armor sets (largest to smallest increase):
- Carmot
- Steel
- Kyber
- Midas Gold
- Mythril
- Hallowed
- Osmium

Increased the durability of the following tools:  
- Gilded Midas Gold Sword (800 -> 999)
- Hallowed (1739 -> 1984)
- Mythril (1445 -> 1564)

Increased the mining speed of the following tools:
- Celestium (16.9 -> 20.0)
- Mythril (14.0 -> 14.3)
- Stormyx (8.0 -> 8.5)

### Other Changes
Allow the Banglum Nuke to be ignited using a flint and steel inside a dispenser.  
Added Smooth Stone to the Midas Gold Bartering loot table.  
Improved the textures of Runite armor.  
Prometheum no longer repairs itself on client, preventing innacurate durability bars.  
Fixed an edge-case with the Hallowed Cape rendering.  
Overhauled the Mythic Metals Advancement tree.  
Made particles from Palladium Gear less obtrusive.  
**Added a warning to logs whenever Terralith is installed.**  
- Terralith uses a lot of stone variants in the overworld, like Calcite, which causes ores to spawn in unexpected places.
- Keep this in mind whenever you are using both, as I have yet to create a custom ore configuration just for Terralith.

# 0.15.4
Restored Alloy Forgery recipes (will be available natively in AF next week).  
Includes fixes from hotfixes.  
Removed armor set tags, in an attempt to fix a rarer crash.  

# 0.15.x-hotfix2
Fixed a crash related to experience dropped.  

# 0.15.x-hotfix  
Fixed an issue where broken tags allowed you to craft items for free.  

# 0.15.3  
Ported to 1.19.x.  

# 0.15.2  
Includes all the changes of 0.14.2, with one **significant** addition.  

## The Banglum Nuke  
You can now mix Banglum and Morkite blocks into a powerful bomb.  
All you need is a 3x3x3 cube made out of them, with a Banglum Nuke Core in the middle.  
An example on how to build this will be made available on the wiki following this release.  

### Other changes  
Increased the radius of the Runite Block Ability (Ice Barrage).  
Split End Starrite and Starrite into their own features. This should make End Starrite more common.  
Fixed some bad tags, causing issues with Harvest Scythes.  
Removed Magna as a dependency.  
Removed Nugget tags.  
Re-enabled Origins Compat.  


# 0.14.2
Added more effects to the Carmot Staff:
- Carmot - Heals you and everything around you for a small amount of health.  
- Midas Gold - Grants you and everyone around you Luck 2 for four minutes.  
- Runite - Barrages your enemies in ice, freezing them in place.  
- Star Platinum - Lets you swing the staff really fast.
- Beacon - Grants players in a large radius (18 blocks) a random beacon effect for 30 seconds.  
- Lapis - Doubles the experience when you kill a mob with the staff.  


### Midas Gold Overhaul  
Midas Gold recieved a ton of small changes, and is now more useful.  

You no longer need Piglib to experience the features of Midas Gold, which are:  

- Piglins being distracted by Midas Gold Items
- Piglins not attacking you while wearing Midas Gold Armor
- Bartering with Piglins using Midas Gold

There is also a custom loot table for bartering with Piglins. You will find it slightly more useful than the normal one.  

There is also a new sword: The Midas Gold Sword!  
This weapon makes Midas Gold some more milage, by giving you a nice sword that you can upgrade 
as long as you have enough gold.  
It might even change depending on how much you give it...

### Balancing changes  
Tweaked Aquarium so that both the chestplate and leggings give Respiration.  
Decreased the chance of Midas Gold spawning.  
Reduced the Carmot Armors Bonus HP (2.5 -> 2.0) and Shield Health per Piece (5 -> 4).  
Increased Star Platinums mining level (3 -> 4).  
Reduced Osmiums mining level (3 -> 2).  
Lowered the Star Platinum Block ability attack speed (3.5 -> 3.0), and made it consume 3 durability per hit.  

### Other changes
Fixed an issue with disabling funny mode.  
Changed the textures of Osmium Armor items.  
New pickaxe textures for Celestium and Metallurgium.  
Fixed a random crash when an entity was ticked without armor.  

# 0.15.1  
Fixed serverside Carmot Shield crash, and updated the Metallurgium Pickaxe texture.  

# 0.14.1
Forced the usage of owo-lib-0.7.2-no-cme (1.18.2 only).  
Updated Metallurgium Pickaxe texture.


# 0.15.0 and 0.14.0  
This update finally brings Mythic Metals to 1.19 (with an update for 1.18 too!).  
It also features an initial Carmot re-work, some new ore variants + features, and the next balance pass.  

### Carmot Re-work
Carmot is now a material that builds off Kyber gear, similar to how you upgrade Banglum.  
The armor itself now grants you extra max health (up to 5 hearts with the full set).  
It also features the Carmot Shield ability, which is a passively regenerating shield.  
It can block up to 5 incoming damage per piece (blocks up to 20 damage with the full set).  
The tools also contain some abilities.  
The sword has an extra level of looting, while the rest have an extra level of fortune.   

#### Carmot Staff  
You can now create a mystical staff out of Carmot, allowing you to channel the inner power of different metal blocks.  
Currently there are only a few blocks that react with it, which is specified in this list:  
- Iron - Fling opponents up, makes the staff stronger  
- Gold - Grant yourself luck for two minutes  
- Copper - Summon lightning on yourself  
- Bronze - Smite whoever you strike with lightning  
- Netherite - Powerful melee weapon, makes the staff much stronger  
- Metallurgium - Highest single hit damage in the entire mod

### Balance Changes  
Buffed Morkite's fuel value from 1000 to 1200 ticks (from smelting 5 to 6 items per fuel).  
Made the Blast Mining ability of Legendary Banglum respect Silk Touch.  
Fixed some inconsistent recipes with Metallurgium.  
Reduced Banglum Ore Explosion chance in overworld and with fortune, and increased it in the nether.  
Reduced the durability of the Aegis swords, and re-assigned their repair materials.  
Increased the durability of Hallowed, and Mythril tools.  
Increased the mining speed of Durasteel slightly.  
Reduced the durability of Prometheum and Bronze tools.  
Increased the chance to find Banglum Chunks and Aquarium Pearls if you have luck.  
Prometheum will no longer cancel block breaking when regaining durability.  
Star Platinum no longer requires Carmot to be crafted.  
Runite can now be found in Deepslate.  
Tightened the spawn range of Starrite, making it more common.  
The Aegis Swords now have different recipes:  
- The Sword of The Aegis is crafted from an Adamantite Sword with a Palladium block in a smithing table  
- The Blade of The Aegis is crafted from a Hallowed Sword with a Hallowed block in a smithing table  

#### Other Changes
Re-worked the Hallowed Armor model (thanks Pois1x!).  
Re-worked all durasteel assets, plus raw quadrillum (thanks Pois1x!).  
You can now make an **Adamantite Block Alloy Forge**.  
Re-implemented steel tools and armor.  
Made Unobtainium ores slightly luminous.  
Fixed a crash related to EnchantmentHelper for entities with no gear.  
Added a resource condition to validate nuggets.  
Fixed Natural Aqua Affinity not applying on tools.  
Improved the textures of Bronze and Osmium armor.  
Overhauled all armor and tool effect particles.  
Added a new armor model for Carmot (thanks Dr. Zeal!).  
The Carmot Staff texture was also made by her.  

# 0.13.1 and 0.12.2 
Fixed multiple issues with anvils, causing them to be slow to break and not drop.   
(`/reload` on older versions fixes this issue till next restart).  
- Added anvils to the `minecraft:minable/pickaxe` tag.  
- Added a new resource condition to properly validate anvils being disabled.

Fixed a settings issue with custom armor items (Hallowed, Metallurgium, Palladium, Legendary Banglum).  
Moved unused Fabric tool tags to Common.  
Added all pickaxes to the `minecraft:cluster_max_harvestables` tag.  
Fixed an issue where mining Banglum Ore could crash a server.  
Updated advancements to work better as a guide for new players.  


# 0.13.0  
Ported to 1.18.2

# 0.12.1
Fixed some issues regarding the language files not using correct translation keys.  
Fixed Banglum TNT not respecting who detonated it.  
Fixed the Smite ability not applying correctly.  
Added missing recipes for Legendary Banglum tools and smelting ores into drops.  
Increased the fuel value of Morkite in an Alloy Forge.  
Adjusted the Hallowed Helmet model slightly.  

# 0.12.0  
## MAKE A BACKUP BEFORE UPDATING TO THIS VERSION!
### Replaced EnchantGiver with a custom ability system.  
**PLEASE NOTE that these <ins>STACK</ins> with enchantments, and ignore vanilla enchantment restrictions.**

Thanks to clarenre, Kasualix and leocth for working towards the Simplified Chinese (zh_ch) translation! 

### Morkite has been added  
This new ore drops a new crystal-like metal, which works as fuel.  
Two pieces of morkite is just as effective as a single piece of coal.  
Morkite can be found around the stone/deepslate border underground.  


### Banglum has recieved a **major** re-work:
- Regular Banglum armor now only has Blast Padding on all pieces (Blast Protection 1)  
- Nether Banglum ores have been added.
- Banglum Ores are now **volatile**. The ores have a chance to explode that scales with the levels of efficiency and fortune on your pickaxe.
- Silk Touch drastically reduces this explosion chance.  
- Banglum Ores have a higher chance to explode when placed in The Nether.  
- You can use Banglum Chunks in order to upgrade Banglum to Legendary Banglum, with various natural enchants  
  - The set has Spiked Helm (Thorns which always activates), Blast Protection 6, Projectile Protection 5, and Feather Falling 4.  
  - The pickaxe has a powerful explosion ability, which lets you create strip-mines easily  
- Banglum Chunks are recieved as a rare drop from Banglum Ore (0.2%) and Nether Banglum Ore (3%).
- Added Banglum TNT, which has the same explosive power as an End Crystal.  

### Aquarium has been buffed following the EnchantGiver replacement:  
- All the natural enchantments have been increased by one level
- A new item, the **Aquarium Pearl** has been added as a rare drop from Aquarium
  - This item can be used in order to craft a Trident from Prismarine Shards and a Heart of the Sea  

#### Other changes:  
Tweaked the White Aegis sword texture slightly.  
Adjusted all hardness values of ores, and made ores harder to mine with the wrong tool (especially if you have efficiency).  
Changed the Aegis blades to use their own material, so that they can be repaired with Palladium instead of Celestium.  
Slightly buffed the attack speed of Orichalcum and Osmium tools.  
Updated the armor item textures for Durasteel, Palladium, and regular Banglum.  
Made Unobtainium slightly more common.  
Removed Vermiculite.

# 0.11.4  
Fixed an oversight where mining orichalcum with silk touch would return mythril ore.  
Improved the armor textures of hallowed and bronze.  
Added the final ore texture courtesy of Haunted Chest.  
Set the EnchantGivers override to false, allowing the config to be changed.  
Minor internal tweaks to reduce overhead in DefaultedRegistry.  

__Balancing changes:__  
Buffed Celestium armors speed trait.  
Increased Celestiums harvest level to mythic, and made the blocks require the same level 
(same as Metallurgium and the unobtainium block).  
Buffed Metallurgium and Star Platinums base damage by 1.  
Increased Hallowed Armors toughness up to 4, but decreased its durability.  


# 0.11.3  
Split debug command into `/mythicmetals range console` and `/mythicmetals range file`.  
File will dump config into CSV, while console will dump the config in a readable format into chat/logs.  
Added animated stormyx ore textures.  
Slight texture adjustments.  
Removed steel gear.  
Shoutouts to Starmute for updating the Terralith compat!  

__Balancing changes:__  
Hallowed tools recieved a small increase in durability.  

# 0.11.2  
Hotfix!  
Fixed crash related to particles.  
Also forgot to mention that the Custom Armor Models from 1.16 have been re-implemented.  

# 0.11.1  
Ores have recieved new height ranges! Be sure to double check your config if you are a modpack creator, 
or simply delete your old config file to update your ore spawns.  
A deepslate variant of Carmot was added.  
A new debug command was added (`/mythicmetals range everything`), which dumps all the height ranges of ores.  
Higher tier items recieved some rarity tweaks.  
New ore textures for Osmium, Runite, Tin, and Silver.  
Turned Vermiculite into an actual fertilizer (bone meal).  
Added a CATLOL translation.
Added new textures for Star Platinum, mainly tools.  
Added low level documentation in the form of Advancements!  

__Balance changes:__  
Palladium recieved multiple QOL features, like being able to stand on magma blocks, campfires, and in powder snow.    
Added recipes for forging ore blocks into ingots.  
Gave Quadrillum some useful industrial recipes (buckets, shears, rails, hoppers).  
Slightly reduced enchantability of quadrillum, as well as increasing its damage.  
Reduced osmium armor values, but in return gave it knockback resistance, more durability, and armor toughness.  
Increased the durability of Hallowed gear.  
Increased the armor of runite and Kyber.  
Tweaked the armor values of silver.  
Reduced the armor of aquarium, but increased the durability of its gear.  
Globally increased the armor values of **all** boots.  
Buffed Osmiums mining level.  
Tewaked Star Platinums armor values, and increased its attack speed slightly.  


# 0.11.0  
Full port to 1.18!  
**CHAINS HAVE BEEN MOVED TO ANOTHER PROJECT!**  
THEY ARE AVAILABLE OVER AT [*MythicMetalsDecorations!!!*](https://github.com/Noaaan/MythicMetalsDecorations)  
A few ore-gen tweaks as well. Have fun!  

# 0.10.2
Another hotfix.  
Fixes Palladium not generating, and an issue with the Starrite height range.  

# 0.10.1
Hotfix!  
Fixed Osmium tools using the wrong material for stats  
Fixes broken recipes  

# 0.10.0 - Caves and Cliffs  
This update contains the biggest changes in the history of Mythic Metals.  
A lot has been removed from the mod, which includes:  
* All of Aetherium
* All of Argonium
* All of Brass
* All of Discordium
* All of Electrum
* All of Etherite
* All of Truesilver, which has been replaced in favor of Palladium
* All of Tantalite
* All of Quicksilver
* All of Ur
* All of Zinc
* Copper Ingots/Blocks, which have been replaced by vanilla variants
* Tin equipment
* Starrite gear, which has been replaced in favor of Star Platinum
* Quadrillum armour

Even though this update removes ores I have written a datafixer which should replace all the missing ores with stones, making this version compatible with older worlds.  

### !!!This is experimental, so **please make a backup before installing this update!!!**  

A lot of changes have been made:
* Added deepslate variants of Adamantite, Mythril, Orichalcum and Unobtainium.
* Added a tuff and smooth basalt variant of Orichalcum.
* Added a calcite variant of Kyber. Normal Kyber spawns rarely in the world, but it spawns in large veins in calcite (mainly from amethyst geodes).
* Added a blackstone variant of Stormyx.
* Nether ores now have their own custom feature for spawning in the overworld (portal remnants and mod compat).
* Added a calcite variant of Starrite. Starrite now spawns rarely anywhere in the world. 
* Added an End Stone Ore of Starrite, which is the main source of Starrite.
* Added a deepslate variant of Prometheum, since it can now be found in Lush Caves. 
* Tweaked Unobtainium spawn rates (it is now more common to find per-world, but will be VERY hard to find in caves).  
* Ores heights have been tweaked, even respecting the max world height/bottom.
  * The world-gen is mainly balanced around the **Caves and Cliffs Datapack**, fully utilizing the new height range from 320 to -64.   
  * For the optimal experience I recommend using it, or any other mod that changes the world height.
* Added some secrets


A lot of the artwork has been changed in the mod. Shoutouts to the artists who have worked on Mythic Metals:
* Matpac
* RGBeet
* Amoraire
* DH
* Tector
* Temreno
* Shiftless
* Pois1x  
* Henchman  

Codewise there has been a lot of internal changes. Re-naming of features, a new solution for configs, and new "sets" which function as bundles for registering items.
A lot of balancing changes have been made, and considering the removal of old materials here are some of the new ones:  
* Star Platinum is an alloy from Starrite, Platinum, and Carmot. It provides protection similar to Diamond, and is a component for Celestium.  
  * The armor set made from Star Platinum has the damage bonus from the Etherite set.
* Celestium is now an end-game metal, focusing on movement speed. It is crafted from Star Platinum, Kyber, and Unobtainium.  
* Prometheum has recieved a re-design, and is now a high tier metal. It has recieved Discordiums effects.  
* To compensate for the strengths of the hallowed ores (adamantite, mythril, orichalcum) they have been given some weaknesses.

There are a lot more minor changes as well, but for now I implore you to check them out for yourself.

# 0.9.11
Hotfix - Fixes a config loading issue with old Autoconfig and Cloth2

# 0.9.10
### Note!
Unembedded Cloth Config from the mod, you now have to download it yourself.  

Added dust support for Indrev and Mechanical Tech.  
Unobtainium can now spawn exposed in caves and similar, making it easier to find.  
SLightly buffed hoes and high-tier axes.  
Major interal refactors of the code.  
Added new hallowed and metallurgium armor models, as well as changing aetherium, adamantite, mythril and orichalcum ones.  
Various re-colours and texture changes.  
Added missing tags for gold and hallowed dusts.  

# 0.9.9
### Note!  
Added two new libraries: Enchant Giver and Alloy Forgery. 
You will need to download Alloy Forgery in order to use Mythic Metals! Link: https://www.curseforge.com/minecraft/mc-mods/alloy-forgery

EnchantGiver adds innate enchantments to aquarium and prometheum. They can be overridden with higher enchantments, but they will not disappear even if a grindstone is used.  
Alloy Forgery is a new mod that lets you build a multiblock alloy smelter. This smeltery replaces the old alloy system. Making alloys require lava and different tiers of smelters (currently only 2 tiers are in place, with nothing more planned).  
A tutorial will be available on the upcoming Mythic Metals Wiki! Once it's ready a link will be available.  

### What's new?
Added new anvils! These can be made from a selection of the metals, and will not break!  
Added new chains! These can be crafted from a selection of metals and nuggets.  
Added a new material: Hallowed. Made from the hallowed ores (adamantite, mythril and orichalcum).  
Unembedded PigLib. You will now have to install it manually, to prevent version issues.  
Added BYG, Terrestria and Traverse support! You will now find biome specific ores such as Starrite in their biomes.  
The ore generator has been changed internally so that it actually generates ores in their defined ranges. This means that worldgen has changed, and upgrading might cause funky chunk borders.  
Squashed a couple of bugs related to Harvest Scythes and Charm.  
Removed Lutetium, as it only served as a worse silver alternative.    

Adjusted most of the textures, as well as adding some new models. Thank you to:
* DH(LordDeatHunter), for a lot of the re-colours, item models and animated textures.  
* Temreno, for the new armour and tool models.  
* Tector, for the new ore and ingot textures.  
* Pois1x, for the new anvil model + texture.  
* Henchman, for new low-tier textures (copper, tin, bronze, and ur).  

### Balancing changes:  
* Quicksilver now has a higher mining level, higher dmg and speed, but less durability  
* Carmot has recieved a major buff  
* Quadrillum can now be smelted with a normal furnace  
* Slightly buffed hallowed  
* Made Kyber slightly easier to find  
* Increased Ur spawn rate  
* Buffed Banglum, Discordium, and Durasteel
* Nerfed Prometheum and Kyber  
* Buffed Metallurgium tools & weapons
* Major Stormyx buff, made it slightly easier to find  
* Slowsilver armor has been nerfed, as well as small tool nerf  
* Made tin and vermiculite spawn higher up   
* Celestium and Starrite have swapped mining speeds  

## What's next?  
Next update is mostly cleaning up before the final major release of Mythic Metals. I want to focus making addons for the mod over adding a lot more content, since I believe Mythic Metals serves the scope of adding more ores.  
Main focus will be getting even better textures for the rest of the items, ores and blocks. The first addon I wish to make is a decorations addon which would mean the chains will be moved to another mod eventually.  
There will be a few more features added, but after then the mod will mainly be maintained. I will be adding support for other mods though, but in the form extra mods.  
Thank you all for showing interest in this mod!  


# 0.9.8  
Added PigLib Integration. If installed Piglins will let you trade with Midas Gold, and ignore you wearing Midas Gold and Argonium armor.  
Added TechReborn Integration, letting you use their machines to possibly automate alloy creation!  
Added Mechanix Integration, letting you double ores through their methods.  
Added Modern Industrialization integration. You can now use the dust mixer for higher alloy yields.  
Updated tag conventions: moved a lot of tags out of the common directory, and added dust tags for mod compat.  
Added hallowed dust, allowing for better automation of metallurgium.  
Changed Durasteel recipe to require Quadrillum instead of Ferrite.  
Speaking of Ferrite, it has been removed. It had a brick-like color and conflicted in purpose with other ores.    
Added Hallowed Dust for mod compatability.  
Balancing changes:  
* Minor nerf to Oricalcums mining speed  
* Nerf to Starrite  
* Nerfed Kyber tools  
* Slight nerf to Durasteel armor  
* Reduced the max vein size of adamantite, mythril, and orichalcum ores

# 0.9.7  
Added nuggets from all ingots, thanks to LordDeatHunter!
Reverted Aetherium change, it now spawns in the overworld  
Expanded on biome specific ores.  
Adjusted Copper ingot texture.  
Reduced blasting time of regular ores (thanks m3talflame!)  
* Prometheum now spawns all jungle biome variants  
* Aetherium and Starrite now spawn in all mountain variants  

Minor tweaks to configs/tools:  
* Tweaked Tantalite vein chance and ores per vein
* Reduced default vein chance of Quadrillum and Midas Gold  
* Slightly reduced ores per vein of Aquarium  
* Increased Banglum vein size  
* Slightly increased Carmot vein size  
* Increased Truesilver vein size  
* Increased speed of Quicksilver tools  
* Increased speed of Slowsilver tools  
* Buffed Carmot  
* Changed spawnrate of silver and lutetium  

# 0.9.6  
Updated storage block mining levels  
Made Metallurgium and Unobtainium fireproof  
Added russian translations (Thanks Oscienet!)  
Added a configuration file, making all of the ores configurable  
* You can find the configuration file in the config/mythic_metals folder in your .minecraft folder or your main directory

Fixed an issue where Carmot would not spawn  
Made Starrite only spawn in mountains  
Made Aquarium only spawn in ocean type biomes
Made Aetherium only spawn in The End (experimental)
Added ModMenu support for configuration
Minor balancing tweaks
* Buffed copper, tin and silver armor  
* Buffed copper, tin, silver, brass and electrum tool durability  
* Slight nerf to Ur armor  
* Rebalanced Bronze armor  

Minor change to the Stormyx armor textures 
Updated Metallurgium Armor Textures  


# 0.9.5
Updated textures for ores  
Fixed a few recipe issues with silver and electrum

# 0.9.4
Added recipes for converting storage blocks back into ingots  
Updated all recipes to use tags instead of items. This makes the mod cross-compatible with other mods using the same tags, similar to Forges ore dictionary.  
Updated the vermiculite loot table in order to suppress an error  
Updated patch notes and credits  


# 0.9.3
Bumped version so it now supports 1.16.3 and 1.16.4  
Changed Kyber Ore to spawn a bit higher up  

# 0.9.2
Metallurgium Armor has been given its intended recipes (thanks to Ackman3121)  
Vermiculite has a new loot table, dropping similar to lapis/redstone ore  

# 0.9.1
Attempted to hotfix Metallurgium armor recipes  

# 0.9
Added common tags for ores, tools, and ingots  
Added storage blocks for all ingots  
Removed True Alloy  
Metallurgium now requires to be upgraded onto Netherite armor with a smithing table  
Updated textures for some ingots and alloys  
Fixed unobtainium being way too rare  
Changed vermiculite into a drop instead of an ingot based catalyst

# 0.8
Added yellow hue to Slowsilver Ingot  
Fixed Copper and Bronze Ingot colors  
Fixed Ur Ingot color  
Fixed armor item models  
Made Custom Runite Textures  
Made Orichalcum consistent  
Made Prometheum darker  
Made Silver shinier  
Made Steel darker  
Made Tin brighter  
Recolored Aetherium Textures  
Recolored Banglum textures  
Recolored Celestium textures  
Recolored Metallurgium Armor  
Recolored Quicksilver  
Recolored Stormyx  
Removed Damascus Steel  
Reworked Midas Gold Textures  
Updated Mod Icon  
