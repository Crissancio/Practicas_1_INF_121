//3.Un restaurante organiza a su personal mediante las siguientes clases:
public class Main {
    public static void main(String[] args) {
        // a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
        Cocinero cocinero = new Cocinero("Hugo", 1500, 8, 50.34f);
        Mesero mesero1 = new Mesero("David", 1100, 9, 15.50f, 54);
        Mesero mesero2 = new Mesero("Estiben", 1110, 12, 20.55f, 58);
        Administrativo admin1 = new Administrativo("Israel", 1550.60f, "Proveedor");
        Administrativo admin2 = new Administrativo("Erick", 1582.80f, "Jefe");

        // b) Sobrecargar el método SueldoTotal para mostrar el sueldo total, sumándole
        // las horas extra, considerando el sueldo por hora y la propina en caso de los
        // meseros.
        cocinero.SueldoTotal();
        mesero1.SueldoTotal();
        mesero2.SueldoTotal();
        admin1.SueldoTotal();
        admin2.SueldoTotal();

        // c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
        // SueldoMes igual a X.
        cocinero.SueldoMes(1500);
        mesero1.SueldoMes(1100);
        mesero2.SueldoMes(1110);
        admin1.SueldoMes(1550.60f);
        admin2.SueldoMes(15.0f);

    }
}
