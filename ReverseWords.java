public class ReverseWords {
    public static String reverseWords(String s) {
        s = s.trim();  // Remove leading and trailing spaces
        StringBuilder ans = new StringBuilder();

        // Step 1: Reverse full string
        StringBuilder reversed = new StringBuilder(s).reverse();

        int n = reversed.length();
        int i = 0;

        while (i < n) {
            // Skip spaces
            while (i < n && reversed.charAt(i) == ' ') i++;

            int j = i;

            // Find end of word
            while (j < n && reversed.charAt(j) != ' ') j++;

            // Extract and reverse the word
            String word = reversed.substring(i, j);
            word = new StringBuilder(word).reverse().toString();

            if (!word.isEmpty()) {
                ans.append(word).append(" ");
            }

            i = j;
        }

        return ans.toString().trim();
    }

    public static void main(String[] args) {
        String s = "  blue   is sky  ";
        System.out.println("[" + reverseWords(s) + "]");
    }
}


// class reverse_word {
//     public static String reverseWords(String s) {
//         int n = s.length();
//         int i , j = n - 1;
//         String str=" ";
//         for(i=j;i>0;i--){
//         if (s.charAt(i)!=' '){
//             j--;
//         } str+=s.substring(j, i)+" ";
//     }
        
//         return str;
//     }

//     public static void main(String[] args) {
//         String s = "blue is sky";
//         System.out.println(reverseWords(s));
//     }
// }
