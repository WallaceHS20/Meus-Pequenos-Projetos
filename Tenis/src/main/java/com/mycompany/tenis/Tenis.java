/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tenis;

/**
 *
 * @author Honorato
 */
public class Tenis {
    
    private String marca;
    private String nome;
    private String tamanho;
    private String cor;
    private String material;
    
    
    //METODO CONSTRUTOR
    public Tenis() {
    }
    
    public Tenis(String marca, String nome, String tamanho, String cor, String material) {
        this.marca = marca;
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    //METODOS DE ACESSO
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
     public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
     public String getTamanho(){
        return tamanho;
    }
    
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    
     public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
     public String getMaterial(){
        return material;
    }
    
    public void setMaterial(String material){
        this.material = material;
    }
     
    // METODOS DE ACOES
    public void protege(boolean ptg){
        if (ptg == true){
            System.out.println("Seu pé está protegido !");
        } else{
            System.out.println("Seu pé está desprotegido !!");
        }
    }
    
    public void estilizar (String elogio){
        System.out.println(elogio);
    }
    
    public void andar (int passos){
        if (passos < 50){
            System.out.println("Seu tênis ainda é novo !!");
        } else{
            System.out.println("Seus tênis está velhoooooo !");
        }
    }
    
    public void confortar (boolean confort){
        if (confort == true){
            System.out.println("Seus pés agradecem");
        }
        
        else{
            System.out.println("Seus pés estão chorando");
        }
    }
    
    public void calcar(boolean calc){
        if (calc == true){
            System.out.println("Você está calçado");
        } else{
            System.out.println("Você está sendo descalçado !!");
        }
    }
   
}



