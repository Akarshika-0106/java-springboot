package codingpractice.DSAProblems.Problem3;

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
