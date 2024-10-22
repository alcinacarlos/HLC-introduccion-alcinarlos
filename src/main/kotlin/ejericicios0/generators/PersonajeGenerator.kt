package ejericicios0.generators

import ejericicios0.entity.Personaje
import kotlin.random.Random


class PersonajeGenerator {

    private val names = listOf("Juan", "Pepe", "Lucas", "Carlos", "Manuel", "Viti")

    fun generateRandomPersonaje(): Personaje {
        val name = names.random()
        val health = Random.nextInt(50, 201)
        val damage = Random.nextInt(10, 51)
        return Personaje(name, health, damage)
    }
}