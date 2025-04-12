
package ejercicio7;

public class Celular {
    private String [] nombresApp = new String [20];
    private int [] tamañosApp = new int [20];
    private int cantidadApps =0;
    private int espacioUsado =0;
    private double bateria = 100.0;

    public void instalarApp(String nombre, int tamaño){
        if(cantidadApps >=20){
            System.out.println("no se pueden instalar mas apps");
            return;
        }
        
        if(espacioUsado + tamaño > 1024){
            System.out.println("No hay espacio");
            return;
        }
        
        nombresApp[cantidadApps] = nombre;
        tamañosApp[cantidadApps]=tamaño;
        cantidadApps++;
        espacioUsado += tamaño;
        System.out.println("app " + nombre + "se instalo");
    }
    
    
    public void Usar(String nombre, int minuto ){
        if (bateria <= 0){
            System.out.println("sin bateria");
            return;
        }
        int indice = -1;
        for (int i= 0;i<cantidadApps; i++){
            if(nombresApp[i].equals(nombre)){
                indice =i;
                break;
            }
        }
        
        if (indice == -1){
            System.out.println("no se encontro la app");
            return;
        }
        int tamaño = tamañosApp[indice];
        double consumoPor10Min;
        
        if(tamaño>250){
            consumoPor10Min=5.0;
            
        }else if(tamaño > 100){
            consumoPor10Min= 2.0;
            
        }else{
            consumoPor10Min=1.0;
        }
        
        double TotalConsumo = (minuto/10.0) *consumoPor10Min;
         if (bateria-TotalConsumo <=0){
             bateria =0;
             System.out.println("se agoto mientras estas usando la app");
         }else {
             bateria -= TotalConsumo;
             System.out.println("usaste la app"+ nombre + " por "+ minuto + "minutos");
         }
    }
    
    public void mostrarBateria(){
        System.out.println("bateria restante " + bateria );
    }
    
    public static void main(String[] args) {
        Celular miCelular = new Celular();

        miCelular.instalarApp("Instagram", 150);
        miCelular.instalarApp("free fire", 300);
        miCelular.instalarApp("Notas", 20);

        miCelular.Usar("Instagram", 30);
        miCelular.mostrarBateria();

        miCelular.Usar("free fire", 20);
        miCelular.mostrarBateria();

        miCelular.Usar("Notas", 60);
        miCelular.mostrarBateria();

        miCelular.Usar("free fire", 200); 
        miCelular.mostrarBateria();

        miCelular.Usar("Notas", 10);
    }
}




