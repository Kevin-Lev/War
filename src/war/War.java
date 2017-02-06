/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import DAO.*;
import jdk.nashorn.internal.scripts.JO;
import org.w3c.dom.ls.LSException;

import java.util.*;

public class War {

    public static void main(String[] args) {
        List<Territorio> Total_ter = new ArrayList();

/////////////////////// América do Norte////////////////////////////////

        Continente.AFRICA.setNumTerritorios(6);
        Continente.AMERICA_DO_NORTE.setNumTerritorios(7);
        Continente.AMERICA_DO_SUL.setNumTerritorios(4);
        Continente.ASIA.setNumTerritorios(7);
        Continente.EUROPA.setNumTerritorios(5);
        Continente.OCEANIA.setNumTerritorios(4);

        Continente.AFRICA.getContinenteVizinhos().add(Continente.AMERICA_DO_NORTE);
        Continente.AFRICA.getContinenteVizinhos().add(Continente.EUROPA);
        Continente.AFRICA.getContinenteVizinhos().add(Continente.OCEANIA);
        Continente.AFRICA.getContinenteVizinhos().add(Continente.ASIA);

        Continente.AMERICA_DO_NORTE.getContinenteVizinhos().add(Continente.AMERICA_DO_SUL);
        Continente.AMERICA_DO_NORTE.getContinenteVizinhos().add(Continente.AFRICA);
        Continente.AMERICA_DO_NORTE.getContinenteVizinhos().add(Continente.ASIA);
        Continente.AMERICA_DO_NORTE.getContinenteVizinhos().add(Continente.EUROPA);

        Continente.AMERICA_DO_SUL.getContinenteVizinhos().add(Continente.AMERICA_DO_NORTE);
        Continente.AMERICA_DO_SUL.getContinenteVizinhos().add(Continente.ASIA);
        Continente.AMERICA_DO_SUL.getContinenteVizinhos().add(Continente.OCEANIA);

        Continente.ASIA.getContinenteVizinhos().add(Continente.AMERICA_DO_NORTE);
        Continente.ASIA.getContinenteVizinhos().add(Continente.AMERICA_DO_SUL);
        Continente.ASIA.getContinenteVizinhos().add(Continente.EUROPA);
        Continente.ASIA.getContinenteVizinhos().add(Continente.AFRICA);
        Continente.ASIA.getContinenteVizinhos().add(Continente.OCEANIA);

        Continente.EUROPA.getContinenteVizinhos().add(Continente.AMERICA_DO_NORTE);
        Continente.EUROPA.getContinenteVizinhos().add(Continente.AFRICA);
        Continente.EUROPA.getContinenteVizinhos().add(Continente.ASIA);

        Continente.OCEANIA.getContinenteVizinhos().add(Continente.ASIA);
        Continente.OCEANIA.getContinenteVizinhos().add(Continente.AMERICA_DO_SUL);
        Continente.OCEANIA.getContinenteVizinhos().add(Continente.AFRICA);

        Territorio alasca = new Territorio();
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

        alasca.addFronteira(vancouver);
        alasca.addFronteira(vladivostok);

        vancouver.addFronteira(alasca);
        vancouver.addFronteira(california);
        vancouver.addFronteira(groenlandia);

        groenlandia.addFronteira(vancouver);
        groenlandia.addFronteira(otawa);
        groenlandia.addFronteira(inglaterra);

        california.addFronteira(vancouver);
        california.addFronteira(otawa);
        california.addFronteira(mexico);

        otawa.addFronteira(california);
        otawa.addFronteira(groenlandia);
        otawa.addFronteira(novayork);

        mexico.addFronteira(california);
        mexico.addFronteira(novayork);
        mexico.addFronteira(colombia);

// América do Sul

        novayork.addFronteira(otawa);
        novayork.addFronteira(mexico);
        novayork.addFronteira(nigeria);

        chile.addFronteira(colombia);
        chile.addFronteira(argentina);
        chile.addFronteira(japao);

        colombia.addFronteira(mexico);
        colombia.addFronteira(brasil);
        colombia.addFronteira(chile);

        argentina.addFronteira(chile);
        argentina.addFronteira(brasil);
        argentina.addFronteira(novaGuine);

//Europa

        inglaterra.addFronteira(groenlandia);
        inglaterra.addFronteira(italia);

        italia.addFronteira(inglaterra);
        italia.addFronteira(alemanha);
        italia.addFronteira(suecia);

        alemanha.addFronteira(italia);
        alemanha.addFronteira(moscou);
        alemanha.addFronteira(egito);

        suecia.addFronteira(italia);
        suecia.addFronteira(moscou);

        moscou.addFronteira(suecia);
        moscou.addFronteira(omsk);
        moscou.addFronteira(orienteMedio);
        moscou.addFronteira(alemanha);

// África

        egito.addFronteira(alemanha);
        egito.addFronteira(nigeria);
        egito.addFronteira(sudao);
        egito.addFronteira(orienteMedio);

        congo.addFronteira(otawa);
        congo.addFronteira(mexico);

        nigeria.addFronteira(egito);
        nigeria.addFronteira(novayork);
        nigeria.addFronteira(congo);

        sudao.addFronteira(egito);
        sudao.addFronteira(sumatra);
        sudao.addFronteira(congo);
        sudao.addFronteira(madagascar);

        africaDoSul.addFronteira(congo);
        africaDoSul.addFronteira(madagascar);

        madagascar.addFronteira(sudao);
        madagascar.addFronteira(africaDoSul);

// Ásia

        vladivostok.addFronteira(alasca);
        vladivostok.addFronteira(siberia);

        omsk.addFronteira(moscou);
        omsk.addFronteira(siberia);
        omsk.addFronteira(india);

        siberia.addFronteira(vladivostok);
        siberia.addFronteira(omsk);
        siberia.addFronteira(chile);

        orienteMedio.addFronteira(moscou);
        orienteMedio.addFronteira(egito);
        orienteMedio.addFronteira(india);
        orienteMedio.addFronteira(sumatra);

        india.addFronteira(omsk);
        india.addFronteira(orienteMedio);
        india.addFronteira(chile);
        india.addFronteira(borneu);

        china.addFronteira(siberia);
        china.addFronteira(india);
        china.addFronteira(japao);

        japao.addFronteira(borneu);
        japao.addFronteira(novaGuine);
        japao.addFronteira(chile);

// Oceania

        sumatra.addFronteira(sudao);
        sumatra.addFronteira(borneu);
        sumatra.addFronteira(orienteMedio);

        borneu.addFronteira(india);
        borneu.addFronteira(sumatra);
        borneu.addFronteira(japao);
        borneu.addFronteira(australia);

        australia.addFronteira(novaGuine);

        novaGuine.addFronteira(japao);
        australia.addFronteira(australia);
        australia.addFronteira(argentina);

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

        Map<Continente, List<Territorio>> mapa = new HashMap<>();

        mapa.put(Continente.AFRICA, Arrays.asList(nigeria, egito, sudao, congo, africaDoSul));
        mapa.put(Continente.ASIA, Arrays.asList(omsk, orienteMedio, india, china, siberia, vladivostok, japao));
        mapa.put(Continente.AMERICA_DO_NORTE, Arrays.asList(alasca, vancouver, california, mexico, novayork, otawa, groenlandia));
        mapa.put(Continente.AMERICA_DO_SUL, Arrays.asList(brasil, colombia, chile, argentina));
        mapa.put(Continente.EUROPA, Arrays.asList(inglaterra, italia, alemanha, moscou, suecia));
        mapa.put(Continente.OCEANIA, Arrays.asList(sumatra, borneu, novaGuine, australia));


        for(Territorio ter : Total_ter){
            i++;
            if(i>=17){
                ter.setCor(player2.getCor());
                ter.addExercitoTerrestre(new Terrestre());
                ter.addExercitoAereos(new Aereo());
                player2.addTerritorio(ter);

            }
            else{
                ter.setCor(player1.getCor());
                ter.addExercitoTerrestre(new Terrestre());
                ter.addExercitoAereos(new Aereo());
                player1.addTerritorio(ter);
            }
        }

        System.out.println("-------------DISTRIBUIÇÃO DE TERRITÓRIOS-------------");
        System.out.println("\n");

        Mapa.setMapa(mapa);
        Mapa.printaMapa();

        //////////////////////////////// Preparação ////////////////////////////////

        // Serve apenas para o recebimento dos novos exércitos e para distribuí-los 
        //nos territórios
        int k=0, l=0;
        Map<Integer, String> j1_territorios = new HashMap();
        Map<Integer, String> adv_territorios = new HashMap();
        List<Territorio> territoriosJogador1 = player1.getTerritorios(), territoriosJogador2 = player2.getTerritorios();
        Scanner scanner = new Scanner(System.in);

        for(Territorio t: territoriosJogador1){
            j1_territorios.put(k, t.getNome());
            k++;
        }

        for(Territorio t: territoriosJogador2){
            adv_territorios.put(k, t.getNome());
            k++;
        }

        player1.setNumExercitoTerrestre(player1.getTerritorios().size()/2);
        player1.setNumExercitoAereo(player1.getTerritorios().size()/3);
        player2.setNumExercitoTerrestre(player2.getTerritorios().size()/2);
        player2.setNumExercitoAereo(player2.getTerritorios().size()/3);

        int playerTurn = 0;
        do {
            Distribuicao.distribuiTerrestre(player1);
            Distribuicao.distribuiAereo(player1);

            Distribuicao.distribuiTerrestre(player2);
            Distribuicao.distribuiAereo(player2);

            Rodada.selecionaOpcao(player1, player2);
            verificaContinente();

            Rodada.selecionaOpcao(player2, player1);
            verificaContinente();

        } while ((player1.getContinentes()) < 2 && (player2.getContinentes() < 2));
    }

    private static void verificaContinente() {
        Map<Continente, List<Territorio>> mapaContinente = Mapa.getMapa();
        Map<String, Integer> mapaCor = new HashMap<>();
        int dominioAzul = 0;
        int dominioVermelho = 0;

        for (Continente continente: mapaContinente.keySet()) {
            String corReferencia;
            int territoriosDominados = 0;

            List<Territorio> listaTerritorios = mapaContinente.get(continente);
            corReferencia = listaTerritorios.get(0).getCor();

            for (Territorio territorio: listaTerritorios) {
                if (corReferencia == territorio.getCor())
                    territoriosDominados++;
            }

            if (territoriosDominados == listaTerritorios.size()) {
                if (corReferencia == "Azul") {
                    dominioAzul++;
                    System.out.println("Jogador azul conquistou o continente " + continente.name());
                }
                else {
                    dominioVermelho++;
                    System.out.println("Jogador vermelho conquistou o continente " + continente.name());
                }
            }
        }

        if (dominioAzul > 1) {
            System.out.println("O jogador Azul ganhou o jogo! ");
            System.exit(0);
        }
        else if (dominioVermelho > 1) {
            System.out.println("O jogador Vermelho ganhou o jogo! ");
            System.exit(0);
        }
    }

}   