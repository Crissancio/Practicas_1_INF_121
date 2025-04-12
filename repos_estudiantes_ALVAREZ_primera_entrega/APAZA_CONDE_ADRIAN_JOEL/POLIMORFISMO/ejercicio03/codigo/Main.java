/* Ejercicio3 polimorfismo: Un restaurante organiza a su personal mediante las siguientes clases:
 a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
 b) Sobrecargar el método SueldoTotal para mostrar el sueldo total, sumándole las horas extra, considerando el sueldo por hora y la propina en caso de los meseros. 
 c) Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.
 */
class Main {
    public static void main(String[] args) {
       // a) Instanciando 1 Cocinero, 2 Mesero y 2  Administrativos.
        Cocinero c1 = new Cocinero("Juan", 3000, 10, 15.5f);
        Mesero m1 = new Mesero("Maria", 2500, 5, 10.0f, 200.0f);
        Mesero m2 = new Mesero("Carlos", 2400, 8, 10.0f, 150.0f);
        Administrativo a1 = new Administrativo("Ana", 3500.5f, "Gerente");
        Administrativo a2 = new Administrativo("Luis", 2800.0f, "Contador");
        // b) Sobrecargado el método SueldoTotal
        c1.mostrarSueldo();
        m1.mostrarSueldo();
        m2.mostrarSueldo();
        a1.mostrarSueldo();
        a2.mostrarSueldo();
        System.out.println("empleados que tienen un  sueldo mes = 2500:");
       // c) Sobrecargado el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.
        c1.sueldoTotal(2500);
        m1.sueldoTotal(2500);
        m2.sueldoTotal(2500);
        a1.sueldoTotal(2500);
        a2.sueldoTotal(2500);
    }
}