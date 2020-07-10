package JavaExersice;

public class Exercise_10 {
    public static void main(String[] args) {
        int enterNum= 3;
        int count=0;

        for(int i=1; i<=enterNum; i++){
            if(enterNum % i == 0){
                count++;
            }
        }

        if (count == 2){
            System.out.println("This is a prime Number..");
        }else{
            System.out.println("This is not a prime Number..");
        }
    }
}
