package com.wznln.mc.api

import java.math.BigDecimal
import java.math.RoundingMode

class BigDeci {

    fun roundPerfect(a: Double, point: Int): String? {
        var b = BigDecimal(a)
        b = b.setScale(point, RoundingMode.DOWN)
        b = b.stripTrailingZeros()
        return b.toPlainString()
    }

    fun m_(a: BigDecimal,b: BigDecimal): BigDecimal = a.minus(b)

    fun gainBigDecimal(s: String) = BigDecimal(s)

    fun mx(a: BigDecimal,b: BigDecimal) = a.multiply(b)

    fun mb(a: BigDecimal,b: BigDecimal) = a.compareTo(b)==1

    fun ms(a: BigDecimal,b: BigDecimal) = a.compareTo(b)==-1

    fun me(a: BigDecimal,b: BigDecimal) = a.compareTo(b)==0

}