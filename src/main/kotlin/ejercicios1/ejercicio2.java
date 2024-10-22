package ejercicios1;

public class ejercicio2 {
        public static void main(String[] args) {
            int energia = 80;
            String estado = (energia > 50) ? "Personaje fuerte" : "Personaje débil";
            //depende del valor de energía nos puede dar dos strings distintas gracias al operador ternario
            System.out.println(estado);
    }
}
