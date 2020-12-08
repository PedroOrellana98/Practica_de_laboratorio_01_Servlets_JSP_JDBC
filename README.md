## PR�CTICA DE LABORATORIO

## CARRERA: COMPUTACION ASIGNATURA: PLATAFORMAS WEB

## NRO. PR�CTICA: 2

T�TULO PR�CTICA: Desarrollo de una aplicaci�n JEE basado en Servlets, JSP y
JDBC para el intercambio de datos en un modelo de tres capas aplicando los patrones
dise�o de software MVC y DAO

OBJETIVO ALCANZADO:

- Dise�ar y desarrollar modelos de software en diferentes niveles de abstracci�n y modelos de datos a
    nivel transaccional y anal�tico con entornos de desarrollo actuales

## ACTIVIDADES DESARROLLADAS

1. Crear un repositorio en GitHub con el nombre �Pr�ctica de laboratorio 01: Servlets, JSP y JDBC�
2. Desarrollar una aplicaci�n con tecnolog�a JEE para gestionar requerimientos de compra en la web.
3. Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicaci�n.
4. Generar el informe de la pr�ctica con el desarrollo de cada uno de los puntos descritos anteriormente.
5. Implementar el README del repositorio del proyecto con la misma informaci�n del informe de la pr�ctica
6. Subir al AVAC el informe del proyecto en formato *.pdf. El informe debe contar con conclusiones
    apropiadas y la firma de cada estudiante
Instrucciones

Se pide desarrollar una aplicaci�n JEE que permita gestionar requerimientos de compras de varias empresas. En
donde, un usuario pertenece a una sola empresa. Y una empresa cuenta con muchos productos, los cuales est�n
organizados en diferentes categor�as. Sin embargo, un producto puede pertenecer a una sola categor�a. La
finalidad de la aplicaci�n es que el usuario pueda ingresar a trav�s de un inicio de sesi�n y pueda registrar un
requerimiento para la compra de varios productos. Adem�s, que pueda ver el estado de la compra.

Los requerimientos funcionales del sistema son:

- La aplicaci�n deber� manejar dos roles �Usuario� y �Administrador�
- Un �usuario� y �administrador� puede iniciar sesi�n usando su correo y contrase�a.
- Una vez iniciado sesi�n el �usuario� podr�:
    o Registrar, modificar, eliminar, buscar y listar sus requerimientos de compra
- Una vez iniciado sesi�n el �administrador� podr�:
    o Registrar, modificar, eliminar, buscar y listar los productos de la empresa a la que pertenece
    o Listar todos los requerimientos de compra de los �usuarios� de la empresa a la que pertenece
    o Aprobar o Rechazar los requerimientos de compra de los �usuarios� de la empresa a la que
       pertenece.


Nota: Filtrar los productos por la empresa a la cual el usuario pertenece

De igual manera, se pide manejar sesiones y filtros para que existe seguridad en el sistema. Por lo qu�, debe
existir una parte p�blica y una privada. La parte privada ha sido descrita en los requisitos antes planteados. Y la
parte p�blica ser� una p�gina index.html a trav�s de la cual podr�n acceder al sistema. Adem�s, en la parte
p�blica se debe mostrar un cat�logo de los productos filtrados por cada empresa. Se debe generar una p�gina
con la experiencia e interfaz de usuario apropiada, como la que se muestra a continuaci�n.

Nota: el sistema debe aplicar los patrones de dise�o de software MVC y DAO, en donde, el modelo ser� clases
POJOs de Java, la vista ser� JSP + JSTL y los controladores ser�n a trav�s de DAOs y Servlets.


Fig 3. Pagina p�blica index.html propuesta para el sistema de agenda telef�nica

## RESULTADO(S) OBTENIDO(S):

# 1. Creaci�n de un repositorio:

URL del Repositorio: https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC.git

Nombres de Usuario: PedroOrellana98, DavidCornejoB, Dperaltat

![Image 1](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/0.PNG)

# 2. Desarrollo de la aplicaci�n JEE:

