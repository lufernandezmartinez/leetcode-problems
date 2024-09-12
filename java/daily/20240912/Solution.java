class Solution {
    public static Boolean checkRedundancy(String allowed,String word){
        String left = word+"";
        for(int i=0;i<allowed.length();i++){
            left = left.replaceAll(""+allowed.charAt(i), "");
        }
        if(left.length() == 0){
            return true;
        }
        return false;
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int consistency = 0;
        for (String s : words) {
            if(checkRedundancy(allowed,s)){
                consistency++;
            }
        }
        return consistency;   
       }
        public static void main(String[] args) {
            String[] consistency1 = {"ad","bd","aaab","baa","badab"};
            String[] consistency2 = {"a","b","c","ab","ac","bc","abc"};
            String[] consistency3 = {"cc","acd","b","ba","bac","bad","ac","d"};

            System.out.println(countConsistentStrings("ab", consistency1));
            System.out.println(countConsistentStrings("abc", consistency2));
            System.out.println(countConsistentStrings("cad", consistency3));
      }
}
