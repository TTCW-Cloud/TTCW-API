package com.wznln.mc.api

import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object SPMethods {
    @JvmStatic
    fun PrintPlayer(player: Player, message: Any) {
        player.sendMessage(message.toString().replace("&", "§"))
    }
    @JvmStatic
    fun PrintPlayer(sender: CommandSender, message: Any) {
        sender.sendMessage(message.toString().replace("&", "§"))
    }
    @JvmStatic
    fun PrintCommandSender(sender: CommandSender, message: Any) {
        sender.sendMessage(message.toString().replace("&", "§"))
    }
}