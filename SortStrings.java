public class SortStrings{
	public static void main(String[] args)
	{
		String[] arr = {"vyshnavi","sreehari","rohith","rethi"};
		
		System.out.println("The sorted array is :");
		for(int i = 0;i<arr.length-1;i++)
			{
				for(int j = i+1 ; j<arr.length;j++)
				{
					if(arr[i].compareTo(arr[j])>0)
					{
						String temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;

					}
				}
				System.out.println(arr[i]);
			}
			
			
	}

}
