import java.util.*;
class Main {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String args[]) {
		// Your code goes here
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] = new int[size];
       for(int i=0; i<size; i++){
           arr[i] = sc.nextInt();
       }
        // Bubble sort
        for( int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
      printArr(arr);
	}
}
