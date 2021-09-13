import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook mb = new MyBook();
        mb.setTitle(title);
        System.out.println("The title is: "+mb.getTitle());
        sc.close();
    }



}
