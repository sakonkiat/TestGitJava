/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimart;

/**
 *
 * @author ARIT
 */
public class CalculatorItem extends Item {
    public final String name = "Calculator"; 

    public CalculatorItem(int id, double price) {
        super(id, "", price);
        super.name=this.name;
    }
    
    
}
