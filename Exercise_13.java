package JavaExersice;

public class Exercise_13 {
    public static void main(String[] args) {
        String str= "Lilaniya";
        String str1= "lilaniya";

        boolean bool= str.equals(str1);
        if(bool){
            System.out.println("This is Palindrome String..");
        }else{
            System.out.println("This is not a Palindrome String..");
        }
    }
}
