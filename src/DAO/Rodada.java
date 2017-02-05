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
public class Rodada {
    
    public static void combateTerrestre(Jogador atacante, Jogador defesa){
       Map<Integer, String> fronteirasdadefesa = new HashMap();
       Map<Integer, String> territoriospraataque = new HashMap();
       List<Territorio> territoriosatacante = atacante.getTerritorios();
       Scanner scanner = new Scanner(System.in); 
       int i=0, l;
       
       for(Territorio t: territoriosatacante){
          if(t.getListaterrestre().size()>1){
              territoriospraataque.put(i, t.getNome());
              i++;
          } 
       }
       
       System.out.println(atacante.getNome() + " - Selecione o número de um dos seus territórios conquistados: \n");
       for(Integer key: territoriospraataque.keySet()){
           System.out.println(key + ")" + territoriospraataque.get(key));
       }
       System.out.print("Território: ");
       l = scanner.nextInt();
       while(territoriospraataque.get(l)==null){
           System.out.println("Selecione um número válido: ");
           l = scanner.nextInt();
       }
       
       
    }
    
    public static void selecionaOpcao(Jogador atacante, Jogador defesa){
        Scanner scanner = new Scanner(System.in); 
        int opcao;
        
        System.out.println("Vez do " + atacante.getNome());
        System.out.println(atacante.getNome() + "Insira o número da opção desejada: \n");
        System.out.println("1) Combate Terrestre");
        System.out.println("2) Combate Aéreo");
        System.out.println("3) Remanejamento de exércitos\n");
        System.out.print("Opcao: ");
        opcao = scanner.nextInt();
        if(opcao > 3 || opcao < 1){
            System.out.println("Número inválido");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();
        }
    }
}
