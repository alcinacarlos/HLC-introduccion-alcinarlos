public class ejercicio6 {
    public static void main(String[] args) {
        // en Kotlin, una variable de tipo 'String?' indica que puede contener un valor de tipo String o ser null
        // esto obliga a manejar los casos nulos explícitamente, evitando errores comunes como el NullPointerException
        String personaje = null;
        if (personaje != null) {
            System.out.println("El personaje es " + personaje);
        } else {
            System.out.println("No hay personaje.");
        }
    }
}