Como primer paso debemos definir la arquitectura que se va a usar dentro de la aplicaci�n JEE, en este caso es la
arquitectura cliente servidor, la cual sigue un patr�n de dise�o DAO la cual se conecta con los Servlets y un
controlador de la arquitectura MVC (Modelo, Vista, Controlador), para realizar las operaciones y validaciones que
vienen de la base de datos MySQL.

![Image 2](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/1.jpg)

El proyecto estar� dividido en varias secciones, el Web Content que contiene la parte de la vista como lo son los
JSP o la parte de HTML de la p�gina web, las im�genes para los estilos de la p�gina, los estilos CSS de la p�gina,
y las librer�as para la conexi�n entre los JSP, los controladores y la base de datos.

La parte de los controladores se encuentra en los recursos de Java los cuales est�n divididos en 4 paquetes:
controlador, dao, modelo y jdbc.

- El paquete controlador esta conformado por 11 Servlets los cuales reciben peticiones de GET y POST.
- El paquete dao esta conformado por 8 clases java que unen el modelo con el controlador.

- El paquete modelo esta conformado por 5 clases de java las cuales tienen atributos que se pueden obtener
    y colocar informaci�n.
- El paquete jdbc esta conformado por 7 clases java las cuales crean sentencias de la base de datos y crean
    la conexi�n con la misma.

P�gina Principal:

![Image 3](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/39-1.PNG)

![Image 4](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/39-2.PNG)

![Image 5](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/2-1.PNG)

![Image 6](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/2-2.png)

# 2.1 JSP: Composici�n de JSPs, visualizar tablas y conexi�n con JSTL

Composici�n JSPs

Existen 12 archivos con extensi�n JSP de los cuales la parte publica se encuentra el index.jsp que es la pagina de
inicio y el InicioSesion.jsp que es la parte del login del Usuario y el Administrador. Para la parte privada est�n los
archivos: ActualizarAdmin.jsp, Admin.jsp, Agregar.jsp, AgregarProducto.jsp, Buscar.jsp, BuscarAdmin.jsp,
EliminarAdmin.jsp, Listar.jsp, ListarAdmin.jsp y Usuario.jsp.

- ActualizarAdmin.jsp: Actualiza el nombre del producto que desea por otro, por ejemplo: cambiar el nombre
    de la laptop LAPTOP_GS3 a LAPTOP_GS 5
    
![Image 7](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/3.PNG)

- Admin.jsp: Es la pagina de inicio del administrador en la cual encontramos las opciones de listar, eliminar,
    insertar, buscar, actualizar producto.

![Image 8](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/4.PNG)

- Agregar.jsp: Agrega un requerimiento a un producto con un estado de �E� = en espera.

![Image 9](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/9.PNG)

- AgregarProducto.jsp: Agrega un producto al catalogo de la empresa que se desea con su respectiva
    categor�a, como ejemplo:
    - Nombre del producto: SOBREMESA_GL6 5
    - Categor�a del producto: 1 - > pertenece a SOBREMESA
    - Requerimiento del producto (id de Persona): 1 - > pertenece a DAVID CORNEJO

![Image 10](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/5.PNG)
    
- Buscar.jsp: Busca un producto en la lista de productos que est�n en la base de datos.
- BuscarAdmin.jsp: Busca un producto en la lista de productos que est�n en la base de datos.

![Image 11](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/11.PNG)

- EliminarAdmin.jsp: Elimina un producto que se encuentre dentro de la empresa ejemplo: SOBREMESA_G
    de la empresa MSI.

![Image 12](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/6.PNG)

- Listar.jsp: Lista todos los productos de la empresa con el id de requerimiento al cual est� asociado.
- ListarAdmin.jsp: Lista todos los productos de la empresa con el id de requerimiento al cual est� asociado.

![Image 13](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/7.PNG)

- Usuario.jsp: Es la p�gina de inicio del usuario en la cual encontramos las opciones de listar, insertar, buscar,
    actualizar requerimientos.

![Image 14](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/8.PNG)

Nota: En la p�gina principal de index.jsp, como el de usuario.jsp y admin.jsp se puede encontrar un bot�n el cual
lista los productos o requerimientos de una forma mas detallada como: el id, nombre del producto, categor�a, y
empresa.

