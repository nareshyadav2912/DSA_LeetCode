class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> al=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ){
                //ar[ind++]=s.charAt(i);
                al.add(s.charAt(i));
                temp.add(i);
            }
        }
        Collections.sort(al);
        //System.out.println(al);
        char[] res=s.toCharArray();
        for(int i=0;i<temp.size();i++){
            res[temp.get(i)]=al.get(i);
        }
        return new String(res);
    }
}