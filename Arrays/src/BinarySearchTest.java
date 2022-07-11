public class BinarySearchTest {
    public static void main(String[] args) {
        int testArray[] = new int[]{1,2,3,4,5,6,77,88,99};
        int position = binary4(testArray,0,testArray.length-1,77);
        System.out.println(testArray[position]);
    }

    private static  int binarySearch(int array[],int l, int r, int target){
        while(l<r){
            int midPoint = l + (r - l)/2;
            if(array[midPoint] == target){
                return midPoint;
            } else if(array[midPoint] > target) {
                r = midPoint - 1;
            } else {
                l = midPoint + 1;
            }
        }
        return -1;
    }

    public static int binary(int array[], int left, int right, int target){
        while(left < right){
            int midPoint = left + (right - left)/2;

            if(array[midPoint] == target){
                return midPoint;
            } else if(array[midPoint]>target){
                right = midPoint - 1;
            } else {
                left = midPoint + 1;
            }
        }
        return -1;
    }

    public static int binary2(int array[],int left, int right, int target){
        while(left<right){
            int midPoint = left+(right-left)/2;
            if(array[midPoint] == target){
                return midPoint;
            } else if(array[midPoint] > target){
                right = midPoint-1;
            } else {
                left = midPoint + 1;
            }
        }
        return -1;
    }

    public static int binTest(int array[],int left, int right, int target){
        while(left<right){
            int midPoint = left+(right - left)/2;
            if(array[midPoint] == target){
                return midPoint;
            } else if(array[midPoint] > target){
                right = midPoint - 1;
            } else {
                left = midPoint + 1;
            }
        }
        return -1;
    }

    public static int binary3(int []array, int left, int right, int target){
        while(left<right){
            int midPoint = left + (right - left)/2;
            if(array[midPoint] == target){
                return midPoint;
            } else if(array[midPoint] > target){
                right = midPoint - 1;
            } else {
                left = midPoint + 1;
            }
        }
        return -1;
    }

    public static int binary4 (int []array,int left, int right, int target){
        while(left<right){
            int midPoint = left + (right - left)/2;
            if(array[midPoint] == target){
                return midPoint;
            } else if(array[midPoint] > target){
                right = midPoint - 1;
            } else {
                left = midPoint + 1;
            }
        }
        return -1;
    }

}
