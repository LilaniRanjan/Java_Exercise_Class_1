package JavaExersice;

public class Exercise_7 {
    public static void main(String[] args) {
        String str="Lilaniyaaa..";
        char ch='a';
        int occurrence=0;

        String str1= str.toLowerCase();

        for(int i=0; i<str1.length();i++){
            if (str.charAt(i)==ch){
                occurrence++;
            }
        }
        System.out.println("'"+ch+"'" + " is present " + occurrence + " number of times..");
    }
}
