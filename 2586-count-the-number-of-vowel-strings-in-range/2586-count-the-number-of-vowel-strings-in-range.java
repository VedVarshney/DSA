class Solution {
    public boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        return false;
    }
    public int vowelStrings(String[] arr, int l, int r) {
    int c=0;
    for(int i=l; i<=r; i++){
        String s=arr[i];
        int last=s.length()-1;
        if(vowel(s.charAt(0)) && vowel(s.charAt(last)))
        c++;
    }    
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna