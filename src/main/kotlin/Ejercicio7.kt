package com.carlosalcina

fun ejercicio7() {
    println(multiplicar(5))

    // Lambda en Kotlin (se puede usar directamente sin interfaz)
    val operacion: (Int, Int) -> Int = { a, b -> a + b }
    println(operacion(3, 4))
}

fun multiplicar(num: Int): Int {
    return num * 2
}
