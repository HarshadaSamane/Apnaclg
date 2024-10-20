package Questions.array_13;

import Questions.part9_loops.revese_num;

public class linear {
    
    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchMenu(String[] menu, String choice) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i].equals(choice)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 10;

        // int index = linearSearch(numbers , key);

        // if(index == -1) {
        //     System.out.println("Element is not present in array");
        // } else {
        //     System.out.println("Element is present at index " + index);
        // }

        String menu[] = {"Dosa", "Idli", "Samosa", "Vadapav"};
        String choice = "Samosa";

        int index = linearSearchMenu(menu, choice);

        if(index == -1) {
            System.out.println("Choice is not present in menu");
        } else {
            System.out.println(choice + " found at index " + index);
        }

    }
}
