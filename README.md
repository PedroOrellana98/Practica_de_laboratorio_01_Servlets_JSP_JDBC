## PRÁCTICA DE LABORATORIO

## CARRERA: COMPUTACION ASIGNATURA: PLATAFORMAS WEB

## NRO. PRÁCTICA: 2

TÍTULO PRÁCTICA: Desarrollo de una aplicación JEE basado en Servlets, JSP y
JDBC para el intercambio de datos en un modelo de tres capas aplicando los patrones
diseño de software MVC y DAO

OBJETIVO ALCANZADO:

- Diseñar y desarrollar modelos de software en diferentes niveles de abstracción y modelos de datos a
    nivel transaccional y analítico con entornos de desarrollo actuales

## ACTIVIDADES DESARROLLADAS

1. Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 01: Servlets, JSP y JDBC”
2. Desarrollar una aplicación con tecnología JEE para gestionar requerimientos de compra en la web.
3. Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación.
4. Generar el informe de la práctica con el desarrollo de cada uno de los puntos descritos anteriormente.
5. Implementar el README del repositorio del proyecto con la misma información del informe de la práctica
6. Subir al AVAC el informe del proyecto en formato *.pdf. El informe debe contar con conclusiones
    apropiadas y la firma de cada estudiante
Instrucciones

Se pide desarrollar una aplicación JEE que permita gestionar requerimientos de compras de varias empresas. En
donde, un usuario pertenece a una sola empresa. Y una empresa cuenta con muchos productos, los cuales están
organizados en diferentes categorías. Sin embargo, un producto puede pertenecer a una sola categoría. La
finalidad de la aplicación es que el usuario pueda ingresar a través de un inicio de sesión y pueda registrar un
requerimiento para la compra de varios productos. Además, que pueda ver el estado de la compra.

Los requerimientos funcionales del sistema son:

- La aplicación deberá manejar dos roles “Usuario” y “Administrador”
- Un “usuario” y “administrador” puede iniciar sesión usando su correo y contraseña.
- Una vez iniciado sesión el “usuario” podrá:
    o Registrar, modificar, eliminar, buscar y listar sus requerimientos de compra
- Una vez iniciado sesión el “administrador” podrá:
    o Registrar, modificar, eliminar, buscar y listar los productos de la empresa a la que pertenece
    o Listar todos los requerimientos de compra de los “usuarios” de la empresa a la que pertenece
    o Aprobar o Rechazar los requerimientos de compra de los “usuarios” de la empresa a la que
       pertenece.


Nota: Filtrar los productos por la empresa a la cual el usuario pertenece

De igual manera, se pide manejar sesiones y filtros para que existe seguridad en el sistema. Por lo qué, debe
existir una parte pública y una privada. La parte privada ha sido descrita en los requisitos antes planteados. Y la
parte pública será una página index.html a través de la cual podrán acceder al sistema. Además, en la parte
pública se debe mostrar un catálogo de los productos filtrados por cada empresa. Se debe generar una página
con la experiencia e interfaz de usuario apropiada, como la que se muestra a continuación.

Nota: el sistema debe aplicar los patrones de diseño de software MVC y DAO, en donde, el modelo será clases
POJOs de Java, la vista será JSP + JSTL y los controladores serán a través de DAOs y Servlets.


Fig 3. Pagina pública index.html propuesta para el sistema de agenda telefónica

## RESULTADO(S) OBTENIDO(S):

# 1. Creación de un repositorio:

URL del Repositorio: https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC.git

Nombres de Usuario: PedroOrellana98, DavidCornejoB, Dperaltat

![Image 1](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/0.PNG)

# 2. Desarrollo de la aplicación JEE:

Como primer paso debemos definir la arquitectura que se va a usar dentro de la aplicación JEE, en este caso es la
arquitectura cliente servidor, la cual sigue un patrón de diseño DAO la cual se conecta con los Servlets y un
controlador de la arquitectura MVC (Modelo, Vista, Controlador), para realizar las operaciones y validaciones que
vienen de la base de datos MySQL.

![Image 2](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/1.jpg)

El proyecto estará dividido en varias secciones, el Web Content que contiene la parte de la vista como lo son los
JSP o la parte de HTML de la página web, las imágenes para los estilos de la página, los estilos CSS de la página,
y las librerías para la conexión entre los JSP, los controladores y la base de datos.

La parte de los controladores se encuentra en los recursos de Java los cuales están divididos en 4 paquetes:
controlador, dao, modelo y jdbc.

- El paquete controlador esta conformado por 11 Servlets los cuales reciben peticiones de GET y POST.
- El paquete dao esta conformado por 8 clases java que unen el modelo con el controlador.

