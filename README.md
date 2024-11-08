# Curso de JavaEE CoreNetworks en el Centro de Formación Tecnológica de Getafe
[![GitHub](https://img.shields.io/badge/CFTIC-Web-blue?style=for-the-badge&logo=github&logoColor=white&labelColor=101010)](https://cftic.centrosdeformacion.empleo.madrid.org/)

![](Paginas/header.png)

📲 Hola Amigos! Este es el repositorio donde iré subiendo toda la información relacionada con el curso de Corenetworks de Java EE, tanto documentación, ejercicios, guías, etc. Espero que os sea de mucha ayuda.

🚀 Happy Code!
> ##### Si consideras útil este curso, apóyalo haciendo "★ Star" en el repositorio. ¡Gracias!

## Índice
- [Comandos favoritos](Paginas/02_comandos_fav.md)

## Ayuda
- [Webs de ayuda e interes](Paginas/01_help.md)

## Enlaces de interés
* Web oficial (Documentación, descarga...): [Oracle.com](https://www.oracle.com/es/)
* [Documentación Oficial de JavaSE](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)
* [Repositorio Github](https://github.com/amartinsierra/javaenterprise2023)
* [JakartaEE](https://jakarta.ee/specifications/platform/8/apidocs/)

🤩 Enjoy it!

### En mi perfil de GitHub tienes más información

[![Web](https://img.shields.io/badge/GitHub-zhimbaya-14a1f0?style=for-the-badge&logo=github&logoColor=white&labelColor=101010)](https://github.com/zhimbaya)

#### Puedes apoyar mi trabajo haciendo "☆ Star" en el repo o nominarme a "GitHub Star". ¡Gracias!

[![GitHub Star](https://img.shields.io/badge/GitHub-Nominar_a_star-yellow?style=for-the-badge&logo=github&logoColor=white&labelColor=101010)](https://stars.github.com/nominate/)

![](Paginas/jakarta_ee.jpg)
# Diario

### 12/12/2023
1. Descargar eclipse
2. Utilizar la vista de Java
3. Desmarcar modularidad

### 13/12/2023
- Cursos de Udemy:
- [Aprende a Programar en Java](https://www.udemy.com/course/aprende-a-programar-en-java/?couponCode=D655A11AA347AFE2737E)
- [JavaEE](https://www.udemy.com/course/programacion-orientada-a-objetos-con-java-b/?couponCode=0113E81CBA9482D12FBC)

### 14/12/2023
- https://docs.oracle.com/en/java/javase/21/docs/api/index.html
- https://github.com/amartinsierra/javaenterprise2023

### 15/12/2023
- Git y github
- Java 8
- Método con código (default y static)
- Interfaces funcionales

### 18/12/2023
- Descargar Tomcat 10
- Nuevo Workspace
- Instalará servidor
- Dynamic Web Proyect
- Ejecutar servidor Tomcat y web sencilla
- Crear un servlet

### 19/12/2023
- Git
- import > project from git > clone Uri
- JSP

### 20/12/23
A partir del proyecto 15 añadir la anotación y quitar de web.xml todo del servlet.

### 10/01/2024
- Instalación de Mysql y workbech
- https://dev.mysql.com/downloads/installer/

### PERSISTENCIA
1. dependencias (framework + driver de bd) > POM
2. configurar cada persistencia
	- crear entidades y configurarlas
	- crear el persistence.xml (Propiedades  > Projects facets > JPA)
		- general org.hibernate.jpa.HibernatePersistenceProvider
		- managed class 
		- connetion > resouce local > añadir datos > com.mysql.cj.jdbc.Driver , jdbc:mysql://localhost:3306/tienda 
3. logica de negocio, JPA
	- error de persitence > boton derecho proyecto > JPA Tools > actualizar lista.

### 11/01/2024
- https://jakarta.ee/specifications/platform/8/apidocs/

### 15/01/2024
- https://www.w3schools.com/git/git_pull_from_remote.asp?remote=github
- https://miguelangelmedina.es/28-anadir-un-corrector-ortografico-en-espanol-castellano-a-eclipse/
- Estamos con CSS.

### 16/01/2024
- Instalación de visual studio code.
- https://caniuse.com/?search=inner

### 17/01/2024
- JSON
- `` var curso = {"nombre":"java","duracion":100};``
- Suscripción:
- https://learn.oracle.com/ords/training/dl4_activation.activateOrder?key=FB41E417D6CEAD5D
```
- Una vez clonado el repositorio, estarás trabajando dentro de la rama por defecto (Por defecto es main)
git clone https://github.com/<git-usuario>/<nombre-repo> && cd <nombre-repo>
- Haz cambios y agrega tus archivos (repite el comando `git add` por cada archivo, o utiliza `git add .` para agregarlos todos)
git add <nombre-archivo>
- Ahora haz el commit de tu código
git commit -m "Agregué cambios a mi repo!"
- Sube los cambios en la rama 'main' a github
git push origin main
```

### 18/01/2024
- JQuery
```
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
```
- AJAX

### 19/01/2024
Lombok
Descargar el paquete por maven
Instalar el plugin de Lombok en eclipse
Ir a la ruta de la librería y ejecutar > buscar la ruta del eclipse instalado.
C:\Users\tarde\Documents\DiegoMisDocumentos\Software\eclipse-jee-2023-12-R-win32-x86_64\eclipse.exe

Preferecias > encodig > escribir utf-8 para que sea por defecto.
Hoisting
Instalar dependencias de Lombok desde MVrepositorios
Descargar lombok > ejecutar > buscar al ruta de instalación de Eclipse ide > reiniciar.

Para visualizar y codificar con javascript desde Eclipse.
- JS > preferencias > General > editor > File associations > *.js > Generic Text editor > default.

- ecInstalar desde la market place > web developer

Instalar nuevo tema: dark > Iconos

22/01/2024
Carrito

23/01/2024
Patrón MVC, Intercenting Filter y DTO
DATA TRANSFER OBJECT
- Patrón factoría
Spring
JavaEE -> CDI (Contexts and Dependency Injection) -> buscar e instalar las dependencias -> requiere de un beans.xml
- webapp > WEB-INF > aquí crear el beans.xml
- SE CREA UNAN INTERFAZ > REFACTOR -> EXTRACT INTERFACE

24/01/2024
* Frameworks Java
-Struts > mvc
-Java Server Faces (jsf) > mvc
-Spring

------
- Crear proyecto web dinámico.
- Cargar dependencias.
- Crear las interfaces y las implementaciones.
- Modelo de datos (entidades y datos).
- Logica de negocio.
- Configuracion lógica de negocio.
- controlador
- vista
- configuración web (controlador + vista)

25/01/2024
@service
@repos-only
@component
@container
@rescontroller
Spring > DispacherServlet > es el frontcontroller, lo hace automático.
Spring > los controladores de acción son clases y no servlets

26/01/2024
thymeleaf
configurar el archivo Mvcconfig

Persistencia:
- añadir las dependencias
- configurar ServiceConfig

29/01/2024
- Dependencias requisito
- Diferencias:
- No se usa el archivo persisten.xml
- Spring te inyecta o crea el entitymanager.
- No hay que hacer transacción o confirmar transacción.
- Todo lo demas es igual.

----------
Patrón DAO
----------
Separar en dos capas el modelo logica de negocio.
Capa service - Capa DAO

30/01/2024
Examen
Estilos y recursos estáticos.
https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
Spring data JPA

31/01/2024
Para proyecto maven y herede > file > new > maven proyect > proyecto simple > pom
Otro proyecto > pom > overview

------------------------------
01/02/2024
@RequestMapping para tanto post y get.
DTos al ejercicio 11 de spring.

JPA
-Entidad venta y Relaciones entre tablas. u v - l ; b v - c
-Dto ventadto
-actualización de mapeado
-daos
-logica de negocio
-controlador
-vistas

05/02/2024
Cambiar dato de idLibro 11213 por 30303 se borro.
Se termina el ejercicio spring 13.

06/02/2024
Servicios web.
war sobre un servidor de aplicaciones.
- Editar variable de entorno
- Colocar war
- Cmd en la ruta de apache tomcat /bin
- Navegador :8080/name.war
https://www.postman.com/downloads/
***
CRUD de cursos: 
Servicio REST que expone los siguientes recursos: 
-Búsqueda de todos los cursos 
-Búsqueda de curso por su id 
-Búsqueda de cursos entre rango de precios 
-Alta de nuevo curso a partir del JSON, devolviendo lista de cursos que quedan 
-Eliminar curso por denominación, devolviendo el curso eliminado 
-Actualización de precios. Se recibe temática y porcentaje, y se suben en ese porcentaje los precios de todos los cursos de esa temática
***
---
new mavenproject
create un simple
maven.parent
maven.parent
pom

07/02/2024
Static web proyect -- cliente rest
***
Ejercicio:
Servicio learning

El servicio formación ofrece los siguientes recursos:

-catalogo de formaciones
-lista formaciones por duracion máxima 
-alta de formaciones

Una formación se caracteriza por: nombre, horas, precio

Para conseguir implementar esta funcionalidad, este servicio tendrá que interaccionar
con el servicio de cursos. 
***
08/02/2024
Ejercicio:
Servicio paises
Ofrece los siguientes recursos:
-lista de continentes
-lista de paises por continente
-datos del pais más poblado

Pais
nombe,continente,capital,poblacion,bandera

09/02/2024
-Instalar plugin desde la Marketplace > spring > version 4
>cdn > truted selected
-new > other > spring boot > spring stared proyect
name: cualquiera
type: maven
package:init
add: spring web, lombok

Cambiar puerto tomcat: 
No tiene dirección por defecto: 
https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html

Ejercicio:
Microservicio que implemente un API REST de coches de segunda mano.

cada coche tiene las siguientes propiedades:

matricula (PK),marca,modelo,kilometros,precio,fechaFabricacion

Funcionalidades:

alta de coches (no se puede dar de alta un coche con matricula repetida)
eliminar coche por matricula y devuelve el coche eliminado.
consulta de coches por marca
consulta de coches por precio maximo
catalogo de todos los coches 
actualizacion coches (se recibe un coche y se actualizan sus datos, a partir de la matricula)

--

lombok
spring data jpa
mysql driver
spring web
--
<<<application properties>>>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/escuela
spring.datasource.username=root
spring.datasource.password=root

Application >> @EnableJpaRepositories

--Respuestas complejas--
Cabecera: codigo de estados, encabezados
cuerpo: json, xml

https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/ResponseEntity.html

https://developer.mozilla.org/es/docs/Web/HTTP/Status

ResponseEntity >> juega con los códigos de estado.

### 13/02/2024
Documentación
http://localhost:8000/swagger-ui/index.html

Add Starter >> spring security

401 =  no autenticado, no existe
403 = no autorizado

Ejercicio:
Microservicio de libros (base de datos libreria)

Expondrá los siguientes recursos:

-catalogo de libros
-lista de tematicas
-buscador de libro por ISBN
-alta de nuevos libros


Los recursos estarán securizados según los siguientes criterios:

buscador de libro por ISBN: usuarios autenticados
alta de libros: usuarios del rol administrador
resto de recursos acceso libre 

### 14/02/2024
- Tokens de validación
- Instalación de keycloak: ejecutar en la carpeta bin : kc start-dev
- un user y pass : diego
	- Crear reino = UsuariosCursoRealm
	- crear cliente 
	- crear roles
	- añadir a cada rol
- cliente > crear cliente > uri: http://localhost:8080
- crear rol > ADMINS, USERS, OPERATORS
- añadir usuarios > user > add user : admin, user1, user2 a ADMINS, USERS, OPERATORS

### 15/02/2024
- Para crear el token: 
- Añadir DEPENDENCIA >> oauth2-resource-server
- postman:
- Post http://localhost:8080/realms/UsuariosCursoRealm/protocol/openid-connect/token
- body
	- client_id validador
	- username user1
	- password user1
	- grant_type password
....
- Postman > Authorization > Bearery token
- Proyecto: editar SecurityConfig, añadir, JwtAuthConverter, editar application.properties.

### 16/02/2024
- spring cloud : un proyecto spring, añadir dependencia eureka server
- Servidor Eureka
- @EnableEurekaServer en application del servidor eureka.
- editar application.properties
	- convertir a yaml
	- añadir dependencia eureka client
- probamos: http://localhost:8761/
- Añadir en proyecto dependencia : eureka client
	-Editar application.properties
- En el rest client: añadir dependencia
	- cambiar la url: localhost por un nombre del servidor eureka.
	
### 19/02/2024
- Hacer ejercicio pdf y base de datos tiendavirtual
	
### 20/02/2024
- Crear un spring proyect > reactive gateway y eureka discovery client
- Convertir a yaml
- Ejercicio: 31 debe funcioanar ejer 22, 27, 28, 30

### Dependencias en proyectos Spring Boot
- Microservicio REST
	- Spring Web
	- Lombok
	- Spring Data JPA (SOLO SI HAY ACCESO A DATOS)
	- MySQL Driver (SOLO SI HAY ACCESO A DATOS)
	- Spring Security (SOLO SI SE VA A SECURIZAR)
	- OAuth2 Resource Server (SOLO SI ES MICROSERVICIO SECURIZADO POR OAUTH2) 
	- Eureka Discovery Client (SOLO SI SE VA A REGISTRAR EN EUREKA O VA A DESCUBRIR POR EUREKA)
		- Dependencia especial si se va a documentar:
		```
		<dependency>
			 <groupId>org.springdoc</groupId>
			 <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			 <version>2.0.0</version>
		</dependency>
		<dependency>
			 <groupId>org.springframework.boot</groupId>
			 <artifactId>spring-boot-starter-validation</artifactId>
		</dependency>
		```
- Eureka Server
	* Eureka Server
- GateWay
	* Reactive GateWay
	* Eureka Discovery Client (SOLO SI VA A DESCUBRIR LOS SERVICIOS POR EUREKA) 
- Ejercicio: 32,33,34,35
- RunAs > maven built > poner un paquete > jar > cmd > java -jar proyecto
- https://www.docker.com/products/docker-desktop/

### 21/02/2024
- Crear un repo en github: servicio-pedidos.yml y servicio-productos.yml > con la configuración de .yml
- proyecto, 36 configurar application.yml y application > @EnableConfigServer > dependencia config server
- Nuevo proyecto, 37, añadir config client
- Arrancar eureka, servidor, gateway, luego 37 y 38
- Crear un application.properties para cada entorno dev, prod.
- Configurar repo local ejercicio 41, añadir config server y editar el application.yml

### Docker
- Contenedores
- https://hub.docker.com/
- docker pull ibtech/tomcat9
- docker run imagen

### 22/02/2024
- docker hub : docker pull openjdk
- dockerfile
```
FROM openjdk
ADD buscador.jar buscador.jar //dir_mquina dir_docker
ENTRYPOINT java -jar buscador.jar

```
- docker build -t nombre_imagen ruta_dockerfile
- asignar un puerto de maquina con el de la imagen: docker run -p 9000:7000 imagen_buscador -name buscador
- properties: variables de entorno: 
- maven build , quitar test, package
- docker run --env HOST_DB=10.1.3.100,PORT_DB=3306 -p 8500:8500 img_cursos -name cursos
- mysql > server > user y privilegios > root > poner un %en limit
- eureka >  hostname: ${HOST}
- https://github.com/amartinsierra/configuracion_microservicios

### 23/02/2024
- https://jwt.io/
- Generar el token con la ip del servidor no con localhost
- Subir contenedores
- docker images
- docker login -u correo
- docker push randysim/microservicios:buscador
- docker pull randysim/microservicios:buscador

### 26/02/2024
- Seguir la Guia pdf angular x.
- Angular Extension Pack - Loiane Groner
- ng new --no-standalone 01_ejemplo
- Aplicaciones Angular: patron MVC
- {{ }} interpolador
- ng server ejemplo
- tsconfig.json > strict = false

### 27/02/2024
- Acceso a recursos externos (servicio rest)
- https://github.com/amartinsierra/angular_feb_2024

### 28/02/2024
- 16 ejer
- 09_cliente_libreria

### 29/02/2024
- ejercicio

### 01/03/2024
- cabecera http: header, body 
- body: authorization: "basic usuario:password" << base64

### 04/03/2024
- keycloak = Web Origins :http://localhost:4200
- App Angular > ng build --base-href=/direccion
- crear un web dinamic proyect y pegar los indes y .js

### 05/03/2024
- Proyecto
