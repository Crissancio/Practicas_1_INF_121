package telefono;
import java.util.ArrayList;

public class Celular {
    public ArrayList<String> W;
    public int ad;
    public int power;
    public int na;

    public Celular() {
        this.W = new ArrayList<>();
        this.ad = 1024;
        this.power = 100;
        this.na = 0;
    }

    public void instalarApp(String nopa, int tana) {
        if (this.na < 20 && this.ad >= tana) {
            this.W.add(nopa);
            this.ad -= tana;
            this.na++;
            System.out.println(nopa + " Instalado con Éxito");
        } else {
            System.out.println("Espacio Insuficiente");
        }
    }

    public void usarApp(String nopa, int tana, int time) {
        if (this.power > 0) {
            int consumoBateria = 0;
            if (this.W.contains(nopa)) {
                if (tana > 250) {
                    consumoBateria = (time / 10) * 5;
                } else if (tana > 100) {
                    consumoBateria = (time / 10) * 2;
                } else {
                    consumoBateria = (time / 10) * 1;
                }

                if (consumoBateria > this.power) {
                    consumoBateria = this.power;
                }

                this.power -= consumoBateria;

                if (this.power == 0) {
                    this.power = 0;
                }

                System.out.println(nopa + " usando durante " + time + " min");
            } else {
                System.out.println("La Aplicacion NO fue encontrada");
            }
        } else {
            System.out.println("Celular Apagado");
        }
    }

    public void mostrarBat() {
        System.out.println("Bateria restante: " + this.power + " %");
    }

    public void mensaje() {
        System.out.println("Celular Apagandose...");
    }

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Celular");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Samsung Galaxy A11");
        System.out.println("---------------------------------------------------------------------");
        Celular celu1 = new Celular();
        System.out.println("Batería: " + celu1.power + " %");
        System.out.println("Espacio disponible: 1 GB = " + celu1.ad + " MB");
        System.out.println("---------------------------------------------------------------------");
        celu1.instalarApp("WhatsApp", 100);
        celu1.instalarApp("Call of Duty Mobile", 300);
        celu1.instalarApp("You Tube", 120);
        celu1.instalarApp("Brawl Stars", 170);
        celu1.instalarApp("Threads", 120);
        celu1.instalarApp("Clash Royale", 214);
        celu1.instalarApp("Mobile Legends", 265);
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("WhatsApp", 100, 20);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("Call of Duty Mobile", 300, 30);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("You Tube", 120, 50);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("Brawl Stars", 170, 35);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("Tik Tok", 200, 30);
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("WhatsApp", 100, 70);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("Threads", 120, 15);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("Call of Duty Mobile", 300, 40);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("You Tube", 120, 30);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("Brawl Stars", 170, 20);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("Clash Royale", 214, 38);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("Call of Duty Mobile", 300, 25);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("You Tube", 120, 50);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.usarApp("WhatsApp", 100, 40);
        celu1.mostrarBat();
        System.out.println("---------------------------------------------------------------------");
        celu1.mensaje();
        System.out.println("---------------------------------------------------------------------");
    }
}
