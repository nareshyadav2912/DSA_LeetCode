import java.util.*;
class Solution {
    public String reverseWords(String s) {
        Stack<String> stack=new Stack<>();
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            stack.push(st.nextToken());
        }
        System.out.println(stack);
        String res="";
        while(!stack.empty()){
            if(stack.size()==1) res+=stack.pop();
            else res=res+stack.pop()+" ";
        }
        return res;
    }
}