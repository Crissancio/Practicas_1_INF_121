class Banco:
    def __init__(self):
        self.usuarios = {}

    def añadir_usuario(self, nombre, saldo=0):
        if len(self.usuarios) < 10:
            self.usuarios[nombre] = saldo
            print("Añadiste un usuario")
        else:
            print("Maximo de usuarios alcanzado")

    def retiro_de_dinero(self,nombre, cantidad):
        if nombre in self.usuarios and self.usuarios[nombre] >= cantidad:
            self.usuarios[nombre]-= cantidad
            print(f"Retiro:${cantidad}")
        else:
            print("No hay suficiente saldo")

    def depositar_dinero(self, nombre, cantidad):
        if nombre in self.usuarios:
            self.usuarios[nombre] += cantidad
            print(f"Deposito:${cantidad}")
            
    def bonos_aplicados(self):
        for nombre in self.usuarios:
            self.usuarios[nombre] *= 1.02
            
    def mostrar_saldo(self):
        for nombre, saldo in self.usuarios.items():
            print(f"{nombre}:${saldo:.2f}")
            
    def monto_total(self):
        total = sum(self.usuarios.values())
        print(f"Monto total del usuario en el banco: ${total:2f}")
        
Usuario1 = Banco()
Usuario2 = Banco()
Usuario1.añadir_usuario("Juan", 1000)
Usuario2.añadir_usuario("Maria", 800)

Usuario1.depositar_dinero("Juan", 500)
Usuario2.depositar_dinero("Maria", 1000)

Usuario1.retiro_de_dinero("Juan", 400)
Usuario2.retiro_de_dinero("Maria", 600)

Usuario1.bonos_aplicados()
Usuario2.bonos_aplicados()

Usuario1.mostrar_saldo()
Usuario2.mostrar_saldo()

Usuario1.monto_total()
Usuario2.monto_total()
