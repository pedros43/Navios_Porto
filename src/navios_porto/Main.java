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
public class Main {
    
        public static void main(String[] args) {
      
            
      /*
      Porto p = new Porto();
      Navio n = new Navio("VSF");
      Navio nf = new Navio("VSF");
      Petroleiro pt = new Petroleiro("HTG");
      PortaContentores pc = new PortaContentores("GTD");
      
      n.setNome("NV1");
      pt.setNome("PT1"); pt.setCarga(200);
      pc.setNome("PC1"); pc.setMaxContentores(100);
      n.setComprimento(10);
      pt.setComprimento(10);
      pc.setComprimento(10);
      
    p.addNavio(n);
    p.addNavio(pt);
    p.addNavio(pc);
    
    p.listNavios();
    System.out.printf("Total de carga = %.1f \n" , p.getTotalCarga());*/
    
    
    
    
            Porto p = new Porto();
            Navio n = new Navio("SDF22", "KGJH");
            Navio nf = new Navio("SDF22", "ADFH");
            Petroleiro h = new Petroleiro("FSD45", "ERYN", 63);
            PortaContentores a = new PortaContentores("TRE64", "RGDF", 100);
            PortaContentores a2 = new PortaContentores("TRsE64", "RGsDF", 110);
            
            n.setComprimento(100);
            nf.setComprimento(120);
            h.setComprimento(200);
            a.setComprimento(430);
            
            p.addNavio(n);
            p.addNavio(nf);
            p.addNavio(h);
            p.addNavio(a);
            p.addNavio(a2);
            
            System.out.println(p.toString());
        
             
       
            //System.out.println(e.getMessage());
        }
    
}
