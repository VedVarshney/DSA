class Solution {
    public int fun(int n){
    int c=0;
    while(n>0){
        if((n & 1)==1) c++;
        n=n>>1;
    }
    return prime(c);
    }
    public int prime(int n){
        if(n<2) return 0;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
    public int countPrimeSetBits(int l , int r) {
    int ans=0;
    for(int i=l; i<=r; i++){
        ans+=fun(i);
    }  
    return ans; 
    }
}