- El paquete modelo esta conformado por 5 clases de java las cuales tienen atributos que se pueden obtener
    y colocar información.
- El paquete jdbc esta conformado por 7 clases java las cuales crean sentencias de la base de datos y crean
    la conexión con la misma.

Página Principal:

![Image 3](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/39-1.PNG)

![Image 4](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/39-2.PNG)

![Image 5](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/2-1.png)

![Image 6](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/2-2.png)

# 2.1 JSP: Composición de JSPs, visualizar tablas y conexión con JSTL

Composición JSPs

Existen 12 archivos con extensión JSP de los cuales la parte publica se encuentra el index.jsp que es la pagina de
inicio y el InicioSesion.jsp que es la parte del login del Usuario y el Administrador. Para la parte privada están los
archivos: ActualizarAdmin.jsp, Admin.jsp, Agregar.jsp, AgregarProducto.jsp, Buscar.jsp, BuscarAdmin.jsp,
EliminarAdmin.jsp, Listar.jsp, ListarAdmin.jsp y Usuario.jsp.

- ActualizarAdmin.jsp: Actualiza el nombre del producto que desea por otro, por ejemplo: cambiar el nombre
    de la laptop LAPTOP_GS3 a LAPTOP_GS 5
    
![Image 7](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/3.PNG)

- Admin.jsp: Es la pagina de inicio del administrador en la cual encontramos las opciones de listar, eliminar,
    insertar, buscar, actualizar producto.

![Image 8](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/4.PNG)

- Agregar.jsp: Agrega un requerimiento a un producto con un estado de “E” = en espera.

![Image 9](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/9.PNG)

- AgregarProducto.jsp: Agrega un producto al catalogo de la empresa que se desea con su respectiva
    categoría, como ejemplo:
    - Nombre del producto: SOBREMESA_GL6 5
    - Categoría del producto: 1 - > pertenece a SOBREMESA
    - Requerimiento del producto (id de Persona): 1 - > pertenece a DAVID CORNEJO

![Image 10](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/5.PNG)
    
- Buscar.jsp: Busca un producto en la lista de productos que están en la base de datos.
- BuscarAdmin.jsp: Busca un producto en la lista de productos que están en la base de datos.

![Image 11](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/11.png)

- EliminarAdmin.jsp: Elimina un producto que se encuentre dentro de la empresa ejemplo: SOBREMESA_G
    de la empresa MSI.

![Image 12](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/6.PNG)

- Listar.jsp: Lista todos los productos de la empresa con el id de requerimiento al cual está asociado.
- ListarAdmin.jsp: Lista todos los productos de la empresa con el id de requerimiento al cual está asociado.

![Image 13](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/7.PNG)

- Usuario.jsp: Es la página de inicio del usuario en la cual encontramos las opciones de listar, insertar, buscar,
    actualizar requerimientos.

![Image 14](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/8.PNG)

Nota: En la página principal de index.jsp, como el de usuario.jsp y admin.jsp se puede encontrar un botón el cual
lista los productos o requerimientos de una forma mas detallada como: el id, nombre del producto, categoría, y
empresa.

Visualizar tablas

Para poder mostrar las consultas de mysql en una tabla se debe crear una etiqueta de expresión <c:out> la cual
imprime valor por valor la información de salida desde el servlet, como ejemplo esta un comando que muestra la
lista por columnas: <c:forEach var="pr" items="${productos}">

<tr>

<td>${pr.idProducto}</td>

<td>${pr.nombre}</td>

</tr>

</c:forEach>

Esta etiqueta se utiliza dentro de la librería de JSTL.

Conexión con JSTL

Dentro de los archivos JSP se debe llamar a las librerías de conexión de JSTL, las cuales nos van a ayuda a
imprimir los datos en las tablas de JSP, para ello tenemos que llamarlas desde el inicio del archivo con los
comandos:

<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

Para que estos funcionen las librerías debe estar previamente cargadas en la carpeta WEB-INF.

![Image 15](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/11.png)

# 2.2 JDBC: Composición de JDBCs, sentencias SQL y conexión con MySQL

Composición de JDBCs

Contiene 7 clases que unen a la base de datos con el controlador y el dao, la clase que conecta el JDBC con la
base es ContextJDBC.java, para la ejecución de las sentecias sql se utiliza la clase JDBCGenericDAO.java la cual
es una clase abstracta e implementa la clase GenericDAO.java.

Las clases como JDBCCategoria.java, JDBCUsuario.java, JDBCProducto.java, JDBCEmpresa.java,
JDBCRequerimiento.java, sirven para ejecutar los métodos de crear, leer, insertar, modificar, listar de la base de
datos.

