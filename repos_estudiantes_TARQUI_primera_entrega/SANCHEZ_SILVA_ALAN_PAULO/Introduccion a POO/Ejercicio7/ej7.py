class Celular:
    def __init__(self):
        self.__apps = [""]*21
        self.__espacio = 1024
        self.__bateria = int(input("Ingrese el porcentaje de la bateria actual:")) 
        self.__esError = False
        self.__pesoApp = 0
        self.__tope = 1
        
    def instalarApp(self):
        self.__apps[0] = "------"
        if self.__bateria > 0 and self.__bateria <= 100:
            self.__apps[self.__tope] = input("Aplicacion a instalar:")
            self.__tope += 1
            self.__peso_app = float(input("Ingrese cuanto pesa la app:"))
            if self.__peso_app <= 0:
                print("Error, entrada invalida")
            elif self.__peso_app >= 1024:
                print("Espacio lleno")
                exit()
            else:
                self.__espacio -= self.__peso_app
        else:
            print("ERROR, FUERA DE RANGO")
            self.__esError = True
            print("El celular esta apagado")
    def usarApp(self):
        if self.__esError == False: 
            print(
                f''' -------APPS INSTALADAS--------
                1. {self.__apps[1]}
                2. {self.__apps[2]}
                3. {self.__apps[3]}
                4. {self.__apps[4]}
                5. {self.__apps[5]}
                6. {self.__apps[6]}
                7. {self.__apps[7]}
                8. {self.__apps[8]}
                9. {self.__apps[9]}
                10. {self.__apps[10]}
                11. {self.__apps[11]}
                12. {self.__apps[12]}
                13. {self.__apps[13]}
                14. {self.__apps[14]}
                15. {self.__apps[15]}
                16. {self.__apps[16]}
                17. {self.__apps[17]}
                18. {self.__apps[18]}
                19. {self.__apps[19]}
                20. {self.__apps[20]}
                '''
            )
            entrada = int(input("Ingresa en numero de app que deseas abrir:"))
            for i in range(len(self.__apps)):
                if i == entrada:
                    print(f"Ejecutando la app de {self.__apps[entrada]}....")
            tiempo = int(input("Ingrese cuántos minutos usara la app:"))
            if self.__peso_app >  100 :
                consumo = (tiempo // 10) * 2
            elif self.__peso_app > 250:
                consumo = (tiempo // 10) * 5
            else:
                consumo = (tiempo // 10) * 1
            
            if consumo >  self.__bateria:
                print("La bateria no alcanza para usar esta app ese tiempo")
                self.__bateria = 0
            else:
                self.__bateria -= consumo
            
            if self.__bateria == 0:
                print("Celular apagado, bateria agotada")
            else:
                print(f"Usaste la app durante {tiempo} minutos ")
                print(f"Bateria restante: {self.__bateria}%")
    
    def mostrarBateria(self):
        print(f"Queda {self.__bateria}% de bateria")

#Main
celular = Celular()
celular.instalarApp()
celular.instalarApp()
celular.instalarApp()
celular.instalarApp()
celular.instalarApp()
celular.instalarApp()
celular.usarApp()
celular.mostrarBateria()