/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer7;

/**
 *
 * @author HP-RYZEN 5
 */
public class Ejer7 {

    public static void main(String[] args) {
    System.out.println("------------CELULAR------------");
        Celular c1=new Celular();
        c1.mostrarBat();
        System.out.println("------------Instalar App------------");
        c1.instalarApp("Whatsapp", 138);
        c1.instalarApp("Facebook", 270);
        c1.instalarApp("Instagram", 300);
        c1.instalarApp("TikTok", 350);
        c1.instalarApp("Youtube", 140);
        c1.instalarApp("Telegram", 10);
        c1.instalarApp("Candy Crush", 355);
        System.out.println("------------Utilizar Apps------------");
        c1.utilizarApp("Whatsapp", 5);
        c1.utilizarApp("TikTok", 60);
        c1.utilizarApp("Youtube", 40);
        c1.utilizarApp("Telegram", 50);
        c1.mostrarBat();
        
        c1.utilizarApp("Candy Crush", 50);
    }
}
