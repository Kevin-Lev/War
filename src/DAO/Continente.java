/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Kevin Levrone
 */

public enum Continente {
    AFRICA, AMERICA_DO_NORTE, AMERICA_DO_SUL, ASIA, EUROPA, OCEANIA;

    private int num_territorios;

    public void setNum_territorios(int num_territorios) {
                                                      this.num_territorios = num_territorios;
                                                                                             }

    public int getNum_territorios() {
                                  return num_territorios;
                                                         }

}


