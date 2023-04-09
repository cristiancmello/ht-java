package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit Test example.
 */
public class ExampleTest {
  @Test
  void verifySum() {
    assertThat(Main.sum(2, 1)).isEqualTo(3);
  }
}
