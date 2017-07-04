/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2j17;

/**
 *
 * @author Oswaldo
 */
public class Tokens {
    private String Lexema;
    private String CompLex;
    private String extra;
    private int fila;
    private int columna;
    private int id;
    private Tokens siguiente;

    public Tokens(String Lexema, String CompLex, String extra, int fila, int columna, int id, Tokens siguiente) {
        this.Lexema = Lexema;
        this.CompLex = CompLex;
        this.extra = extra;
        this.fila = fila;
        this.columna = columna;
        this.id = id;
        this.siguiente = siguiente;
    }

    

    /**
     * @return the Lexema
     */
    public String getLexema() {
        return Lexema;
    }

    /**
     * @param Lexema the Lexema to set
     */
    public void setLexema(String Lexema) {
        this.Lexema = Lexema;
    }

    /**
     * @return the CompLex
     */
    public String getCompLex() {
        return CompLex;
    }

    /**
     * @param CompLex the CompLex to set
     */
    public void setCompLex(String CompLex) {
        this.CompLex = CompLex;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the siguiente
     */
    public Tokens getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Tokens siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the extra
     */
    public String getExtra() {
        return extra;
    }

    /**
     * @param extra the extra to set
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }

    
    
    
    
    
    
    
    
    
}
