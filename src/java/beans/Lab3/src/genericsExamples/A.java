package genericsExamples;

/**
 * @author Meghan
 */
public class A<E>
{
    private E e;
    private E[] arE;

    public A(E e, E[] arE)
    {
        this.e = e;
        this.arE = arE;
    }

    public A(E e, int SIZE_OF_ARRAY)
    {
        this.e = e;
        this.arE = (E[]) new Object[SIZE_OF_ARRAY];
    }
    //Getters and Setters
    public E getE(){return e;}
    public void setE(E e){this.e = e;}
    public E[] getArE(){return arE;}
    public void setArE(E[] arE){this.arE = arE;}
    
    @Override
    public String toString()
    {
        String s = "A{" + "e = " + e + ", arE = ";
        for (E e: arE)
            s += e.toString() + " ";
        s += "}";
        return s;
    }
    
    public static void main(String[] args)
    {
        int x = 10;
        String s = "Hello";
        Integer[] arInt = {1, 2, 3};
        String[] arString = {"a", "b", "c"};
        A a1 = new A(x, arInt);
        A a2 = new A(s, arString);
        System.out.println(a1);
        System.out.println(a2);
        A a3 = new A(100, 3);
        Integer[] arA = new Integer[] {101, 102, 103};
        a3.setArE(arA);
        System.out.println(a3);
    }    
}
