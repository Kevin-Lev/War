/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import war.Aereo;
import war.Terrestre;

import java.util.*;
/**
 *
 * @author Kevin Levrone
 */

public class Rodada {

    public static void combateTerrestre(Jogador atacante, Jogador defensor){
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
       
       System.out.println(atacante.getCor() + " - Selecione o número de um dos seus territórios conquistados: \n");

       for(int i = 0; i < territoriosAlvos.size(); i++){
           System.out.println(i + ")" + territoriosAlvos.get(i).getNome() + " " );
       }

       System.out.print("Território: ");
       opcaoEscolhida = scanner.nextInt();

       while(territoriosAlvos.get(opcaoEscolhida) == null){
           System.out.print("Selecione um número válido: ");
           opcaoEscolhida = scanner.nextInt();
       }
       
       Territorio territoriosAtacante = territoriosAlvos.get(opcaoEscolhida);
       PriorityQueue<Integer> combatesAtaque = new PriorityQueue<>();

       for(Territorio t: territoriosAlvos.get(opcaoEscolhida).getFronteiras()){
          if(t.getCor().equals(defensor.getCor())){
           fronteirasAtacantes.add(t);
          }
       }
       
        System.out.println(atacante.getCor() + "- Selecione a fronteira inimiga para atacar!\n");
        for (int i = 0; i < fronteirasAtacantes.size(); i++) {
            System.out.println(i + ")" + " " + fronteirasAtacantes.get(i).getNome());
        }

        System.out.print("Fronteira: ");
        opcaoEscolhida = scanner.nextInt();
        while(territoriosAlvos.get(opcaoEscolhida)==null){
           System.out.print("Selecione um número válido: ");
           opcaoEscolhida = scanner.nextInt();
        }
        
        Territorio territoriosDefesa = fronteirasAtacantes.get(opcaoEscolhida);
        PriorityQueue<Integer> combatesDefesa = new PriorityQueue<>();
        
        for(int i = 0; i < Math.min(territoriosDefesa.getExercitosTerrestre().size(), 3); i++){
            combatesDefesa.add(territoriosDefesa.getExercitosTerrestre().get(i).Combater());
        }
        
        System.out.println("Deseja atacar " + territoriosDefesa.getNome() + " com quantos exércitos de "
                + territoriosAtacante.getExercitosTerrestre().size() + "?\n");
        System.out.println("Quantidade de exércitos disponíveis em " + territoriosAtacante.getNome() + " : " + 
                territoriosAtacante.getExercitosTerrestre().size() + "\n");
        System.out.print("Exércitos: ");
        opcaoEscolhida = scanner.nextInt();

        while ((opcaoEscolhida >= territoriosAtacante.getExercitosTerrestre().size()) || (opcaoEscolhida > 3)){
            System.out.print("Valor inválido! Deve permanecer pelo menos 1 exército no território\n");
            opcaoEscolhida = scanner.nextInt();
        }
        while((opcaoEscolhida>3) && (opcaoEscolhida < 1)){
            System.out.print("Você só pode mover até 3 exércitos para o ataque !!\n");
            opcaoEscolhida = scanner.nextInt();
        }

        for (int i = 0; i < opcaoEscolhida; i++) {
             combatesAtaque.add(territoriosAtacante.getExercitosTerrestre().get(i).Combater());
        }

        int derrota = 0, vitoria = 0;
        int numMinimoCombates = Math.min(combatesAtaque.size(), combatesDefesa.size());

        for (int i = 0; i < numMinimoCombates; i++) {
            if(combatesAtaque.peek() <= combatesDefesa.peek()){
                territoriosAtacante.removeExercitoTerrestre();
                derrota += 1;
            }
            else{
                territoriosDefesa.removeExercitoTerrestre();
                vitoria += 1;
            }

            combatesAtaque.poll();
            combatesDefesa.poll();
        }

        if(territoriosDefesa.getExercitosTerrestre().isEmpty()){
            System.out.println("O jogador " + atacante.getCor() + " conquistou o território " + territoriosDefesa.getNome());
            territoriosDefesa.setCor(atacante.getCor());
            for (int i = 0; i < (opcaoEscolhida - derrota); i++) {
                territoriosAtacante.removeExercitoTerrestre();
                territoriosDefesa.addExercitoTerrestre(new Terrestre());
            }

            atacante.addTerritorio(territoriosDefesa);

        }

        System.out.println("O jogador " + atacante.getCor() + " perdeu " + derrota + " exército(s) no " + territoriosAtacante.getNome());
        System.out.println("O jogador " + defensor.getCor() + " perdeu " + vitoria + " exército(s) no " + territoriosDefesa.getNome());
        
    }

