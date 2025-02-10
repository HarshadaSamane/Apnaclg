public class substring {

    public static int countSubstring(String str, int i, int j) {
        if(i > j) return 0;

        int count = (str.charAt(i) == str.charAt(j)) ?  1 : 0;

        return count + countSubstring(str, i+1, j) + countSubstring(str, i, j-1) - countSubstring(str, i+1, j-1);
    }
    public static void main(String[] args) {
        String s1 = "abcab";
        int count1 = countSubstring(s1, 0, s1.length()-1);
        System.out.println("Output1: " + count1);

        String s2 = "aba";
        int count2 = countSubstring(s2, 0, s2.length()-1);
        System.out.println("Output2: " + count2);
    }
}
