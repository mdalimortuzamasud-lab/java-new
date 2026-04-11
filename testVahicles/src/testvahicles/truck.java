
package testvahicles;


public class truck extends vahicles{
    public int weight;

    public truck(int weight) {
        this.weight = weight;
    }

    public truck(int weight, int regularprice) {
        super(regularprice);
        this.weight = weight;
    }

    @Override
    public double getsaleprice() {
        if(weight>2000){
        return regularprice-(regularprice*.10);
        }else{
        return  regularprice;
        }
    }

    
    

   
    
    
    
}
