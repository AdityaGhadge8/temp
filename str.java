import java.util.HashMap;

public class str {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);


            System.out.println("charS = "+charS);
            System.out.println("charT = "+charT);

            if ((sToT.containsKey(charS) && sToT.get(charS) != charT) ||
                    (tToS.containsKey(charT) && tToS.get(charT) != charS)) {
                return false;
            }

            sToT.put(charS, charT);
            tToS.put(charT, charS);
        }

        System.out.println("stot = " + sToT);
        System.out.println("tTos = " + tToS);

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));     // Output: true
        // System.out.println(isIsomorphic("foo", "bar"));     // Output: false
        // System.out.println(isIsomorphic("paper", "title")); // Output: true
    }
}
