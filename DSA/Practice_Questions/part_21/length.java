public class length {
    public static int stringLength(String str) {
        if(str.length() == 0) return 0;

        return (1 + stringLength(str.substring(1))); 
    }

    
    public static void main(String[] args) {
        String str = "Hello";
        int length = stringLength(str);
        System.out.println("Length of the string is " + length);
    }
}
