# Etapa 1: Build da aplicação usando Maven
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
# Copia o arquivo pom.xml e baixa as dependências
COPY .. .. .. pom.xml ./
RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn clean package -DskipTests


FROM openjdk:17-jdk-alpine
WORKDIR /app

COPY --from=build /app/target/assessment-service.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
