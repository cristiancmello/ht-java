package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Integration Test example.
 */
public class ExampleIT {
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  public void tearDown() {
    System.setOut(standardOut);
  }

  @Test
  void whenCallMain_thenCheckHelloWorldMessage()
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    var mainMethod = Main.class.getDeclaredMethod("main", String[].class);

    mainMethod.invoke(null, (Object) null);
    assertThat(outputStream.toString()).contains("Hello world!");
  }
}
