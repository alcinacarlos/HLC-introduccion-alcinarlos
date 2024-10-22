package ejericicios0
import ejericicios0.entity.Personaje
import ejericicios0.generators.PersonajeGenerator
import kotlin.random.Random

val personajeGenerator = PersonajeGenerator()

fun ejercicio1() {
    println("Hola munod")
}

fun ejercicio2() {
    val personaje = personajeGenerator.generateRandomPersonaje()
    println("La vida de ${personaje.name} es ${personaje.health}")
}

fun multiplicarAtaques(numero: Int): Int {
    return numero * 5
}

fun ejercicio3() {
    val personaje = personajeGenerator.generateRandomPersonaje()
    val personajeQueRecibe = personajeGenerator.generateRandomPersonaje()
    personaje.attack(personajeQueRecibe, multiplicarAtaques(personaje.damage))
    println("${personajeQueRecibe.health}")
}

fun ejercicio4() {
    var monedas = 0

    for (i in 1..10) {
        monedas += 5
        println("Paso $i: Tienes $monedas monedas.")
    }
}

fun ejercicio5() {
    print("Introduce el nivel del personaje: ")
    val nivel = readlnOrNull()?.toIntOrNull() ?: 0

    when {
        nivel < 10 -> println("Personaje principiante")
        nivel in 10..19 -> println("Personaje intermedio")
        nivel > 20 -> println("Personaje avanzado")
        else -> println("Nivel no válido")
    }
}

fun calcularDamage(ataque: Int): Int {
    return if (ataque > 50) {
        println("¡Golpe crítico!")
        ataque * 2
    } else {
        ataque
    }
}

fun ejercicio6() {
    val ataque = Random.nextInt(40, 60)
    val damage = calcularDamage(ataque)
    println("El daño causado es: $damage")
}

fun ejercicio7() {
    val personajes = mutableListOf<Personaje>()
    //aquí he puesto 10 pero podría poner 2 para cumplir con el enunciado
    for (i in 1..10) {
        val personaje = personajeGenerator.generateRandomPersonaje()
        personajes.add(personaje)
    }
    while (personajes.count { !it.isDead() } > 1) {
        val personajesVivos = personajes.filter { !it.isDead() }
        for (personaje in personajesVivos) {
            val personajeAAtacar = personajesVivos.random()
            if (personaje != personajeAAtacar) {
                personaje.attack(personajeAAtacar, personaje.damage)
            }
        }
    }
    val personajeGanador = personajes.first { !it.isDead() }
    println(personajeGanador)
}

fun ejercicio8() {
    val inventario = mutableListOf<String>()

    while (true) {
        println("\nOpciones del inventario:")
        println("1. Añadir objeto")
        println("2. Eliminar objeto")
        println("3. Mostrar inventario")
        println("4. Salir")
        print("Selecciona una opción: ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                print("Introduce el nombre del objeto que quieres añadir: ")
                val objeto = readlnOrNull() ?: ""
                inventario.add(objeto)
                println("$objeto ha sido añadido al inventario.")
            }

            2 -> {
                if (inventario.isEmpty()) {
                    println("El inventario está vacío, no hay nada que eliminar.")
                } else {
                    print("Introduce el nombre del objeto que quieres eliminar: ")
                    val objeto = readlnOrNull() ?: ""
                    if (inventario.remove(objeto)) {
                        println("$objeto ha sido eliminado del inventario.")
                    } else {
                        println("$objeto no se encuentra en el inventario.")
                    }
                }
            }

            3 -> {
                if (inventario.isEmpty()) {
                    println("El inventario está vacío.")
                } else {
                    println("Inventario actual: $inventario")
                }
            }

            4 -> {
                println("Saliendo.....")
                break
            }

            else -> println("Opción no válida")
        }
    }
}
fun ejercicio9(){
    val personajeChetado = Personaje("Chetado", 1000, 100)
    val personajes = mutableListOf(personajeChetado)
    for (i in 1..50){
        personajes.add(personajeGenerator.generateRandomPersonaje())
    }
    while (personajes.count { !it.isDead() } > 1) {
        val personajesVivos = personajes.filter { !it.isDead() }
        for (personaje in personajesVivos) {
            val personajeAAtacar = personajesVivos.random()
            if (personaje != personajeAAtacar) {
                personaje.attack(personajeAAtacar, personaje.damage)
            }
        }
    }
    val personajeGanador = personajes.first { !it.isDead() }
    println(personajeGanador)
}

fun ejercicio10(){
    val equipo = mutableListOf<Personaje>()
    for (i in 1..10){
        equipo.add(personajeGenerator.generateRandomPersonaje())
    }
    val boss = Personaje("Boss xd", 500, 30)
    while (!boss.isDead() && equipo.count { it.isDead() } == 0){
        val equipoVivo = equipo.filter { !it.isDead() }
        if (Random.nextBoolean()){
            equipoVivo.forEach {boss.attack(it, boss.damage) }
        }else{
            equipoVivo.forEach{it.attack(boss, it.damage)}
        }
    }
    if (boss.isDead()){
        println("Ha ganado el equipo!!")
        println("Formador por: ")
        equipo.forEach { println(it) }
    }else{
        println("Ganó el boss")
        println(boss)
    }
}
fun showMenu(){
    repeat(100){
        println("\n")
    }
    println("Bienvenido, selecciona el ejercicio a ejecutar:")
    println("\t 0. Salir")
    for (i in 1..10){
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
            9 -> ejercicio9()
            10 -> ejercicio10()
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

