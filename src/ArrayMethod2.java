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
		
		//Partition Test
		start = System.nanoTime();
		int pivotFinalPos = partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Parition test took " + time + "nanoseconds");
		System.out.println("Final Pivot Position:" + pivotFinalPos);
		System.out.println(Arrays.toString(test3));
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
		int high = list.length;
		int low = 0;
		int pivot = list[low];
		while(low < high)
		{
			while(list[low] < pivot)
			{
				low++;
			}
			while(list[high] > pivot)
			{
				high--;
			}
			int temp = list[low];
			list[low] = list[high];
			list[high] = temp;
		}
		return low;
	}
}
