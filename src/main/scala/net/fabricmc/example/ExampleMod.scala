package net.fabricmc.example

import net.fabricmc.api.ModInitializer

object ExampleMod extends ModInitializer {

  override def onInitialize(): Unit = {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.
    System.out.println("Hello Fabric world from scala!")
  }

}
