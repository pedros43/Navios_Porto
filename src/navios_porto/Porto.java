/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navios_porto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Porto {

    private List<Navio> navios;

    public Porto() {
        navios = new ArrayList<>();
    }

    private boolean procura(Navio nv) {
        for (Navio n : navios) {
            if (n.getMatricula().equals(nv.getMatricula())) {
                return true;
            }
        }

        return false;
    }

    public void addNavio(Navio n) {
        if (!procura(n)) {
            navios.add(n);
        }else{
            System.out.println("Navio "+n.getNome()+" com a matricula: "+n.getMatricula()+" já se encontra no porto!");
        }
    }

    public int getMaxContentores() {
        int ct = 0;
        for (Navio n : navios) {
            if (n instanceof PortaContentores) {
                ct += ((PortaContentores) n).getMaxContentores();
            }
        }
        return ct;
    }

    public float getTotalCarga() {
        float ct = 0;
        for (Navio n : navios) {
            if (n instanceof PortaContentores) {
                ct += ((PortaContentores) n).getMaxContentores() * 10f;
            }
            if (n instanceof Petroleiro) {
                ct += ((Petroleiro) n).getCarga();
            }
        }
        return ct;
    }

    public void listNavios() {
        for (Navio n : navios) {
            System.out.println(n);
        }
    }

    @Override
    public String toString() {

        String resultado = "Porto:\n";

        for (int i = 0; i < navios.size(); i++) {
            resultado += this.navios.get(i).toString() + "\n";

        }
        resultado += "quantidade de contentores: " + this.getTotalCarga() + "\n";
        resultado += "capacidade total : " + this.getMaxContentores() + " toneladas \n";

        return resultado;

    }
}
