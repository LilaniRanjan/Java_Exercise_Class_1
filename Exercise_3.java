package JavaExersice;

public class Exersice_3 {
    public static void main(String[] args){
        String albas= "b";
        String alba= albas.toUpperCase();


        if( alba.equals("A") || alba.equals("E") || alba.equals("I") || alba.equals("O")|| alba.equals("U")){
            System.out.println(alba + " This is a Vowel letter..");
        }else{
            System.out.println(alba + " This is a Consonant letter..");
        }
    }

}
