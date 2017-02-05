/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

<<<<<<< HEAD
=======
import DAO.Continente.continentes;
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Levrone
 */
public class Territorio {
    
    private String nome;
    private String cor;
<<<<<<< HEAD
    private Continente continente;
    private List<Territorio> listafronteira;
    private int terrestre;
    private int aereo;
=======
    private continentes conti;
    private List<Territorio> listafronteira;
    private int terrestre;
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f

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
<<<<<<< HEAD
=======
    private int aereo;
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f

    public Territorio() {
        this.listafronteira = new ArrayList<>();
    }

<<<<<<< HEAD
    public Territorio(String nome , String cor, Continente continente){
        this.nome = nome;
        this.cor  = cor;
        this.continente = continente;
=======
    public Territorio(String nome , String cor, continentes conti){
        this.nome = nome;
        this.cor  = cor;
        this.conti = conti;
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
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
    
<<<<<<< HEAD
    public Continente getContinente(){
        return this.continente;
    }
    
    public void setContinente(Continente continente){
        this.continente = continente;
=======
    public continentes getContinente(){
        return this.conti;
    }
    
    public void setContinente(continentes conti){
        this.conti = conti;
>>>>>>> 37a5176bce00fe9d441a169783a1d91b3303fd0f
    }
    
    public List<Territorio> getFronteira(){
        return listafronteira;
    }
    
    public void setFronteira(Territorio t){ // recebe tipo territorio
       this.listafronteira.add(t);
    }
    
}
