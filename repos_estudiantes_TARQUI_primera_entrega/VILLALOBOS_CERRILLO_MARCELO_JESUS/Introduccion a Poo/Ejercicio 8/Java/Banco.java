import java.util.ArrayList;
public class Banco {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    public void agregarUsuario(Usuario u) {
        if (usuarios.size() < 10) {
            usuarios.add(u);
        }
    }
    public void depositar(String nombre, double cantidad) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equals(nombre)) {
                u.depositar(cantidad);
            }
        }
    }
    public void retirar(String nombre, double cantidad) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equals(nombre)) {
                u.retirar(cantidad);
            }
        }
    }
    public void darBonos() {
        for (Usuario u : usuarios) {
            u.darBono();
        }
    }
    public void totalBanco() {
        double total = 0;
        for (Usuario u : usuarios) {
            total += u.getSaldo();
        }
        System.out.println("Total del banco: " + total);
    }
}
public class Usuario {
    private String nombre;
    private double saldo;
    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
    public void retirar(double cantidad) {
        saldo -= cantidad;
    }
    public void darBono() {
        saldo *= 1.02;
    }
}
