package chapter24;

public class Country implements Comparable<Country>{
    String name;
    Cont cont;
    int popu;
    boolean oecd;

    Country(String name, Cont cont, int popu, boolean oecd) {
        this.name = name;
        this.cont = cont;
        this.popu = popu;
        this.oecd = oecd;
    }

    String getName() { return name; }
    Cont getCont() { return cont; }
    int getPopu() { return popu; }
    boolean isOecd() { return oecd; }
    public String toString() {
        return name + " in " + cont + " : " + popu + (oecd ? "(O)":"");
    }

    @Override
    public int compareTo(Country o) {
        return popu - o.popu;// 인구 순으로 비교하는 compareTo 메서드를 정의하였다.
    }
}
