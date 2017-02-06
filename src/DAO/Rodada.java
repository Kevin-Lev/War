/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import war.Terrestre;

import java.util.*;
/**
 *
 * @author Kevin Levrone
 */

public class Rodada {

    public static void combateTerrestre(Jogador atacante, Jogador defesa){
       List<Territorio> territoriosAtacantes = atacante.getTerritorios();
       List<Territorio> fronteirasAtacantes = new ArrayList<>();
       List<Territorio> territoriosAlvos = new ArrayList<>();

       Scanner scanner = new Scanner(System.in);

       int opcaoEscolhida = 0;
       
       for(Territorio t: territoriosAtacantes){
          if(t.getExercitosTerrestre().size() > 1){
              territoriosAlvos.add(t);
          } 
       }
       
       System.out.println(atacante.getNome() + " - Selecione o número de um dos seus territórios conquistados: \n");

       for(int i = 0; i < territoriosAlvos.size(); i++){
           System.out.println(i + ")" + territoriosAlvos.get(i).getNome());
       }

       System.out.print("Território: ");
       opcaoEscolhida = scanner.nextInt();

       while(territoriosAlvos.get(opcaoEscolhida)==null){
           System.out.print("Selecione um número válido: ");
           opcaoEscolhida = scanner.nextInt();
       }
       
       Territorio territoriosAtacante = territoriosAlvos.get(opcaoEscolhida);
       PriorityQueue<Integer> combatesAtaque = new PriorityQueue<>();

       for(Territorio t: territoriosAlvos.get(opcaoEscolhida).getFronteira()){
          if(t.getCor().equals(defesa.getCor())){ 
           fronteirasAtacantes.add(t);
          }
       }
       
        System.out.println(atacante.getNome() + "- Selecione a fronteira inimiga para atacar!\n");
        for (int i = 0; i < fronteirasAtacantes.size(); i++) {
            System.out.println(i + ")" + " " + fronteirasAtacantes.get(i).getNome());
        }

        System.out.print("Fronteira: ");
        opcaoEscolhida = scanner.nextInt();
        while(territoriosAlvos.get(opcaoEscolhida)==null){
           System.out.print("Selecione um número válido: ");
           opcaoEscolhida = scanner.nextInt();
        }
        
        Territorio ter_defesa = fronteirasAtacantes.get(opcaoEscolhida);
        PriorityQueue<Integer> combates_defesa = new PriorityQueue<>();
        
        for(Terrestre terr: ter_defesa.getExercitosTerrestre()){
            combates_defesa.add(terr.Combater());
        }
        
        System.out.println("Deseja atacar " + ter_defesa.getNome() + " com quantos exércitos de " + territoriosAtacante + "?\n");
        System.out.println("Quantidade de exércitos disponíveis em " + territoriosAtacante.getNome() + " : " + territoriosAtacante.getExercitosTerrestre() + "\n");
        System.out.print("Exércitos: ");
        opcaoEscolhida = scanner.nextInt();
        while(opcaoEscolhida>=territoriosAtacante.getExercitosTerrestre().size()){
            System.out.print("Valor inválido! Deve permanecer pelo menos 1 exército no território");
            opcaoEscolhida = scanner.nextInt();
        }
        while(opcaoEscolhida>3){
            System.out.print("Você só pode mover até 3 exércitos para o ataque !!");
            opcaoEscolhida = scanner.nextInt();
        }
        
        int n=1;
        for(Terrestre terr: territoriosAtacante.getExercitosTerrestre()){
            combatesAtaque.add(terr.Combater());
            if(n==opcaoEscolhida){
              break;
            }
            n++;
        }   
        
        n=0;
        int perdas_atacante=0, perdas_defesa=0;
        while(n<=opcaoEscolhida){
           if(combatesAtaque.peek() < combates_defesa.peek() || combatesAtaque.peek() == combates_defesa.peek()){
               territoriosAtacante.getExercitosTerrestre().remove(0);
               perdas_atacante+= 1;
           }
           else{
               ter_defesa.getExercitosTerrestre().remove(0);
               perdas_defesa+= 1;
           }
           if(ter_defesa.getExercitosTerrestre().size() == 0){
               System.out.println("O " + atacante.getNome() + "conquistou o território " + ter_defesa.getNome());
               ter_defesa.setCor(atacante.getCor());
               atacante.setEx_aereos(atacante.getNumExercitosAereo() + ter_defesa.getExercitosAereo().size());
               System.out.println("O " + atacante.getNome() + " recebeu " + ter_defesa.getExercitosAereo().size() + " exército(s) aéreo(s) " + " do território " + ter_defesa.getNome());
               ter_defesa.getExercitosAereo().clear();
               break;
           }
        }
        System.out.println("O " + atacante.getNome() + "perdeu" + perdas_atacante + "exército(s) no " + territoriosAtacante.getNome()+ "\n");
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
        while(opcao > 3 || opcao < 1){
            System.out.println("Número inválido");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();
        }
        if(opcao == 1){
            combateTerrestre(atacante, defesa);
        }
    }
}
