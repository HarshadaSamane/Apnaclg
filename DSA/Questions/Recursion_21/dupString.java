package Questions.Recursion_21;

public class dupString {

    public static void removeDuplicate(int idx, String str, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            removeDuplicate(idx+1, str, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicate(idx+1, str, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(0, str, new StringBuilder(""), new boolean[26]);
        // System.out.println();
    }
}
