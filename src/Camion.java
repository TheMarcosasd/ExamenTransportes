public class Camion implements ITransporte{
    private Integer codigoPostal;
    private Float ejeX;
    private Float ejeY;
    private Float ejeZ;
    private Float peso;

    public Camion(Integer codigoPostal, Float ejeX, Float ejeY, Float ejeZ, Float peso) {
        this.codigoPostal = codigoPostal;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.ejeZ = ejeZ;
        this.peso = peso;
    }

    public Float costeTotal(Integer CodigoPostall){
        Float precio = codigoPostal.floatValue()*0+2;
        return precio;
    }
}
