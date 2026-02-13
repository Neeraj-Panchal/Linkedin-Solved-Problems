import java.util.Arrays;

public class MedianOfTwoArrays{

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        int[] mArr = new int[l1 + l2];

        System.arraycopy(nums1 , 0, mArr ,0 , l1);
        System.arraycopy(nums2, 0, mArr, l1, l2);

        Arrays.sort(mArr);

        int mArrLen = mArr.length;
        float median = 0;
        if(mArrLen % 2 != 0){
            median = mArr[mArrLen / 2];
        }
        else{
            median = (mArr[(mArrLen / 2) - 1] + mArr[(mArrLen / 2)]) / 2.0f ; 
        }
        return median;
    }

    public static void main(String[] args){

        int[] ar1 = {1,2};
        int[] ar2 = {3,4};
        System.out.println(MedianOfTwoArrays.findMedianSortedArrays(ar1,ar2));
    }
}