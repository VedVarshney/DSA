class Solution {
    public boolean hasAlternatingBits(int n) {
    if(n==1) return true;
    StringBuilder sb = new StringBuilder();
    while(n>0){
        sb.append(n%2);
        n/=2;
    }  
    sb.reverse();
    int j=1;
    for(int i=0; i<sb.length()-1; i++){
        if(sb.charAt(i)==sb.charAt(j)) return false;
        j++;
    }
    return true;
    }
}