Visualizar tablas

Para poder mostrar las consultas de mysql en una tabla se debe crear una etiqueta de expresi�n <c:out> la cual
imprime valor por valor la informaci�n de salida desde el servlet, como ejemplo esta un comando que muestra la
lista por columnas: <c:forEach var="pr" items="${productos}">

<tr>

<td>${pr.idProducto}</td>

<td>${pr.nombre}</td>

</tr>

</c:forEach>

Esta etiqueta se utiliza dentro de la librer�a de JSTL.

Conexi�n con JSTL

Dentro de los archivos JSP se debe llamar a las librer�as de conexi�n de JSTL, las cuales nos van a ayuda a
imprimir los datos en las tablas de JSP, para ello tenemos que llamarlas desde el inicio del archivo con los
comandos:

<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

Para que estos funcionen las librer�as debe estar previamente cargadas en la carpeta WEB-INF.

![Image 15](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/9.PNG)

# 2.2 JDBC: Composici�n de JDBCs, sentencias SQL y conexi�n con MySQL

Composici�n de JDBCs

Contiene 7 clases que unen a la base de datos con el controlador y el dao, la clase que conecta el JDBC con la
base es ContextJDBC.java, para la ejecuci�n de las sentecias sql se utiliza la clase JDBCGenericDAO.java la cual
es una clase abstracta e implementa la clase GenericDAO.java.

Las clases como JDBCCategoria.java, JDBCUsuario.java, JDBCProducto.java, JDBCEmpresa.java,
JDBCRequerimiento.java, sirven para ejecutar los m�todos de crear, leer, insertar, modificar, listar de la base de
datos.

En la clase JDBCUsuarioDAO.java se tiene variables globales las cuales obtienen los id del usuario, id de Empresa,
clave del usuario, correo del usuario y el rol asignado:

public static String nuevoCorreo;

public static String nuevoClave;

public static String id;

public static String idEmpresa;

public static String rol;

Cada variable sirve para identificar al usuario ya sea por el rol para el inicio de sesi�n o para identificar la empresa
a la que el usuario pertenece.

Sentencias SQL

- Buscar id de usuario

Se realiza una consulta en la cual se va a seleccionar el id del usuario y el rol del usuario seg�n los par�metros de
entrada que son el correo y la clave que se obtienen del JSP de Inicio de Sesi�n.

El id y el rol se guardan en variables globales para utilizarlas en otros m�todos, para colocar el valor del id se utiliza
el comando rs.getString("id"); y para el rol el comando: rs.getString("id");

![Image 16](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/10.PNG)

- Buscar id de empresa

Se realiza una consulta en la cual se va a seleccionar el id de la empresa a partir del id del usuario que se hab�a
guardado en una variable global con anterioridad.

El id de la empresa se guarda en una variable global para utilizarlas en otros m�todos, para colocar el valor del id
de empresa se utiliza el comando rs.getString("id");

![Image 17](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/11.PNG)

- Listar productos de empresa

Para obtener una lista de productos seg�n la empresa a la que pertenece se debe tener primero el id de empresa
la cual se va a relacionar con los productos que esta tiene, por lo que es necesario obtener la id de empresa global
para la sentencia.

Como es una lista que va a retornar y son m�ltiples clases que se van a tomar en cuenta se debe realizar la misma
sentencia para 3 distintas clases como:

- List<Producto> listarProductos
- List<Empresa> listarEmpresas
- List<Requerimiento> listarRequerimientos

Que son las 3 combinaciones de tablas que se necesitan para imprimir los resultados en la tabla de listar ya sea
para un usuario o para el administrador.

![Image 18](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/12.PNG)

- Buscar Producto

Para buscar un producto seg�n la empresa a la que pertenece se debe tener primero el id de empresa la cual se
va a relacionar con los productos que esta tiene, por lo que es necesario obtener la id de empresa global para la
sentencia, y tener un par�metro de b�squeda para seleccionar el nombre especifico del producto.

Como es una lista que va a retornar y son m�ltiples clases que se van a tomar en cuenta se debe realizar la misma
sentencia para 2 distintas clases como:

- List<Producto> listarProductos
- List<Categoria> listarCategorias

