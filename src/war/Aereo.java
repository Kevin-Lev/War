/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import DAO.Jogador;

import java.util.Random;

/**
 *
 * @author Kevin Levrone
 */

public class Aereo extends Exercito {

    public int Combater(int playerTurn) {
        Random random = new Random();

        return random.nextInt(4);
    }
}
