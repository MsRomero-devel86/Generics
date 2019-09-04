package genericsExamples;

/**
 * @author Meghan
 */
public class C<E extends Number>
{
    private E e;

    public C(E e)
    {
        this.e = e;
    }

    public E getE()
    {
        return e;
    }

    public void setE(E e)
    {
        this.e = e;
    }

    @Override
    public String toString()
    {
        return "C{" + "e = " + e + '}';
    }
    
    public static int hashANewNumber(C<Number> e1)
    {
        return e1.hashCode() + 100;
    }
    
    public static void main(String[] args)
    {
        C<Integer> c1 = new C(1);
        C<Integer> c2 = new C(new Integer(2));
        C<Integer> c3 = new C(new Double(3));
        
        System.out.println(c1 + " " + c2 + " " + c3);
    }
}
