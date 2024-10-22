package ejercicios1

class Personaje(val nombre: String, var vida: Int, var ataque: Int) {
    // Kotlin simplifica la definición de clases al permitir declarar propiedades directamente en el constructor
    // elimina la necesidad de declarar variables de instancia y un constructor explícito como en Java.
    fun mostrarInfo() {
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }
}

fun ejercicio5() {
    val goku = Personaje("Goku", 100, 50)
    goku.mostrarInfo()
}
