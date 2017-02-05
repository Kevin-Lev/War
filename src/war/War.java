/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import DAO.Continente;
import DAO.Jogador;
import DAO.Mapa;
import DAO.Territorio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Kevin Levrone
 */


public class War {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int playerTurn = 0;
        List<Territorio> Total_ter = new ArrayList();
        
/////////////////////// América do Norte////////////////////////////////

        Continente.AFRICA.setNum_territorios(6);
        Continente.AMERICA_DO_NORTE.setNum_territorios(7);
        Continente.AMERICA_DO_SUL.setNum_territorios(4);
        Continente.ASIA.setNum_territorios(7);
        Continente.EUROPA.setNum_territorios(5);
        Continente.OCEANIA.setNum_territorios(4);


        Territorio alasca= new Territorio();
        alasca.setNome("Alasca");
        alasca.setContinente(Continente.AMERICA_DO_NORTE);
        Total_ter.add(alasca);
        
        Territorio vancouver = new Territorio();
        vancouver.setNome("Vancouver");
        vancouver.setContinente(Continente.AMERICA_DO_NORTE);
        Total_ter.add(vancouver);
        
        Territorio california = new Territorio();
        california.setNome("California");
        california.setContinente(Continente.AMERICA_DO_NORTE);
        Total_ter.add(california);
        
        Territorio mexico = new Territorio();
        mexico.setNome("Mexico");
        mexico.setContinente(Continente.AMERICA_DO_NORTE);
        Total_ter.add(mexico);
        
        Territorio groenlandia = new Territorio();
        groenlandia.setNome("Groenlandia");
        groenlandia.setContinente(Continente.AMERICA_DO_NORTE);
        Total_ter.add(groenlandia);
        
        Territorio otawa = new Territorio();
        otawa.setNome("Otawa");
        otawa.setContinente(Continente.AMERICA_DO_NORTE);
        Total_ter.add(otawa);
        
        Territorio novayork = new Territorio();
        novayork.setNome("Nova York");
        novayork.setContinente(Continente.AMERICA_DO_NORTE);
        Total_ter.add(novayork);
        
    /////////////////////// América do Sul////////////////////////////////
        
        Territorio chile = new Territorio();
        chile.setNome("Chile");
        chile.setContinente(Continente.AMERICA_DO_SUL);
        Total_ter.add(chile);
        
        Territorio colombia = new Territorio();
        colombia.setNome("Colombia");
        colombia.setContinente(Continente.AMERICA_DO_SUL);
        Total_ter.add(colombia);
        
        Territorio argentina = new Territorio();
        argentina.setNome("Argentina");
        argentina.setContinente(Continente.AMERICA_DO_SUL);
        Total_ter.add(argentina);
        
        Territorio brasil = new Territorio();
        brasil.setNome("Brasil");
        brasil.setContinente(Continente.AMERICA_DO_SUL);
        Total_ter.add(brasil);
        
    /////////////////////// Europa ////////////////////////////////
        
        Territorio inglaterra = new Territorio();
        inglaterra.setNome("Inglaterra");
        inglaterra.setContinente(Continente.EUROPA);
        Total_ter.add(inglaterra);
        
        Territorio italia = new Territorio();
        italia.setNome("Italia");
        italia.setContinente(Continente.EUROPA);
        Total_ter.add(italia);
        
        Territorio suecia = new Territorio();
        suecia.setNome("Suécia");
        suecia.setContinente(Continente.EUROPA);
        Total_ter.add(suecia);
        
        Territorio alemanha = new Territorio();
        alemanha.setNome("Alemanha");
        alemanha.setContinente(Continente.EUROPA);
        Total_ter.add(alemanha);
        
        Territorio moscou = new Territorio();
        moscou.setNome("Moscou");
        moscou.setContinente(Continente.EUROPA);
        Total_ter.add(moscou);
        
    /////////////////////// África ////////////////////////////////
        
        Territorio nigeria = new Territorio();
        nigeria.setNome("Nigeria");
        nigeria.setContinente(Continente.AFRICA);
        Total_ter.add(nigeria);
        
        Territorio egito = new Territorio();
        egito.setNome("Egito");
        egito.setContinente(Continente.AFRICA);
        Total_ter.add(egito);
        
