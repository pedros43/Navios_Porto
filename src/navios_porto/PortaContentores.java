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
public class PortaContentores extends Navio {
    
    private int maxContentores;
    
    public PortaContentores(String matricula) {
        super(matricula);
        maxContentores = 0;
    }

    public int getMaxContentores() {
        return maxContentores;
    }

    public void setMaxContentores(int maxContentores) {
        this.maxContentores = maxContentores;
    }
    
}
