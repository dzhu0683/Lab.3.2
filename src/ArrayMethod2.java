import java.util.Arrays;

public class ArrayMethod2 
{
	public static void main(String[] args)
	{
		String [] test1 = { "abba","bar","foo", "tortilla", "zebra"};
		String [] test2 = {"amy", "bob", "claire", "sam", "tom"};
		
		
		for(int x = 0; x < test1.length + test2.length; x++)
		{
			System.out.print(merge(test1, test2)[x] + " ");
		}
		
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] list3 = new String[list1.length + list2.length];//Declare a new array that is blank that we are going to fill with strings from the other two array
	      int i = 0, j = 0, k = 0;
	      while (i < list1.length && j < list2.length) 
	      {
	           if (list1[i].compareTo(list2[j]) < 0) 
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
	      return list3;
	}
	
	public static int partition(int[] list)
	{
		return 0;
		
	}

}
