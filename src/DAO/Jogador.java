/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author Kevin Levrone
 */
public class Jogador {
    private String nome;
    private int num;
    private String cor;
    private List<Territorio> territorios;
    private int continentes;

    public void setContinentes(int continentes) {
        this.continentes = continentes;
    }

    public int getContinentes() {
        return continentes;
    }

    public Jogador(){    
    }
    
    public Jogador(String nome, int num, String cor){
        this.nome = nome;
        this.num = num;
        this.cor = cor;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getNum(){
        return this.num;
    }
    
    public void setNum(int num){
        this.num = num;
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
    
    public void setTerritorios(List<Territorio> territorios){
        this.territorios = territorios;
    }
    
}

