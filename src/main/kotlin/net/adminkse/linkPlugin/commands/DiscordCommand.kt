package net.adminkse.linkPlugin.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

class DiscordCommand (var plugin:JavaPlugin): CommandExecutor {


    override fun onCommand(sender: CommandSender?, command: Command?, label: String?, args: Array<out String>? ): Boolean {
        if (sender !is Player) return false
        if (command == null) return false

        when(command.name){
            "discord" -> {
                sender.sendMessage("§3"+plugin.config.getString("links.discord"))
            }
        }

        return true

    }

}