        Territorio congo = new Territorio();
        congo.setNome("Congo");
        congo.setContinente(Continente.AFRICA);
        Total_ter.add(congo);
        
        Territorio africaDoSul = new Territorio();
        africaDoSul.setNome("África do Sul");
        africaDoSul.setContinente(Continente.AFRICA);
        Total_ter.add(africaDoSul);
        
        Territorio madagascar = new Territorio();
        madagascar.setNome("Madagascar");
        madagascar.setContinente(Continente.AFRICA);
        Total_ter.add(madagascar);
        
        Territorio sudao = new Territorio();
        sudao.setNome("Sudão");
        sudao.setContinente(Continente.AFRICA);
        Total_ter.add(sudao);
        
    /////////////////////// Asia ////////////////////////////////
        
        Territorio orienteMedio = new Territorio();
        orienteMedio.setNome("Oriente Médio");
        orienteMedio.setContinente(Continente.ASIA);
        Total_ter.add(orienteMedio);
        
        Territorio india = new Territorio();
        india.setNome("Índia");
        india.setContinente(Continente.ASIA);
        Total_ter.add(india);
        
        Territorio omsk = new Territorio();
        omsk.setNome("Omsk");
        omsk.setContinente(Continente.ASIA);
        Total_ter.add(omsk);
        
        Territorio vladivostok = new Territorio();
        vladivostok.setNome("Vladivostok");
        vladivostok.setContinente(Continente.ASIA);
        Total_ter.add(vladivostok);
        
        Territorio siberia = new Territorio();
        siberia.setNome("Sibéria");
        siberia.setContinente(Continente.ASIA);
        Total_ter.add(siberia);
        
        Territorio china = new Territorio();
        china.setNome("China");
        china.setContinente(Continente.ASIA);
        Total_ter.add(china);
        
        Territorio japao = new Territorio();
        japao.setNome("Japão");
        japao.setContinente(Continente.ASIA);
        Total_ter.add(japao);
        
    /////////////////////// Oceania ////////////////////////////////
        
        Territorio sumatra = new Territorio();
        sumatra.setNome("Sumatra");
        sumatra.setContinente(Continente.OCEANIA);
        Total_ter.add(sumatra);
        
        Territorio borneu = new Territorio();
        borneu.setNome("Bornéu");
        borneu.setContinente(Continente.OCEANIA);
        Total_ter.add(borneu);
        
        Territorio australia = new Territorio();
        australia.setNome("Austrália");
        australia.setContinente(Continente.OCEANIA);
        Total_ter.add(australia);
        
        Territorio novaGuine = new Territorio();
        novaGuine.setNome("Nova Guiné");
        novaGuine.setContinente(Continente.OCEANIA);
        Total_ter.add(novaGuine);
 
 //////////////// Definição das fronteiras /////////////////////////////////////       
// América do Norte

        alasca.setFronteira(vancouver);
        alasca.setFronteira(vladivostok);

        vancouver.setFronteira(alasca);
        vancouver.setFronteira(california);
        vancouver.setFronteira(groenlandia);
      
        groenlandia.setFronteira(vancouver);
        groenlandia.setFronteira(otawa);
        groenlandia.setFronteira(inglaterra);

        california.setFronteira(vancouver);
        california.setFronteira(otawa);
        california.setFronteira(mexico);

        otawa.setFronteira(california);
        otawa.setFronteira(groenlandia);
        otawa.setFronteira(novayork);
        
        mexico.setFronteira(california);
        mexico.setFronteira(novayork);
        mexico.setFronteira(colombia);
        
// América do Sul
        
        novayork.setFronteira(otawa);
        novayork.setFronteira(mexico);
        novayork.setFronteira(nigeria);
        
        chile.setFronteira(colombia);
        chile.setFronteira(argentina);
        chile.setFronteira(japao);

        colombia.setFronteira(mexico);
        colombia.setFronteira(brasil);
        colombia.setFronteira(chile);

        argentina.setFronteira(chile);
        argentina.setFronteira(brasil);
        argentina.setFronteira(novaGuine);

//Europa
        
