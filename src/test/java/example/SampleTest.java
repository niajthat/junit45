package example;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SampleTest {

	List<String> list;

	@BeforeEach
	void beforeEach() {
		list = new ArrayList<>();
	}

	@Test
	public void join() {
		list.add("abc");
		list.add("def");
		Assertions.assertEquals("abcXdef", String.join("X", list));
	}

	@Test
	public void unjoin() {
		String joinedString = "abcXdef";
		String[] values = joinedString.split("X");
		Assertions.assertArrayEquals(new String[] { "abc", "def" }, values);
	}
}
