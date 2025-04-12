from multimethod import multimethod
class Cocinero:
    def __init__(self,nombre:str, sueldoMes:int,horasExtra:int,sueldoHora:float):
        self.nombre=nombre
        self.sueldoMes=sueldoMes
        self.horasExtra=horasExtra
        self.sueldoHora=sueldoHora
class Mesero:
    def __init__(self,nombre:str, sueldoMes:int,horasExtra:int,sueldoHora:float,propina:float):
        self.nombre=nombre
        self.sueldoMes=sueldoMes
        self.horasExtra=horasExtra
        self.sueldoHora=sueldoHora
        self.propina=propina
class Administrativo:
    def __init__(self,nombre:str, sueldoMes:float,cargo:str):
        self.nombre=nombre
        self.sueldoMes=sueldoMes
        self.cargo=cargo
@multimethod
def sueldoTotal(c: Cocinero):
    print("El suelto total del cocinero ",c.nombre,"es:")
    return c.sueldoMes + (c.horasExtra * c.sueldoHora)
        
@multimethod
def sueldoTotal(m: Mesero):
    print("El suelto total del mesero ",m.nombre,"es:")
    return m.sueldoMes + (m.horasExtra * m.sueldoHora) + m.propina
       
@multimethod
def sueldoTotal(a:Administrativo):
    print("El suelto total del administrativo",a.nombre,"es:")
    return a.sueldoMes

@multimethod
def sueldoMesX( x:int,c:Cocinero,m: Mesero,md: Mesero,a:Administrativo,ad:Administrativo ):
    emp=[c,m,md,a,ad]
    print("LOS empleados con sueldo  mensual X=",x," son: ")
    for em in emp :
        if em.sueldoMes == x:
            print(em.nombre)
@multimethod
def sueldoMesX(x: float,c:Cocinero,m: Mesero,md: Mesero,a:Administrativo,ad:Administrativo):
    print("LOS empleados con sueldo  mensual X=",x," son: ")
    if c.sueldoMes == x:
        print(c.nombre)
    if m.sueldoMes == x:
        print(m.nombre)
    if md.sueldoMes == x:
        print(md.nombre)
    if a.sueldoMes == x:
         print(a.nombre)
    if ad.sueldoMes == x:
        print(ad.nombre)


    
c1=Cocinero("Miguel", 500,4,36.5)
m1=Mesero("Ana",200,2,16.3,13)
m2=Mesero("Pedro",500,3,16.3,7.6)
a1=Administrativo("JAzmin",600,"Gerente")
a2=Administrativo("Felipe",200,"Organizador")


print(sueldoTotal(c1))
print(sueldoTotal(m1))
print(sueldoTotal(m2))
print(sueldoTotal(a1))
print(sueldoTotal(a2))

sueldoMesX(200,c1,m1,m2,a1,a2)

sueldoMesX(500,c1,m1,m2,a1,a2)
