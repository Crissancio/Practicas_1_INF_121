package Ejercicio_9;

public class AppComputadora {
	
    public static void main(String[] args) {
        Computadora miPC = new Computadora("Intel i7", 16, 512);

        System.out.println(miPC.toString());

        miPC.encender();
        System.out.println(miPC.toString());

        miPC.apagar();
        System.out.println(miPC.toString());
    }

}
