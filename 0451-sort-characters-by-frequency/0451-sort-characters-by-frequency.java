class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
            else{
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(char i:hm.keySet()){
            al.add(hm.get(i));
        }
        Collections.sort(al);
        String res="";
        for(int i=al.size()-1;i>=0;i--){
            int x=al.get(i);
            char ch='a';
            for(Map.Entry<Character,Integer> en : hm.entrySet()){
                if(en.getValue().equals(x)){
                    ch=en.getKey();
                }
            }
            for(int j=0;j<x;j++){
                res+=ch;
            }
            hm.remove(ch);
        }
        System.out.println(al);
        return res;
    }
}