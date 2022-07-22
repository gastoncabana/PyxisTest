# PyxisTest

#Instalacion
1-Para instalar el proyecto, se debe descargar la carpeta "Entrevista" del repositorio y guardarla en alguna carpeta de su preferencia.
2-Abrir eclipse y dirigirse a  File>Import>Maven>Existing Maven Projects , localizar la carpeta previamente descargada, seleccionarla y apretar Finish.
3-Navegar hasta el proyecto en el Project explorer, hacerle click derecho : Maven> Update project. 

#Descripcion de Proyecto
-Este proyecto fue realizado como una prueba para la empresa Pyxis, por parte de Gaston Cabana.
-El proyecto consiste de automatizar funcionalidades de Trello.
-Fue solicitado realizar Login, creacion de un nuevo tablero, y Añadir una lista al mismo. Tambien sacar screenshot si falla la prueba en algun momento, parametricar datos y usar Page Object Model.


#Ejecucion de pruebas
1- Para ejecutar la prueba, lo primero que debemos establecer es si queremos que la prueba sea headless o con navegador levantado. Para esto debemos dirigirnos a src/main/java/resources/data.properties , abrimos el archivo y en donde encontramos la palabra headless establecemos si es true(Correr headless) o false, (correr a navegador levantado)
2- Luego del paso anterior, debemos dirigirnos a Interview/testng.xml. Ahi encontraremos los parametros utilizados durante las pruebas. En este caso, la prueba esta configurada para ser ejecutada 2 veces, parametrizada con diferentes datos para crear tablero y lista, pero utilizando el mismo usuario y contraseña. Los parametros son los siguientes: user, password, boardName y listName.
3-Para correr la prueba, hacemos click derecho en testng.xml  Run as> TestNG Suite.
