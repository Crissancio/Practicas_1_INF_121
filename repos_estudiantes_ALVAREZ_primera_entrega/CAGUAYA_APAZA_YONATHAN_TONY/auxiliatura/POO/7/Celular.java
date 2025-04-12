package celular;

public class Celular {
    private String[] apps=new String[20];
    private int[] tamaño=new int[20];
    private int bateria;
    private int c=0;
    public Celular(int bateria) {
        this.bateria = bateria;
    }
    
    public void instalar(String x, int y){
        apps[c]=x;
        tamaño[c]=y;
        c++;
    }
    public void utilizar(String x){
        int u=-1;
        for(int i=0;i<20;i++){
            if(apps[i]!=null && apps[i].equals(x)){
                u=i;
                break;
            }
            
        }
        if(u==-1){
            System.out.println("Esa aplicacion no esta instalada en el celular");
            return;
        }
        if(tamaño[u]>100 && tamaño[u]<=250)bateria-=2;
        else if(tamaño[u]>250) bateria-=5;    
        else if(tamaño[u]<=100) bateria-=1;
        if(bateria<=0){
            System.out.println("celular apagado");
            bateria=0;
            
        }
        
    }
    public void mostrar(){
        
        System.out.println("El porcentaje de la batreia es de "+bateria+"%");
    }
    public static void main(String[] args) {
        Celular c1=new Celular(10);
        c1.instalar("Fornite", 258);
        c1.instalar("Hollow Knigth", 100);
        
        c1.utilizar("Fornite");
        c1.utilizar("Hollow Knigth");
        c1.utilizar("Fornite");
        c1.utilizar("Hollow Knigth");
        c1.mostrar();
        c1.utilizar("Pou");
        
    }
    
}
