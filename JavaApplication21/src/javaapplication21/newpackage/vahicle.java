
package javaapplication21.newpackage;


public class vahicle {
    public int spreed;
    public double regutarprice;
    public String color;

    public vahicle() {
    }

    public vahicle(double regutarprice) {
        this.regutarprice = regutarprice;
    }
    
   
    
    public double getsaleprice(){
    return regutarprice;
    }
}
