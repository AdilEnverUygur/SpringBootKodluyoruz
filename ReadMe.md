# Kodluyoruz

- Java 17
- Spring Framework
- Spring Boot
- Spring MVC
- Spring Data
- Spring Rest (Http Status)
- Spring Security

## System Login

> Register
> Login (Username + Password)
> Authorization(Jwt)

## Lesson Steps

> Spring Framework
> Spring Boot
> Spring MVC
> Spring Data (Jpa Hibernate)
> Spring Rest ( RestFull ==>Jersey
> Spring Security

### Reference Documentation

* [GitHub](https://github.com/AdilEnverUygur/SpringBootKodluyoruz)
* [H2_console](http://localhost:8080/h2-console/l)
* [Swagger](http://localhost:8080/swagger-ui.html)

## Project Steps

1. @Bean (ModelMapper)
2. Dto
3. BaseEntity (@MappedSuperclass)
4. EmployeeEntity (@Entity)
5. EmployeeRepository (@Repository)
6. EmployeeServices (interface)
7. EmployeeServiceImpl(@Service)
8. ResourceNotFoundException(@ResponseStatus)
9. EmployeeController(@RestController)

## Unit Test

1. TestCrud (interface)
2. @SpringBootTest

## Auditing

1. AuditorAwareBean
2. AuditorAwareImpl (implements AuditorAware)
3. @SpringBootApplication

```
1. Deneme
```

## Docker Deployment

```
1.STEP
$     ./mvnw clean package -DskipTests

2.STEP
$    docker-compose up
$    docker ps


######POSTMAN###########
3.STEP
POSTMAN

//CREATE
http://localhost:8080/docker/v1/create/product


//LIST
http://localhost:8080/docker/v1/list/product


//FIND
http://localhost:8080/docker/v1/find/product/1



//DELETE
http://localhost:8080/docker/v1/delete/product/1


4.STEP
$    docker exec -it spring_docker_postgresqldb_1 psql -U postgres studentdb


5.STEP
$    studentdb=#  \dt ==> Show Table
$    studentdb=#  select * from product
$    studentdb=#  \q ==> Exist
```