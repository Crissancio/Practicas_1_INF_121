import os
import shutil

# Ruta base donde están los clones
base_path = "./repos_estudiantes_TARQUI_primera_entrega"

# Verifica si la ruta existe
if not os.path.exists(base_path):
    print(f"La carpeta {base_path} no existe.")
    exit()

# Recorre cada subcarpeta
for nombre_carpeta in os.listdir(base_path):
    ruta_carpeta = os.path.join(base_path, nombre_carpeta)

    if os.path.isdir(ruta_carpeta):
        ruta_git = os.path.join(ruta_carpeta, ".git")

        if os.path.exists(ruta_git):
            try:
                shutil.rmtree(ruta_git)
                print(f"✅ .git eliminado en: {nombre_carpeta}")
            except Exception as e:
                print(f"❌ Error eliminando .git en {nombre_carpeta}: {e}")
        else:
            print(f"ℹ️ No se encontró .git en: {nombre_carpeta}")

print("\n🧹 Limpieza finalizada.")
