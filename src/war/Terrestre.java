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
    
    public int Combater(Territorio t){
        Random r = new Random();
        int menor = 1,  maior = 6;
        
        return r.nextInt(maior-menor) + menor;
    }

}
