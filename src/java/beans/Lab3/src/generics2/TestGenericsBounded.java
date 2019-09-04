package generics2;

/**
 * @author Meghan
 */
public class TestGenericsBounded<E extends Comparable<E>>
{
    public static void main(String[] args)
    {
        TestGenericsBounded<String> tgb = new TestGenericsBounded();
        TestGenericsBounded<Test1> tgb1 = new TestGenericsBounded();

    }
}

class Test1 implements Comparable<Test1>
{
    int x;
    
    @Override
    public int compareTo(Test1 t)
    {
        if (t.x == this.x)
            return 0;
        else if (t.x < this.x)
            return 1;
        else 
            return -1;
    }
    
}
