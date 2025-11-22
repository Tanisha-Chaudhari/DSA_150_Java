import java.util.*;

public class max_min_array {
    public static void main(String[] args) {


    // Find maximum and minimum in array
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    System.out.println("Enter array elements: ");
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }
    int max=arr[0];
    int min=arr[0];

    for(int i =1; i<n;i++){
        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }

    }

        System.out.println("Max element is: "+max);
        System.out.println("Min element is: "+ min);

        sc.close();
    }

}