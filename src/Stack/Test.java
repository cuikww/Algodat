package Stack;

public class Test {
    public static void main(String[] args) {
        String infix= "6-(2+3)*3";
        char[] c= infix.toCharArray();
        for (char t:c){
            System.out.print(t+ " ");
        }
    }
}