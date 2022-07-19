package leetcode_arrays;

public class RainWaterTrapping {
	
    public static int trap(int[] height) {
        int n = height.length;
        int left=0, right=n-1;
        int res=0;
        int leftMax=0, rightMax=0;
        
        while(left<=right){
            
            if(height[left]<=height[right]){
                
                if(height[left]>=leftMax)
                    leftMax=height[left];
                else
                    res += leftMax-height[left];
                
                left++;
            }
            else{
                
                if(height[right]>=rightMax)
                    rightMax = height[right];
                else
                    res += rightMax-height[right];
                
                right--;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		int[] nums= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(nums));
	}
}
