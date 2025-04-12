public class Banco {

    private int max = 10;
    private int tope;
    private Persona[] v = new Persona[max + 1];

    public Banco() {
        tope = 0;
    }

    public boolean esvacia() {
        return tope == 0;
    }

    public boolean esllena() {
        return tope == max;
    }

    public void agregar_Usuario(Persona p) {
        if (!esllena()) {
            v[tope] = p;
            tope++;
            System.out.println("Usuario agregado: " + p.getNombre() + ", Saldo: " + p.getSaldo());
        } else {
            System.out.println("Banco lleno");
        }
    }

    public Persona eliminar() {
        if (!esvacia()) {
            tope--;
            return v[tope];
        } else {
            System.out.println("Banco vacío");
            return null;
        }
    }

    public void Retiro(String X, float monto_a_retirar) {
        Banco aux = new Banco();
        while (!esvacia()) {
            Persona p = eliminar();
            if (p.getNombre().equals(X)) {
                float retiro = p.getSaldo() - monto_a_retirar;
                if (retiro >= 0) {
                    p.setSaldo(retiro);
                    System.out.println("Retiro exitoso: " + monto_a_retirar + " bs, Saldo actual: " + p.getSaldo());
                    aux.agregar_Usuario(p);
                } else {
                    System.out.println("Saldo insuficiente para retirar: " + monto_a_retirar + " bs.");
                    aux.agregar_Usuario(p);
                }
            } else {
                aux.agregar_Usuario(p);
            }
        }
        while (!aux.esvacia()) {
            agregar_Usuario(aux.eliminar());
        }
    }

    public void Adicion(String X, float adicion) {
        Banco aux = new Banco();
        while (!esvacia()) {
            Persona p = eliminar();
            if (p.getNombre().equals(X)) {
                float adicionar = p.getSaldo() + adicion;
                p.setSaldo(adicionar);
                System.out.println(
                        "Usuario: " + p.getNombre() + " se adicionó: " + adicion + " bs. Saldo total: " + p.getSaldo());
                aux.agregar_Usuario(p);
            } else {
                aux.agregar_Usuario(p);
            }
        }
        while (!aux.esvacia()) {
            agregar_Usuario(aux.eliminar());
        }
    }

    public void Abono() {
        Banco aux = new Banco();
        while (!esvacia()) {
            Persona p = eliminar();
            float abono = p.getSaldo() + (p.getSaldo() * (0.02f / 100.00f));
            p.setSaldo(abono);
            System.out.println("Abono realizado al usuario: " + p.getNombre() + ". Saldo actual: " + p.getSaldo());
            aux.agregar_Usuario(p);
        }
        while (!aux.esvacia()) {
            agregar_Usuario(aux.eliminar());
        }
    }

    public void Total() {
        Banco aux = new Banco();
        float contador = 0;
        while (!esvacia()) {
            Persona p = eliminar();
            contador += p.getSaldo();
            aux.agregar_Usuario(p);
        }
        while (!aux.esvacia()) {
            agregar_Usuario(aux.eliminar());
        }
        System.out.println("El total de dinero en el banco es de: " + contador + " bs.");
    }
}
