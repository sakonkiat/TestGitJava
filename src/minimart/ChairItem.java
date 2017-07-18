/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimart;

/**
 *
 * @author d1-Komsak
 */
public class ChairItem extends Item {
    public final String name = "Chair";

    public ChairItem(int id, double price) {
        super(id, "", price);
        super.name=this.name;
    }
    
}
