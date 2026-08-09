package arrays;
public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] input = { 3, 4, 5, 7, 9 };
        ContainerWithMostWater.maxArea(input);
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int size = height.length - 1;
        int startPointer = 0;
        int endPointer = size;
        while (startPointer < endPointer) {

            int currentHeight = Math.min(height[startPointer], height[endPointer]);
            int area = currentHeight * (endPointer - startPointer);
            if(maxArea < area ) maxArea = area;
            if(height[startPointer] < height[endPointer]){
                startPointer ++;
            }else{
                endPointer --;
            }
        }

        return maxArea;
    }
}