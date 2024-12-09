## Crear los Artifactos de los 2 microservicios

```sh
 ./mvnw clean package -DskipTests
```

## Construir la Imagen

## Microservicio de usuario
```sh
docker build -t mramoscli/user-service-2:latest .
```

## Microservicio de orders
```sh
docker build -t mramoscli/order-service-2:latest .
```

## Subir las imagenes a Docker Hub
```sh
docker push mramoscli/user-service-2:latest
```

```sh
docker push mramoscli/order-service-2:latest
```