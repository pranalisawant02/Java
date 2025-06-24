package com.dkte;

public class FibnnociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0;
		int secNum=1;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int i=0;i<=10;i++)
		{
			int nxtNum=firstNum+secNum;
			System.out.println(nxtNum);
			firstNum=secNum;
			secNum=nxtNum;
		}
		
	}

}
