
package javaapplication29.newpackage.in;

public class vahicle {
   public int spreed;
   public double  regularprice;
   public String color;

    public vahicle() {
    }

    public vahicle(double regularprice) {
        this.regularprice = regularprice;
    }
   
   public double getsaleprice(){
   return regularprice;
   }
   
}
