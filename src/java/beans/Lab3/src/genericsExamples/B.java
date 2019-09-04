package genericsExamples;

/**
 * @author Meghan
 */
public class B<E1, E2>
{
    private E1 e1;
    private E2[] e2;

    public B(E1 e1, E2[] e2)
    {
        this.e1 = e1;
        this.e2 = e2;
    }

    public E1 getE1(){return e1;}
    public void setE1(E1 e1){this.e1 = e1;}
    public E2[] getE2(){return e2;}
    public void setE2(E2[] e2){this.e2 = e2;}    

    @Override
    public String toString()
    {
        String s = "B{" + "e1 = " + e1 + ", e2 = ";
        for (E2 e: e2)
            s += e.toString() + " ";
        s += "}";
        return s ;
    }
    
    public static void main(String[] args)
    {
        B b = new B("abc", new Integer[]{1000, 1001, 1002});
        System.out.println(b);
        B b1 = new B(1000, new String [] {"abc", "def"});
        System.out.println(b1);
    }
}
