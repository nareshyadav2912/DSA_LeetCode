class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        System.out.println(st);
        String res="";
        while(!st.empty()){
            res+=st.pop();
        }
        StringBuilder sb=new StringBuilder(res);
        sb.reverse();
        return sb.toString();
    }
}