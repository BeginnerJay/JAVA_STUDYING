package chapter10;

class Station {
    private String name;
    private int distance, fare;

    public Station(String name, int distance, int fare) {
        setName(name);
        setDistance(distance);
        setFare(fare);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
}
