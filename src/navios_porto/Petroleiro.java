/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navios_porto;

/**
 *
 * @author pedro
 */
public class Petroleiro extends Navio {
    
    private float carga;
    
    
    public Petroleiro(String matricula){
    super(matricula);
        carga = 0;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
    
}