    private static void combateAereo(Jogador atacante, Jogador defensor) {
        List<Territorio> territoriosAlvosAereo = new ArrayList<>();
        List<Territorio> terriotoriosAtacante = atacante.getTerritorios();
        List<Territorio> territoriosComAereo = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (Territorio territorio: terriotoriosAtacante) {
            if (!(territorio.getExercitosAereo().isEmpty()))
                territoriosComAereo.add(territorio);

            for (Territorio fronteira: territorio.getFronteiras()) {
                if (!fronteira.getExercitosAereo().isEmpty() && (territoriosAlvosAereo.indexOf(fronteira) == -1) &&
                        (fronteira.getExercitosTerrestre().size() >= 4) && (fronteira.getCor() != territorio.getCor())) {
                    territoriosAlvosAereo.add(fronteira);
                }

            }
        }

        if (territoriosAlvosAereo.isEmpty()) {
            System.out.println("Sem alvo para ataque aereo!!!");
            return;
        }

        System.out.println(atacante.getCor() + "- Selecione a fronteira inimiga para atacar!\n");
        for (int i = 0; i < territoriosAlvosAereo.size(); i++) {
            System.out.println(i + ")" + " " + territoriosAlvosAereo.get(i).getNome());
        }

        System.out.print("Fronteira: ");
        int opcaoEscolhida = scanner.nextInt();
        while(territoriosAlvosAereo.get(opcaoEscolhida)==null){
            System.out.print("Selecione um número válido: ");
            opcaoEscolhida = scanner.nextInt();
        }

        Territorio territorioDefesa = territoriosAlvosAereo.get(opcaoEscolhida);
        int exercitoAereoRetirado = 0;

        System.out.println("Selecione o territorio que possui Exercito Aereo");
        for (int i = 0; i < territoriosComAereo.size(); i++) {
            System.out.println(i + ") " + territoriosComAereo.get(i).getNome() + " : Possui " +
                    territoriosComAereo.get(i).getExercitosAereo().size() + " exercito(s) aereos");
        }

        opcaoEscolhida = scanner.nextInt();

        while ((opcaoEscolhida >= territoriosComAereo.size()) || (opcaoEscolhida < 0)) {
            System.out.println("Opcao invalida! Digite novamente um novo valor: ");
            opcaoEscolhida = scanner.nextInt();
        }

        territoriosComAereo.get(opcaoEscolhida).removeExercitoAereos();
        exercitoAereoRetirado++;

        Territorio territorioReferencia = territoriosComAereo.get(opcaoEscolhida);
        List<Territorio> territorioParticipantes = new ArrayList<>();

        gerarContinentesParticipantes(territoriosComAereo, territorioReferencia, territorioParticipantes);

        do {
            System.out.println("Digite outro territorio que deseja unir o Exercito aereo. Caso nao queria mais, digite 99");
            for (int i = 0; i < territorioParticipantes.size(); i++) {
                System.out.println(i + ") " + territorioParticipantes.get(i).getNome() + " : possui "
                        + territorioParticipantes.get(i).getExercitosAereo().size() + " exercitos aereos");
            }

            opcaoEscolhida = scanner.nextInt();

            while ((opcaoEscolhida >= territorioParticipantes.size()) || (opcaoEscolhida < 0)) {
                System.out.println("Opcao invalida! Digite novamente um novo valor: ");
                opcaoEscolhida = scanner.nextInt();
            }

            territoriosComAereo.get(opcaoEscolhida).removeExercitoAereos();
            exercitoAereoRetirado++;

        } while ((opcaoEscolhida != 99) && (exercitoAereoRetirado < 3));


        int defesaAerea = territorioDefesa.getExercitosAereo().get(0).Combater();
        System.out.println("A defesa aerea teve o combate() = " + defesaAerea);
        exercitoAereoRetirado -= defesaAerea;

        int soldadosMortos = 0;
        int aereoAbatido = 0;
        for (int i = 0; i < exercitoAereoRetirado; i++) {
            int ataqueAereo = new Aereo().Combater();
            System.out.println("O ataque aereoa teve o combate() = " + ataqueAereo);

            if (ataqueAereo > 0) {
                aereoAbatido++;
                territorioDefesa.removeExercitoAereos();
                soldadosMortos += Math.min(ataqueAereo, territorioDefesa.getExercitosTerrestre().size());
                for (int j = 0; j < ataqueAereo; j++) {
                    territorioDefesa.removeExercitoTerrestre();
                }
            }
        }

        System.out.println("O jogador " + atacante.getCor() + " perdeu " + defesaAerea + " exercitos aereos");
        System.out.println("O jogador " + defensor.getCor() + " perdeu " + aereoAbatido + " exercitos aereos e "
                            + soldadosMortos + " exercitos terrestres");


    }

