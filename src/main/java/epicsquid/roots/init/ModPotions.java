package epicsquid.roots.init;

import epicsquid.roots.Roots;
import epicsquid.roots.potion.*;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;

public class ModPotions {
  public static Potion freeze;
  public static Potion geas;
  public static Potion time_stop;
  public static Potion invulnerability;
  public static Potion petal_shell;

  public static void registerPotions(RegistryEvent.Register<Potion> event) {
    event.getRegistry().register(freeze = new PotionFreeze(0xFFFFFF).setRegistryName(Roots.MODID, "freeze"));
    event.getRegistry().register(geas = new PotionGeas().setRegistryName(Roots.MODID, "geas"));
    event.getRegistry().register(time_stop = new PotionTimeStop().setRegistryName(Roots.MODID, "time_stop"));
    event.getRegistry().register(invulnerability = new PotionInvulnerability().setRegistryName(Roots.MODID, "invulnerability"));
    event.getRegistry().register(petal_shell = new PotionPetalShell().setRegistryName(Roots.MODID, "petal_shell"));
  }
}
