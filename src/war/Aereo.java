/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

<<<<<<< HEAD
import DAO.Jogador;

import java.util.Random;

=======
import java.util.Random;



>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
/**
 *
 * @author Kevin Levrone
 */
<<<<<<< HEAD

public class Aereo extends Exercito {

    public int Combater(int playerTurn) {
        if ((Jogador.getTurno() / 2) == 0) {
            Random random = new Random();

            return random.nextInt(4);
        }
=======
public class Aereo extends Exercito {
    
    public int Combater(){
      Random r = new Random();
      int menor = 0,  maior = 3;
        
      return r.nextInt(maior-menor) + menor;
       
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
    }
}
