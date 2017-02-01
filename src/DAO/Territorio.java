/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.Continente.continentes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Levrone
 */
public class Territorio {
    
    private String nome;
    private String cor;
    private continentes conti;
    private List<Territorio> listafronteira;
    private int terrestre;

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
    private int aereo;

    public Territorio() {
    }

    public Territorio(String nome , String cor, continentes conti, List<Territorio> listafronteira){
        this.nome = nome;
        this.cor  = cor;
        this.conti = conti;
        this.listafronteira = new ArrayList();
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
    
    public continentes getContinente(){
        return this.conti;
    }
    
    public void setContinente(continentes conti){
        this.conti = conti;
    }
    
    public List<Territorio> getFronteira(){
        return listafronteira;
    }
    
    public void setFronteira(Territorio t){ // recebe tipo territorio
       this.listafronteira.add(t);
    }
    
}
