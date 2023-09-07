package Array;

public class Meragearry {
	
	public int[] meragearray(int []arr1,int arr2[])
	{
		int result[]= new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			result[k++]=arr1[i++];
			result[k++]=arr2[j++];
		}
		while(i<arr1.length)
		{
			result[k++]=arr1[i++];
		}
		while(j<arr2.length)
		{
			result[k++]=arr2[j++];
		}
		return result;
		
	}
	int temp=0;
	public int[] reverse(int arr[])
	{
		for(int i=0;i<(arr.length)/2;i++)
		{
		  temp=arr[i];
		  arr[i]=arr[arr.length-(i+1)];
		  arr[arr.length-(i+1)]=temp;
		}
		return arr;
	}

	public void disply(int res[])
	{
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	public int[] sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public int[] leftrotate(int arr[])
	{
		temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		return arr;
	}

}
