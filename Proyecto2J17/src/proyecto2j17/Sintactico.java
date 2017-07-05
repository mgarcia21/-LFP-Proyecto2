/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2j17;

import java.util.ArrayList;

/**
 *
 * @author Oswaldo
 */
public class Sintactico extends Interfaz{
    
    ArrayList<MiniToken> tokens;
    int pos = 0;
    int pre;
    private Errores CabezaEr;
    Errores error;
    Errores temporalEr;
    
    public Sintactico(ArrayList<MiniToken> tokens){
       this.tokens = tokens;
       CabezaEr = new Errores("","","","",0,0,null);
       pos = 0;
        
    }
    
    
    
    
    public void analizar(){
        pre = tokens.get(pos).getId();
        S();      
        if(pos != tokens.size()){
          System.out.println("Se acabaron prro " );  
          Error("Ocurrio un error, se esperaba +, *, (:");
        }
        else{
           System.out.println("Analisis correcto prro");
        }
    }
    
    public void Parea(int analisis){
        if (pre == analisis){
            pos++;
            if(pos==tokens.size()){
                pre = -1;
            }else{
                pre= tokens.get(pos).getId();
            }
        }else{
            System.out.println("Se esperaba idToken:" + analisis + "Tengo " + pre);
            Error("Se esperaba idToken:" + analisis + "Tengo " + pre);
        }
            
        
        
        
        
        
    }
    
    
    //S -> [lenguaje] GRAM RESERV GRADEF [-lenguaje]
    public void S() {
        Parea(140);
        Parea(45);
        Parea(145);
        GRAM();
//        RESERV();
//        GRADEF();
//        Parea(140);
//        Parea(150);
//        Parea(45);
//        Parea(145);
        
    }

    
    //GRAM -> [[componentes lexicos]] CL
    public void GRAM() {
        Parea(140);
        Parea(140);
        Parea(30);
        Parea(145);
        Parea(145);
        CL();
        
    }
   //    CL-> PR $ CL'
    public void CL() {
        PP();
        Parea(90);
        CLP();
        
    }
//    CL'-> PR $ CL'
//          |eps
    public void CLP(){
        if(pre == 95 || pre == 165 || pre == 155 || pre == 55){
            PP();
            Parea(90);
            CLP();
        }
    }
//    PP -> id ::= PR
    public void PP(){
        Parea(55);
        Parea(60);
        PR();
        
        
    }
    
    
//      PR -> Q PR'
    public void PR() {
        Q();
        PRP();
    }
    
//    PR' -> Q PR'
//          |eps
    public void PRP(){
        if(pre == 95 || pre == 165 || pre == 155 || pre == 55){
            Q();
            PRP();
            
            
        }
    }
    
//    Q -> R Q'
    public void Q(){
        R();
        QP();
        
        
    }
//    Q' -> '|'R Q'
//          |eps 
    public void QP(){
        if(pre == 85){
            Parea(85);
            R();
            QP();
        }
        
    }
    
//    R -> T R'
    public void R(){
        T();
        RP();
          
    }
    
//    R' -> .T R'
//     |eps
    public void RP(){
       if(pre == 80){
           Parea(80);
           T();
           RP();

       } 
  
    }
    
//    T -> U*
//         |U?
//         |U+
//         |U
    public void T(){
        U();
        if (pre==70){
            Parea(70);
        }else if(pre==75){
            Parea(75);
        }else if(pre==65){
            Parea(65);
        }
        
        
    }
    
//U -> (Q)
//    |'"' Q '"'    
//    |'simbolo'    
//    |letra
//    |numero
    public void U(){
        if (pre == 95){
            Parea(95);
            Q();
            Parea(100);
        }else if(pre == 165){
            Parea(165);
            
        }else if(pre == 155){
            Parea(155);
        }else if(pre == 55){
            Parea(55);
        }else{
            Error("Se esperaba (  '\"'  Simbolo o identificador");
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    /**
     * @return the CabezaEr
     */
    public Errores getCabezaEr() {
        return CabezaEr;
    }

    private void Error(String Descripcion) {
        error = new Errores(tokens.get(pos).getLexema(),Descripcion,"Sintactico","",tokens.get(pos).getFila(),tokens.get(pos).getColumna(),null);
        
        temporalEr = getCabezaEr();
        while (temporalEr.getSiguiente() != null){
            temporalEr = temporalEr.getSiguiente();
            
        }
        temporalEr.setSiguiente(error);
    }

    
    
    
    
    
    
    
    
    
}
