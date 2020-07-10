package JavaExersice;

public class Exercise_5 {
    public static void main(String[] main){
        int base= 2;
        int exporent= 5;
        int ans=1;

//        while(exporent !=0){
//            ans *= base;
//            exporent--;
//        }

        for(int i=1; i<= exporent; i++){
            ans *= base;
        }
        System.out.println(ans);
    }
}
