
package testvehicles2233;


public class Vahicle {
    public int spreed;
    public  double regularPrice;
    public  String color;

    public Vahicle() {
    }

    public Vahicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    
    public double getSaleprice(){
    return regularPrice;
    }
}
