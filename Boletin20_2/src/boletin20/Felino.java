
package boletin20;


public class Felino extends Mamifero implements IPodeCamiñar,IPodeNadar{
    @Override
    public void camiñar() {
        System.out.println("Teñen patas para podes andar");
    }

    @Override
    public void nadar() {
        System.out.println("Poden nadar");
    }
}
