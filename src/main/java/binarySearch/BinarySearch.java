package binarySearch;

public class BinarySearch {

    static int binarySearch(int[] nums,int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid = (low)+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,7,12,14,15,16,17};
        System.out.println(binarySearch(nums,15));
    }
}
