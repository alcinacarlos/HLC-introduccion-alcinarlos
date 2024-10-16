package com.carlosalcina

fun ejercicio3(){
    val cofres = arrayOf("Espada", "Escudo", "Poción")
    cofres.forEach { println("Has encontrado: $it") }
    //gracias a la lambda es mucho más fácil iterar por una lista de elemntos tipo string
}