Que son las 2 combinaciones de tablas que se necesitan para imprimir los resultados en la tabla de listar ya sea
para un usuario o para el administrador.


![Image 19](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/13.PNG)

- Actualizar Requerimiento

Se realiza una consulta en la cual se va a actualizar el requerimiento de producto pasando de un estado de �R� - >
rechazado a un estado de �E� - > en camino, a partir del id de la empresa, y el correo de la persona que ingreso,
adem�s de utilizar un par�metro de entrada para determinar el nombre de producto a actualizar.

![Image 20](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/14.PNG)

- Actualizar Producto

Se realiza una consulta en la cual se va a actualizar el producto utilizando 2 par�metros: el primero para actualizar
el nombre que se ingrese dentro del formulario y el segundo el nombre del producto que necesita actualizar, esto
a partir del id de la empresa, y el correo de la persona que ingreso.

![Image 21](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/15.PNG)

- Insertar Producto y seleccionar id m�ximo

Se crea una consulta en la cual se va a insertar un producto utilizando 3 par�metros de ingreso: el primero seg�n
el nombre del producto que desee actualizar, el segundo la categor�a a la cual pertenece el producto (en n�meros)
y la �ltima que hace referencia al requerimiento de compra del producto.

Dentro de la sentencia se obtiene un id el cual es el id del producto final ejemplo: supongamos que el ultimo producto
con el nombre LAPTOP_GL63 tiene el id 10 entonces se obtiene el ultimo identificador de todos los valores posibles
que en este caso es 10 y se le incrementa en 1 cada vez para insertar un producto, esto se realiza para que no
exista un problema de llaves primarias dentro de la base de datos.

![Image 22](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/16.PNG)

![Image 23](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/17.PNG)

- Eliminar Producto

Se crea una consulta en la cual se va a eliminar un producto utilizando 1 par�metro de ingreso el cual es el nombre
del producto al que deseo eliminar de la base de datos y el id de la empresa que se obtiene de la variable global
de la clase JDBCUsuarioDAO.java

![Image 24](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/18.PNG)

Conexi�n con MySQL

Para realizar una conexi�n de la base de datos SQL se debe tener la clase ContextJDBC.java en la cual se va a
digitar los valores del nombre del esquema de lavase, el usuario de la base de datos registrada, la clave de la base
de datos y si es necesario cambiar el puerto escucha (por defecto es el puerto 3306)

![Image 25](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/19.PNG)

# 2.3 Servlets: Composici�n de Servlets, m�todos GET y POST y filtro

Los servlets se encuentra en el paquete del controlador con un total de 11 clases las cuales tienen m�todos post y
get para enviar y recibir datos de un JSP y de un JDBC.

Existe solo un servlet que utiliza el m�todo doFilter que realiza el filtro de sesiones seg�n cuantas veces a iniciado
el Usuario dentro de la p�gina para evitar problemas de conexi�n y por m�todos de seguridad para no dejar una
sesi�n abierta el mayor tiempo.

Para empezar a utilizar los servlets necesitamos enviar una respuesta que es la url a la cual va a redirigir el servlet
si se cumplen una condici�n y la petici�n que se env�a del formulario del JSP.

El comando de redirecci�n y de despacho es el siguiente: request.getRequestDispatcher(url).forward(request,
response);

Nota: Se utiliza el atributo global rol de la clase JDBCUsuarioDAO.java para comparar los roles.

- Buscar Controlador

GET: en el m�todo GET del controlador lo que se realiza es redirigir al usuario seg�n el rol que tenga a la p�gina
que corresponde como, por ejemplo: si el rol es �U� se redirige a la p�gina buscar del usuario, y si el rol es �A� se
redirige a la p�gina buscar del administrador.

POST: el m�todo POST lo que realiza es obtener el texto del formulario de y la acci�n del bot�n Buscar.jps, despu�s
lo que se hace es insertar dentro de la lista de productos y categor�as los valores que se obtuvo de los par�metros

