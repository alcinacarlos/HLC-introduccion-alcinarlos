package com.carlosalcina

fun ejercicio8() {
    // la clase persona está definida en el ejercicio 5 ya que es igual
    val goku = Personaje("Goku", 100, 20)
    val vegeta = Personaje("Vegeta", 80, 25)
    while (goku.vida > 0 && vegeta.vida > 0) {
        goku.vida -= vegeta.ataque
        vegeta.vida -= goku.ataque
        println("Vida de Goku: " + goku.vida)
        println("Vida de Vegeta: " + vegeta.vida)
    }
    if (goku.vida <= 0) {
        println("Vegeta ha ganado el combate.")
    } else {
        println("Goku ha ganado el combate.")
    }
}

