import java.util.Arrays;

public class ArrayMethod2 
{
	public static void main(String[] args)
	{
		//Testing Arrays
		String [] test1 = { "apple", "cucumber", "microsoft", "zorro"};
		String [] test2 = {"banana", "cherry", "mahogany", "oreos", "pinata"};
		int [] test3 = {3,4,2,7,12,22,0,1};
		
		//Merge Test
		long start = System.nanoTime();
		String [] mergeResult = merge(test1, test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(mergeResult));
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] list3 = new String[list1.length + list2.length];//Declare a new array that is blank that we are going to fill with strings from the other two array
	    int i = 0, j = 0, k = 0;
	    while (i < list1.length && j < list2.length)
	    {
	         if (list1[i].compareTo(list2[j]) <= 0) 
	         {
	             list3[k] = list1[i];
	             i++;
	         } 
	         else 
	         {
	             list3[k] = list2[j];
	             j++;
	         }
	         k++;
	    }
	    while(i < list1.length)
	    {
	    	list3[k] = list1[i];
	        k++;
	        i++;
	    }
	    while(j < list2.length)
	    {
	    	list3[k] = list2[j];
	        k++;
	        j++;
	    }
	    return list3;
	}
	
	public static int partition(int[] list)
	{
		return 0;
		
	}
}