del formulario, cuando se hayan insertado los valores se van a colocar dentro del JSTL, para despu�s imprimir en
la tabla del JSP en tiempo real redireccionando a la misma p�gina si se cumpli� la condici�n, si no es as� no se
ejecutara la acci�n dentro de las listas y no se ejecutara la sentencia en la base de datos.

![Image 26](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/20.PNG)

![Image 27](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/21.PNG)

- Eliminar Producto

GET: en el m�todo GET del controlador lo que se realiza es redirigir al usuario a la pagina que corresponda, como
solo puede acceder a esta funci�n el administrador se le redirige a la p�gina eliminar producto.

POST: el m�todo POST lo que realiza es obtener el texto del formulario y la acci�n del bot�n EliminarAdmin.jps,
despu�s lo que se hace es validar las acciones de los botones, si se acciono el bot�n manda a llamar al m�todo de
eliminarProducto que est� dentro del paquete jdbc, en el cual el m�todo recibe un par�metro de tipo String que es
el texto que se ingres� en el formulario.

![Image 28](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/22.PNG)

- Index Controlador

POST: el m�todo POST lo que se hace es obtener el dao de la empresa, el producto y la categor�a para insertarlos
dentro de cada una de las listas, de las cuales se van a imprimir en la tabla de la pagina principal index.js, despu�s
lo que se hace es validar las acciones de los botones, si se acciono el bot�n manda a llamar a los m�todos
listarPrincipal, listarPrincipal 1 , listarPrincipal 2 que est� dentro del paquete jdbc.

![Image 29](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/23.PNG)

- Insertar Producto

GET: en el m�todo GET del controlador lo que se realiza es redirigir al usuario a la p�gina que corresponda, como
solo puede acceder a esta funci�n el administrador se le redirige a la p�gina insertar producto, mientras se manda
a ejecutar el m�todo de leerMaximo que corresponde al �ltimo id del producto que est� localizado en el
JDBCProductoDAO.java.

POST: el m�todo POST lo que realiza es obtener el texto del formulario y la acci�n del bot�n AgregarProducto.jps,
despu�s lo que se hace es validar las acciones de los botones, si se acciono el bot�n manda a llamar al m�todo
nuevoProducto que est� dentro del paquete jdbc, en el cual el m�todo recibe 3 parametros que son del texto de
ingreso del formulario, cabe mencionar que dos variables son enteras y una es String.

![Image 30](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/24.PNG)

![Image 31](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/25.PNG)

- Listar Producto Controlador

GET: en el m�todo GET del controlador lo que se realiza es redirigir al usuario seg�n el rol que tenga a la p�gina
que corresponde como, por ejemplo: si el rol es �U� se redirige a la p�gina listar del usuario, y si el rol es �A� se
redirige a la p�gina listar del administrador.

POST: el m�todo POST lo que realiza es obtener el texto del formulario y la acci�n del bot�n Listar.jps y para el
administrador ListarAdmin.jsp, despu�s lo que se hace es validar las acciones de los botones, si se acciono el bot�n
manda a llamar al m�todo listarProductos que est� dentro del paquete jdbc.

![Image 32](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/26.PNG)

- Login

GET: en el m�todo GET del controlador lo que se realiza es redirigir al usuario seg�n el rol que tenga a la p�gina
que corresponde como, por ejemplo: si el rol es �U� se redirige a la p�gina listar del usuario, y si el rol es �A� se
redirige a la p�gina listar del administrador. Adem�s, se debe instanciar la sesi�n HTTP y esta atribuirle un punto
de acceso al sistema para que cuando salga se active un filtro y no pueda acceder de nuevo al inicio del usuario o
del administrador.

POST: el m�todo POST lo que se hace es obtener el dao del usuario para insertarlos dentro de la clase, cuando
se hay instanciado el dao se llama al m�todo buscar de la clase JDBCUsuaroioDAO la cual va a recibir como
par�metros: correo y clave de la p�gina InicioSesion.jsp, a continuaci�n se llama al dao de la empresa para buscar
el id de la empresa que est� en el m�todo buscarEmpresa, una vez realizado todo este proceso entra a cada uno
de las paginas principales JSP administrador o usuario.

![Image 33](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/27.PNG)

![Image 34](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/28.PNG)

- Registrar Administrador

