class Solution {
    public int[] singleNumber(int[] arr) {
    int[] ans = new int[2];
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele))
        map.put(ele,2);
        else
        map.put(ele,1);
    } 
    int i=0; 
    for(int key : map.keySet()){
        int frq=map.get(key);
        if(frq==1)
        ans[i++]=key;
    }
    return ans;
    }
}