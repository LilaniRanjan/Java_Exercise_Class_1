package JavaExersice;

public class Exersice_2 {
    public static void main(String[] args){
        int year= 2004;
        boolean bool = false;

        if((year % 400) == 0){
            bool= true;
        }else if((year % 100) == 0){
            bool= false;
        }else if((year % 4) == 0){
            bool = true;
        }else{
            bool = false;
        }

        if(bool){
            System.out.println(year + " This is a leap year..");
        }else{
            System.out.println(year + " This is not a leap year..");
        }

    }
}
