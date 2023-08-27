class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i],1);
            }
            else{
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
        //System.out.println(h);
        for(int j:h.values()){
            if(s.contains(j)){
                return false;
            }
            else{
                s.add(j);
            }
        }
        System.out.println(s);
        return true;
    }
}