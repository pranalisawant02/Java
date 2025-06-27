package demo01;

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2D array
//		int [][]arr1=new int[3][2];
//		int []arr2[]=new int[3][3];
//		int arr2[][]=new int [3][3];
		double arr3[][]=new double[][] {{1,2,3},{1,2,1}};//2 rows 3 cols
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
