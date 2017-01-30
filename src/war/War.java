/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import DAO.Continente;
import DAO.Jogador;
import DAO.Territorio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        Territorio al = new Territorio();
        al.setNome("Alasca");
        al.setCor("amarelo");
        al.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(al);
        
        Territorio van = new Territorio();
        van.setNome("Vancouver");
        van.setCor("amarelo");
        van.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(van);
        
        Territorio cal = new Territorio();
        cal.setNome("California");
        cal.setCor("amarelo");
        cal.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(cal);
        
        Territorio mex = new Territorio();
        mex.setNome("Mexico");
        mex.setCor("amarelo");
        mex.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(mex);
        
        Territorio gro = new Territorio();
        gro.setNome("Groenlandia");
        gro.setCor("amarelo");
        gro.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(gro);
        
        Territorio ota = new Territorio();
        ota.setNome("Otawa");
        ota.setCor("amarelo");
        ota.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(ota);
        
        Territorio ny = new Territorio();
        ny.setNome("Nova York");
        ny.setCor("amarelo");
        ny.setContinente(Continente.continentes.AMERICA_DO_NORTE);
        Total_ter.add(ny);
        
    /////////////////////// América do Sul////////////////////////////////
        
        Territorio chi = new Territorio();
        chi.setNome("Chile");
        chi.setCor("verde");
        chi.setContinente(Continente.continentes.AMERICA_DO_SUL);
        Total_ter.add(chi);
        
        Territorio col = new Territorio();
        col.setNome("Colombia");
        col.setCor("verde");
        col.setContinente(Continente.continentes.AMERICA_DO_SUL);
        Total_ter.add(col);
        
        Territorio arg = new Territorio();
        arg.setNome("Argentina");
        arg.setCor("verde");
        arg.setContinente(Continente.continentes.AMERICA_DO_SUL);
        Total_ter.add(arg);
        
        Territorio bra = new Territorio();
        bra.setNome("Brasil");
        bra.setCor ("verde");
        bra.setContinente(Continente.continentes.AMERICA_DO_SUL);
        Total_ter.add(bra);
        
    /////////////////////// Europa ////////////////////////////////
        
        Territorio  ing = new Territorio();
        ing.setNome("Inglaterra");
        ing.setCor("azul");
        ing.setContinente(Continente.continentes.EUROPA);
        Total_ter.add(ing);
        
        Territorio ita = new Territorio();
        ita.setNome("Italia");
        ita.setCor("azul");
        ita.setContinente(Continente.continentes.EUROPA);
        Total_ter.add(ita);
        
        Territorio sue = new Territorio();
        sue.setNome("Suécia");
        sue.setCor("azul");
        sue.setContinente(Continente.continentes.EUROPA);
        Total_ter.add(sue);
        
        Territorio ale = new Territorio();
        ale.setNome("Alemanha");
        ale.setCor("azul");
        ale.setContinente(Continente.continentes.EUROPA);
        Total_ter.add(ale);
        
        Territorio mos = new Territorio();
        mos.setNome("Moscou");
        mos.setCor("azul");
        mos.setContinente(Continente.continentes.EUROPA);
        Total_ter.add(mos);
        
    /////////////////////// África ////////////////////////////////
        
        Territorio nig = new Territorio();
        nig.setNome("Nigeria");
        nig.setCor("roxo");
        nig.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(nig);
        
        Territorio egi = new Territorio();
        egi.setNome("Egito");
        egi.setCor("roxo");
        egi.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(egi);
        
        Territorio con = new Territorio();
        con.setNome("Congo");
        con.setCor("roxo");
        con.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(con);
        
        Territorio afr = new Territorio();
        afr.setNome("África do Sul");
        afr.setCor("roxo");
        afr.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(afr);
        
        Territorio mad = new Territorio();
        mad.setNome("Madagascar");
        mad.setCor("roxo");
        mad.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(mad);
        
        Territorio sud = new Territorio();
        sud.setNome("Sudão");
        sud.setCor("roxo");
        sud.setContinente(Continente.continentes.AFRICA);
        Total_ter.add(sud);
        
    /////////////////////// Asia ////////////////////////////////
        
        Territorio ori = new Territorio();
        ori.setNome("Oriente Médio");
        ori.setCor("laranja");
        ori.setContinente(Continente.continentes.ASIA);
        Total_ter.add(ori);
        
        Territorio ind = new Territorio();
        ind.setNome("Índia");
        ind.setCor("laranja");
        ind.setContinente(Continente.continentes.ASIA);
        Total_ter.add(ind);
        
        Territorio om = new Territorio();
        om.setNome("Omsk");
        om.setCor("laranja");
        om.setContinente(Continente.continentes.ASIA);
        Total_ter.add(om);
        
        Territorio vlad = new Territorio();
        vlad.setNome("Vladivostok");
        vlad.setCor("laranja");
        vlad.setContinente(Continente.continentes.ASIA);
        Total_ter.add(vlad);
        
        Territorio sib = new Territorio();
        sib.setNome("Sibéria");
        sib.setCor("laranja");
        sib.setContinente(Continente.continentes.ASIA);
        Total_ter.add(sib);
        
        Territorio chin = new Territorio();
        chin.setNome("China");
        chin.setCor("laranja");
        chin.setContinente(Continente.continentes.ASIA);
        Total_ter.add(chin);
        
        Territorio jap = new Territorio();
        jap.setNome("Japão");
        jap.setCor("laranja");
        jap.setContinente(Continente.continentes.ASIA);
        Total_ter.add(jap);
        
    /////////////////////// Oceania ////////////////////////////////
        
        Territorio sum = new Territorio();
        sum.setNome("Sumatra");
        sum.setCor("rosa");
        sum.setContinente(Continente.continentes.OCEANIA);
        Total_ter.add(sum);
        
        Territorio bor = new Territorio();
        bor.setNome("Bornéu");
        bor.setCor("rosa");
        bor.setContinente(Continente.continentes.OCEANIA);
        Total_ter.add(bor);
        
        Territorio aus = new Territorio();
        aus.setNome("Austrália");
        aus.setCor("rosa");
        aus.setContinente(Continente.continentes.OCEANIA);
        Total_ter.add(aus);
        
        Territorio nov = new Territorio();
        nov.setNome("Nova Guiné");
        nov.setCor("rosa");
        nov.setContinente(Continente.continentes.OCEANIA);
        Total_ter.add(nov);
 
 //////////////// Definição das fronteiras /////////////////////////////////////       
