package Basics.Strings;

public class LargestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
       for(int i = 0 ; i < strs[0].length() ; i++){
          char c = strs[0].charAt(i);
          for (int j = 1; j < strs.length ; j ++){
             // check for the index at i of strs[0] is same for all other strs
            if (i >= strs[j].length() || c != strs[j].charAt(i)){
                return strs[0].substring(0,i);
            }
          }
       }
       return strs[0];
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flowers", "flow", "fly", "flight"}));
    }
}
