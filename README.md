# How-To Java

## Leia

### Exception Handling

- [Como tratar exceptions?](java-exception-handling.md)

## How to Build?

- Execute unit tests before package.

```sh
mvn clean package
```

- Execute without unit tests.

```sh
mvn clean package -DskipTests
```

## How to Run?

- Example

```sh
java -jar target/maven-quickstart-junit5-0.1.0-1.jar
Hello world!
```

## How to Test?

```sh
mvn clean verify
```

### Unit Tests Only

```sh
mvn clean verify -DskipITs
# or
mvn clean test
```

### Integration Tests Only

```sh
mvn clean verify -DskipTests
```

## How to Generate Code Coverage Report?

- Verify tests and Generate Report with JaCoCo
- JaCoCo Report path is `target/site/jacoco`

```sh
mvn clean verify jacoco:report
```
