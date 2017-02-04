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
        // TODO code application logic here
        List<Territorio> Total_ter = new ArrayList();
        
/////////////////////// América do Norte////////////////////////////////

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
        Total_ter.add(aus);
        
        Territorio nov = new Territorio();
        nov.setNome("Nova Guiné");
        nov.setContinente(Continente.continentes.OCEANIA);
        Total_ter.add(nov);
 
 //////////////// Definição das fronteiras /////////////////////////////////////       
// América do Norte
        
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
        
  
 /////////////////////// Inicialização//////////////////////////////////////////
    
        Jogador jogador_1 = new Jogador();
        Jogador adversario = new Jogador();
        int i=0,j,cont=0;
        
        System.out.println("####################### WAR ##########################");
        System.out.println("\n");
        
        Collections.shuffle(Total_ter); // Para dar um Random nas posições dos elementos da lista
        jogador_1.setNum(0);
        jogador_1.setCor("Azul");
        adversario.setNum(1);
        adversario.setCor("Vermelho");
        if(jogador_1.getNum() == 1){
            System.out.println("O jogador 1 terá um território a mais");
            System.out.println("O adversário irá iniciar o ataque");
        }
        else{
            System.out.println("O adversário terá um território a mais");
            System.out.println("O jogador 1 irá iniciar o ataque");
        }
        
        System.out.println("\n");
        
        Territorio[][] mapa = new Territorio[5][8];
        
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
    }  
}   