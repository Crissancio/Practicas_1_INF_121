class Perro {
    private String nombre;
    private String raza;
    private int edad;
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    public void hacerSonido() {
        System.out.println("Wuauu");
    }
    public void moverse() {
        System.out.println("el perro corre");
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre + " Raza: " + raza + " Edad: " + edad);
    }
}
class Gato {
    private String nombre;
    private String color;
    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    public void hacerSonido() {
        System.out.println("Miauuu");
    }
    public void moverse() {
        System.out.println("el gato salta");
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre + " Color: " + color);
    }
}
class Pajaro {
    private String nombre;
    private String tipo;
    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public void hacerSonido() {
        System.out.println("kua kuaaaaaa");
    }
    public void moverse() {
        System.out.println("el pájaro vuela");
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre + " Tipo: " + tipo);
    }
}