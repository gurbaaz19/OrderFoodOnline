package com.example.orderfoodonline
var uqtymc:IntArray= intArrayOf(0,0,0,0)

var imgarr = intArrayOf(R.drawable.bruschetta,R.drawable.ravioli,R.drawable.calamari,R.drawable.garlic_bread,
                        R.drawable.pizza,R.drawable.lasagna,R.drawable.pasta,R.drawable.spaghetti,
                        R.drawable.cheesecake,R.drawable.tiramisu,R.drawable.chocolate_fondant,R.drawable.sorbet,)

public data class holdmc(var qtymc:IntArray?)
{
    fun retmc() = qtymc
}
public fun retmc(qtymc: IntArray= intArrayOf(0,0,0,0))
{
    uqtymc = qtymc
}