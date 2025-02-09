public class digittoword {

    static String digitsInWords[] = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    public static void convertToWords(int num) {
        if(num == 0) return;

        convertToWords(num/10);
        System.out.print(digitsInWords[num%10]+" ");
    } 
  
    public static void main(String[] args) {
        int num = 1094;
        convertToWords(num);
    }
}
