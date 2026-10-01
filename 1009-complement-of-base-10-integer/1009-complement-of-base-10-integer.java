class Solution {
    public int bitwiseComplement(int n) {
    if(n==0) return 1;
    int m=0;
    int d=n;
    while(d>0){
        m=(m<<1)|1;
        d=d>>1;
    }    
    return m^n;
    }
}