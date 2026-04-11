
package testvehicle556;


public class Truck extends vahicles{
    public int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, double regularprice) {
        super(regularprice);
        this.weight = weight;
    }



    @Override
    public double getsalesprice() {
        if(weight>=2000){
     return regularprice-(regularprice*.10);
        }
        return regularprice;
    }
    
    
    
    
    
    
    
    
    
}
