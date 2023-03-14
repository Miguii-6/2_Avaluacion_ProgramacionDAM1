
package boletin20;

public class Boletin20 {

    public static void main(String[] args) {
         Avestruz ave1=new Avestruz();
        ave1.camiñar();
        
        Papagaio ave2=new Papagaio();
        ave2.camiñar();
        ave2.voar();
        
        Mamifero mamifero=new Mamifero();
        mamifero.camiñar();
        
        Morcego murci=new Morcego();
        murci.camiñar();
        murci.voar();
        
        Felino felino=new Felino();
        felino.camiñar();
        felino.nadar();
        
        Gato gato=new Gato();
        System.out.println("El gato es un felino y: ");
        gato.camiñar();
        gato.nadar();
        
        Tigre tigre=new Tigre();
        tigre.camiñar();
        tigre.nadar();
    }
    
    
}
