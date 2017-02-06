/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import war.Aereo;
import war.Terrestre;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kevin Levrone
 */
public class Distribuicao {
    
    public static void distribuiTerrestre(Jogador jogador){
        int opcaoEscolhida;
        List<Territorio> territoriosJogador = jogador.getTerritorios();
        Scanner scanner = new Scanner(System.in); 
        
        jogador.setNumExercitoTerrestre(jogador.getTerritorios().size()/2);

        System.out.println(jogador.getCor() + " - Distribua seus exércitos terrestres!\n");
        while(jogador.getNumExercitoTerrestre()>0){
            System.out.println("Exércitos disponíveis: " + jogador.getNumExercitoTerrestre() + "\n");
            System.out.println("Selecione o número do território desejado para distribuir um exército: \n");
            for(int k = 0; k < territoriosJogador.size(); k++){
                System.out.println(k + ")" + " " + territoriosJogador.get(k).getNome() + " (" +
                        territoriosJogador.get(k).getExercitosTerrestre().size() + " " + "terrestre(s)" + ")");
            }
            System.out.print("\nTerritorio: ");
            opcaoEscolhida = scanner.nextInt();
            while(opcaoEscolhida<0 || opcaoEscolhida>territoriosJogador.size()-1){
              System.out.print("Insira um valor válido para a seleção\nTerritório: ");  
              opcaoEscolhida = scanner.nextInt();
              System.out.println("\n");
            }
            territoriosJogador.get(opcaoEscolhida).addExercitoTerrestre(new Terrestre());
            System.out.println(territoriosJogador.get(opcaoEscolhida).getCor() + " " + "recebeu um exército terrestre a mais!");
            jogador.setNumExercitoTerrestre((jogador.getNumExercitoTerrestre()-1));
            System.out.println("\n");
        }
    }
        
    public static void distribuiAereo(Jogador jogador){
        int opcaoEscolhida;
        List<Territorio> territoriosJogador = jogador.getTerritorios();
        Scanner scanner = new Scanner(System.in); 
        
        jogador.setNumExercitoAereo(jogador.getTerritorios().size()/3);

        System.out.println(jogador.getCor() + "- Distribua seus exércitos aéreos!\n");
        while(jogador.getNumExercitosAereo()>0){
            System.out.println("Exércitos disponíveis: " + jogador.getNumExercitosAereo()+ "\n");
            System.out.println("Selecione o número do território desejado para distribuir um exército: \n");

            for(int k = 0; k < territoriosJogador.size(); k++){
                System.out.println(k + ")" + " " + territoriosJogador.get(k).getNome() + " ("
                        + territoriosJogador.get(k).getExercitosAereo().size() + " " + "aéreo(s)" + ")");
            }

            System.out.print("\nTerritorio: ");
            opcaoEscolhida = scanner.nextInt();
            while(opcaoEscolhida<0 || opcaoEscolhida>territoriosJogador.size()-1){
              System.out.print("Insira um valor válido para a seleção\nTerritório: ");  
              opcaoEscolhida = scanner.nextInt();
              System.out.println("\n");
            }
            territoriosJogador.get(opcaoEscolhida).addExercitoAereos(new Aereo());
            System.out.println(territoriosJogador.get(opcaoEscolhida).getCor() + " " + "recebeu um exército aéreo a mais!");
            jogador.setNumExercitoAereo((jogador.getNumExercitosAereo()-1));
            System.out.println("\n");
        }
    }  
    
}
