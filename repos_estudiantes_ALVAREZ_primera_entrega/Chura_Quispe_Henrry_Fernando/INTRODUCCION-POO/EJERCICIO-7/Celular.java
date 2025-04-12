package inf121;

//7. Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio

public class Celular {

    String aplicacion[] = new String[20];
    int tamanio[] = new int[20];
    int espacio;
    int bateria;

    public Celular(int espacio, int bateria) {
        this.aplicacion = new String[20];
        this.tamanio = new int[20];
        this.espacio = espacio;
        this.bateria = bateria;
    }
//a) Crea un método para instalar una nueva aplicación
    public void instalarAplicacion(String nombreApp, int tamanioApp) {
        for (int i = 0; i < aplicacion.length; i++) {
            if (aplicacion[i] == null && espacio >= tamanioApp) {
                aplicacion[i] = nombreApp;
                tamanio[i] = tamanioApp;
                espacio -= tamanioApp;
                System.out.println("La app instalada es: " + nombreApp);
                return;
            }
        }
        if (espacio < tamanioApp) {
            System.out.println("Espacio insuficiente para instalar " + nombreApp);
        } else {
            System.out.println("Límite máximo de aplicaciones alcanzado (20 aplicaciones).");
        }
    }
//b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más
//de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan
//más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza
//un 1% cada 10 minutos de uso)
    public void utilizaAplicacion(String nombreApp, int tiempoUso) {
        if (bateria <= 0) {
            System.out.println("¡El celular está apagado! No puedes usar aplicaciones.");
            return;
        }

        for (int i = 0; i < aplicacion.length; i++) {
            if (aplicacion[i] != null && aplicacion[i].equals(nombreApp)) {
                int tamanioApp = tamanio[i];
                int consumo10min = 0;


                if (tamanioApp > 250) {
                    consumo10min = 5;
                } else if (tamanioApp > 100) {
                    consumo10min = 2;
                } else {
                    consumo10min = 1;
                }


                int bloques10min = tiempoUso / 10;
                int bateriaConsumida = bloques10min * consumo10min;

                if (bateria < bateriaConsumida) {
                    System.out.println("Batería insuficiente para usar " + nombreApp);
                    return;
                }

                bateria -= bateriaConsumida;

     
                if (bateria <= 0) {
                    System.out.println("¡El celular se ha apagado!");
                    bateria = 0; 
                    return;
                }

                System.out.println("Has usado " + nombreApp + " por " + tiempoUso + " minutos.");
      
                System.out.println("Batería restante: " + bateria + "%");
                return;
            }
        }
        System.out.println("La aplicación " + nombreApp + " no está instalada.");
    }
//c) Muestra el porcentaje de batería restante
    public void mostrarBateria() {
        System.out.println("Batería restante: " + bateria + "%");
    }

    public static void main(String[] args) {
        Celular app = new Celular(1024, 100);

    
        app.instalarAplicacion("WhatsApp", 30);
        app.instalarAplicacion("Netflix", 30);
        app.instalarAplicacion("TikTok", 30);
        app.instalarAplicacion("Messenger", 50);
        app.instalarAplicacion("Spotify", 30);
        app.instalarAplicacion("YouTube", 30);
        app.instalarAplicacion("Telegram", 30);
        app.instalarAplicacion("Classroom", 50);
        app.instalarAplicacion("PhotoMath", 340);
        app.instalarAplicacion("Google", 340);
        app.instalarAplicacion("Binance", 30);
        app.instalarAplicacion("Gemini", 30);
        app.instalarAplicacion("IA", 30);
        app.instalarAplicacion("Chrome", 550);
        app.instalarAplicacion("PlayStore", 30);
        app.instalarAplicacion("DeepSeek", 330);
        app.instalarAplicacion("X", 30);
        app.instalarAplicacion("Clash of Clans", 50);
        app.instalarAplicacion("Clash Royale", 334);
        app.instalarAplicacion("Teams", 340);


        System.out.println("Espacio disponible: " + app.espacio + " Mb");

       
        app.utilizaAplicacion("WhatsApp", 5293);
        app.mostrarBateria();
        app.utilizaAplicacion("Netflix", 1533);
        app.mostrarBateria();
        app.utilizaAplicacion("TikTok", 545);
        app.mostrarBateria();
        app.utilizaAplicacion("Messenger", 50);
        app.mostrarBateria();
        app.utilizaAplicacion("Spotify", 350);
        app.mostrarBateria();
        app.utilizaAplicacion("YouTube", 30);
        app.mostrarBateria();
        app.utilizaAplicacion("Telegram", 350);
        app.mostrarBateria();
        app.utilizaAplicacion("Classroom", 550);
        app.mostrarBateria();

        app.utilizaAplicacion("PhotoMath", 6340);
        app.utilizaAplicacion("Google", 340);
        app.utilizaAplicacion("Binance", 30); 
    }
}

