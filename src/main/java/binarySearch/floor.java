package binarySearch;

public class floor {
    static int floor(int[] nums,int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid = (low)+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,7,12,14,15,16,17};
        System.out.println(nums[floor(nums,10)]);
    }
}
