
package boletin20;


public class Gato extends Mamifero implements IPodeCamiñar,IPodeNadar {

    @Override
    public void nadar() {
        System.out.println("Poden nadar aunque non lles guste a agua");
    }

    @Override
    public void camiñar() {
        System.out.println("O gato ten patas para andar");
    }
    
}
