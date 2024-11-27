package Practice_Questions.part_18;

// Convert uppercase characters to lowercase using bits 
public class casechange {
    public static void main(String[] args) {
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }
    }
}
