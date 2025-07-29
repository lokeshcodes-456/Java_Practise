import java.util.*;

public class linearSearch{
    public static boolean search(int target,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr={1,3,4,5,6};
        int target=4;
        boolean found = search(target,arr);
        System.err.println(found);
    }
}