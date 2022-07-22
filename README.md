# PyxisTest

#Instalacion
1-Para instalar el proyecto, se debe descargar la carpeta "Entrevista" del repositorio y guardarla en alguna carpeta de su preferencia.

2-Abrir eclipse y dirigirse a  File>Import>Maven>Existing Maven Projects , localizar la carpeta previamente descargada, seleccionarla y apretar Finish.

3-Navegar hasta el proyecto en el Project explorer, hacerle click derecho : Maven> Update project. 

#Descripcion de Proyecto
-Este proyecto fue realizado como una prueba para la empresa Pyxis, por parte de Gaston Cabana.

-El proyecto consiste de automatizar funcionalidades de Trello.

-Esta realizado con el siguiente stack tecnologico: Java, Maven, TestNG y Selenium webdriver.

-Fue solicitado realizar Login, creacion de un nuevo tablero, y Añadir una lista al mismo. Tambien sacar screenshot si falla la prueba en algun momento, parametrizar datos y usar Page Object Model.


------------------------------------------------------------------#Informacion Importante#--------------------------------------------------------------

En la consigna, fue solicitado inicializar la prueba desde el siguiente link : https://trello.com/
pero debido a un error con la version actual de chrome(103.0.5060.114), no me permitia realizar la navegacion desde el link solicitado a la pagina de login y me mostraba este codigo de error : unknown error: unexpected command response; por lo tanto, la prueba se inicializa directamente desde el link https://trello.com/login.

Dejo link aqui  explicando el problema con la version de chrome: https://exerror.com/webdriverexception-unknown-error-unexpected-command-response/#:~:text=unexpected%20command%20response%3F-,How%20To%20Solve%20WebDriverException%3A%20unknown%20error%3A%20unexpected%20command%20response%3F,is%20102%20and%20Now%20your%20error%20must%20be%20solved.%20Thank%20You.,-WebDriverException%3A%20unknown%20error

Si bien habia que hacer un downgrade, tenia datos que no podia perder, por ende la prueba se inicia desde https://trello.com/login.

------------------------------------------------------------------#####---------------------------------------------------------------------------------



#Ejecucion de pruebas
1- Para ejecutar la prueba, lo primero que debemos establecer es si queremos que la prueba sea headless o con navegador levantado. Para esto debemos dirigirnos a src/main/java/resources/data.properties , abrimos el archivo y en donde encontramos la palabra headless establecemos si es true(Correr headless) o false, (correr a navegador levantado)

2- Luego del paso anterior, debemos dirigirnos a Interview/testng.xml. Ahi encontraremos los parametros utilizados durante las pruebas. En este caso, la prueba esta configurada para ser ejecutada 2 veces, parametrizada con diferentes datos para crear tablero y lista, pero utilizando el mismo usuario y contraseña. Los parametros son los siguientes: user, password, boardName y listName.

3-Para correr la prueba, hacemos click derecho en testng.xml  Run as> TestNG Suite.

4-La prueba se ejecutara.
