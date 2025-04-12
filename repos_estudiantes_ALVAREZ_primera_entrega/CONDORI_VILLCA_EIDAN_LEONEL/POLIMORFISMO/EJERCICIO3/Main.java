package POLIMORFISMO.EJERCICIO3;
//Un restaurante organiza a su personal mediante las siguientes clases:
//a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
//b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
//sumándole las horas extra, considerando el sueldo por hora y la propina
//en caso de los meseros.
//c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
//SueldoMes igual a X.
public class Main {
	public static void main(String[] args) {
        Cocinero cocinero1 = new Cocinero("Carlos", 2000, 10, 20);
        Mesero mesero1 = new Mesero("Luis", 1500, 5, 15, 200);
        Mesero mesero2 = new Mesero("Ana", 1600, 8, 15, 300);
        Administrativo admin1 = new Administrativo("Marta", "Contadora", 2200);
        Administrativo admin2 = new Administrativo("Jorge", "Recursos Humanos", 1800);

        cocinero1.mostrar();
        mesero1.mostrar();
        mesero2.mostrar();
        admin1.mostrar();
        admin2.mostrar();

        System.out.println("\n--- Empleados con sueldoMes = 1600 ---");
        cocinero1.mostrar(1600);
        mesero1.mostrar(1600);
        mesero2.mostrar(1600);
        admin1.mostrar(1600);
        admin2.mostrar(1600);
    }

}

