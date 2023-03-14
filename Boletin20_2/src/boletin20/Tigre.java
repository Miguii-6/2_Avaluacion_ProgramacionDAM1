
package boletin20;

public class Tigre extends Felino implements IPodeNadar, IPodeCamiñar{
    @Override
    public void nadar() {
        System.out.println("Pode nadar");
    }

    @Override
    public void camiñar() {
        System.out.println("Pode camiñar");
    }
}
