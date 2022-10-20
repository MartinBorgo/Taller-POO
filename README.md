# Taller de Programacion Orientado a Objetos.
<b> Este repositorio es el taller de programacion orientada a objetos de la facultad de administracion UNER </b>
Integrantes:
- Martin Borgo.
- Sebastian Haoys.
- Cesar de Maurizio.
- Leandro Molina.
- Gabriel (Libre).

## ¿De que trata el proyecto?
Se trata de resolver el nuevo sistema de control de prestamos solicitado por la biblioteca de la FCAD, cumpliendo los requerimientos solicitados.

## Instalacion del proyecto.
El proyecto puede ser descargado por medio .ZIP o por medio de comandos de git (git clone). En estos 2 metodos el proyecto funciona correctamente.

## Funcionamiento del proyecto.
Este para su ejecucion se realiza desde el main, ubicado en:
    Taller-POO/src/main/java/com/mycompany/taller/poo/Main.java
Al ejecutarlo le habra una pantalla de inicio sesion esta podra iniciarse con los siguentes bibliotecarios y contreseña:
- Norma 12345 (Admin)
- Eduardo hola01 (bibliotecario)
- Ana 345 (bibliotecario)
- Elisa 1111a (bibliotecario)
La diferencia entre el admin y bibliotecario, es la cantidad de funcionalidades que tienen permitidas.

|  Funcionalidades | Admin | Bibliotecario
| ----------- | ------------ | ------------ |
|Gestion ejemplares | Si | No
|Listados | Si | Si |
| Prestamo |Si | Si |
|Registrar lector | Si | Si |
| Registrar obra | Si | No |

## Dependencias usadas.
### Generacion de barcodes.
Se utiliza la libreria barbecue version 2.0, instalada localmente desde maven.
Esta ubicada en la carpeta Taller-POO/libreria.
Para mas informacion de esta libreria vea [ACA.](https://sourceforge.net/projects/barbecue/files/http:// "ACA")

### Lectura de barcodes.
Los barcodes generados de los ejemplares son guardados en la siguiente direccion:
Taller-POO/src/main/java/codigoDeBarras
Son archivos .PNG para su escaneo.
Recomendamos para el escaneo de los barcodes el programa **Barcode to PC** que posee aplicacion de escritorio y celular.
Este posee conexion entre la computadora y el celular por medio de Wi-Fi, se hace una vinculacion entre los dispositivos para su funcionamiento.
[Link para Barcode to PC.](https://barcodetopc.com/ "Link para Barcode to PC.")
