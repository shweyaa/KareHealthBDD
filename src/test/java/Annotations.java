import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class Annotations {

    @BeforeAll
    public static void BeforeAll() {
        System.out.println("before all");

    }
       @Test
        public void Test()
    {
            System.out.println("test1");

    }
@Test
    public void Test1()
{
    System.out.println("print me");
}
@AfterAll
        public static void AfterAll()
{
    System.out.println("After All");
}
}
