public class binarySearch {
    public static boolean binarysearch(int target,int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,4,5,6,8,9,13,24};
        System.out.println(binarysearch(50, arr));
    }
}
