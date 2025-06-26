package demo1;

import java.util.Scanner;
class Conversion {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Integer number:");
       int i=sc.nextInt();
       String binValue=Integer.toBinaryString(i);
       String octalValue=Integer.toOctalString(i);
       String hexaValue=Integer.toHexString(i);
       
       System.out.println("Binary value:"+binValue+", Octal Value:"+octalValue+", HexaDecimal Value:"+ hexaValue);
        
    }
}
