
public class ArrayMethod2 
{
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] newArray = new String[0];
		for(int i = 0; i < list1.length; i++)
		{
			for(int j = 0; j < list2.length; j++)
			{
				if(list1[i].compareTo(list2[j]) > 0)
				{
					newArray[i] = list1[i];
				}
				else 
				{
					newArray[i] = list2[j];
				}
			}
		}
		return newArray;
		
	}
	
	public static int partition(int[] list)
	{
		return 0;
		
	}

}
