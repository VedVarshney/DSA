class Solution {
    public boolean canConstruct(String s, String t) {
    HashMap<Character ,Integer> map1 = new HashMap<>();
    for(int i=0; i<t.length(); i++){
        if(map1.containsKey(t.charAt(i))){
           map1.put(t.charAt(i),map1.get(t.charAt(i))+1);
        }else{
            map1.put(t.charAt(i),1);
        }
    }  
    HashMap<Character,Integer> map2 = new HashMap<>(); 
    for(int i=0; i<s.length(); i++){
        if(map2.containsKey(s.charAt(i))){
           map2.put(s.charAt(i),map2.get(s.charAt(i))+1);
        }else{
            map2.put(s.charAt(i),1);
        }
    }
    for(char ch : map2.keySet()){
        if(map1.containsKey(ch)==false) return false;
        if(map2.get(ch)>map1.get(ch)) return false;
    }
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna