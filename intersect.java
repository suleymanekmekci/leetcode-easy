/* 350. Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> numFreq = new HashMap<>();
        
        for (int num : nums1) {
            if (numFreq.containsKey(num)) {
                numFreq.put(num,numFreq.get(num) + 1);
            }
            else {
                numFreq.put(num,1);

            }
        }
        
        List<Integer> intersection = new ArrayList<>();
        
        for (int num: nums2) {
            if (numFreq.containsKey(num)) {
                numFreq.put(num,numFreq.get(num) - 1);
                
                intersection.add(num);
                
                if (numFreq.get(num) == 0) {
                    numFreq.remove(num);
                }
                
            }
        }
        
        int[] output = new int[intersection.size()];
        
        for (int i = 0; i < intersection.size(); i++){
            output[i] = intersection.get(i);
        }
        return output;
    }
}
