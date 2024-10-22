package ejercicios1;

public class ejercicio4 {
    public static void main(String[] args) {
        // los rangos se manejan de forma más intuitiva usando ".."
        // el control de flujo con "continue" y "break" funciona igual en ambos lenguajes.
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Salta la iteración cuando i es 3
            }
            System.out.println("Número: " + i);
        }
    }
}
