package MidTest;

public class Q2 {
    final int min = 1, max = 3;

    int getRNum() {
        double d_rnum;
        int rndNum;

        d_rnum = Math.random();
        rndNum = (int)(d_rnum*10)%max+min;
        return rndNum;
    }
}
