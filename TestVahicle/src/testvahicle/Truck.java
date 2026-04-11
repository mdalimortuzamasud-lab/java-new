package testvahicle;

public class Truck extends vahicle {

    public int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, double regularprice) {
        super(regularprice);
        this.weight = weight;
    }

    @Override
    public double getsalePrice() {
        if (weight >= 2000) {
            return regularprice - (regularprice * .10);
        } else {
            return regularprice;

        }

    }
}