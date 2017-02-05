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
public class Territorio {
    
    private String nome;
    private String cor;
    private Continente continente;
    private List<Territorio> listafronteira;
    private int terrestre;
    private int aereo;

    public void setTerrestre(int terrestre) {
        this.terrestre = terrestre;
    }

    public void setAereo(int aereo) {
        this.aereo = aereo;
    }

    public int getTerrestre() {
        return terrestre;
    }

    public int getAereo() {
        return aereo;
    }

    public Territorio() {
        this.listafronteira = new ArrayList<>();
    }

    public Territorio(String nome , String cor, Continente continente){
        this.nome = nome;
        this.cor  = cor;
        this.continente = continente;
        this.listafronteira = new ArrayList<Territorio>();
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }

    public Continente getContinente(){
        return this.continente;
    }
    
    public void setContinente(Continente continente){
        this.continente = continente;
    }
    
    public List<Territorio> getFronteira(){
        return listafronteira;
    }
    
    public void setFronteira(Territorio t){ // recebe tipo territorio
       this.listafronteira.add(t);
    }
    
}
