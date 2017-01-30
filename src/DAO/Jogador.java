/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Kevin Levrone
 */
public class Jogador {
    private String nome;
    private int num;
    private String cor;

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
    
}

