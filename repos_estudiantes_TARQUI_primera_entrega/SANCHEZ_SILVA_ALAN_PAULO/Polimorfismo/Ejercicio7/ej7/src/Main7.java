public class Main7 {
    public static void main(String[] args) throws Exception {
        //Instanciando clases
        Perro perro = new  Perro();
        Gato gato = new Gato();
        Pajaro pajaro = new Pajaro();

        //Llamando a los métodos
        System.out.println(perro.hacerSonido());
        System.out.println(perro.moverse());

        System.out.println(gato.hacerSonido());
        System.out.println(gato.moverse());                                                                           

        System.out.println(pajaro.hacerSonido());
        System.out.println(pajaro.moverse());
    }
}
