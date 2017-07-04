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
    private Tokens CabezaT;
    boolean coment = false;
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
        reservadas.add("Componentes Lexicos");
        reservadas.add("Reservadas");
        reservadas.add("Gramatica");
        fila = 1;
        columna = 0;
        CabezaT = new Tokens("","","",0,0,0,null);
        
        Scanner scanner = new Scanner(texto);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Lineas
            if (coment){
               
            }else{
                estado = 0;
                lexema = "";
            }
            
            for(int i = 0; i < line.length(); i++) {
                ascii = (int)line.charAt(i);
         System.out.println(ascii +"  "+ (char)ascii + "  "+ estado);
                switch (estado){
                    
                    case 0:
                        if ((ascii>= 65 && ascii <= 90) || (ascii>= 97 && ascii <=122)){
                            lexema = lexema + (char)ascii;
                            estado = 1;
                            
                        } else if (ascii == 35){
                            lexema = lexema + (char)ascii;
                            estado = 2;
                            
                            
                        } else if (ascii == 58) {
                            lexema = lexema + (char) ascii;
                            estado = 7;
                            
                        } else if (ascii == 43 || ascii ==  93 || ascii == 42 || ascii == 63 || ascii == 46 || ascii == 124 || ascii == 36 || ascii == 40 || ascii == 41 || ascii == 123 || ascii == 125 || ascii == 44 || ascii == 60 || ascii ==  62 || ascii == 61 || ascii == 91 || ascii == 45) {
                            lexema = lexema + (char) ascii;
                            i = i-1;
                            estado = 10;
                         
                        } else if (ascii == 39) {
                            lexema = lexema + (char) ascii;
                            estado = 11;    
                        } else if (ascii == 32 || estado == 9) {
                                 
                        }else {
                            
                            
                        }
                        
                        
                        break;
                    
                    case 1:
                        if ((ascii>= 65 && ascii <= 90) || (ascii>= 97 && ascii <=122) || (48 <= ascii && ascii <= 57) || ascii == 95){
                            lexema = lexema + (char)ascii;
                            estado = 1;
                        } else if( ascii==60 || ascii == 62 || ascii == 125 || ascii == 123 || ascii == 44 || ascii == 61 || ascii == 34 || ascii == 42 || ascii == 41 || ascii == 124 || ascii == 58 || ascii == 46 || ascii == 43 || ascii == 39 || ascii == 36 || ascii == 93){
                            Aceptacion(lexema,fila,columna,ascii);
                            i = i-1;
                            lexema = "";
                            estado = 0;
                            
                        } else if (ascii == 32){
                            
                        }
                        
                        break;
                        
                        
                    case 2 : 
                        if (ascii == 45){
                            lexema = lexema + (char)ascii;
                            estado = 4; 
                            
                        }else{
                            lexema = lexema +(char)ascii;
                            estado = 3;
                            
                        }
                        
                        break;
                        
                    case 3: 
                        if (i+1 ==  line.length()){
                            lexema = lexema + (char)ascii;
                            Aceptacion(lexema,fila,columna,ascii);
                            lexema = "";
                            estado = 0;
                        }else{
                            lexema = lexema + (char)ascii;
                            estado = 3;
                        }
                    
                       break;
                        
                    case 4:
                        coment = true;
                        if (ascii == 45){
                            
                            lexema = lexema + (char)ascii;
                            estado = 5;
                            
                        } else{
                            lexema = lexema +(char)ascii;
                            estado = 4; 
                            
                            
                        }
                        
                        break;
                        
                        
                    case 5: 
                        if(ascii == 45){
                            lexema = lexema + (char)ascii;
                            estado = 4;
                            
                            
                            
                        }else if(ascii == 35){
                            lexema = lexema + (char)ascii;
                            estado = 6;
                            
                            
                            
                        }else{
                            lexema = lexema + (char)ascii;
                            estado = 4;
                            
                            
                        }
                        
                        break;
                        
                    case 6: 
                        
                            Aceptacion(lexema,fila,columna,ascii);
                            coment = false;
                            i = i-1;
                            lexema = "";
                            estado = 0;
                     
                        break;
                        
                    case 7:
                        if (ascii == 58){
                            lexema = lexema + (char)ascii;
                            estado = 8;
                            
                        }else{
                            
                            
                        }
                        break;
                       
                    case 8:
                        if (ascii == 61){
                            lexema = lexema + (char)ascii;
                            estado = 9;
                            
                        }else{
                            
                            
                        }
                        break;    
                        
                    case 9:
                        Aceptacion(lexema,fila,columna,ascii);
                            i = i-1;
                            lexema = "";
                            estado = 0;
                        break;
                        
                    case 10:
                        Aceptacion(lexema,fila,columna,ascii);
                            
                            lexema = "";
                            estado = 0;
                        break;
                    
                    case 11:
                        if (ascii != 39){
                            lexema = lexema + (char)ascii;
                            estado = 12;
                            
                        }else{
                            
                        }
                        
                        
                        break;
                       
                    case 12:
                        if (ascii == 39){
                            lexema = lexema + (char)ascii;
                            estado = 13;
                            
                            
                        } else{
                            
                            
                        }
                    
                    
                    case 13:
                        Aceptacion(lexema,fila,columna,ascii);
                       
                        lexema = "";
                        estado = 0;
                        break;
                    
                    
                }
                
                
                
                
                
                
                
               columna++; 
            }
            fila++;
            if (coment){
                
            }else{
                columna = 0;
            }
            
        }
       debugeo(); 
        
    }

    private void Aceptacion(String lexema, int fila, int columna, int ascii) {
        switch (estado){
            case 1:
                 switch(lexema.toLowerCase()){
                        case "no_terminales":
                            token = new Tokens(lexema, "Palabra Reservada", "No_Terminales", fila,columna-lexema.length()+1, 5, null);
                         
                            break;
                        case "terminales":
                            token = new Tokens(lexema, "Palabra Reservada", "Terminales", fila,columna-lexema.length()+1, 10, null);
                         
                            break;
                         
                        case "inicio":
                            token = new Tokens(lexema, "Palabra Reservada", "Iniciales", fila,columna-lexema.length()+1, 15, null);
                         
                            break;
                         
                        case "producciones":
                            token = new Tokens(lexema, "Palabra Reservada", "Producciones", fila,columna-lexema.length()+1, 20, null);
                         
                            break;
                        
                        case "epsilon":
                            token = new Tokens(lexema, "Palabra Reservada", "Epsilon", fila,columna-lexema.length()+1, 25, null);
                         
                            break;
                            
                        case "componenteslexicos":
                            token = new Tokens(lexema, "Palabra Reservada", "Componentes Lexicos", fila,columna-lexema.length()+1, 30, null);
                         
                            break;
                            
                        case "reservadas":
                            token = new Tokens(lexema, "Palabra Reservada", "Reservadas", fila,columna-lexema.length()+1, 35, null);
                         
                            break;
                            
                        case "gramatica":
                            token = new Tokens(lexema, "Palabra Reservada", "Gramatica", fila,columna-lexema.length()+1, 40, null);
                         
                            break;
                            
                        case "lenguaje":
                            token = new Tokens(lexema, "Palabra Reservada", "[Lenguaje]", fila,columna-lexema.length()+1, 45, null);
                         
                            break;
                        
                     
                            
                        default:
                            token = new Tokens(lexema, "Identificador", "", fila,columna-lexema.length()+1, 55, null);  
                            
                            break;

                 }

                break;
            
            case 3: 
                token = new Tokens(lexema, "Comentario", "", fila,columna-lexema.length()+1, 0, null);  
                break;
            case 6: 
                token = new Tokens(lexema, "Comentario", "", fila,columna-lexema.length()+1, 0, null);
                break;
            
            case 9:
                token = new Tokens(lexema, "Asignacion", "", fila,columna-lexema.length()+1, 60, null); 
                break;
                
            case 10:
                switch(lexema){
                    case "+":
                        token = new Tokens(lexema, "Una o muchas veces", "", fila,columna-lexema.length()+1, 65, null);  
                        break;
                    
                    case "*":
                        token = new Tokens(lexema, "Cero o muchas veces", "", fila,columna-lexema.length()+1, 70, null);  
                        break;
                    
                    case "?":
                        token = new Tokens(lexema, "0 o 1 vez", "", fila,columna-lexema.length()+1, 75, null);  
                        break;
                        
                    case ".":
                        token = new Tokens(lexema, "Concatenacion", "", fila,columna-lexema.length()+1, 80, null);  
                        break;
                        
                    case "|":
                        token = new Tokens(lexema, "O exclusivo", "", fila,columna-lexema.length()+1, 85, null);  
                        break;
                        
                    case "$":
                        token = new Tokens(lexema, "Delimitador", "", fila,columna-lexema.length()+1, 90, null);  
                        break;
                        
                    case "(":
                        token = new Tokens(lexema, "Abre Parentesis", "", fila,columna-lexema.length()+1, 95, null);  
                        break;
                        
                    case ")":
                        token = new Tokens(lexema, "Cierra Parentesis", "", fila,columna-lexema.length()+1, 100, null);  
                        break;
                        
                    case "{":
                        token = new Tokens(lexema, "Abre Llave", "", fila,columna-lexema.length()+1, 105, null);  
                        break;
                        
                    case "}":
                        token = new Tokens(lexema, "Cierra Llave", "", fila,columna-lexema.length()+1, 110, null);  
                        break;
                        
                    case ",":
                        token = new Tokens(lexema, "Delimitador", "", fila,columna-lexema.length()+1, 115, null);  
                        break;
                        
                    case "<":
                        token = new Tokens(lexema, "Menor Que", "", fila,columna-lexema.length()+1, 120, null);  
                        break;
                        
                    case ">":
                        token = new Tokens(lexema, "Mayor Que", "", fila,columna-lexema.length()+1, 125, null);  
                        break;    
                        
                    case "=":
                        token = new Tokens(lexema, "Igual", "", fila,columna-lexema.length()+1, 130, null);  
                        break;    
                        
                    case ":":
                        token = new Tokens(lexema, "Dos Puntos", "", fila,columna-lexema.length()+1, 135, null);  
                        break;
                        
                    case "[":
                        token = new Tokens(lexema, "Abre Corchete", "", fila,columna-lexema.length()+1, 140, null);  
                        break;    
                        
                    case "]":
                        token = new Tokens(lexema, "Cierra Corchete", "", fila,columna-lexema.length()+1, 145, null);  
                        break;     
                        
                    case "-":
                        token = new Tokens(lexema, "Guion", "", fila,columna-lexema.length()+1, 150, null);  
                        break;    
                        
                        
                        
                }
            break;
                
            case 13:
                token = new Tokens(lexema, "Simbolo", "", fila,columna-lexema.length()+1, 155, null); 
                
                break;
        }
        
        
        
        debugeo();
        temporalT = getCabezaT();
        
        while(temporalT.getSiguiente() != null){
            temporalT = temporalT.getSiguiente();
          
        }
        temporalT.setSiguiente(token);  
    
    
    
    
    
    
    }

    private void debugeo() {
    int zyx =0 ;
    zyx++;
    }

    /**
     * @return the CabezaT
     */
    public Tokens getCabezaT() {
        return CabezaT;
    }

    
    
    
    
    
}
