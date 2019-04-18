package chapter04;
/*
 * ���� country�� ����ڰ� ���� �Է��Ѵٸ� 
 * CHINA�� �Է��� ���� �ְ� china�� �Է��� ���� �ִµ� 
 * �� ���� case���� China�� �޶� ����� ���õ��� �ʴ´�. 
 * �̷� ������ �����Ϸ��� ���ڿ� ������ toLowerCase 
 * �޼��带 ȣ���Ͽ� ��� �ҹ��ڷ� �ٲٰ� 
 * case���� �ҹ��ڷ� �Ἥ ���Ѵ�
 */
public class StringCase2 {
	 public static void main(String[] args) {

         String country = "CHINA";

         switch (country.toLowerCase()) {
         case "korea":
             System.out.println("Seoul");
             break;
         case "china":
             System.out.println("Beijing");
             break;
         case "japan":
             System.out.println("Tokyo");
             break;
         }
    }
}
