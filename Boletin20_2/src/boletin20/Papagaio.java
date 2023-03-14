
package boletin20;


public class Papagaio extends Aves implements IPodeCamiñar,IPodeVoar{
    @Override
    public void camiñar() {
        System.out.println("Pode camiñar");
    }

    @Override
    public void voar() {
        System.out.println("Pode voar");
    }
}