// América do Norte
    List<Territorio> t = new ArrayList();
        t.add(van);
        t.add(vlad);
        al.setFronteira(t);
        t.clear();
        
        t.add(al);
        t.add(cal);
        t.add(gro);
        van.setFronteira(t);
        t.clear();
        
        t.add(van);
        t.add(ota);
        t.add(ing);
        gro.setFronteira(t);
        t.clear();
        
        t.add(van);
        t.add(ota);
        t.add(mex);
        cal.setFronteira(t);
        t.clear();
        
        t.add(cal);
        t.add(gro);
        t.add(ny);
        ota.setFronteira(t);
        t.clear();
        
        t.add(cal);
        t.add(ny);
        t.add(col);
        mex.setFronteira(t);
        t.clear();
    
// América do Sul
        t.add(ota);
        t.add(mex);
        t.add(nig);
        ny.setFronteira(t);
        t.clear();
        
        t.add(col);
        t.add(arg);
        t.add(jap);
        chi.setFronteira(t);
        t.clear();
        
        t.add(mex);
        t.add(bra);
        t.add(chi);
        col.setFronteira(t);
        t.clear();
        
        t.add(chi);
        t.add(bra);
        t.add(nov);
        arg.setFronteira(t);
        t.clear();
        
//Europa
        t.add(gro);
        t.add(ita);
        ing.setFronteira(t);
        t.clear();
        
        t.add(ing);
        t.add(ale);
        t.add(sue);
        ita.setFronteira(t);
        t.clear();
        
        t.add(ita);
        t.add(mos);
        t.add(egi);
        ale.setFronteira(t);
        t.clear();
        
        t.add(ita);
        t.add(mos);
        sue.setFronteira(t);
        t.clear();
        
        t.add(sue);
        t.add(om);
        t.add(ori);
        t.add(ale);
        mos.setFronteira(t);
        t.clear();

