/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2j17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Oswaldo
 */
public class Lexico extends Interfaz {
    int estado = 0;
    String lexema = "";
    int ascii = 0;
    int fila = 0; 
    int columna = 0;
    Tokens token;
    Tokens temporalT;
    ArrayList<String> reservadas = new ArrayList();
    public void AnalisisLexico(int tabA, String texto){
        reservadas.add("No_Terminales");
        reservadas.add("Terminales");
        reservadas.add("Iniciales");
        reservadas.add("Producciones");
        reservadas.add("epsilon");
        reservadas.add("[lenguaje]");
        reservadas.add("[-lenguaje]");
        reservadas.add("[[COMPONENTES LEXICOS]]");
        reservadas.add("[[RESERVADAS]]");
        fila = 1;
        columna = 0;
        
        
        Scanner scanner = new Scanner(texto);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Lineas
           estado = 0;
           lexema = "";
            for(int i = 0; i < line.length(); i++) {
                ascii = (int)line.charAt(i);
         System.out.println(ascii +"  "+ (char)ascii + "  "+ estado);
                switch (estado){
                    
                    case 0:
                        if ((ascii>= 65 && ascii <= 90) || (ascii>= 97 && ascii <=122)){
                            lexema = lexema + (char)ascii;
                            estado = 1;
                        } else {
                            
                            
                        }
                        
                        
                        break;
                    
                    case 1:
                        if ((ascii>= 65 && ascii <= 90) || (ascii>= 97 && ascii <=122) || (48 <= ascii && ascii <= 57)){
                            lexema = lexema + (char)ascii;
                            estado = 1;
                        } else if( ascii==60 || ascii == 62 || ascii == 125 || ascii == 123 || ascii == 44 || ascii == 61 || ascii == 34 || ascii == 42 || ascii == 41 || ascii == 124 || ascii == 58 || ascii == 46 || ascii == 43 || ascii == 39 || ascii == 36){
                            Aceptacion(lexema,fila,columna,ascii);
                            i = i-1;
                            lexema = "";
                            estado = 0;
                            
                        } else if (ascii == 32){
                            
                        }
                        
                        break;
                        
                    
                    
                    
                    
                    
                    
                    
                }
                
                
                
                
                
                
                
               columna++; 
            }
            fila++;
            columna = 0;
        }
       debugeo(); 
        
    }

    private void Aceptacion(String lexema, int fila, int columna, int ascii) {
        switch (estado){
            case 1:
                token = new Tokens(lexema, "Identificador", "nose", fila,columna-lexema.length()+1, 0, null);
                
                
                
                
                break;
            
            
            
            
            
            
        }
        
        
        
        debugeo();
        temporalT = super.cabezaT[TabA];
        
        while(temporalT.getSiguiente() != null){
            temporalT = temporalT.getSiguiente();
          
        }
        temporalT.setSiguiente(token);  
    
    super.prueba = 4;
    
    
    
    
    }

    private void debugeo() {
    int zyx =0 ;
    zyx++;
    }

    
    
    
    
    
}
