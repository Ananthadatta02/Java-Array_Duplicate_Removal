package duplicateElemtOperations;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array Size");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		
		int count = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			boolean isPresent = false;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i] == arr[j])
				{
					isPresent = true;
					break;
				}
			}
			if(!isPresent)
				count++;
		}
		int index = 0;
		int b[] = new int[count];
		for(int i=0;i<=arr.length-1;i++)
		{
			boolean isPresent = false;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i] == arr[j])
				{
					isPresent = true;
					break;
				}
			}
			if(!isPresent)
				b[index++] = arr[i];
		}
		System.out.println(Arrays.toString(b));
 	}
}
