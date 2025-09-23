//Glass bottoles are placed in a row so you have to calculatr the max area of rectangle formed by bottles. Width of each bottle is one unit

import java.util.*;

public class maxArea {

    public static int area (ArrayList<Integer> list) {
        int maxArea = 0;
        int lp = 0;
        int rp = list.size()-1;

        while (lp < rp) {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp + 1;
            int currArea = height * width;

            maxArea = Math.max(maxArea, currArea);

            if(lp < rp) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=10; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println(area(list));
    }
}
