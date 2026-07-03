import java.util.Scanner;

public class lengthOfLastWord_58 {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        String str=s.trim();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
               count++;        
            }
            else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string");
    String  str = sc.nextLine();
    System.out.println(lengthOfLastWord(str));
    sc.close();
}
}

