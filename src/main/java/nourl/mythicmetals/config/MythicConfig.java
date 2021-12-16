package nourl.mythicmetals.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import nourl.mythicmetals.MythicMetals;

import java.util.ArrayList;

@Config(name = MythicMetals.MOD_ID)
public class MythicConfig implements ConfigData {
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableDusts = false;
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableNuggets = true;

    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig adamantite = new OreConfig(true, 5, 1, -52, 12, .125f, false, true);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig aquarium = new OreConfig(true, 9, 4, 39, 63, .0f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig banglum = new OreConfig(true, 6, 3, 42, 65, .125f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig carmot = new OreConfig(true,4, 2, 4 ,36, .125f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
     public VariantConfig kyber = new VariantConfig(true, 3, 15, 1, 40, 2, -62, 50, 40,.5f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig manganese = new OreConfig(true, 9, 2, 28, 48,.25f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig midas_gold = new OreConfig(true,6, 7, 10, 128,.125f, false, true);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig mythril = new OreConfig(true, 5, 1, -36, 16, .125f, false, true);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig orichalcum = new OreConfig(true, 5, 1, 8, 24, .125f, true);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig osmium = new OreConfig(true, 6, 5, 20, 40, .25f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig overworld_nether_ores = new OreConfig(true, 4, 2, 40, 70, .125f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig palladium = new OreConfig(true, 4, 2, 16, 40, .0f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig platinum = new OreConfig(true, 6, 2, 8, 32, .0f, false, true);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig prometheum = new OreConfig(true, 6, 4, 30, 48, .0f, true);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig quadrillum = new OreConfig(true,7, 2, 16, 44, .25f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig runite = new OreConfig(true, 3, 2, 9, 39, .0f, false, true);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig silver = new OreConfig(true,8, 4, 16, 38, .25f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public VariantConfig starrite = new VariantConfig(true, 4, 7, 1, 2, 50, 40, 40, 20, .25f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig stormyx = new OreConfig(true,8, 3, 4, 116, .0f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig unobtainium = new OreConfig(true,3, 1, -60, 12, .25f, false, true);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig tin = new OreConfig(true,8, 4, 44, 72, .25f, false);
    @ConfigEntry.Gui.CollapsibleObject(startExpanded = true)
    public OreConfig vermiculite = new OreConfig(true,8, 4, 64, 108, .25f, false);
    @ConfigEntry.Gui.Excluded
    public int configVersion = 2;

    public ArrayList<String> blacklist = new ArrayList<>();
}
