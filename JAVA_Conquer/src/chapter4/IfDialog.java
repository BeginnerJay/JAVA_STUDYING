package chapter4;

public class IfDialog {
	 public static void main(String[] args) {

         int age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("너 몇살이니?"));

        

         if (age >= 19)

             System.out.println("성인입니다.");

    }
}
