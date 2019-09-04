package generics2;

/**
 * @author Meghan
 */
public class TestGenericsBounded2<E extends A1>
{
    public static void main(String[] args)
    {
        TestGenericsBounded2<A1> a1 = new TestGenericsBounded2();
        TestGenericsBounded2<A2> a2 = new TestGenericsBounded2();
        TestGenericsBounded2<A3> a3 = new TestGenericsBounded2();
    }
}

class A1{}

class A2 extends A1{}

class A3 extends A1{}