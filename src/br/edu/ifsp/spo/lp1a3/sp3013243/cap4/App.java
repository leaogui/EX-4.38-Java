package br.edu.ifsp.spo.lp1a3.sp3013243.cap4;

import java.util.Scanner;

public class App {

	
	public static void main (String[] args) {
		
		
		  Scanner sc = new Scanner(System.in);

	        int toCripto = 0;
	        
	        while(toCripto < 1000 || toCripto > 9999){
	        	
	        System.out.println("Digite um número de quatro dígitos: ");
	        
	        toCripto = sc.nextInt();
	
	        if(toCripto < 1000 || toCripto > 9999) {
	        	
	        System.out.println("Seu número não possui 4 dígitos");	
	        }
	        
	        }
	        
	        Cripto cript = new Cripto(toCripto);
	        
	        cript.cPri();
	        cript.cSeg();
	        cript.cTer();
	        cript.cQua();
	       
	      System.out.println("\nNúmero criptografado: "); 
	        
	      System.out.println(cript.getPri()); 
	      System.out.println(cript.getSeg()); 
	      System.out.println(cript.getTer()); 
	      System.out.println(cript.getQua()); 
	      
	      
	      cript.troca(cript.getPri(), cript.getSeg(), cript.getTer(), cript.getQua());
	      
	      System.out.println("\nNúmero com lugares trocados:");
	     
	      System.out.println(cript.getPri()); 
	      System.out.println(cript.getSeg()); 
	      System.out.println(cript.getTer()); 
	      System.out.println(cript.getQua()); 
	      
	      
	      Descripto dcp = new Descripto(cript.getPri(), cript.getSeg(), cript.getTer(), cript.getQua());
	      
	      dcp.destroca(dcp.getPri(), dcp.getSeg(), dcp.getTer(), dcp.getQua());
	      
	      System.out.println("\nNúmero com lugares destrocados: ");
	      
	      System.out.println(dcp.getPri()); 
	      System.out.println(dcp.getSeg()); 
	      System.out.println(dcp.getTer()); 
	      System.out.println(dcp.getQua()); 
	     
	      
	      	dcp.dcPri();
	        dcp.dcSeg();
	        dcp.dcTer();
	        dcp.dcQua();
	
	        System.out.println("\nNúmero descriptografado: ");
	        
	        System.out.println(dcp.getPri()); 
		    System.out.println(dcp.getSeg()); 
		    System.out.println(dcp.getTer()); 
		    System.out.println(dcp.getQua()); 
		      
		   System.out.println("\n\n");
	}
	
	
}
