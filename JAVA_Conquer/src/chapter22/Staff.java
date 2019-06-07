package chapter22;

public class Staff {
    interface Workable {
        void work(String what, int time);
    }
    void doWork(Workable w, String what, int time) {
        w.work(what, time);
    }
}
