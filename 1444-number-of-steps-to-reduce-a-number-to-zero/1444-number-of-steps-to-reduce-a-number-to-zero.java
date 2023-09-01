class Solution {
    public int numberOfSteps(int n) {
        int c=0;
        int temp=n;
        while(n!=0){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=n-1;
            }
            c++;
        }
        return c;
    }
}