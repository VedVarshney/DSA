class Solution {
    public int countWords(String[] arr, String[] brr) {
    HashMap<String,Integer> map1 = new HashMap<>();
    HashMap<String,Integer> map2 = new HashMap<>();
    for(String s : arr){
    if(map1.containsKey(s))
       map1.put(s,map1.get(s)+1);
    else
       map1.put(s,1);
    }    
    for(String s : brr){
    if(map2.containsKey(s))
       map2.put(s,map2.get(s)+1);
    else
       map2.put(s,1);
    }
    int c=0;
    for(String s : map1.keySet()){
        if(map2.containsKey(s) && (int)map1.get(s)==1 && (int)map2.get(s)==1)
        c++;
    }
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna