class Solution {
    public String reverseWords(String s) {
        String [] word = s.split(" ");
        StringBuilder ans = new StringBuilder();
        int n =word.length;
        for(int i=0;i<n;i++){
            ans.append(new StringBuilder(word[i]).reverse());
            if( i != n-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}