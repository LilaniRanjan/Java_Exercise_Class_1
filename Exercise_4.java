package JavaExersice;

public class Exercise_4 {
    public  static void main(String[] args){
        int enterNum= 118;
        int devidedBy= 4;

         int quotient= (enterNum / devidedBy);
         int remainder= (enterNum % devidedBy);

         String question= String.format("When %d is devided by %d =  ", enterNum, devidedBy);
         String answer= String.format("Quotient is %d and Reminder is %d " , quotient, remainder);

         System.out.println(question + answer);
    }
}
