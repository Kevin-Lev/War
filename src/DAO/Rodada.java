/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import war.War;
import war.Terrestre;
import war.Exercito;
/**
 *
 * @author Kevin Levrone
 */

public class Rodada {
   
    
    public static void combateTerrestre(Jogador atacante, Jogador defesa){
       Map<Integer, Territorio> fronteirasdadefesa = new HashMap();
       Map<Integer, Territorio> territoriospraataque = new HashMap();
       List<Territorio> territoriosatacante = atacante.getTerritorios();
       Scanner scanner = new Scanner(System.in); 
       int i=0, l;
       
       for(Territorio t: territoriosatacante){
          if(t.getListaterrestre().size()>1){
              territoriospraataque.put(i, t);
              i++;
          } 
       }
       
       System.out.println(atacante.getNome() + " - Selecione o número de um dos seus territórios conquistados: \n");
       for(Integer key: territoriospraataque.keySet()){
           System.out.println(key + ")" + territoriospraataque.get(key).getNome());
       }
       System.out.print("Território: ");
       l = scanner.nextInt();
       while(territoriospraataque.get(l)==null){
           System.out.print("Selecione um número válido: ");
           l = scanner.nextInt();
       }
       
       Territorio ter_ataque = territoriospraataque.get(l);
       PriorityQueue<Integer> combates_ataque = new PriorityQueue<>();
       
       
       for(Territorio t: territoriospraataque.get(l).getFronteira()){
          if(t.getCor().equals(defesa.getCor())){ 
           fronteirasdadefesa.put(i, t);
           i++;
          }
       }
       
        System.out.println(atacante.getNome() + "- Selecione a fronteira inimiga para atacar!\n");
        for(Integer key: fronteirasdadefesa.keySet()){
            System.out.println(key + ")" + " " + fronteirasdadefesa.get(key).getNome()); 
        }
        System.out.print("Fronteira: ");
        l = scanner.nextInt();
        while(territoriospraataque.get(l)==null){
           System.out.print("Selecione um número válido: ");
           l = scanner.nextInt();
        }
        
        Territorio ter_defesa = fronteirasdadefesa.get(l);
        PriorityQueue<Integer> combates_defesa = new PriorityQueue<>();
        
        for(Terrestre terr: ter_defesa.getListaterrestre()){
            combates_defesa.add(terr.Combater());
        }
        
        System.out.println("Deseja atacar " + ter_defesa.getNome() + " com quantos exércitos de " + ter_ataque + "?\n");
        System.out.println("Quantidade de exércitos disponíveis em " + ter_ataque.getNome() + " : " + ter_ataque.getListaterrestre() + "\n");
        System.out.print("Exércitos: ");
        l = scanner.nextInt();
        while(l>=ter_ataque.getListaterrestre().size()){
            System.out.print("Valor inválido! Deve permanecer pelo menos 1 exército no território");
            l = scanner.nextInt();
        }
        while(l>3){
            System.out.print("Você só pode mover até 3 exércitos para o ataque !!");
            l = scanner.nextInt();
        }
        
        int n=1;
        for(Terrestre terr: ter_ataque.getListaterrestre()){
            combates_ataque.add(terr.Combater());
            if(n==l){
              break;
            }
            n++;
        }   
        
        n=0;
        int perdas_atacante=0, perdas_defesa=0;
        while(n<=l){
           if(combates_ataque.peek() < combates_defesa.peek() || combates_ataque.peek() == combates_defesa.peek()){
               ter_ataque.getListaterrestre().remove(0);
               perdas_atacante+= 1;
           }
           else{
               ter_defesa.getListaterrestre().remove(0);
               perdas_defesa+= 1;
           }
        }
        System.out.println("O " + atacante.getNome() + "perdeu" + perdas_atacante + "exército(s) no " + ter_ataque.getNome()+ "\n");
        System.out.println("O " + defesa.getNome() + "perdeu" + perdas_defesa + "exército(s) no " + ter_defesa.getNome());
        
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
