package chapter7;

public class Dog
{
    private String name;
    private String type;

    Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getNmae() {
        return name;
    }

    public void setNmae(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String showDogInfo() {
        return name + "," + type;
    }
}
