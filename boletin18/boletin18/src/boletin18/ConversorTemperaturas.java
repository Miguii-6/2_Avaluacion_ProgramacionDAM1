
package boletin18;


public class ConversorTemperaturas {
    
    private static final int TEMP_MAX = 80;
    
    public float centigradosAFharenheit(float temperatura) throws TemperaturaErradaExcepcion{
        if(temperatura < TEMP_MAX) throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor a 80º");
        else{
            float fharenheit = (temperatura * 9 / 5) + 32;
            return fharenheit;
        }
    }
    
    public float centigradosAReamur(float temperatura) throws TemperaturaErradaExcepcion{
        if(temperatura < TEMP_MAX) throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor a 80º");
        else{
            float reamur = 4 / 5 * temperatura;
            return reamur;
        }
    }
}
