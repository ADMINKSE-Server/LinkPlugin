package net.adminkse.linkPlugin

import net.adminkse.linkPlugin.commands.DiscordCommand
import org.bukkit.plugin.java.JavaPlugin

class LinkPlugin: JavaPlugin() {

    override fun onEnable() {
        super.onEnable()

        if(this.config.saveToString()=="") this.saveDefaultConfig()

        this.getCommand("discord").executor = DiscordCommand(this)

    }
}