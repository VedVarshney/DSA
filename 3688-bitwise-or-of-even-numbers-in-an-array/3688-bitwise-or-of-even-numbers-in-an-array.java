class Solution {
    public int evenNumberBitwiseORs(int[] arr) {
    int ans=0;
    for(int ele : arr){
        if(ele%2==0)
        ans|=ele;
    }
    return ans;
    }
}