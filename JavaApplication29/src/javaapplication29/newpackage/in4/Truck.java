/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication29.newpackage.in4;

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
        if (weight>2000) {
            return  regularprice-(regularprice*.10);
        }
        return  regularprice;
    }
    
    
    
    
}
