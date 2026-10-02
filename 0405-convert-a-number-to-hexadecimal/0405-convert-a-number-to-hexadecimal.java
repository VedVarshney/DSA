class Solution {
    public String toHex(int num) {
    if(num==0)
    return "0";
    long n=num;
    if(n<0)
    n=(1L<<32)+n;
    StringBuilder sb = new StringBuilder();
    while(n>0){
    long rm=n%16;
    if(rm>9) sb.append((char)(87+rm));
    else sb.append(rm);
    n=n/16;
    }
    sb.reverse();
    return sb.toString();
    }
}