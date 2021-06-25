package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SampleTest {

  List<String> list;

  @BeforeEach
  void beforeEach() {
    list = new ArrayList<>();
  }

  @Test
  void join() {
    list.add("abc");
    list.add("def");
    Assertions.assertEquals("abcXdef", String.join("X", list));
  }

  @Test
  void unjoin() {
    String joinedString = "abcXdef";
    String[] values = joinedString.split("X");
    Assertions.assertArrayEquals(new String[]{"abc", "def"}, values);
  }
}
