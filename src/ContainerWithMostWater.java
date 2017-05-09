/**
 * No.11
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 */
public class ContainerWithMostWater {
    /**
     * 本来算了一个O（n^2）的方法，后来参考了下标准答案，给出一个O(n)方法
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int result=0;
//        for (int i = 0; i <height.length ; i++) {
//            for (int j = i+1; j <height.length ; j++) {
//                int area=(j-i)*Math.min(height[i],height[j]);
//                if(area>result)
//                    result=area;
//            }
//        }
        int i=0;int j=height.length-1;
        while(i<j){
            result=Math.max(result,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] height={1,2,3,4};
        System.out.println(maxArea(height));
    }
}
