/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import DAO.Jogador;
import DAO.Territorio;
import java.util.Random;



/**
 *
 * @author Kevin Levrone
 */
public class Terrestre extends Exercito {
    
    public int Combater(){
        Random r = new Random();
        
        return r.nextInt(6);
    }

}
