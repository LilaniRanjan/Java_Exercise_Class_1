package JavaExersice;

import java.util.Arrays;

public class Exercise_9 {
    public static void main(String[] args) {
        String[] str={"Apple", "Orange", "Pineapple", "Banana"};

        int i=0;
        int j=str.length - 1;

        while(i <= j){
            String temp= str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }System.out.println(Arrays.toString(str));

    }
}
