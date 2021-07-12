package com.wznln.mc.api

import com.wznln.mc.api.Printer.PrintConsole
import org.bukkit.inventory.ItemStack


object Items {
    @JvmStatic
    fun PrintItem(i: ItemStack?){
        if(i==null){
            PrintConsole("&a物品为NULL")
            return
        }
        PrintConsole("&a物品种类："+i.type+(i.itemMeta?.displayName))
        if(i.hasItemMeta()&&i.itemMeta.hasLore())
        PrintConsole("&a物品Lore：\n"+i.itemMeta.lore?.joinToString("&r#行#&r"))
    }
}