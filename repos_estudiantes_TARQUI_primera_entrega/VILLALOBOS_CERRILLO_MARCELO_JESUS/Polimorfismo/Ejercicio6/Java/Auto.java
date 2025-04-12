class Auto {
    private String modelo;
    private String placa;
    private String color;
    public Auto(String modelo, String placa, String color) {
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
    }
    public Auto(String modelo) {
        this.modelo = modelo;
    }
    public Auto(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }
    public void mostrar() {
        System.out.println("El modelo del auto es: " + modelo + " la placa es " + placa + " y es de color " + color);
    }
    public void nuevoAuto() {
        Scanner sc = new Scanner(System.in);
        modelo = sc.nextLine();
        placa = sc.nextLine();
        color = sc.nextLine();
    }
    public void verAuto() {
        mostrar();
    }
}