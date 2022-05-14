import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Priority {

    @BeforeAll

    public static void BeforeAll()

    {
        System.out.println("Driver Setup");
    }
    @Test
    @Order(1)
    public void Test1()
    {
        System.out.println("Test1");
    }

    @Test
    @Order(2)
    public void Test2()
    {
        System.out.println("Test2");
    }

    @Test
    @Order(3)

    public void Test3()
    {
        System.out.println("Test3");
    }

    @AfterAll
    public static void AfterAll()
    {
        System.out.println("Tear Down");
    }


}
