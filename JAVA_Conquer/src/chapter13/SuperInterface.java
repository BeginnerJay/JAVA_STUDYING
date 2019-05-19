package chapter13;

public class SuperInterface implements Print, Output{
    public void print() {
        Print.super.print();
    }
    public void output() {
        Output.super.print();
    }
}
