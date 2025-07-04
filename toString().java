package demo02;
import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {1,5,4,6,3,2};
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.print("After sorting:");
		System.out.println(""+Arrays.toString(arr1));
		Arrays.sort(arr1);
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
	}

}
