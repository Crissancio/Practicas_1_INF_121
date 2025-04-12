package com.mycompany.ejer7;

public class Celular {
    private int cant;
    private String apps[];
    private int espacio[];
    private int almacenamiento;
    private int bateria;

    public Celular() {
        this.cant = 0;
        this.apps =new String[20];
        this.espacio =new int[20];
        this.almacenamiento = 1024;
        this.bateria = 100;
    }
    
    public int espacioTotal(){
        int total=0;
        for(int i=0; i<cant; i++)
            total=total+espacio[i];
        return total;
    }
    
    public void instalarApp(String n, int e){
        apps[cant]=n;
        espacio[cant]=e;
        cant=cant+1;
        if(cant<=20 || espacioTotal()<almacenamiento)
            System.out.println("La app "+n+" se instalo correctamente.");
        else
            System.out.println("Almacenamiento lleno");     
    }
    public void utilizarApp(String app, int min){
            boolean sw=false;
            for(int i=0;i<cant;i++){
                if(apps[i].equals(app)){
                    sw=true;
                    if(espacio[i]>=250)
                        bateria=bateria-(min/10)*5;
                    if(espacio[i]>=100 || espacio[i]<250)
                        bateria=bateria-(min/10)*2;
                    if(espacio[i]<100)
                        bateria=bateria-(min/10)*1;
                    if(bateria<=0)
                        System.out.println("Celular Apagado.");
                }
            }
            if(!sw)
                System.out.println("No se encontro la App");
    }
    public void mostrarBat(){
        System.out.println("Bateria: "+bateria+"%");
    }
}