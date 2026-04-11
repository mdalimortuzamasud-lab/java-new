
package javaapplication29.newpackage.in3;


public class truck extends vahicle{
    int weight;

    public truck(int weight) {
        this.weight = weight;
    }

    public truck(int weight, double regularprice) {
        super(regularprice);
        this.weight = weight;
    }

    @Override
    public double getsaleprice() {
        
        if (weight>2000) {
            return regularprice-(regularprice*.10);
        }
        return regularprice;
    }
 
    
}
