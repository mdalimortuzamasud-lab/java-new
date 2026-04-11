
package testvehicle272788;


public class Truck extends vahicle{
    int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, double regularprice) {
        super(regularprice);
        this.weight = weight;
    }

    @Override
    public double getsaleprice() {
        if(weight>2000){
            return regularprice-(regularprice*.10);
        }else{
            return regularprice;
        }
    }
    
    
    
    
    
}
