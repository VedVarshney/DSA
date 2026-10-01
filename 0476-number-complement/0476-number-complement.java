class Solution {
    public int findComplement(int n) {
    int dum=n; 
    int m=0;
    while(dum>0){
        m = (m<<1) | 1;
        dum = dum>>1;
    }
    return m ^ n;
    }
}