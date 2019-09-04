package generics;
/**
 * @author Meghan
 */
public class GenericStack1<E>
{
    private int capacity = 3;
    private E[] list = (E[]) new Object[capacity];
    private int topOfStack = -1;
    
    public int getSize()
    {
        return topOfStack + 1;
    }
    
    public E peek()
    {
        return list[topOfStack];
    }
    
    public void push(E o)
    {
        list[topOfStack] = o;
        topOfStack++;
    }
    
    public E pop()
    {
        return list[topOfStack--];
    }
    
    public boolean isEmpty()
    {
        return topOfStack == -1;
    }
    
    public void clear()
    {
        topOfStack = -1;
    }
    
    @Override 
    public String toString()
    {
        String s = "Stack: [";
        for (int i = topOfStack; i >= 0; --i)
        {
            s += list[i];
            s += s += (i > 0) ? ", " : "]";
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
