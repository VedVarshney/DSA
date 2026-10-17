class Solution {
    public int[] applyOperations(int[] arr) {
    for(int i=0; i<arr.length-1; i++){
        if(arr[i]==arr[i+1]){
            arr[i]*=2;
            arr[i+1]=0;
        }
    }   
    int j=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]!=0){
           int t=arr[i];
           arr[i]=arr[j];
           arr[j]=t;
           j++;
        }
    } 
    return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna