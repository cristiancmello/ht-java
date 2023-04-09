# Maven Quickstart with JUnit5 and AssertJ

Make your **unit tests** and **integration tests** faster.
Support to build **executable JAR** and **JaCoCo Code Coverage**.

## Dependencies

- **JUnit 5** (`junit-jupiter`) v5.9.2
- **AssertJ** (`assertj-core`) v3.24.2

## Plugins

- **Maven Compiler** (`maven-compiler-plugin`) v3.8.1
- **Maven Failsafe** (`maven-failsafe-plugin`) v3.0.0 : add Integration Tests support
- **Maven JAR plugin** (`maven-jar-plugin`) v3.3.0 : generate executable JAR
- **Maven JaCoCo plugin** (`jacoco-maven-plugin`) v0.8.9 : generate Code Coverage

## How to Build?

* Execute unit tests before package.

```sh
mvn clean package
```

* Execute without unit tests.

```sh
mvn clean package -DskipTests
```

## How to Run?

* Example

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
