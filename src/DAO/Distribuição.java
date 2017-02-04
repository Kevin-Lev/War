/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Kevin Levrone
 */
public class Distribuição {
    
    public static void distribuiTerrestre(Jogador j){
        int k=0, l=0;
        Map<Integer, String> j_territorios = new HashMap(); 
        List<Territorio> ter_j = j.getTerritorios();
        Scanner scanner = new Scanner(System.in); 
        
        j.setEx_terrestres(j.getTerritorios().size()/2);
        
        
        for(Territorio t: ter_j){
            j_territorios.put(k, t.getNome());
            k++;
        }
        
        System.out.println(j.getNome() + " - Distribua seus exércitos terrestres!\n");
        while(j.getEx_terrestres()>0){
            System.out.println("Exércitos disponíveis: " + j.getEx_terrestres() + "\n");
            System.out.println("Selecione o número do território desejado para distribuir um exército: \n");
            for(k=0;k<ter_j.size();k++){
                System.out.println(k + ")" + " " + ter_j.get(k).getNome() + " (" + ter_j.get(k).getTerrestre() + " " + "terrestre(s)" + ")");
            }
            System.out.print("\nTerritorio: ");
            l = scanner.nextInt();
            while(l<0 || l>ter_j.size()-1){
              System.out.print("Insira um valor válido para a seleção\nTerritório: ");  
              l = scanner.nextInt();
              System.out.println("\n");
            }
            ter_j.get(l).setTerrestre((ter_j.get(l).getTerrestre()+1));
            System.out.println(ter_j.get(l).getNome() + " " + "recebeu um exército terrestre a mais!");
            j.setEx_terrestres((j.getEx_terrestres()-1));
            System.out.println("\n");
        }
    }
        
    public static void distribuiAereo(Jogador j){
        int k=0, l=0;
        Map<Integer, String> j_territorios = new HashMap(); 
        List<Territorio> ter_j = j.getTerritorios();
        Scanner scanner = new Scanner(System.in); 
        
        j.setEx_aereos(j.getTerritorios().size()/3);
        
        for(Territorio t: ter_j){
            j_territorios.put(k, t.getNome());
            k++;
        }
        
        System.out.println(j.getNome() + "- Distribua seus exércitos aéreos!\n");
        while(j.getEx_aereos()>0){
            System.out.println("Exércitos disponíveis: " + j.getEx_aereos()+ "\n");
            System.out.println("Selecione o número do território desejado para distribuir um exército: \n");
            for(k=0;k<ter_j.size();k++){
                System.out.println(k + ")" + " " + ter_j.get(k).getNome() + " (" + ter_j.get(k).getAereo()+ " " + "aéreo(s)" + ")");
            }
            System.out.print("\nTerritorio: ");
            l = scanner.nextInt();
            while(l<0 || l>ter_j.size()-1){
              System.out.print("Insira um valor válido para a seleção\nTerritório: ");  
              l = scanner.nextInt();
              System.out.println("\n");
            }
            ter_j.get(l).setAereo((ter_j.get(l).getAereo()+1));
            System.out.println(ter_j.get(l).getNome() + " " + "recebeu um exército aéreo a mais!");
            j.setEx_aereos((j.getEx_aereos()-1));
            System.out.println("\n");
        }
    }  
    
}
