package com.wznln.mc.api

import java.util.function.Predicate

object ListOrMap {
    fun <T> filterList(list: MutableList<T>, predicate: Predicate<T>) {
        val itr = list.iterator()
        while (itr.hasNext()) {
            val t = itr.next()
            if (predicate.test(t)) {
                itr.remove()
            }
        }
    }

    fun <K,V> filterMap(map: MutableMap<K,V>, predicate: Predicate<Map.Entry<K, V>>){
        val itr = map.entries.iterator()
        while (itr.hasNext()) {
            val t = itr.next()
            if (predicate.test(t)) {
                itr.remove()
            }
        }
    }
}