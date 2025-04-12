class Celular {
    private String[] aplicacion; 
    private int espacioTotal; 
    private int espacioUsado;
    private int bateria; 
    private int numApps; 
 // a) Crea un método para instalar una nueva aplicación.
    public Celular() {
        espacioTotal = 1024;
        espacioUsado = 0;
        bateria = 100;
        numApps = 0;
        aplicacion = new String[20];  
    }

    public void instalandoApp(String nombre, int tamaño) {
        if (espacioUsado + tamaño <= espacioTotal && numApps < 20) {
            aplicacion[numApps] = nombre;
            espacioUsado += tamaño;
            numApps++;
            System.out.println(" la app " + nombre + " instalada-Espacio usado: " + espacioUsado + "Mb");
        } else {
            System.out.println("error tal parece que no puede instalar " + nombre + " debido a espacio insuficiente o límite de apps alcanzado");
        }
    }
/* b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza un 1% cada 10 minutos de uso). */
    public void usandoApp(String nombre, int tamaño, int minuto) {  // Corregido: orden de parámetros
        if (bateria <= 0) {
            System.out.println("celular se apagará. No se puede usar la app " + nombre);
            return;
        }
        
        int a;
        if (tamaño > 250) {
            a = 5;
        } else if (tamaño > 100) {
            a = 2;
        } else {
            a = 1;
        }
        
        int c = (minuto / 10) * a;
        if (minuto % 10 != 0) c += a;
        
        bateria -= c;
       // c) Muestra el porcentaje de batería restante.
        if (bateria < 0) bateria = 0;
        System.out.println("esta usando " + nombre + " por " + minuto + " minutos tiene una batería restante: " + bateria + "%");
         // d) Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el mensaje de celular apagado. 
        if (bateria == 0) {
            System.out.println("celular apagado");
        }
    }
}

