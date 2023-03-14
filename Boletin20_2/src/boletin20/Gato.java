
package boletin20;


public class Gato extends Felino implements IPodeNadar, IPodeCamiñar{
     @Override
    public void nadar() {
        System.out.println("Poden nadar");
    }

    @Override
    public void camiñar() {
        System.out.println("Poden camiñar");
    }
}
