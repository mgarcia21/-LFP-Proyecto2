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
public class ExpresionRegular {
    private String titulo;
    private String ER;

    public ExpresionRegular(String titulo, String ER) {
        this.titulo = titulo;
        this.ER = ER;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the ER
     */
    public String getER() {
        return ER;
    }

    /**
     * @param ER the ER to set
     */
    public void setER(String ER) {
        this.ER = ER;
    }
    
    
}
