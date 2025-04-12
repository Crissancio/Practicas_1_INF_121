package Ejercicio_7;

public class AppCelular {

	public static void main(String[] args) {
        Celular miCelular = new Celular();

        miCelular.instalarApp(150); // app1
        miCelular.instalarApp(300); // app2
        miCelular.instalarApp(50);  // app3

        miCelular.usarApp(150, 30);  // debería consumir 6%
        miCelular.usarApp(300, 20);  // debería consumir 10%
        miCelular.usarApp(50, 10);   // debería consumir 1%

        System.out.println(miCelular.toString());

        //Agotamos la batería
        miCelular.usarApp(300, 1000); // debería apagar el celular

        System.out.println(miCelular.toString());
    }

}
