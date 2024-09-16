class Solution {
    public static void main(String[] args){
        lengthOfLastWord("Hello World");
        lengthOfLastWord("   fly me   to   the moon  ");
        lengthOfLastWord("luffy is still joyboy");
  }
    public static int lengthOfLastWord(String s) {
        // Remove the spaces in the last char
        String spaces_removed = s+"";
        for(int i=1; i < s.length(); i++){
            if(s.charAt(s.length()-i)+"" != " "){
            spaces_removed = s.substring(0,s.length()-i);
            }
        }
        for(int i=1; i<spaces_removed.length();i++){
            if(spaces_removed.charAt(s.length()-i) == ' '){
                String to_return = spaces_removed.substring(spaces_removed.length()-i, spaces_removed.length());
                return to_return.length();
            }
        }
        return 0;
    }
}
