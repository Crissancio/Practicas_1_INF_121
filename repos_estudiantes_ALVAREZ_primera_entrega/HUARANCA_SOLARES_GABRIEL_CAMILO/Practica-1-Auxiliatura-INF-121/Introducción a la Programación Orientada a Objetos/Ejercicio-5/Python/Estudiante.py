class Estudiante:
  def __init__(self,nombre,nota_1,nota_2):
    self.nombre=nombre
    self.nota_1=nota_1
    self.nota_2=nota_2
    
  def promediando(self):
    self.promedio=(self.nota_1+self.nota_2)/2
    return (f"Promedio: {self.promedio}")

  def aproboureprobo(self):
    if(self.promedio>=6):
      return (f"Aprobado")
    else:
      print(f"Reprobado")
  def muestraestudiante(self):
    return (f"Estudiante: {self.nombre}")

est1 = Estudiante("Dayra",7,9)
print("---------------------------------------------------------------------")
print("Lista de algunos Estudiantes")
print("---------------------------------------------------------------------")
print(est1.muestraestudiante())
print("1ra Nota: ",est1.nota_1,"pts")
print("1ra Nota: ",est1.nota_2,"pts")
print(est1.promediando(),"pts")
print(est1.aproboureprobo())
print("--------------------------------------------------------------------")
est2 = Estudiante("Joel",3,7)
print(est2.muestraestudiante())
print("1ra Nota: ",est2.nota_1,"pts")
print("1ra Nota: ",est2.nota_2,"pts")
print(est2.promediando(),"pts")
est2.aproboureprobo()
print("--------------------------------------------------------------------")
est3 = Estudiante("Ramiro",5,7)
print(est3.muestraestudiante())
print("1ra Nota: ",est3.nota_1,"pts")
print("1ra Nota: ",est3.nota_2,"pts")
print(est3.promediando(),"pts")
print(est3.aproboureprobo())
print("--------------------------------------------------------------------")
