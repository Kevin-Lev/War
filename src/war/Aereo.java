/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import java.util.Random;



/**
 *
 * @author Kevin Levrone
 */
public class Aereo extends Exercito {
    
    public int Combater(){
      Random r = new Random();
      int menor = 0,  maior = 3;
        
      return r.nextInt(maior-menor) + menor;
       
    }
}
