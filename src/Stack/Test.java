package Stack;

public class Test {
    public static void main(String[] args) {
        String infix= "9-(2+3)*5";
        char[] c= infix.toCharArray();
        for (char t:c){
            System.out.print(t+ " ");
        }
    }
}