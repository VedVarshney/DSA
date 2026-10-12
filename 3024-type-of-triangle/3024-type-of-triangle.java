class Solution {
    public String triangleType(int[] arr) {
    if(arr[0]+arr[1]<=arr[2] || arr[0]+arr[2]<=arr[1] || arr[1]+arr[2]<=arr[0]) return "none";
    else if(arr[0]==arr[1] && arr[1]==arr[2]) return "equilateral";
    else if(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[0]!=arr[2]) return "scalene";
    return "isosceles";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna