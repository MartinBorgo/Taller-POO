# Taller de Programacion Orientado a Objetos.
<b> Este repositorio es el taller de programacion orientada a objetos de la facultad de administracion UNER </b>
### Integrantes del grupo:
- Martin Borgo.
- Sebastian Haoys.
- Leandro Molina.

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
<p>La diferencia entre el admin y bibliotecario, es la cantidad de funcionalidades que tienen permitidas. </p>

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
[Link para Barcode to PC.](https://barcodetopc.com/ "Link para Barcode to PC.")<br>
![](https://barcodetopc.com/wp-content/themes/barcodetopc/assets/images/logo.png)<br>

## Funcionalidades
Cuando se inicia sesion dependiendo del usuario se tendran mas o menos funcionalidades. Tomaremos todas las funcionalidades del administracion para esta explicacion.
Las funcionalidades son:
- Gestion Ejemplares
- Listados
- Prestamo
- Registrar nuevo lector
- Registrar obra
- Ayuda<br>

### Gestion ejemplares
Muestra todos los ejemplares cargados, se muestra de cada ejemplar el codigo de barras, fecha de adquisicion, forma de adquisicion, estado y ubicacion en la biblioteca.
En la parte de abajo posee 3 botones cuales son:
- **Realizar observacion**: Permite dejar un comentario sobre el ejemplar (Ejemplo: el ejemplar 20 tiene las paginas 19-22 con daños.), debe seleccionar un ejemplar del listado y hacer click sobre el boton **Realizar observacion** apareciendo una ventana que le permite escribir la observacion correspondiente con el ejemplar, para guardar la observacion presione en **Hecho** guardando la observacion. Para eliminar la observacion ingrese nuevamente a realizar observacion y borre el texto escrito. Dandole a **Hecho** para guardar el cambio.
- **Dar de baja**: Permite dar de baja un libro, como en Realizar observacion tiene que seleccionar un ejemplar del listado, y darle a **Dar de baja**. Se le pedira motivo de la baja y ubicacion de la baja del ejemplar.
- **Actualizar lista**: Refresca el listado de ejemplares cargados (Si cargo nuevas obras o presto algun ejemplar favor de refrescar los ejemplares para mostrar los nuevos datos.).


### Listados
Permite la filtracion, busqueda y ordenar: lectores, obras y ejemplares por diferentes modos. En total cuenta con 8 metodos de filtro.
- Listado de lectores que no han devuelto al momento obras y ya se encuentran fuera de plazo de devolución.
- Listado de las obras más solicitadas por alumnos y docentes.
- Listado de las obras más solicitadas por público en general.
- Ejemplares disponibles para préstamo para un área de referencia determinada.
- Obras que se encuentran reservadas a partir de una fecha determinada.
- Listado de lectores que tuvieron multas en cierto periodo de tiempo.
- Ranking de lectores por cantidad de multas aplicadas.
- Listado de obras dada una editorial determinada.


### Prestamo 
Permite el prestamo de ejemplares por sala o domicilio, en adicion a esto cuenta para realizar reservaciones de ejemplares, como tambien registrar devoluciones de los ejemplares.

Para el prestamo del ejemplar se requiere, el tipo de prestamo (sala o domicilio), codigo de barras del ejemplar y documento del lector. Si cumple estos datos darle a **Registrar prestamo** con esto el ejemplar queda prestado (Vease gestionar ejemplares -> actualizar lista).

El boton **Realizar reservacion** permite reservar un ejemplar para un lector en una fecha en especifico. Se requiere codigo de barras del ejemplar, DNI del lector y la fecha de la reservacion. Darle a **registrar** para que se guarde la reservacion.

El boton **registrar devolucion** requiere el ingreso del codigo de barras del ejemplar para ser devuelto.

### Registrar nuevo lector
Permite agregar un nuevo lector, con todos sus datos a la "base de datos" de la biblioteca, para poder registrar correctamente al lector se debe llenar todos sus datos, en caso de que sea ***lector general*** no hace falta introducirle una carrera. Pero en caso de que el lector sea ***Alumno o Docente*** este campo debe ser completado de manera obligatoria.
Una vez llenado todos los campos solo debe pulsar el boton **Registrar**

### Registrar obra
Permite registrar una nueva obra a la "base de datos" de la biblioteca, para hacer esto se debe completar todos los campos y apretar el boton **Cargar datos** y se crearan de forma automatica la cantidad de ejemplares de esa obra. En caso de que algun campo no desee ser completado, por ejemplo el de segundo y tercer autor, solo basta con ponerle un espacio y se cargara correctamente la obra.

### Ayuda
Se debe tener algunas concideraciones en el caso de los listados:

- En caso de ejemplares disponibles por area de referencia: recomendamos poner las areas de referencias Calculo, Programacion
- En caso de Obras dada una editorial determinada: recomendamos poner Cengage Learning, Alfaomega Grupo Editor, Pearson
- En caso de Lectores multados en un periodo de tiempo: si bien se puede poner cualquier fecha, si quiere ver alguna diferencia recomendamos las fechas 12/05/2022 hasta el 12/11/2022
- En caso de Obras reservadas a partir de una fecha determinada: recomendamos poner las fechas 10/03/2022 o 22/11/2022
