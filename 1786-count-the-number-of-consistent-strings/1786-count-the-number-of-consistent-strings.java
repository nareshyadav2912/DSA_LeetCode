class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs1=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            hs1.add(allowed.charAt(i));
        }
        int c=0;
        boolean flag=false;
        for(int i=0;i<words.length;i++){
            //HashSet<Character> hs2=new HashSet<>();
            String str=words[i];
            for(int j=0;j<str.length();j++){
                if(!hs1.contains(str.charAt(j))){
                    flag=false;
                    break;
                }
                else{
                    flag=true;
                }
            }
            if(flag==true) c++;
        }
        //System.out.println(hs1);
        return c;
    }
}