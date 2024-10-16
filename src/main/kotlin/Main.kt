package com.carlosalcina

import ejercicio2
import ejercicio4
import ejercicio6

fun showMenu(){
    repeat(100){
        println("\n")
    }
    println("Bienvenido, selecciona el ejercicio a ejecutar:")
    println("\t 0. Salir")
    for (i in 1..8){
        println("\t $i. Ejercicio $i")
    }
}
fun menuPrincipal(){
    while (true){
        showMenu()
        when(readlnOrNull()?.toIntOrNull()){
            0 -> break
            1 -> ejercicio1()
            2 -> ejercicio2()
            3 -> ejercicio3()
            4 -> ejercicio4()
            5 -> ejercicio5()
            6 -> ejercicio6()
            7 -> ejercicio7()
            8 -> ejercicio8()
            else -> println("Ejercicio no válido, vuelve a intentarlo")
        }
        println("\nEjercicio mostrado, espera 5 segundos....")
        Thread.sleep(5000)
    }
    println("Hasta luego!")
}
fun main(){
    menuPrincipal()
}