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
    String ExR = "";
    String Titulo;
    private ArrayList<ExpresionRegular> ER = new ArrayList();
    private ArrayList<Producciones> Prod = new ArrayList();
    boolean PR = false;
    boolean PR2 = false;
    
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
            if (PR){
                ExR = ExR +"//"+ tokens.get(pos).getLexema();
            }
            if (PR2){
                ExR = ExR + "//"+tokens.get(pos).getLexema();
            
        }
            
            
            
            
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
        RESERV();
        GRADEF();
        Parea(140);
        Parea(150);
        Parea(45);
        Parea(145);
        
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
        PR = false;
            ListaER();
        Parea(90);
        
        CLP();
        
    }
//    CL'-> PR $ CL'
//          |eps
    public void CLP(){
        if(pre == 95 || pre == 165 || pre == 155 || pre == 55){
            PP();
            PR = false;
            ListaER();
            Parea(90);
            
            CLP();
        }
    }
//    PP -> id ::= PR
    public void PP(){
        Titulo = tokens.get(pos).getLexema();
        Parea(55);
        Parea(60);
        PR();
        
        
    }
    
    
//      PR -> Q PR'
    public void PR() {
        PR = true;
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
    
//    RESERV -> [[reservadas]]RES
    public void RESERV(){
        Parea(140);
        Parea(140);
        Parea(35);
        Parea(145);
        Parea(145);
        RES();
        
    }
    
//    RES -> L $ RES'
    public void RES(){
        L();
        Parea(90);
        RESP();
        
        
    }
    
//    RES' -> L $ RES'
//       |eps
    public void RESP(){
        if(pre == 55){
            L();
            Parea(90);
            RESP();
        }
        
        
    }
    
//    L-> id::="id"
    public void L(){
        Parea(55);
        Parea(60);
        Parea(160);
                
               
        
        
    }
    
//    GRADEF -> [[Gramatica: id]]NT
    public void GRADEF(){
        Parea(140);
        Parea(140);
        Parea(40);
        Parea(165);
        Parea(55);
        Parea(145);
        Parea(145);
        NT();
        
    }
    
//    NT -> No_Terminales={LID} TE
    public void NT(){
        Parea(5);
        Parea(130);
        Parea(105);
        LID();
        Parea(110);
        TE();
        
        
    }
    
//    TE -> Terminales={LID} IN
    public void TE(){
        Parea(10);
        Parea(130);
        Parea(105);
        LID();
        Parea(110);
        IN();
        
        
    }
    
//    LID -> id LID'
    public void LID(){
        Parea(55);
        LIDP();
        
    }
    
    
//    LID' -> ,id LID'
//            |eps
    public void LIDP(){
        if(pre == 115){
            Parea(115);
            Parea(55);
            LIDP();
            
            
        }
        
        
    }
    
//    IN -> Inicio=<id> PROD
    public void IN(){
        Parea(15);
        Parea(130);
        Parea(120);
        Parea(55);
        Parea(125);
        PROD();
        
        
        
    }
    
//    PROD -> Producciones={ LPRO }
    public void PROD(){
        Parea(20);
        Parea(130);
        Parea(105);
        LPRO();
        Parea(110);

    }
    
//    LPRO -> IP $ LPRO'
    public void LPRO(){
        IP();
        PR2 = false;
            ListaPRO();
        Parea(90);
        LPROP();
        
        
    }
    
//    LPRO' -> IP $ LPRO'
//        |eps
    public void LPROP(){
        if(pre == 120){
            IP();
            PR2 = false;
            ListaPRO();
            Parea(90);
            LPROP();
            
            
        }
    }
    
//    IP -> <id> ::= PO
    public void IP(){
        
        Parea(120);
        Titulo = "<" + tokens.get(pos).getLexema()+">" ;
        Parea(55);
        Parea(125);
        Parea(60);
        PO();
        
    }
    
//    PO -> POT PO'
    public void PO(){
        PR2 = true;
        POT();
        POP();
        
        
        
    }
    
//    PO' -> POT PO'
//      |eps
    public void POP(){
       if ( pre == 55 || pre == 120){
           POT();
           POP();
           
       }  
        
    }
    
    
//    POT -> POF POT'
    public void POT(){
        POF();
        POTP();
        
        
    }
    
    
    
//    POT' -> |POF POT'
//        |eps

    public void POTP(){
        if (pre == 85){
            Parea(85);
            POF();
            POTP();
            
        }
          
        
    }
    
//    POF -> id
//      |<id>
//      |'epsilon'
    public void POF(){
        if (pre == 55){
            Parea(55);
        }else if (pre == 120){
            Parea(120);
            Parea(55);
            Parea(125);
            
        }else if (pre == 25){
            Parea(25);
            
            
        }else{
            Error("Se Esperaba id o <id>");
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

    private void ListaER() {
        debugeo();
        getER().add(new ExpresionRegular(Titulo, ExR));
        ExR="";
        
        
        
    }

    private void debugeo() {
        int xy = 2;
    }

    /**
     * @return the ER
     */
    public ArrayList<ExpresionRegular> getER() {
        return ER;
    }

    /**
     * @return the Prod
     */
    public ArrayList<Producciones> getProd() {
        return Prod;
    }

    private void ListaPRO() {
        debugeo();
        getProd().add(new Producciones(Titulo, ExR));
        ExR="";
    }

    
    
    
    
    
    
    
    
    
}
