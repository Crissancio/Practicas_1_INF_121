package universidad;

public class Universidad {
    public static void main(String[] args) {
        Oficina o1 = new Oficina(4, 2, 1);
        Oficina o2 = new Oficina(3, 3, 2);

        Aula a1 = new Aula("Aula 101", 40, 40);
        Aula a2 = new Aula("Aula 102", 30, 30);

        Laboratorio lab = new Laboratorio("Lab Quimica", 25, 10, 25);

        o1.mostrar();
        o2.mostrar();
        a1.mostrar();
        a2.mostrar();
        lab.mostrar();
    }
}

