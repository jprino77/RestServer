# WebService
Sistemas Distribuidos TP4 2018: Api Rest y Soap que:

1) Consume el la api "OpenWeatherMap" (https://openweathermap.org/api) consultando el estado del tiempo procesando respondiendo datos mas acotados.

2) ABM de usuarios.


Soap:
Wsdl http://localhost:8080/ws/wsSoapWsdl.wsdl

Rest:

http://localhost:8080/buscarCiudad
Peticion: Post
En el mensaje del post me tenes que pasar lo que vayas tipeando en el input:
por ejemplo tipeas “Bue” y dispara una busqueda (No es key sensitive) 


http://localhost:8080/clima/ciudadesMasConsultadas
Peticion: Get
No tiene parametros

http://localhost:8080/clima/climaExtendido/{id}  --Donde {id} es el id de la ciudad por ej 75541
Peticion: Get
Parametros: id de la ciudad. Cuando el usuario se loguea deberias guardarte id de la ciudad, y para los casos que vos selcciones una ciudad que buscaste ese dato te lo vaoy a estar pasando.

http://localhost:8080/usuario/alta
Peticion Post
Mensaje {  “nombre”: fulano, “usuario”: sarsa, “clave”: sarasa, ciudad { “id”: 123} }

http://localhost:8080/usuario/modificar
Peticion Put
Mensaje { “id”:12, “nombre”: fulano, “usuario”: sarsa, “clave”: sarasa, ciudad { “id”: 123} }

http://localhost:8080/usuario/baja/{id} -- dinde {id} es el id del usuario a eliminar
tipo de peticion delete.


# Configuraciones

- Dentro de resources/application.properties se encuentran las configuraciones de la base de datos y urls para la api del clima.
- Dentro de resources sen encuentra el .sql para generar la base de datos con los datos de las ciudades pre cargado.

# Iniciar en entorno de desarrollo

- Convertir a proyecto Maven
- Correr como Javava aplication (El proyecto es Spring Boot con tomcat embebido).

# Compilar y ejecutar

- Desde Consola: entrar a la carpeta donde tengamos desccargado el proyecto y ejecutar mvn clean install 
- Desde eclipse: click derecho sobre el proyecto -> maven -> Build -> goals: clean install

- Para ejecutar una vez compilado: desde la consola ingresar a la carpeta donde tengamos el jar que se genero y ejecutar:
    java -jar webService-1.0.0
