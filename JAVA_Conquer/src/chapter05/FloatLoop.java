package chapter05;

public class FloatLoop {
	 public static void main(String[] args) {

         for (int i = 10; i > 0; i--){

             System.out.print(i + ", ");

         }

         System.out.println();

         for (double d = 0; d < 3.0; d = d + 0.5) {

             System.out.print(d + ", ");

         }

    }
}
