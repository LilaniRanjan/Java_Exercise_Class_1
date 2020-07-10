package JavaExersice;

public class Exercise_6 {
    public static void main(String[] args){
        String str= "Lilaniya";

        for (int startNum= str.length()-1; startNum>=0; startNum--){
            System.out.print(str.charAt(startNum));
        }
    }
}
