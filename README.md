# mongodb-panache-quickstart

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```
or
```shell script
/mvn compile quarkus:dev
```


> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

> **_NOTE:_** This service implements quarkus-mongodb-panache extension
> MongoDB with Panache provides active record style entities (and repositories) like you have in Hibernate ORM with Panache and focuses on making your entities trivial and fun to write in Quarkus.

> In this example we can observate two patterns.
>
> The active record pattern (person example)
> 
> The repository pattern (student example)

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/mongodb-panache-quickstart-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- MongoDB with Panache ([guide](https://quarkus.io/guides/mongodb-panache)): Simplify your persistence code for MongoDB via the active record or the repository pattern

## Curls to execute request to the service
> curl --location 'localhost:8080/persons/count'
>
> curl --location 'localhost:8080/fruits/get?fruit=pera' \
--header 'Content-Type: application/json' \
--data ''
 
> curl --location 'localhost:8080/persons/641a2f0863c23c776593cd96'

> curl --location 'localhost:8080/fruits/create' \
--header 'Content-Type: application/json' \
--data '{
"name": "tuna",
"description": "delicious fresh and green fruit"
}'

> curl --location 'localhost:8080/fruits/list' \
--header 'Content-Type: application/json'

> curl --location 'localhost:8080/students/count'

> curl --location 'localhost:8080/students' \
--header 'Content-Type: application/json' \
--data '{"name":"osvaldo",
"grade":9.6,
"status":0}'

> curl --location 'localhost:8080/students/search/osvaldo'