    private static void gerarContinentesParticipantes(List<Territorio> territoriosComAereo, Territorio territorioReferencia, List<Territorio> territorioParticipantes) {
        for (Territorio territorio: territoriosComAereo) {
            if ((territorioReferencia.getContinente().saoVizinhos(territorio.getContinente()) ||
                    (territorioReferencia.getContinente() == territorio.getContinente())) &&
                            !(territorio.getExercitosAereo().isEmpty()))
                territorioParticipantes.add(territorio);
        }
    }

    private static void remanejarExercito (Jogador atacante) {
        List<Territorio> territoriosAtuais = atacante.getTerritorios();

        Scanner scanner = new Scanner(System.in);
        int origem, destino, numSoldados;

        for(int k = 0; k < territoriosAtuais.size(); k++){
            System.out.println(k + ")" + " " + territoriosAtuais.get(k).getNome() + " (" +
                    territoriosAtuais.get(k).getExercitosTerrestre().size() + " " + "terrestre(s)" + ")");
        }

        System.out.println("Digite agora o numero de soldados que deseja locomover");
        numSoldados = scanner.nextInt();

        System.out.println("Digite o numero da posicao que vai mover os soldados e, em seguida, o numero da posicao \n" +
                "que recebera os soldados");

        do {
            System.out.println("Digite a origem: ");
            origem = scanner.nextInt();
        } while (territoriosAtuais.get(origem).getExercitosAereo().size() < numSoldados+1);

        System.out.println("Digite o destino: ");
        destino = scanner.nextInt();

        for (int i = 0; i < numSoldados; i++) {
            territoriosAtuais.get(origem).removeExercitoTerrestre();
            territoriosAtuais.get(destino).addExercitoTerrestre(new Terrestre());
        }
    }

    public static void selecionaOpcao(Jogador atacante, Jogador defensor){
        Scanner scanner = new Scanner(System.in);
        int opcao;


        do {
            System.out.println("Vez do " + atacante.getCor());
            System.out.println(atacante.getCor() + "Insira o número da opção desejada: \n");
            System.out.println("1) Combate Terrestre");
            System.out.println("2) Combate Aéreo");
            System.out.println("3) Finalizar combate\n");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    combateTerrestre(atacante, defensor);
                    break;

                case 2:
                    combateAereo(atacante, defensor);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Número inválido");
                    System.out.print("Opcao: ");
                    opcao = scanner.nextInt();
                    break;
            }

            Mapa.printaMapa();
        } while (opcao != 3);

        do {
            System.out.println("Deseja remanejar os exercitos terrestres? Caso nao digite 1");
            opcao = scanner.nextInt();
            if (opcao != 1) {
                remanejarExercito(atacante);
                Mapa.printaMapa();
            }
        } while (opcao != 1);
    }
}
