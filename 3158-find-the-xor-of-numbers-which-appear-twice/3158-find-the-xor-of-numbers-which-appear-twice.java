class Solution {
    public int duplicateNumbersXOR(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele)) map.put(ele,2);
        else map.put(ele,1);
    }  
    int ans=0;
    for(int key : map.keySet()){
        int  fr = map.get(key);
        if(fr==2)
        ans^=key;
    }
    return ans;
    }
}