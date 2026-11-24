
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM maven:3.9-eclipse-temurin-24 AS build

##PARTE 1
#pillar directorio de trabajo
WORKDIR /app

#primero ejecuta solo el pom (? y luego ya pilla las dependencias creo
COPY pom.xml .
RUN mvn -B dependency:go-offline

#pillar codigo fuente y compilarlo
COPY src ./src

RUN mvn -B clean compile

##PARTE 2
#empieza desde la primera etapa para ejecutar los test
FROM build AS test

RUN mvn -B test

##PARTE 3
#empieza desde la etapa de los test y genera el .jar

FROM test AS package

RUN mvn -B package -DskipTests

##PARTE 4
#Imagen con el JRE y .jar
FROM maven:3.9-eclipse-temurin-24 AS runtime

WORKDIR /app

COPY --from=package /app/target/*.jar app.jar

ENTRYPOINT ["java","-cp","app.jar","tema6.gestorcolecciones.GestorColecciones"]