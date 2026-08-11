class Solution {
    public List<String> fizzBuzz(int n) {
    ArrayList<String> al = new ArrayList<>();
    for(int i=1; i<=n; i++){
    if(i%3==0 && i%5==0)
    al.add("FizzBuzz");
    else if(i%3==0)
    al.add("Fizz");
    else if(i%5==0)
    al.add("Buzz");
    else
    al.add(Integer.toString(i));
    }  
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna