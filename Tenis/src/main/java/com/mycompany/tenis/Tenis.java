/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tenis;

import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null,
                "Seu pé está protegido ! Aproveita e passa um talquinho rsrs...",
                "WALLACE INFORMA:",
                JOptionPane.INFORMATION_MESSAGE);
        } else{
            System.out.println("Seu pé está desprotegido !!");
            JOptionPane.showMessageDialog(null,
                "Seu pé está desprotegido ! Põe um tênis agora, ta doidoo ?!",
                "WALLACE INFORMA:",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void estilizar (String elogio){
        System.out.println(elogio);
        JOptionPane.showMessageDialog(null,
                "Seu tênis são ESTILOSOS !! ",
                "WALLACE INFORMA:",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void andar (int passos){
        if (passos < 50){
            System.out.println("Seu tênis ainda é novo !!");
            JOptionPane.showMessageDialog(null,
                "Seu tênis ainda é novo !! ",
                "WALLACE INFORMA:",
                JOptionPane.INFORMATION_MESSAGE);
        } else{
            System.out.println("Seus tênis está velhoooooo !");
             JOptionPane.showMessageDialog(null,
                "Seus tênis está velhoooooo !",
                "WALLACE INFORMA:",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void confortar (boolean confort){
        if (confort == true){
            System.out.println("Seus pés agradecem");
            JOptionPane.showMessageDialog(null,
                "Meia quentinha no pé...",
                "WALLACE INFORMA:",
                JOptionPane.INFORMATION_MESSAGE);            
        }
        
        else{
            System.out.println("Seus pés estão chorando");
            JOptionPane.showMessageDialog(null,
                "Sem meia ? seus dedos estão chorando...",
                "WALLACE INFORMA:",
                JOptionPane.INFORMATION_MESSAGE);      
        }
    }
    
    public void calcar(boolean calc){
        if (calc == true){
            System.out.println("Você está calçado");
            JOptionPane.showMessageDialog(null,
                "Você tá calçado uooouu !!",
                "WALLACE INFORMA:",
                JOptionPane.INFORMATION_MESSAGE);
            
        } else{
            System.out.println("Você está sendo descalçado !!");
             System.out.println("Você está calçado");
             JOptionPane.showMessageDialog(null,
                "Descaço ! vem pro fuut !!",
                "WALLACE INFORMA:",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
   
}



