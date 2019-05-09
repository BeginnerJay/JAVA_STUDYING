package chapter12;

public class GenericPrinterTest {
    public static void main(String[] args) {
        var powderGenericPrinter = new GenericPrinter<Powder>();

        powderGenericPrinter.setMaterial(new Powder());
        Powder powder = powderGenericPrinter.getMaterial();
        // Powder 자료형인 powder는 getMaterial한다.

        System.out.println(powderGenericPrinter); // 주소가 출력된다.
        powder.doPrinting(); // doPrinting()이 print() 하라고 했어
        powder.toString(); // 왜 toString 안나오지? -> return만 했지 print는 안했으니까.
        System.out.println(powder.toString());
        System.out.println(powder); // 왜 powder.toString() 이랑 같은 결과가 나오지?
        // powder라고 하면 powder.toString 자동으로 나오는데, 그걸 override해서 그런가?
        powderGenericPrinter.printing();

        System.out.println();

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<Plastic>();

        plasticGenericPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticGenericPrinter.getMaterial();

        System.out.println(plasticGenericPrinter);
        plastic.doPrinting();
        plastic.toString();
        System.out.println(plastic.toString());
        System.out.println(plastic);

        powderGenericPrinter.printing();

    }
}
