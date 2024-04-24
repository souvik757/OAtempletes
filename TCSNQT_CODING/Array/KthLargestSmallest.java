package TCSNQT_CODING.Array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestSmallest {
    public static void main(String[] args) {
        Solution_Arr_1 object = new Solution_Arr_1() ;
        System.out.println(object.kthLargest(new int[]{1,2,3,4,5,6} , 2));
        System.out.println(object.kthSmallest(new int[]{6,5,4,3,2,1} , 3));
    }
}
class Solution_Arr_1 {
    public int kthSmallest(int[] arr , int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder()) ;
        for (int i = 0 ; i < k ; i ++)
            maxHeap.add(arr[i]) ;
        for (int i = k ; i < arr.length ; i ++) {
            if(arr[i] < maxHeap.peek()) {
                maxHeap.remove() ;
                maxHeap.add(arr[i]) ;
            }
        }

        return (maxHeap.isEmpty()) ? -1 : maxHeap.peek() ;
    }
    public int kthLargest(int[] arr , int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ;
        for (int i = 0 ; i < k ; i ++)
            minHeap.add(arr[i]) ;
        for (int i = k ; i < arr.length ; i ++){
            if(arr[i] > minHeap.peek()){
                minHeap.remove() ;
                minHeap.add(arr[i]) ;
            }
        }

        return (minHeap.isEmpty()) ? -1 : minHeap.peek() ;
    }
}