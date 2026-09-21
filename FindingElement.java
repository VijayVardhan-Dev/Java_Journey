import java.util.Scanner;

class BinarySearch{
    static void bs (int arr[],int n,int f){
        int l = 0;
        int r = n-1;
        int mid;

        while (l <= r){
            mid = (l+r)/2;
            if (arr[mid] == f){
                System.out.print("Found at " +  mid+1);
                return;
            }
            else if (f > arr[mid]){
                l = mid + 1;
            }
            else{
                r = mid-1;
            }
        }
        
        System.out.print("Not Found");

    }
}

public class FindingElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Element to Find: ");
        int f = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt(); 
        }

        BinarySearch.bs(arr,n,f);
    }
}
