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
<<<<<<< HEAD

    public static void main(String[] args) {
        int playerTurn = 0;
=======
    public static void main(String[] args) {
        // TODO code application logic here
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
        List<Territorio> Total_ter = new ArrayList();
        
/////////////////////// América do Norte////////////////////////////////

<<<<<<< HEAD
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
        
        Territorio aus = new Territorio();
        aus.setNome("Austrália");
        aus.setContinente(Continente.OCEANIA);
=======
        Continente.continentes.AFRICA.setNum_territorios(6);
        Continente.continentes.AMERICA_DO_NORTE.setNum_territorios(7);
        Continente.continentes.AMERICA_DO_SUL.setNum_territorios(4);
        Continente.continentes.ASIA.setNum_territorios(7);
        Continente.continentes.EUROPA.setNum_territorios(5);
        Continente.continentes.OCEANIA.setNum_territorios(4);


        Territorio al = new Territorio();
        al.setNome("Alasca");
        al.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(al);
        
        Territorio van = new Territorio();
        van.setNome("Vancouver");
        van.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(van);
        
        Territorio cal = new Territorio();
        cal.setNome("California");
        cal.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(cal);
        
        Territorio mex = new Territorio();
        mex.setNome("Mexico");
        mex.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(mex);
        
        Territorio gro = new Territorio();
        gro.setNome("Groenlandia");
        gro.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(gro);
        
        Territorio ota = new Territorio();
        ota.setNome("Otawa");
        ota.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(ota);
        
        Territorio ny = new Territorio();
        ny.setNome("Nova York");
        ny.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(ny);
        
    /////////////////////// América do Sul////////////////////////////////
        
        Territorio chi = new Territorio();
        chi.setNome("Chile");
        chi.setContinente(Continente.continentes.AMERICA_DO_SUL);
        Total_ter.add(chi);
        
        Territorio col = new Territorio();
        col.setNome("Colombia");
        col.setContinente(Continente.continentes.AMERICA_DO_SUL);
        Total_ter.add(col);
        
        Territorio arg = new Territorio();
        arg.setNome("Argentina");
        arg.setContinente(Continente.continentes.AMERICA_DO_SUL);
        Total_ter.add(arg);
        
        Territorio bra = new Territorio();
        bra.setNome("Brasil");
        bra.setContinente(Continente.continentes.AMERICA_DO_SUL);
        Total_ter.add(bra);
        
    /////////////////////// Europa ////////////////////////////////
        
        Territorio  ing = new Territorio();
        ing.setNome("Inglaterra");
        ing.setContinente(Continente.continentes.EUROPA);
        Total_ter.add(ing);
        
        Territorio ita = new Territorio();
        ita.setNome("Italia");
        ita.setContinente(Continente.continentes.EUROPA);
        Total_ter.add(ita);
        
        Territorio sue = new Territorio();
        sue.setNome("Suécia");
        sue.setContinente(Continente.continentes.EUROPA);
        Total_ter.add(sue);
        
        Territorio ale = new Territorio();
        ale.setNome("Alemanha");
        ale.setContinente(Continente.continentes.EUROPA);
        Total_ter.add(ale);
        
        Territorio mos = new Territorio();
        mos.setNome("Moscou");
        mos.setContinente(Continente.continentes.EUROPA);
        Total_ter.add(mos);
        
    /////////////////////// África ////////////////////////////////
        
        Territorio nig = new Territorio();
        nig.setNome("Nigeria");
        nig.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(nig);
        
        Territorio egi = new Territorio();
        egi.setNome("Egito");
        egi.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(egi);
        
        Territorio con = new Territorio();
        con.setNome("Congo");
        con.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(con);
        
        Territorio afr = new Territorio();
        afr.setNome("África do Sul");
        afr.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(afr);
        
        Territorio mad = new Territorio();
        mad.setNome("Madagascar");
        mad.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(mad);
        
        Territorio sud = new Territorio();
        sud.setNome("Sudão");
        sud.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(sud);
        
    /////////////////////// Asia ////////////////////////////////
        
        Territorio ori = new Territorio();
        ori.setNome("Oriente Médio");
        ori.setContinente(Continente.continentes.ASIA);
        Total_ter.add(ori);
        
        Territorio ind = new Territorio();
        ind.setNome("Índia");
        ind.setContinente(Continente.continentes.ASIA);
        Total_ter.add(ind);
        
        Territorio om = new Territorio();
        om.setNome("Omsk");
        om.setContinente(Continente.continentes.ASIA);
        Total_ter.add(om);
        
        Territorio vlad = new Territorio();
        vlad.setNome("Vladivostok");
        vlad.setContinente(Continente.continentes.ASIA);
        Total_ter.add(vlad);
        
        Territorio sib = new Territorio();
        sib.setNome("Sibéria");
        sib.setContinente(Continente.continentes.ASIA);
        Total_ter.add(sib);
        
        Territorio chin = new Territorio();
        chin.setNome("China");
        chin.setContinente(Continente.continentes.ASIA);
        Total_ter.add(chin);
        
        Territorio jap = new Territorio();
        jap.setNome("Japão");
        jap.setContinente(Continente.continentes.ASIA);
        Total_ter.add(jap);
        
    /////////////////////// Oceania ////////////////////////////////
        
        Territorio sum = new Territorio();
        sum.setNome("Sumatra");
        sum.setContinente(Continente.continentes.OCEANIA);
        Total_ter.add(sum);
        
        Territorio bor = new Territorio();
        bor.setNome("Bornéu");
        bor.setContinente(Continente.continentes.OCEANIA);
        Total_ter.add(bor);
        
        Territorio aus = new Territorio();
        aus.setNome("Austrália");
        aus.setContinente(Continente.continentes.OCEANIA);
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
        Total_ter.add(aus);
        
        Territorio nov = new Territorio();
        nov.setNome("Nova Guiné");
<<<<<<< HEAD
        nov.setContinente(Continente.OCEANIA);
=======
        nov.setContinente(Continente.continentes.OCEANIA);
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
        Total_ter.add(nov);
 
 //////////////// Definição das fronteiras /////////////////////////////////////       
// América do Norte
        
<<<<<<< HEAD
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
        argentina.setFronteira(nov);

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
        japao.setFronteira(nov);
        japao.setFronteira(chile);
        
// Oceania
        
        sumatra.setFronteira(sudao);
        sumatra.setFronteira(borneu);
        sumatra.setFronteira(orienteMedio);
        
        borneu.setFronteira(india);
        borneu.setFronteira(sumatra);
        borneu.setFronteira(japao);
        borneu.setFronteira(aus);

        aus.setFronteira(borneu);
        aus.setFronteira(nov);
        
        nov.setFronteira(japao);
        aus.setFronteira(aus);
        aus.setFronteira(argentina); 
=======
        al.setFronteira(van);
        al.setFronteira(vlad);
        
        
        van.setFronteira(al);
        van.setFronteira(cal);
        van.setFronteira(gro);
        
      
        gro.setFronteira(van);
        gro.setFronteira(ota);
        gro.setFronteira(ing);
        
       
        cal.setFronteira(van);
        cal.setFronteira(ota);
        cal.setFronteira(mex);
        
       
        ota.setFronteira(cal);
        ota.setFronteira(gro);
        ota.setFronteira(ny);
        
        
        mex.setFronteira(cal);
        mex.setFronteira(ny);
        mex.setFronteira(col);
        
// América do Sul
        
        ny.setFronteira(ota);
        ny.setFronteira(mex);
        ny.setFronteira(nig);
        
        
        chi.setFronteira(col);
        chi.setFronteira(arg);
        chi.setFronteira(jap);
        
       
        col.setFronteira(mex);
        col.setFronteira(bra);
        col.setFronteira(chi);
        
       
        arg.setFronteira(chi);
        arg.setFronteira(bra);
        arg.setFronteira(nov);
        
        
//Europa
        
        ing.setFronteira(gro);
        ing.setFronteira(ita);
       
        
        
        ita.setFronteira(ing);
        ita.setFronteira(ale);
        ita.setFronteira(sue);
    
        
       
        ale.setFronteira(ita);
        ale.setFronteira(mos);
        ale.setFronteira(egi);
        
       
        sue.setFronteira(ita);
        sue.setFronteira(mos);
        
        
        mos.setFronteira(sue);
        mos.setFronteira(om);
        mos.setFronteira(ori);
        mos.setFronteira(ale);

// África
        
               
       
        egi.setFronteira(ale);
        egi.setFronteira(nig);
        egi.setFronteira(sud);
        egi.setFronteira(ori);
        
        
        con.setFronteira(ota);
        con.setFronteira(mex);
        
        
        sud.setFronteira(egi);
        sud.setFronteira(sum);
        sud.setFronteira(con);
        sud.setFronteira(mad);
        
        
        afr.setFronteira(con);
        afr.setFronteira(mad);
        
        
        mad.setFronteira(sud);
        mad.setFronteira(afr);
        
// Ásia
        
        vlad.setFronteira(al);
        vlad.setFronteira(sib);
        
        
        om.setFronteira(mos);
        om.setFronteira(sib);
        om.setFronteira(ind);
        
        
        sib.setFronteira(vlad);
        sib.setFronteira(om);
        sib.setFronteira(chi);
        
        
        ori.setFronteira(mos);
        ori.setFronteira(egi);
        ori.setFronteira(ind);
        ori.setFronteira(sum);
      
       
        ind.setFronteira(om);
        ind.setFronteira(ori);
        ind.setFronteira(chi);
        ind.setFronteira(bor);
        
       
        chi.setFronteira(sib);
        chi.setFronteira(ind);
        chi.setFronteira(jap);
        
       
        jap.setFronteira(bor);
        jap.setFronteira(nov);
        jap.setFronteira(chi);
        
// Oceania
        
        sum.setFronteira(sud);
        sum.setFronteira(bor);
        sum.setFronteira(ori);
        
        
        bor.setFronteira(ind);
        bor.setFronteira(sum);
        bor.setFronteira(jap);
        bor.setFronteira(aus);
     
        
        aus.setFronteira(bor);
        aus.setFronteira(nov);
        
        
        nov.setFronteira(jap);
        aus.setFronteira(aus);
        aus.setFronteira(arg); 
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
        
  
 /////////////////////// Inicialização//////////////////////////////////////////
    
        Jogador jogador_1 = new Jogador();
        Jogador adversario = new Jogador();
        int i=0,j,cont=0;
        
        System.out.println("####################### WAR ##########################");
        System.out.println("\n");
        
        Collections.shuffle(Total_ter); // Para dar um Random nas posições dos elementos da lista
<<<<<<< HEAD
        jogador_1.setTurno(0);
        jogador_1.setCor("Azul");
        adversario.setTurno(1);
        adversario.setCor("Vermelho");
        if(jogador_1.getTurno() == 1){
=======
        jogador_1.setNum(0);
        jogador_1.setCor("Azul");
        adversario.setNum(1);
        adversario.setCor("Vermelho");
        if(jogador_1.getNum() == 1){
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
            System.out.println("O jogador 1 terá um território a mais");
            System.out.println("O adversário irá iniciar o ataque");
        }
        else{
            System.out.println("O adversário terá um território a mais");
            System.out.println("O jogador 1 irá iniciar o ataque");
        }
        
        System.out.println("\n");
        
        Territorio[][] mapa = new Territorio[5][8];
        
<<<<<<< HEAD
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
=======
        mapa[0][0] = al;    
        mapa[0][1] = van;
        mapa[0][2] = gro;
        mapa[0][3] = ing;
        mapa[0][4] = ita;
        mapa[0][5] = sue;
        mapa[0][7] = vlad;
        mapa[1][1] = cal;
        mapa[1][2] = ota;
        mapa[1][4] = ale;
        mapa[1][5] = mos;
        mapa[1][6] = om;
        mapa[1][7] = sib;
        mapa[2][1] = mex;
        mapa[2][2] = cal;
        mapa[2][3] = nig;
        mapa[2][4] = egi;
        mapa[2][5] = ori;
        mapa[2][6] = ind;
        mapa[2][7] = chin;
        mapa[3][0] = chi;
        mapa[3][1] = col;
        mapa[3][3] = con;
        mapa[3][4] = sud;
        mapa[3][5] = sum;
        mapa[3][6] = bor;
        mapa[3][7] = jap;
        mapa[4][0] = arg;
        mapa[4][1] = bra;
        mapa[4][3] = afr;
        mapa[4][4] = mad;
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
        mapa[4][6] = aus;
        mapa[4][7] = nov;
        
        for(Territorio ter : Total_ter){
            i++;
            if(i>=17){
              ter.setCor(adversario.getCor());
              ter.setTerrestre(1);
              ter.setAereo(1);
              adversario.setTerritorios(ter);
              
            }
            else{
              ter.setCor(jogador_1.getCor());
              ter.setTerrestre(1);
              ter.setAereo(1);
              jogador_1.setTerritorios(ter);
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
        List<Territorio> ter_j1 = jogador_1.getTerritorios(), ter_adv = adversario.getTerritorios();
        Scanner scanner = new Scanner(System.in); 
        
        for(Territorio t: ter_j1){
            j1_territorios.put(k, t.getNome());
            k++;
        }
        
        for(Territorio t: ter_adv){
            adv_territorios.put(k, t.getNome());
            k++;
        }
                
        jogador_1.setEx_terrestres(jogador_1.getTerritorios().size()/2);
        jogador_1.setEx_aereos(jogador_1.getTerritorios().size()/3);
        adversario.setEx_terrestres(adversario.getTerritorios().size()/2);
        adversario.setEx_aereos(adversario.getTerritorios().size()/3);
        
        System.out.println("Jogador 1 - Distribua seus exércitos terrestres!\n");
<<<<<<< HEAD

        do {
            if ((playerTurn / 2) == 0) {
                while (jogador_1.getEx_terrestres() > 0) {
                    System.out.println("Exércitos disponíveis: " + jogador_1.getEx_terrestres() + "\n");
                    System.out.println("Selecione o número do território desejado para distribuir um exército: \n");
                    for (k = 0; k < ter_j1.size(); k++) {
                        System.out.println(k + ")" + " " + ter_j1.get(k).getNome() + " (" + ter_j1.get(k).getTerrestre() + " " + "exército(s)" + ")");
                    }
                    System.out.print("\nTerritorio: ");
                    l = scanner.nextInt();
                    ter_j1.get(l).setTerrestre((ter_j1.get(l).getTerrestre() + 1));
                    System.out.println(ter_j1.get(l).getNome() + " " + "recebeu um exército a mais!");
                    jogador_1.setEx_terrestres((jogador_1.getEx_terrestres() - 1));
                    System.out.println("\n");
                }
            }

            else {
                System.out.println("Exércitos disponíveis: " + adversario.getEx_terrestres() + "\n");
                System.out.println("Selecione o número do território desejado para distribuir um exército: \n");
                for (k = 0; k < ter_j1.size(); k++) {
                    System.out.println(k + ")" + " " + ter_j1.get(k).getNome() + " (" + ter_j1.get(k).getTerrestre() + " " + "exército(s)" + ")");
                }
                System.out.print("\nTerritorio: ");
                l = scanner.nextInt();
                ter_j1.get(l).setTerrestre((ter_j1.get(l).getTerrestre() + 1));
                System.out.println(ter_j1.get(l).getNome() + " " + "recebeu um exército a mais!");
                jogador_1.setEx_terrestres((jogador_1.getEx_terrestres() - 1));
                System.out.println("\n");
            }

            playerTurn++;
        } while ((jogador_1.getContinentes()) < 2 && (adversario.getContinentes() < 2));
=======
        while(jogador_1.getEx_terrestres()>0){
            System.out.println("Exércitos disponíveis: " + jogador_1.getEx_terrestres() + "\n");
            System.out.println("Selecione o número do território desejado para distribuir um exército: \n");
            for(k=0;k<ter_j1.size();k++){
                System.out.println(k + ")" + " " + ter_j1.get(k).getNome() + " (" + ter_j1.get(k).getTerrestre() + " " + "exército(s)" + ")");
            }
            System.out.print("\nTerritorio: ");
            l = scanner.nextInt();
            ter_j1.get(l).setTerrestre((ter_j1.get(l).getTerrestre()+1));
            System.out.println(ter_j1.get(l).getNome() + " " + "recebeu um exército a mais!");
            jogador_1.setEx_terrestres((jogador_1.getEx_terrestres()-1));
            System.out.println("\n");
        }
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
    }  
}   