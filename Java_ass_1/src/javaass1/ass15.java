package javaass1;

public class ass15 {

	
static boolean isTriplet(int arr[],int n)
{
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				int x=arr[i]*arr[i],y=arr[j]*arr[j],z=arr[k]*arr[k];
				if(x==y+z||y==x+z||z==x+y)
				{
					return true;
				}
			}
		}
	}
	return false;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub 
	int arr[]= {1,2,6,7,45};
	int arr_size=arr.length;
	if(isTriplet(arr,arr_size)==true)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	}

}
