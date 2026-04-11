
package testvahicle222333;


public class Truck extends Vahicle{
    
    int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int regularprice) {
        super(regularprice);
        this.weight = weight;
    }

    @Override
    public double getregularPrice() {
        if(weight>2000){
        return regularprice-(regularprice*.10);
        }else{
        return regularprice;
        }
    }


    
    
    
    
    
    
    
}
