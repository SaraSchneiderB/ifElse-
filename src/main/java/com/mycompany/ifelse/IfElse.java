package com.mycompany.ifelse;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        
       /*ESTRUTURA CONDICIONAL SIMPLES:    
       if( condição ) {
           comando 1
           comando 2
       */
       
        int hora;
                
        Scanner teclado = new Scanner(System.in);
        
                System.out.println("Qual o horário");
        
        hora = teclado.nextInt();
       
        if(hora < 12) { // SE ( uma condição for algo ) {
                System.out.println("Bom dia"); // vai ser bom dia
        } 
            else{
        if(hora < 18){
                System.out.println("Boa tarde");
            }   
            else{
                System.out.println("Boa noite");
            }   
        }         
    }   
}       
        
/*SE FOR 12 HORAS
VAI SER BOM DIA

SENAO - SE FOR MAIS QUE 12 HORAS E MENOS QUE 18H
VAI SER BOA TARDE

E SENAO FOR 18 HORAS E FOR APÓS ÀS 18 HORAS
VAI SER BOA NOITE
*/
        
        
        
        
        
               
    

