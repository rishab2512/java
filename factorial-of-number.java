import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
        Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int fact=1;
       for(int i=1; i<=number; i++){
           fact = fact*i;
       }
       System.out.println(fact);
      
	}
}
