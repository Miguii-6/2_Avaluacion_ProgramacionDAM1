
package boletin21_4;


public class Dni {
    private int numeroDni;

    public Dni(int numeroDni) {
        this.numeroDni = numeroDni;
    }
    
    public char calculoLetraDni(){
        int resto=numeroDni%23;
        char[] letrasDni=new char[]{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letrasDni[resto];
    }
}
