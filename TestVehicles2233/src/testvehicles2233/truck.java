
package testvehicles2233;


public class truck extends Vahicle{
    public int weight;

    public truck(int weight) {
        this.weight = weight;
    }

    public truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    public double getSaleprice() {
        if(weight>=2000){
            return regularPrice-(regularPrice*.10);
        }else{
        return regularPrice;
        }
    }
    
    
    
    
    
    
    
    
    
    
}
