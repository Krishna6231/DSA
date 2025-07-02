package binarySearch;

public class orderAgnosticBS {
    static int orderAgnosticBS(int[] nums,int target){
        int low=0,high=nums.length-1;
        boolean isAsc = nums[high]>nums[low];

        while(low<=high){
            int mid = (low)+(high-low)/2;
            if(nums[mid]==target) return mid;
            if(isAsc){
                 if(nums[mid]<target) low=mid+1;
                else high=mid-1;
            }else if(!isAsc){
                 if(nums[mid]>target) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,7,12,14,15,16,17};
        int[] rev = {19,18,16,13,11,9,4,2,1,0};
        System.out.println(orderAgnosticBS(nums,15));
    }
}