En la clase JDBCUsuarioDAO.java se tiene variables globales las cuales obtienen los id del usuario, id de Empresa,
clave del usuario, correo del usuario y el rol asignado:

public static String nuevoCorreo;

public static String nuevoClave;

public static String id;

public static String idEmpresa;

public static String rol;

Cada variable sirve para identificar al usuario ya sea por el rol para el inicio de sesión o para identificar la empresa
a la que el usuario pertenece.

Sentencias SQL

- Buscar id de usuario

Se realiza una consulta en la cual se va a seleccionar el id del usuario y el rol del usuario según los parámetros de
entrada que son el correo y la clave que se obtienen del JSP de Inicio de Sesión.

El id y el rol se guardan en variables globales para utilizarlas en otros métodos, para colocar el valor del id se utiliza
el comando rs.getString("id"); y para el rol el comando: rs.getString("id");

![Image 16](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/12.PNG)

- Buscar id de empresa

Se realiza una consulta en la cual se va a seleccionar el id de la empresa a partir del id del usuario que se había
guardado en una variable global con anterioridad.

El id de la empresa se guarda en una variable global para utilizarlas en otros métodos, para colocar el valor del id
de empresa se utiliza el comando rs.getString("id");

![Image 17](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/13.PNG)

- Listar productos de empresa

Para obtener una lista de productos según la empresa a la que pertenece se debe tener primero el id de empresa
la cual se va a relacionar con los productos que esta tiene, por lo que es necesario obtener la id de empresa global
para la sentencia.

Como es una lista que va a retornar y son múltiples clases que se van a tomar en cuenta se debe realizar la misma
sentencia para 3 distintas clases como:

- List<Producto> listarProductos
- List<Empresa> listarEmpresas
- List<Requerimiento> listarRequerimientos

Que son las 3 combinaciones de tablas que se necesitan para imprimir los resultados en la tabla de listar ya sea
para un usuario o para el administrador.

![Image 18](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/14.PNG)

- Buscar Producto

Para buscar un producto según la empresa a la que pertenece se debe tener primero el id de empresa la cual se
va a relacionar con los productos que esta tiene, por lo que es necesario obtener la id de empresa global para la
sentencia, y tener un parámetro de búsqueda para seleccionar el nombre especifico del producto.

Como es una lista que va a retornar y son múltiples clases que se van a tomar en cuenta se debe realizar la misma
sentencia para 2 distintas clases como:

- List<Producto> listarProductos
- List<Categoria> listarCategorias

Que son las 2 combinaciones de tablas que se necesitan para imprimir los resultados en la tabla de listar ya sea
para un usuario o para el administrador.


![Image 19](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/15.PNG)

- Actualizar Requerimiento

Se realiza una consulta en la cual se va a actualizar el requerimiento de producto pasando de un estado de “R” - >
rechazado a un estado de “E” - > en camino, a partir del id de la empresa, y el correo de la persona que ingreso,
además de utilizar un parámetro de entrada para determinar el nombre de producto a actualizar.

![Image 20](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/16.PNG)

- Actualizar Producto

Se realiza una consulta en la cual se va a actualizar el producto utilizando 2 parámetros: el primero para actualizar
el nombre que se ingrese dentro del formulario y el segundo el nombre del producto que necesita actualizar, esto
a partir del id de la empresa, y el correo de la persona que ingreso.

![Image 21](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/17.PNG)

- Insertar Producto y seleccionar id máximo

Se crea una consulta en la cual se va a insertar un producto utilizando 3 parámetros de ingreso: el primero según
el nombre del producto que desee actualizar, el segundo la categoría a la cual pertenece el producto (en números)
y la última que hace referencia al requerimiento de compra del producto.

Dentro de la sentencia se obtiene un id el cual es el id del producto final ejemplo: supongamos que el ultimo producto
con el nombre LAPTOP_GL63 tiene el id 10 entonces se obtiene el ultimo identificador de todos los valores posibles
que en este caso es 10 y se le incrementa en 1 cada vez para insertar un producto, esto se realiza para que no
exista un problema de llaves primarias dentro de la base de datos.

![Image 22](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/18.PNG)

![Image 23](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/19.PNG)

- Eliminar Producto

Se crea una consulta en la cual se va a eliminar un producto utilizando 1 parámetro de ingreso el cual es el nombre
del producto al que deseo eliminar de la base de datos y el id de la empresa que se obtiene de la variable global
de la clase JDBCUsuarioDAO.java

![Image 24](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/20.PNG)

Conexión con MySQL

