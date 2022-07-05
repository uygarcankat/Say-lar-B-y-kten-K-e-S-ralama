import java.util.Scanner;

public class sayilar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int n1 = input.nextByte();
        System.out.println("2.sayıyı giriniz");
        int n2 = input.nextByte();
        System.out.println("3.sayıyı giriniz");
        int n3 = input.nextByte();


        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println(n1+","+n2+","+n3);
            } else {
                System.out.println(n1+","+n3+","+n2);
            }
        } else if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println(n2+","+n1+","+n3);
            } else  {
                System.out.println(n2 +","+ n3+ ","+n1);

            }
        } else if (n3 < n1 && n3 < n2) {

            if (n1< n2){
                System.out.println(n3+","+ n1 +"," +n2);
            }
            else  {
                System.out.println(n3+","+n3+","+n1);
            }
        }
   }
}
