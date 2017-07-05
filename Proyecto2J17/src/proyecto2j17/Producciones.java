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
public class Producciones {
    private String titulo;
    private String Produccion;

    public Producciones(String titulo, String Produccion) {
        this.titulo = titulo;
        this.Produccion = Produccion;
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
     * @return the Produccion
     */
    public String getProduccion() {
        return Produccion;
    }

    /**
     * @param Produccion the Produccion to set
     */
    public void setProduccion(String Produccion) {
        this.Produccion = Produccion;
    }
    
    
}
