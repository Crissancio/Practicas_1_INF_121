class Cocinero:
    def __int__(self,nombre,sueldo_mes,horas_extras,sueldo_hora):
        self.n=nombre
        self.sm=sueldo_mes
        self.hex=horas_extras
        self.sh=sueldo_hora
    def mostrar(self):
        st=self.sm+(self.hex * self.sh)
        print(f"cocinero : {self.n}, sueldo total: {st}")
class Mesero:
    def __int__(self, nombre, sueldo_mes, horas_extras, sueldo_hora,propina):
        self.n = nombre
        self.sm = sueldo_mes
        self.hex = horas_extras
        self.sh = sueldo_hora
        self.p=propina

    def mostrar(self):
        st = self.sm + (self.hex * self.sh)+self.p
        print(f"cocinero : {self.n}, sueldo total: {st}")
class Administrativo:
    def __init__(self,nombre,sueldo_mes,cargo):
        self.n=nombre
        self.sm=sueldo_mes
        self.c=cargo
    def mostrar(self):
        print(f"administrativo: {self.n} ,cargo: {self.c} ,sueldo: {self.sm}")

c1=Cocinero ("pedro",2500,10,50)
m1=Mesero ("juan",1800,10,5,20)
m2=Mesero ("carlos",1900,5,6,150)
ad1=Administrativo ("ana",3000,"gerente")
ad2=Administrativo ("luis",2800,"supervisor")
c1.mostrar()
m1.mostrar()
m2.mostrar()
ad1.mostrar()
ad2.mostrar()