// África
        t.add(ny);
        t.add(con);
        t.add(egi);
        nig.setFronteira(t);
        t.clear();
        
        t.add(ale);
        t.add(nig);
        t.add(sud);
        t.add(ori);
        egi.setFronteira(t);
        t.clear();
        
        t.add(ota);
        t.add(mex);
        con.setFronteira(t);
        t.clear();
        
        t.add(egi);
        t.add(sum);
        t.add(con);
        t.add(mad);
        sud.setFronteira(t);
        t.clear();
        
        t.add(con);
        t.add(mad);
        afr.setFronteira(t);
        t.clear();
        
        t.add(sud);
        t.add(afr);
        mad.setFronteira(t);
        t.clear();
        
// Ásia
        t.add(al);
        t.add(sib);
        vlad.setFronteira(t);
        t.clear();
        
        t.add(mos);
        t.add(sib);
        t.add(ind);
        om.setFronteira(t);
        t.clear();
        
        t.add(vlad);
        t.add(om);
        t.add(chi);
        sib.setFronteira(t);
        t.clear();
        
        t.add(mos);
        t.add(egi);
        t.add(ind);
        t.add(sum);
        ori.setFronteira(t);
        t.clear();
        
        t.add(om);
        t.add(ori);
        t.add(chi);
        t.add(bor);
        ind.setFronteira(t);
        t.clear();
        
        t.add(sib);
        t.add(ind);
        t.add(jap);
        chi.setFronteira(t);
        t.clear();
        
        t.add(bor);
        t.add(nov);
        t.add(chi);
        jap.setFronteira(t);
        t.clear();
        
// Oceania
        t.add(sud);
        t.add(bor);
        t.add(ori);
        sum.setFronteira(t);
        t.clear();
        
        t.add(ind);
        t.add(sum);
        t.add(jap);
        t.add(aus);
        bor.setFronteira(t);
        t.clear();
        
        t.add(bor);
        t.add(nov);
        aus.setFronteira(t);
        t.clear();
        
        t.add(jap);
        t.add(aus);
        t.add(arg);
        nov.setFronteira(t);
        t.clear();
  
    
 /////////////////////// Inicialização//////////////////////////////////////////
    
        Jogador jogador_1 = new Jogador();
        Jogador jogador_2 = new Jogador();
        int i=0,cont=0;
        
        Collections.shuffle(Total_ter); // Para dar um Random nas posições dos elementos da lista
        jogador_1.setNum(0);
        jogador_1.setCor("Azul");
        jogador_2.setNum(1);
        jogador_2.setCor("Vermelho");
        if(jogador_1.getNum() == 1){
            System.out.println("O jogador 1 terá um território a mais");
        }
        else{
            System.out.println("O jogador 2 terá um território a mais");
        }
        
        System.out.println("\n");
        
        for(Territorio ter : Total_ter){
            i++;
            if(i>=17){
              System.out.println("Território do jogador 2: \n");
              ter.setCor(jogador_2.getCor());
              System.out.println("Território " + ter.getNome() + " da cor: " + ter.getCor() + "\n");
            }
            else{
              System.out.println("Território do jogador 1: \n");
              ter.setCor(jogador_1.getCor());
              System.out.println("Território " + ter.getNome() + " da cor: " + ter.getCor() + "\n");
            }
        }
    
    }  
}   