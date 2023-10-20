class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st1.isEmpty() && s.charAt(i)=='#'){
                st1.pop();
            }
            if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(!st2.isEmpty() && t.charAt(i)=='#'){
                st2.pop();
            }
            if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }
        }
        System.out.println(st1);
        System.out.println(st2);
        String s1="";
        String s2="";
        while(!st1.isEmpty()){
            s1+=st1.pop();
        }
        while(!st2.isEmpty()){
            s2+=st2.pop();
        }
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}