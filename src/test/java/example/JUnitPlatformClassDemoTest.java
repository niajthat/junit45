import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
// import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class JUnitPlatformClassDemoTest {

    @Test
    void succeedingTest() {
        System.out.println("Inside success test");
    }

    @Test
    void failingTest() {
        System.out.println("Inside fail test");
    }

}

