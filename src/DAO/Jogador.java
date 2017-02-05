/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Levrone
 */

public class Jogador {
    private String nome;
    private int turno;
    private String cor;
    private List<Territorio> territorios;
    private int continentes;
    private int ex_terrestres;
    private int ex_aereos;

    public void setEx_terrestres(int ex_terrestres) {
        this.ex_terrestres = ex_terrestres;
    }

    public void setEx_aereos(int ex_aereos) {
        this.ex_aereos = ex_aereos;
    }

    public int getEx_terrestres() {
        return ex_terrestres;
    }

    public int getEx_aereos() {
        return ex_aereos;
    }
    
    private enum Conti{
        AFR, AMER_N, AMER_S, ASI, EURO, OCEAN;
        
        private int n_territorios;
    
        public void setN_territorios(int n_territorios) {
            this.n_territorios = n_territorios;
        }
    
        public int getN_territorios() {
            return n_territorios;
        }
    }

    public void setContinentes(int continentes) {
        this.continentes = continentes;
    }

    public int getContinentes() {
        return continentes;
    }

    public Jogador(){    
        this.territorios = new ArrayList();
    }
    
    public Jogador(String nome, int turno, String cor, List<Territorio> territorios){
        this.nome = nome;
        this.turno = turno;
        this.cor = cor;
        this.territorios = territorios;
    }

    public Jogador(int turno) {
        this.turno = turno;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getTurno(){
        return this.turno;
    }
    
    public void setTurno(int turno){
        this.turno = turno;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public List<Territorio> getTerritorios(){
        return territorios;
    }
    
    public void setTerritorios(Territorio territorio){
        this.territorios.add(territorio);
    }
    
}

