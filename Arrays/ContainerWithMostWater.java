public class ContainerWithMostWater {

    //THIS METHOD IS PASSED IN 56 OUR OF 64
    public static int maxArea(int[] height) {
        
        int l = height.length;
        int small = 0;
        int d = 0;
        int area = 0;
        for(int i = 0; i < l; i++){
            for(int j = l-1; j > i; j--){

                int newArea = 0;

                if(height[i] < height[j]){
                    small = height[i];
                    d = j-i;
                    newArea = d * small;
                    if(area < newArea){
                        area = newArea;
                    }
                }else{
                    small = height[j];
                    d = j-i;
                    newArea = d * small;
                    if(area < newArea){
                        area = newArea;
                    }
                }
            }
        }
        return area;
    }

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(ContainerWithMostWater.maxArea(height));
    }
}

// ****************OPTIMIZED METHOD SOLVE EACH AND EVERY POSSIBLE EXAMPLE SET*****************

    public int maxArea(int[] height) {
        int left = 0;                  
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
           
            int h = Math.min(height[left], height[right]);
            
       
            int width = right - left;
            
            maxArea = Math.max(maxArea, h * width);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
