class Solution {
    public int numTeams(int[] r) {
        int c=0;
        for(int i=0;i<r.length;i++){
            for(int j=i+1;j<r.length;j++){
                for(int k=j+1;k<r.length;k++){
                    if((r[i]<r[j] && r[j]<r[k] && r[i]<r[k]) || (r[i]>r[j] && r[j]>r[k] && r[i]>r[k])){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}