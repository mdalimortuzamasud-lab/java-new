
package javaapplication21.newpackage;


public class Truck extends vahicle{
  int weight;  

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, double regutarprice) {
        super(regutarprice);
        this.weight = weight;
    }

    @Override
    public double getsaleprice() {
        if(weight>2000){
            return regutarprice-(regutarprice*.10);
        
        }else{
    return regutarprice;
    }
    }
  
  
  
  
  
  
  
  
}
