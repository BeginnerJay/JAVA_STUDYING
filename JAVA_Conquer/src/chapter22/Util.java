package chapter22;

class Util {
    static void outName(Human2.Name name) {
        System.out.println(name.family + name.first + "입니다.");
    }

    static void outHuman(Human2 who) {
        who.intro();
    }
}