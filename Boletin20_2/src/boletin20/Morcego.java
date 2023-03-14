
package boletin20;

public class Morcego extends Mamifero implements IPodeVoar{
    @Override
    public void camiñar() {
        System.out.println("Pode camiñar");
    }

    @Override
    public void voar() {
        System.out.println("Pode voar");
    }
}