Para realizar una conexión de la base de datos SQL se debe tener la clase ContextJDBC.java en la cual se va a
digitar los valores del nombre del esquema de lavase, el usuario de la base de datos registrada, la clave de la base
de datos y si es necesario cambiar el puerto escucha (por defecto es el puerto 3306)

![Image 25](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/21.PNG)

# 2.3 Servlets: Composición de Servlets, métodos GET y POST y filtro

Los servlets se encuentra en el paquete del controlador con un total de 11 clases las cuales tienen métodos post y
get para enviar y recibir datos de un JSP y de un JDBC.

Existe solo un servlet que utiliza el método doFilter que realiza el filtro de sesiones según cuantas veces a iniciado
el Usuario dentro de la página para evitar problemas de conexión y por métodos de seguridad para no dejar una
sesión abierta el mayor tiempo.

Para empezar a utilizar los servlets necesitamos enviar una respuesta que es la url a la cual va a redirigir el servlet
si se cumplen una condición y la petición que se envía del formulario del JSP.

El comando de redirección y de despacho es el siguiente: request.getRequestDispatcher(url).forward(request,
response);

Nota: Se utiliza el atributo global rol de la clase JDBCUsuarioDAO.java para comparar los roles.

- Buscar Controlador

GET: en el método GET del controlador lo que se realiza es redirigir al usuario según el rol que tenga a la página
que corresponde como, por ejemplo: si el rol es “U” se redirige a la página buscar del usuario, y si el rol es “A” se
redirige a la página buscar del administrador.

POST: el método POST lo que realiza es obtener el texto del formulario de y la acción del botón Buscar.jps, después
lo que se hace es insertar dentro de la lista de productos y categorías los valores que se obtuvo de los parámetros

del formulario, cuando se hayan insertado los valores se van a colocar dentro del JSTL, para después imprimir en
la tabla del JSP en tiempo real redireccionando a la misma página si se cumplió la condición, si no es así no se
ejecutara la acción dentro de las listas y no se ejecutara la sentencia en la base de datos.

![Image 26](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/22.PNG)

![Image 27](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/23.PNG)

- Eliminar Producto

GET: en el método GET del controlador lo que se realiza es redirigir al usuario a la pagina que corresponda, como
solo puede acceder a esta función el administrador se le redirige a la página eliminar producto.

POST: el método POST lo que realiza es obtener el texto del formulario y la acción del botón EliminarAdmin.jps,
después lo que se hace es validar las acciones de los botones, si se acciono el botón manda a llamar al método de
eliminarProducto que está dentro del paquete jdbc, en el cual el método recibe un parámetro de tipo String que es
el texto que se ingresó en el formulario.

![Image 28](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/24.PNG)

- Index Controlador

POST: el método POST lo que se hace es obtener el dao de la empresa, el producto y la categoría para insertarlos
dentro de cada una de las listas, de las cuales se van a imprimir en la tabla de la pagina principal index.js, después
lo que se hace es validar las acciones de los botones, si se acciono el botón manda a llamar a los métodos
listarPrincipal, listarPrincipal 1 , listarPrincipal 2 que está dentro del paquete jdbc.

![Image 29](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/25.PNG)

- Insertar Producto

GET: en el método GET del controlador lo que se realiza es redirigir al usuario a la página que corresponda, como
solo puede acceder a esta función el administrador se le redirige a la página insertar producto, mientras se manda
a ejecutar el método de leerMaximo que corresponde al último id del producto que está localizado en el
JDBCProductoDAO.java.

POST: el método POST lo que realiza es obtener el texto del formulario y la acción del botón AgregarProducto.jps,
después lo que se hace es validar las acciones de los botones, si se acciono el botón manda a llamar al método
nuevoProducto que está dentro del paquete jdbc, en el cual el método recibe 3 parametros que son del texto de
ingreso del formulario, cabe mencionar que dos variables son enteras y una es String.

![Image 30](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/26.PNG)

![Image 31](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/27.PNG)

- Listar Producto Controlador

GET: en el método GET del controlador lo que se realiza es redirigir al usuario según el rol que tenga a la página
que corresponde como, por ejemplo: si el rol es “U” se redirige a la página listar del usuario, y si el rol es “A” se
redirige a la página listar del administrador.

POST: el método POST lo que realiza es obtener el texto del formulario y la acción del botón Listar.jps y para el
administrador ListarAdmin.jsp, después lo que se hace es validar las acciones de los botones, si se acciono el botón
manda a llamar al método listarProductos que está dentro del paquete jdbc.

![Image 32](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/28.PNG)

- Login

