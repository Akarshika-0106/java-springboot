package codingpractice.DSAProblems;

import java.util.*;

public class CpuCycles {

    public static void main(String[] args) {

        int[] memory = new int[]{2,4,5,6,3,3,8,2,7,9,1,5};
        int[] type = new int[]{0,0,0,0,1,1,1,2,2,3,3,3};

        int result = cpuCycles(memory, type, 9);
        System.out.println(result);

    }

    private static int cpuCycles(int[] memory, int[] type, int maxMemory){
        int n = memory.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(type[i])){
                map.put(type[i], new ArrayList<>());
            }
            map.get(type[i]).add(memory[i]);
        }

        for(int key: map.keySet()){
            List<Integer> value = map.get(key);
            Collections.sort(value);
        }

        int count = 0;
        for(int key : map.keySet()){
            List<Integer> memories = map.get(key);
            System.out.println(memories);
            int i = 0;
            int j = memories.size()-1;
            while(i<=j){
                if(memories.get(i) + memories.get(j) <= maxMemory){
                    i++;
                    j--;
                }else{
                    j--;

                }
                count++;
            }
        }
        return count;
    }
}


//Given array of process type, array of process memory, and maxMemory.
//One CPU cycle can process at most 2 processes if the sum of two processes is less than equal to the maxMemory.
//Otherwise, the process should be executed in a separate CPU cycle.
//Return the minimum number of CPU cycles required to execute all processes.
//
//
//processes = [
//        [0, 2], [0, 4], [0, 5], [0, 6],  	# Type 0
//        [1, 3], [1, 3], [1, 8],          	# Type 1
//        [2, 2], [2, 7],                  	# Type 2
//        [3, 9], [3, 1], [3, 5]            # Type 3]
//maxMemory = 9
//
//Output : 7
