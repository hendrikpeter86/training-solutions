package week10d02;

import java.util.Arrays;
import java.util.List;

public class MaxTravel {

    int[] stations = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};

   public int getMaxIndex(List<Integer> numbers){
       int[] counters = new int[30];
       for (int i: numbers) {
           counters[i]++;
       }
       System.out.println(Arrays.toString(counters));

       int index = 0;
       for(int i = 1; i < counters.length; i++){
           if(counters[index] < counters[i]) {
               index = i;
           }
       }
       return index;
   }

    public static void main(String[] args) {
        int max = new MaxTravel().getMaxIndex(List.of(12,12,0,3,4,12));
        System.out.println(max);
    }


}
