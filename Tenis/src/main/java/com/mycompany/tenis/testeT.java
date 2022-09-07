/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tenis;

import com.opencsv.CSVWriter;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Honorato
 */
public class testeT {
    
    private String marca;
    private String nome;
    private String tamanho;
    private String cor;
    private String material;
    
    public testeT(){
    
}
    public testeT (String marca){
        
    }
    
    public static void main(String[] args) throws IOException {

        String[] cabecalho = {"nome", "idade", "telefone"};

        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{"Jo","35","joao@dicasdejava.com.br"});
        linhas.add(new String[]{"Maria","23","maria@dicasdeprogramacao.com.br"});
        linhas.add(new String[]{"Ana","25","ana@dicasdejava.com.br"});

        Writer writer = Files.newBufferedWriter(Paths.get("C:\\Users\\Honorato\\Documents\\NetBeansProjects\\Tenis\\src\\main\\java\\com\\mycompany\\tenis\\pessoas.csv"));
        CSVWriter csvWriter = new CSVWriter(writer);

        csvWriter.writeNext(cabecalho);
        csvWriter.writeAll(linhas);

        csvWriter.flush();
        writer.close();

    }
    
}
