package JavaExersice;

public class Exercise_8 {
    public static void main(String[] args) {
        int[] ary= {2, 4, 6, 8, 10};
        int sum= 0;

        for (int nums : ary){
            sum= sum + nums;
        }
        System.out.println("Sum the elements of this array: " + sum);
    }
}
