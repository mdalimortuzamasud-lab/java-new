
package testvehicle556.in;


public class Truck extends vahicle{
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
      if(weight>2000){
      return regularprice-(regularprice*.10);
      }
      return regularprice;
      
    }
    
    
    
    
    
    
    
}
