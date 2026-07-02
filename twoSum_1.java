import java.util.*;

public class twoSum_1{
    public static int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<Integer,Integer>() ;
       for(int i=0; i<nums.length;i++){
        int required = target - nums[i];
        if(map.containsKey(required)){
            int arr[]= {map.get(required),i};
            return arr;
        }
        else{
            map.put(nums[i],i);
        }
       }     
        return null;
    }
    public static void main(String[] args) {
    int arr[] = {2,7,11,15};
    int target = 9;
    int[] result = twoSum(arr, target);
    System.out.println(Arrays.toString(result));

    }
}
