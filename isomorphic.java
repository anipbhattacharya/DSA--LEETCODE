import java.util.HashMap;
import java.util.Map;

public class isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) {
                    return false;
                }
            } else {
                map1.put(c1, c2);
            }

            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) {
                    return false;
                }
            } else {
                map2.put(c2, c1);
            }
        }
        return true;
    }

 public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        if (isIsomorphic(s, t)) {
            System.out.println("Yes, strings are isomorphic.");
        } else {
            System.out.println("No, strings are not isomorphic.");
        }
    }
}


// import java.util.HashMap;
// import java.util.Map;

// public class isomorphic {
//      public boolean isIsomorphic(String s, String t) {
//         Map<Character, Integer> map = new HashMap<>();
//         Map<Character, Integer> map1 = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//         char ch = s.charAt(i);
//         if (map.containsKey(ch)) {
//            map.put(ch, map.get(ch) + 1);
//          } 
//          else {
//         map.put(ch, 1);
//          }      
//      }    for (int i = 0; i < t.length(); i++) {
//         char ch1 = t.charAt(i);
//         if (map1.containsKey(ch1)) {
//            map1.put(ch1, map1.get(ch1) + 1);
//          } 
//          else {
//         map1.put(ch1, 1);
//          }      
//      }
//    for (int i = 0; i < s.length(); i++) {
//     Integer val1 = map.get(s.charAt(i));
//     Integer val2 = map1.get(t.charAt(i));

//     if (val1 == null || !val1.equals(val2)) {
//         return false;
//     }
// }
// return true;
// }
// public static void main(String[] args) {
    
// }
// }
