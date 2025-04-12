//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Oficina oficina1 = new Oficina(9,9, 12);
        Oficina oficina2 = new Oficina(12,13, 4);
        Aula aula1 = new Aula("Amarillo", 40, 20);
        Aula aula2 = new Aula("Verde", 20, 10);
        Laboratorio lab1 = new Laboratorio("CN",20, 10,10);
        Laboratorio lab2 = new Laboratorio("CS",30, 30,30);
        System.out.println(oficina1.mostrar());
        System.out.println(aula1.mostrar());
        System.out.println(lab1.mostrar());
        System.out.println(oficina1.cantidaddeMuebles());
        System.out.println(aula1.cantidaddeMuebles());
        System.out.println(lab1.cantidaddeMuebles());

    }
}
