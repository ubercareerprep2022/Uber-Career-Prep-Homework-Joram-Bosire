import java.util.*;

public class Solution
{
    
    public static boolean isStringPermutation(String s1, String s2)
    {
        if(s1.length() != s2.length()){
            return false;
        }
        
        char[] s1arr = s1.toCharArray();
        char[] s2arr = s2.toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        
        
        for(int i = 0; i < s1.length(); i++){
            
            
            if(s1arr[i] != s2arr[i]){
                return false;
            }
        }
        
        return true;
    }
    
    public static List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum){
         List<List<Integer>> res = new ArrayList<>();
         
         List<Integer> numTrack = new ArrayList<>();
         
         for(int i = 0; i < inputArray.size(); i++){
             
             
             numTrack.add(inputArray.get(i));
             
             for(int j = 0; j < inputArray.size(); j++){
                 if((j == i) || numTrack.contains(inputArray.get(j))){
                     continue;
                 }
                 
                 int total = inputArray.get(i) + inputArray.get(j);
                 
                 if(total == targetSum){
                     List<Integer> acc = new ArrayList<>();
                     acc.add(inputArray.get(i));
                     acc.add(inputArray.get(j));
                     res.add(acc);
                     
                 }
             }
         }
         
         return res;
    }
}