GET: en el m�todo GET del controlador lo que se realiza es redirigir al usuario a la p�gina que corresponda, como
solo puede acceder a esta funci�n el administrador se le redirige a la p�gina actualizar admin.

POST: el m�todo POST lo que realiza es obtener el texto del formulario y la acci�n del bot�n ActualizarAdmin.jps,
despu�s lo que se hace es validar las acciones de los botones, si se acciono el bot�n manda a llamar al m�todo
actualizarProducto que est� dentro del paquete jdbc, en el cual el m�todo recibe 2 par�metros que son del texto de
ingreso del formulario, de estos son el nombre del producto que desea cambiar y el nuevo nombre del producto.

![Image 35](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/29.PNG)

- Registrar Controlador

GET: en el m�todo GET del controlador lo que se realiza es redirigir al usuario a la p�gina que corresponda, como
solo puede acceder a esta funci�n el usuario se le redirige a la p�gina agregar.

POST: el m�todo POST lo que realiza es obtener el texto del formulario y la acci�n del bot�n Agregar.jps, despu�s
lo que se hace es validar las acciones de los botones, si se acciono el bot�n manda a llamar al m�todo
actualizarRequerimiento que est� dentro del paquete jdbc, en el cual el m�todo recibe 1 par�metro el cual dentro
de la base pasa a estar un requerimiento en estado de espera �E�. Solo se debe ingresar el nombre del producto
que quiere registrar como requerimiento.

![Image 36](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/30.PNG)

- Usuario Controlador

POST: el m�todo POST lo que realiza es obtener el texto del formulario y la acci�n del bot�n Usuario.jps y del
administrador Admin.jsp, despu�s lo que se hace es validar las acciones de los botones, si se acciono el bot�n
manda a llamar a los m�todos listarProducto, listarProducto0, listarProducto1, que est�n dentro del paquete jdbc,
en el cual el m�todo recibe cada uno un par�metro que es la lista de requerimientos, productos y empresa.

![Image 37](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/31.PNG)

- Filtro

FILTER: en este m�todo lo que se realiza es obtener el id de la sesi�n a la cual estamos conectados, si el atributo
de acceso o la sesi�n es nula nos redireccionara al inicio de sesi�n, ya que nunca iniciamos sesi�n, por el contrario,
si ten�amos iniciado sesi�n los filtros no se activaran y no tendremos ning�n problema al rato de acceder a cada
pagina del usuario o del administrador.

Los WebFilter son las paginas que se vana bloquear si no inicio sesi�n estos son:

@WebFilter({"/Filtro", "/JSPs/Usuario.jsp", "/JSPs/Admin.jsp", "/JSPs/ActualizarAdmin.jsp", "/JSPs/Agregar.jsp",
"/JSPs/AgregarProducto.jsp", "/JSPs/Buscar.jsp", "/JSPs/BuscarAdmin.jsp", "/JSPs/EliminarAdmin.jsp",
"/JSPs/Listar.jsp", "/JSPs/ListarAdmin.jsp"})

![Image 38](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/32.PNG)

- Salir

GET: en el m�todo GET del controlador lo que se realiza es verificar si la sesi�n se creo y si la sesi�n esta siendo
utilizada la invalida y la setea con un valor de null para no permitir el ingreso a la paginas privadas.

![Image 39](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/33.PNG)

## CONCLUSIONES:

Podemos concluir que el uso de JDBC con el servicio de JSTL nos sirve para manejar de una mejor manera las
bases de datos en conjunto con java y el servicio web

## RECOMENDACIONES:

Utilizar las siguientes paginas web para entender mejor JSTL y JSP

https://www.tutorialspoint.com/jsp/jstl_core_out_tag.htm

https://www.tutorialspoint.com/jsp/jsp_syntax.htm


Nombre de estudiantes: Pedro Orellana David Cornejo Daniel Peralta

# Firma de estudiante:

![Image 40](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/34.PNG)

![Image 41](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/35.PNG)

![Image 42](https://github.com/PedroOrellana98/Practica_de_laboratorio_01_Servlets_JSP_JDBC/blob/main/Capturas%20Practica%2002/36.PNG)

 