GET: en el método GET del controlador lo que se realiza es redirigir al usuario según el rol que tenga a la página
que corresponde como, por ejemplo: si el rol es “U” se redirige a la página listar del usuario, y si el rol es “A” se
redirige a la página listar del administrador. Además, se debe instanciar la sesión HTTP y esta atribuirle un punto
de acceso al sistema para que cuando salga se active un filtro y no pueda acceder de nuevo al inicio del usuario o
del administrador.

POST: el método POST lo que se hace es obtener el dao del usuario para insertarlos dentro de la clase, cuando
se hay instanciado el dao se llama al método buscar de la clase JDBCUsuaroioDAO la cual va a recibir como
parámetros: correo y clave de la página InicioSesion.jsp, a continuación se llama al dao de la empresa para buscar
el id de la empresa que está en el método buscarEmpresa, una vez realizado todo este proceso entra a cada uno
de las paginas principales JSP administrador o usuario.

![Image 33](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/29.PNG)

![Image 34](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/30.PNG)

- Registrar Administrador

GET: en el método GET del controlador lo que se realiza es redirigir al usuario a la página que corresponda, como
solo puede acceder a esta función el administrador se le redirige a la página actualizar admin.

POST: el método POST lo que realiza es obtener el texto del formulario y la acción del botón ActualizarAdmin.jps,
después lo que se hace es validar las acciones de los botones, si se acciono el botón manda a llamar al método
actualizarProducto que está dentro del paquete jdbc, en el cual el método recibe 2 parámetros que son del texto de
ingreso del formulario, de estos son el nombre del producto que desea cambiar y el nuevo nombre del producto.

![Image 35](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/31.PNG)

- Registrar Controlador

GET: en el método GET del controlador lo que se realiza es redirigir al usuario a la página que corresponda, como
solo puede acceder a esta función el usuario se le redirige a la página agregar.

POST: el método POST lo que realiza es obtener el texto del formulario y la acción del botón Agregar.jps, después
lo que se hace es validar las acciones de los botones, si se acciono el botón manda a llamar al método
actualizarRequerimiento que está dentro del paquete jdbc, en el cual el método recibe 1 parámetro el cual dentro
de la base pasa a estar un requerimiento en estado de espera “E”. Solo se debe ingresar el nombre del producto
que quiere registrar como requerimiento.

![Image 36](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/32.PNG)

- Usuario Controlador

POST: el método POST lo que realiza es obtener el texto del formulario y la acción del botón Usuario.jps y del
administrador Admin.jsp, después lo que se hace es validar las acciones de los botones, si se acciono el botón
manda a llamar a los métodos listarProducto, listarProducto0, listarProducto1, que están dentro del paquete jdbc,
en el cual el método recibe cada uno un parámetro que es la lista de requerimientos, productos y empresa.

![Image 37](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/33.PNG)

- Filtro

FILTER: en este método lo que se realiza es obtener el id de la sesión a la cual estamos conectados, si el atributo
de acceso o la sesión es nula nos redireccionara al inicio de sesión, ya que nunca iniciamos sesión, por el contrario,
si teníamos iniciado sesión los filtros no se activaran y no tendremos ningún problema al rato de acceder a cada
pagina del usuario o del administrador.

Los WebFilter son las paginas que se vana bloquear si no inicio sesión estos son:

@WebFilter({"/Filtro", "/JSPs/Usuario.jsp", "/JSPs/Admin.jsp", "/JSPs/ActualizarAdmin.jsp", "/JSPs/Agregar.jsp",
"/JSPs/AgregarProducto.jsp", "/JSPs/Buscar.jsp", "/JSPs/BuscarAdmin.jsp", "/JSPs/EliminarAdmin.jsp",
"/JSPs/Listar.jsp", "/JSPs/ListarAdmin.jsp"})

![Image 38](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/34.PNG)

- Salir

GET: en el método GET del controlador lo que se realiza es verificar si la sesión se creo y si la sesión esta siendo
utilizada la invalida y la setea con un valor de null para no permitir el ingreso a la paginas privadas.

![Image 39](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/35.PNG)

## CONCLUSIONES:

Podemos concluir que el uso de JDBC con el servicio de JSTL nos sirve para manejar de una mejor manera las
bases de datos en conjunto con java y el servicio web

## RECOMENDACIONES:

Utilizar las siguientes paginas web para entender mejor JSTL y JSP

https://www.tutorialspoint.com/jsp/jstl_core_out_tag.htm

https://www.tutorialspoint.com/jsp/jsp_syntax.htm


Nombre de estudiantes: Pedro Orellana David Cornejo Daniel Peralta

# Firma de estudiante:

![Image 40](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/36.png)

![Image 41](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/37.png)

![Image 42](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/38.png)

 
