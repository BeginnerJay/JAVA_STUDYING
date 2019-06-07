package chapter23;

public class OperatorObject2 {
    static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
    public static void main(String[] args) {
        System.out.println("over = " + count(new AgeFilter() {
            public boolean isAgeOk(int age) {
                return (age > 30);
            }
        }));
        System.out.println("under = " + count(new AgeFilter() {
            public boolean isAgeOk(int age) {
                return (age < 30);
            }
        }));
    }

    static int count(AgeFilter op) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (op.isAgeOk(arAge[i])) num++;
        }
        return num;
    }
}