        inglaterra.setFronteira(groenlandia);
        inglaterra.setFronteira(italia);
        
        italia.setFronteira(inglaterra);
        italia.setFronteira(alemanha);
        italia.setFronteira(suecia);
       
        alemanha.setFronteira(italia);
        alemanha.setFronteira(moscou);
        alemanha.setFronteira(egito);

        suecia.setFronteira(italia);
        suecia.setFronteira(moscou);
        
        moscou.setFronteira(suecia);
        moscou.setFronteira(omsk);
        moscou.setFronteira(orienteMedio);
        moscou.setFronteira(alemanha);

// África
       
        egito.setFronteira(alemanha);
        egito.setFronteira(nigeria);
        egito.setFronteira(sudao);
        egito.setFronteira(orienteMedio);

        congo.setFronteira(otawa);
        congo.setFronteira(mexico);
        
        sudao.setFronteira(egito);
        sudao.setFronteira(sumatra);
        sudao.setFronteira(congo);
        sudao.setFronteira(madagascar);
        
        africaDoSul.setFronteira(congo);
        africaDoSul.setFronteira(madagascar);
        
        madagascar.setFronteira(sudao);
        madagascar.setFronteira(africaDoSul);
        
// Ásia
        
        vladivostok.setFronteira(alasca);
        vladivostok.setFronteira(siberia);
        
        omsk.setFronteira(moscou);
        omsk.setFronteira(siberia);
        omsk.setFronteira(india);
        
        siberia.setFronteira(vladivostok);
        siberia.setFronteira(omsk);
        siberia.setFronteira(chile);
        
        orienteMedio.setFronteira(moscou);
        orienteMedio.setFronteira(egito);
        orienteMedio.setFronteira(india);
        orienteMedio.setFronteira(sumatra);

        india.setFronteira(omsk);
        india.setFronteira(orienteMedio);
        india.setFronteira(chile);
        india.setFronteira(borneu);
       
        chile.setFronteira(siberia);
        chile.setFronteira(india);
        chile.setFronteira(japao);

        japao.setFronteira(borneu);
        japao.setFronteira(novaGuine);
        japao.setFronteira(chile);
        
// Oceania
        
        sumatra.setFronteira(sudao);
        sumatra.setFronteira(borneu);
        sumatra.setFronteira(orienteMedio);
        
        borneu.setFronteira(india);
        borneu.setFronteira(sumatra);
        borneu.setFronteira(japao);
        borneu.setFronteira(australia);

        australia.setFronteira(novaGuine);
        
        novaGuine.setFronteira(japao);
        australia.setFronteira(australia);
        australia.setFronteira(argentina);
  
 /////////////////////// Inicialização//////////////////////////////////////////
    
        Jogador player1 = new Jogador();
        Jogador player2 = new Jogador();
        int i=0,j,cont=0;
        
        System.out.println("####################### WAR ##########################");
        System.out.println("\n");
        
        Collections.shuffle(Total_ter); // Para dar um Random nas posições dos elementos da lista
        player1.setTurno(0);
        player1.setCor("Azul");
        player2.setTurno(1);
        player2.setCor("Vermelho");
        if(player1.getTurno() == 1){
            System.out.println("O jogador 1 terá um território a mais");
            System.out.println("O adversário irá iniciar o ataque");
        }
        else{
            System.out.println("O adversário terá um território a mais");
            System.out.println("O jogador 1 irá iniciar o ataque");
        }
        
        System.out.println("\n");
        
        Territorio[][] mapa = new Territorio[5][8];

        mapa[0][0] = alasca;
        mapa[0][1] = vancouver;
        mapa[0][2] = groenlandia;
        mapa[0][3] = inglaterra;
        mapa[0][4] = italia;
        mapa[0][5] = suecia;
        mapa[0][7] = vladivostok;
        mapa[1][1] = california;
        mapa[1][2] = otawa;
        mapa[1][4] = alemanha;
        mapa[1][5] = moscou;
        mapa[1][6] = omsk;
        mapa[1][7] = siberia;
        mapa[2][1] = mexico;
        mapa[2][2] = california;
        mapa[2][3] = nigeria;
        mapa[2][4] = egito;
        mapa[2][5] = orienteMedio;
        mapa[2][6] = india;
        mapa[2][7] = china;
        mapa[3][0] = chile;
        mapa[3][1] = colombia;
        mapa[3][3] = congo;
        mapa[3][4] = sudao;
        mapa[3][5] = sumatra;
        mapa[3][6] = borneu;
        mapa[3][7] = japao;
        mapa[4][0] = argentina;
        mapa[4][1] = brasil;
        mapa[4][3] = africaDoSul;
        mapa[4][4] = madagascar;
        mapa[4][6] = australia;
        mapa[4][7] = novaGuine;
        
