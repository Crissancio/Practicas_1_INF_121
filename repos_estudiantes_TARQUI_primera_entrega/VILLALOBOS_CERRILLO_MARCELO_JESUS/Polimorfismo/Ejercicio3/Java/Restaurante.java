class Cocinero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;
    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora){
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }
    public void mostrar(){
        System.out.println("El cocinero se llama: " + nombre + " el sueldo mensual de este es de: " + sueldoMes + " las horas extras trabajadas son: " + horasExtra + " su sueldo por hora es de: " + sueldoHora);
    }
}

class Mesero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;
    private float propina;
    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina){
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }
    public float sueldoTotal(){
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }
    public void mostrar(){
        System.out.println("El cocinero se llama: " + nombre + " el sueldo mensual de este es de: " + sueldoMes + " las horas extras trabajadas son: " + horasExtra + " su sueldo por hora es de: " + sueldoHora + " su propina es de: " + propina);
        System.out.println("Su sueldo total es de: " + sueldoTotal());
    }
}

class Administrativo {
    private String nombre;
    private float sueldoMes;
    private String cargo;
    public Administrativo(String nombre, float sueldoMes, String cargo){
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }
    public void mostrar(){
        System.out.println("El cocinero se llama: " + nombre + " el sueldo mensual de este es de: " + sueldoMes + " el cargo que tiene es: " + cargo);
    }
}