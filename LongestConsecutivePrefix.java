public class LongestConsecutivePrefix {

    public static String prefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];  
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(prefix(strs));  // Output: fl
    }
}

// public class longest_consecutive_prefix {
//     public static String prefix(String[] str){
//         String str1,str2,str3,str4="";
//         str1 = str[0]; 
//         str2 = str[1];  
//         str3 = str[2];  
//        for (int i = 0; i < 3; i++) {
//     if (str1.charAt(i) == str2.charAt(i) && str2.charAt(i) == str3.charAt(i)) {
//         str4 = str1.substring(0, i + 1);
        
//     }
        
// }
//     return str4;
//     }
// public static void main(String[] args) {
//     String str[] = {"flower", "flow", "flight"};
//       System.out.println(prefix(str));
     
// }
// }
