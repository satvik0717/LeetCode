class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        Stack<String> st = new Stack<>();
        for(int i = 0;i<words.length;i++){
            st.push(words[i]);
        }
       StringBuilder ans = new StringBuilder();
       while(!st.isEmpty()){
        ans.append(st.pop());
        if(!st.isEmpty()){
            ans.append(" ");
        }
      
       }
         return ans.toString();
    }
}