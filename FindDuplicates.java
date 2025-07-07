package demo01;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr1= {"USA","INDIA","UK","JAPAN","CHINA"};
		String []arr2= {"USA","ITALY","KOREA","GERMANY","IRAN"};
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++)
			{
				if(arr1[i].equals(arr2[j]))
						System.out.println("Duplicate values are:"+arr1[i]);
			}
			
		}
		
	}
}