        for(Territorio ter : Total_ter){
            i++;
            if(i>=17){
              ter.setCor(player2.getCor());
              ter.setTerrestre(1);
              ter.setAereo(1);
              player2.setTerritorios(ter);
              
            }
            else{
              ter.setCor(player1.getCor());
              ter.setTerrestre(1);
              ter.setAereo(1);
              player1.setTerritorios(ter);
            }
        }
        
        System.out.println("-------------DISTRIBUIÇÃO DE TERRITÓRIOS-------------");
        System.out.println("\n");
        
        Mapa.printaMapa(mapa);
        
        
    //////////////////////////////// Preparação ////////////////////////////////    
         
        // Serve apenas para o recebimento dos novos exércitos e para distribuí-los 
        //nos territórios
        int k=0, l=0;
        Map<Integer, String> j1_territorios = new HashMap(); 
        Map<Integer, String> adv_territorios = new HashMap(); 
        List<Territorio> ter_j1 = player1.getTerritorios(), ter_adv = player2.getTerritorios();
        Scanner scanner = new Scanner(System.in); 
        
        for(Territorio t: ter_j1){
            j1_territorios.put(k, t.getNome());
            k++;
        }
        
        for(Territorio t: ter_adv){
            adv_territorios.put(k, t.getNome());
            k++;
        }
                
        player1.setEx_terrestres(player1.getTerritorios().size()/2);
        player1.setEx_aereos(player1.getTerritorios().size()/3);
        player2.setEx_terrestres(player2.getTerritorios().size()/2);
        player2.setEx_aereos(player2.getTerritorios().size()/3);
        
        System.out.println("Jogador 1 - Distribua seus exércitos terrestres!\n");

        do {
            if ((playerTurn / 2) == 0) {
                while (player1.getEx_terrestres() > 0) {
                    System.out.println("Exércitos disponíveis: " + player1.getEx_terrestres() + "\n");
                    System.out.println("Selecione o número do território desejado para distribuir um exército: \n");
                    for (k = 0; k < ter_j1.size(); k++) {
                        System.out.println(k + ")" + " " + ter_j1.get(k).getNome() + " (" + ter_j1.get(k).getTerrestre() + " " + "exército(s)" + ")");
                    }
                    System.out.print("\nTerritorio: ");
                    l = scanner.nextInt();
                    ter_j1.get(l).setTerrestre((ter_j1.get(l).getTerrestre() + 1));
                    System.out.println(ter_j1.get(l).getNome() + " " + "recebeu um exército a mais!");
                    player1.setEx_terrestres((player1.getEx_terrestres() - 1));
                    System.out.println("\n");
                }
            }

            else {
                System.out.println("Exércitos disponíveis: " + player2.getEx_terrestres() + "\n");
                System.out.println("Selecione o número do território desejado para distribuir um exército: \n");
                for (k = 0; k < ter_j1.size(); k++) {
                    System.out.println(k + ")" + " " + ter_j1.get(k).getNome() + " (" + ter_j1.get(k).getTerrestre() + " " + "exército(s)" + ")");
                }
                System.out.print("\nTerritorio: ");
                l = scanner.nextInt();
                ter_j1.get(l).setTerrestre((ter_j1.get(l).getTerrestre() + 1));
                System.out.println(ter_j1.get(l).getNome() + " " + "recebeu um exército a mais!");
                player1.setEx_terrestres((player1.getEx_terrestres() - 1));
                System.out.println("\n");
            }

            playerTurn++;
        } while ((player1.getContinentes()) < 2 && (player2.getContinentes() < 2));
    }  
}   