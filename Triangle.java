package demo1;

class Pattern  {
    public static void main(String[] args) {
        int n=5;
        
      for(int i=0;i<n;i++)
    	  {
    	  	System.out.print(" ".repeat(n-i-1)); //space
    	  	System.out.println("* ".repeat(i+1)); //star
    	  }
}
}
