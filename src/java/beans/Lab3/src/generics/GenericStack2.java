package generics;
/**
 * @author Meghan
 */
public class GenericStack2<E>
    extends java.util.ArrayList<E>
{
    
    public int getSize()
    {
        return this.size();
    }
    
    public E peek()
    {
        return this.get(getSize() - 1);
    }
    
    public void push(E o)
    {
        this.add(o);
    }
    
    public E pop()
    {
        E o = this.get(getSize() - 1);
        this.remove(getSize() - 1);
        return o;
    }
    
    public boolean isEmpty()
    {
        return this.isEmpty();
    }
    
    public void clear()
    {
        this.clear();
    }
    
    @Override
    public String toString()
    {
        String s = "Stack: [";
        for (int i = this.size() - 1; i >= 0; --i)
        {
            s += this.get(i);
            s += (i > 0) ? ", " : "]";
        }
        return s;
    }
    
    public static void main(String[] args)
    {
        GenericStack<Integer> stackInt = new GenericStack();
        GenericStack<String> stackString = new GenericStack();
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        System.out.println(stackInt);
        System.out.println(stackInt.peek());
        System.out.println(stackInt.pop());       
        System.out.println(stackInt);
        
        stackString.push("a");
        stackString.push("b");
        stackString.push("c");
        System.out.println(stackString);
        System.out.println(stackString.peek());
        System.out.println(stackString.pop());
        System.out.println(stackString);
    }
}
