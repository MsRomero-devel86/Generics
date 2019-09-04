package generics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Meghan
 */
public class GenericStack3<E>
{
    E e;
    
    public <E> int foo(E e)
    {
        return 1;
    }
    
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        ArrayList<E> listNoDups = new ArrayList<E>();
        for (E e: list)
        {
            if ( ! listNoDups.contains(e))
                listNoDups.add(e);
        }
        return listNoDups;
    }
    
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
    {
        for (int i = 0; i < list.length; ++i)
            if (list[i].compareTo(key) == 0)
                return i;
        return -1;
    }
    
//    public static <E extends Comparable<E>> E max(E[] list)
//    {
//        
//    }
    
    public static void main(String[] args)
    {
        Integer[] ar = new Integer[] {1, 2, 2, 2, 3, 30};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(ar));
        String[] arS = {"a", "a", "b", "c", "c"};
        ArrayList<String> listS = new ArrayList<String>(Arrays.asList(arS));
        
        Integer[][] ar2D = new Integer[][] { {1}, {2, 2}, {2, 3, 30} };
            
        System.out.println("removeDuplicates() from " + list + " yields " + removeDuplicates(list));
        System.out.println("removeDuplicates() from " + listS + " yields " + removeDuplicates(listS));
        
        System.out.println("linearSearch() for 3 " + list + " at pos " + linearSearch(ar, 3) );
        System.out.println("linearSearch() for 888 " + list + " at pos " + linearSearch(ar, 888));
        
//        System.out.println("max() of 1D array " + list + " is " + max(ar) );
//        System.out.println("max() of 2D array " + list + " is " + max(ar2D));
//        
//        System.out.println("binarySearch() for 3 " + list + " ar pos " + binarySearch(ar, 30));
//        System.out.println("binarySearch() for 888 " + list + " at pos " + binarySearch(ar, 888));
//        
//        System.out.println("sort() " + list + " in descending order: ");
//        sort(list);
//        System.out.println(list);
    }
}
