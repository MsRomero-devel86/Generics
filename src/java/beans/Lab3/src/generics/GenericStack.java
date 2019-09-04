package generics;
/**
 * @author Meghan
 */
public class GenericStack<T>
{
    private java.util.ArrayList<T> list = new java.util.ArrayList<>();
    
    public int getSize()
    {
        return list.size();
    }
    
    public T peek()
    {
        return list.get(getSize() - 1);
    }
    
    public void push (T o)
    {
        list.add(o);
    }
    
    public T pop()
    {
        T o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    public void clear()
    {
        list.clear();
    }
    
    @Override
    public String toString()
    {
        String s = "Stack: [";
        for (int i = list.size() - 1; i >= 0; --i)
        {
            s += list.get(i);
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
