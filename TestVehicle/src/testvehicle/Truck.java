
package testvehicle;



public class Truck extends vahicle{
    int Weight;

    public Truck(int Weight) {
        this.Weight = Weight;
    }

    public Truck(int Weight, double regularpice) {
        super(regularpice);
        this.Weight = Weight;
    }

    @Override
    public double getsaleprice() {
       if(Weight>2000){
       return regularpice-(regularpice*.10);
       }
        return regularpice;
    
    }

    
    
    
    
}
