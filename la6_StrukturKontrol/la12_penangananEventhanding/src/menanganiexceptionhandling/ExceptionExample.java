/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menanganiexceptionhandling;

/**
 *
 * @author USER
 */
public class ExceptionExample {
     public static void main( String[] args ){ 
 
        try{ 
 
            System.out.println( args[1] ); 
 
        }catch( ArrayIndexOutOfBoundsException exp ){ 
            System.out.println("init:"); 
            System.out.println("debs-jar:"); 
            System.out.println("compile-single:"); 
            System.out.println("run-single:"); 
            System.out.println("Exception caught!"); 
            
 
        } } } 
 
 

