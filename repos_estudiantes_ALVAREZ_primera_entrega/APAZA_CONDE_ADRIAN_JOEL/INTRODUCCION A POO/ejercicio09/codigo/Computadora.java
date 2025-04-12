class Computadora {
    private int almacenamiento;
    private int ram;
    private boolean encendido;
    private String procesador;
      // c) Creando una instancia. 
   public Computadora(String procesador, int ram, int almacenamiento) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        encendido = false;
    }
     // c) Simulando encender y apagar la computadora.
   public  void encendiendo() {
        encendido = true;
        System.out.println("la computadora esta encendida");
    }
     // c) Simulando encender y apagar la computadora.
    public void apagando() {
        encendido = false;
        System.out.println("la computadora esta apagada");
    }
//   b) Muestra el estado de la computadora (encendido o apagado)
    public void estado() {
        System.out.println("su estado es: " + (encendido ? "encendido" : "apagado"));
    }
// a) Muestra los componentes principales de la computadora
    public void componentes() {
         System.out.println("Almacenamiento: " + almacenamiento + "GB");
         System.out.println("RAM: " + ram + "GB");
         System.out.println("Procesador: " + procesador);
            }
}

