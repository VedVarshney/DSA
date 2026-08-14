class Solution {
    public int mostFrequentEven(int[] arr){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
    if(arr[i]%2==0){
    if(map.containsKey(arr[i]))
       map.put(arr[i],map.get(arr[i])+1);
    else
       map.put(arr[i],1);
    }  
    }
    if(map.size()==0) return -1;
    int mx=-1;
    for(int ele : map.keySet()){
        if(map.get(ele)>mx)
        mx=map.get(ele);
    }
    int mn=Integer.MAX_VALUE;
    for(int ele : map.keySet()){
        if(map.get(ele)==mx && ele<mn)
        mn=ele;
    }
    return mn;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna