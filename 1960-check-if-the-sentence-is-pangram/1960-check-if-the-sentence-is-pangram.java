class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        String str="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<str.length();i++){
            hm1.put(str.charAt(i),1);
        }
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            hm2.put(sentence.charAt(i),1);
        }
        if(hm1.equals(hm2)){
            return true;
        }
        return false;
    }
}