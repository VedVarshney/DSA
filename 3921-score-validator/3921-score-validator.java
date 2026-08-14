class Solution {
    public int[] scoreValidator(String[] arr) {
    int[] ans = new int[2];
    int s=0,c=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i].equals("W")){
        c++;
        if(c==10) break;
        }else if(arr[i].equals("WD")){
        s+=1;
        }else if(arr[i].equals("NB")){
        s+=1;
        }else{
        s+=Integer.parseInt(arr[i]);
        }
    }
    ans[0]=s;
    ans[1]=c;
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna