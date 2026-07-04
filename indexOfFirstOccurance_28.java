import java.util.Scanner;

public class indexOfFirstOccurance_28{
   public static int strStr(String haystack, String needle) {
    
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
          if(haystack.substring(i,needle.length()+i).equals(needle)){
            return i;
          }
           
    }
     return -1;
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string 1 haystring");
    String  str1 = sc.nextLine();
    System.out.println("Enter string 2 needle");
    String  str2 = sc.nextLine();
    System.out.println(strStr(str1,str2));
    sc.close();
}
}
