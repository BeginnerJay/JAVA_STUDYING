package chapter05;

public class Break {
	 public static void main(String[] args) {

         int[] score = { 88, 94, 72, -8, 23 };

         for (int i = 0; i < 5; i++){

             if (score[i] < 0 || score[i] > 100) break;

             System.out.println((i + 1) + "�� �л��� ���� : " + score[i]);

         }

    }
}
