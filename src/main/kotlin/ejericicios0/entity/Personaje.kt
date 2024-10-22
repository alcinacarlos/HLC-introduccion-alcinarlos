package ejericicios0.entity

class Personaje(
    val name:String,
    var health: Int,
    val damage:Int,
    private var dead: Boolean = false,
    var xp:Int = 0,
    var lvl:Int = 0)
{
    fun attack(personaje: Personaje, damage: Int){
        if(personaje.defense(damage)) addXp(50)
    }
    fun defense(damage: Int):Boolean{
        health -= damage
        if (health <= 0) {
            dead = true
            return true
        }
        return false
    }
    fun isDead() = dead

    private fun addXp(quantity:Int){
        xp += quantity
        checkXP()
    }
    private fun checkXP(){
        if (xp>=200){
            xp = 0
            lvl += 1
        }
    }

    override fun toString(): String {
        return "Nombre: $name, Vida: $health, Daño: $damage, Dead: $dead, Lvl: $lvl, XP: $xp"
    }
}