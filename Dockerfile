FROM gradle:jdk21-corretto AS build
LABEL authors="hakon, moritz"

WORKDIR /app

COPY . .

RUN ./gradlew build

FROM registry.access.redhat.com/ubi8/openjdk-21:1.20

WORKDIR /app

COPY --from=build /app/build/swepflichtenheft-1.0-SNAPSHOT-runner.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "swepflichtenheft-1.0-SNAPSHOT-runner.jar"]