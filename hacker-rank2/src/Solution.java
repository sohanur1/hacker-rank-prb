public class Solution {
    public static void main(String[] args) {
        Adder a=new Adder();
        System.out.println("my super class is: "+a.getClass().getSuperclass().getName());
        System.out.println(a.add(40,2)+" "+a.add(6,7)+" "+a.add(15,5)+"\n");

    }
}
