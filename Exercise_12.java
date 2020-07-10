package JavaExersice;

public class Exercise_12 {
    public static void main(String[] args) {
        int decimal=6;
        String binary= "";
        int rem;

        while(decimal>0){
            rem= decimal%2;
            binary= rem + binary;
            decimal= decimal/2;
        }
        System.out.println(binary);
    }
}
