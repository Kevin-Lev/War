/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author kevin
 */
public class Mapa {
    private Territorio[][] mapa;

    public Territorio[][] getMapa() {
        return mapa;
    }

    public void setMapa(Territorio[][] mapa) {
        this.mapa = mapa;
    }
    
    public static void printaMapa(Territorio[][] mapa){
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<8;j++){
                if(mapa[i][j] == null){
                    System.out.print("VAZIO \t\t\t\t");
                }
                else if("Azul".equals(mapa[i][j].getCor())){
                    System.out.print("|" + mapa[i][j].getNome() + "[T = " + mapa[i][j].getExercitosTerrestre().size()
                            + "]" + "[A = " + mapa[i][j].getExercitosAereo().size() + "]" + "[Azul]" + "|" + "\t");
                }
                else{
                    System.out.print("|" + mapa[i][j].getNome() + "[T = " + mapa[i][j].getExercitosTerrestre().size()
                            + "]" + "[A = " + mapa[i][j].getExercitosAereo().size() + "]" + "[Vermelho]" + "|" + "\t");
                }
            }
            System.out.println("\n\n");
        }
    }
    
}
