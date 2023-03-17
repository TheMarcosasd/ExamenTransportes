public interface ITransporte {
    public static final int PALET = 0;
    public static final int CAJACARTON = 1;
    public static final int CAJAMADERA = 2;
    public static final int CONTENEDOR = 3;
    public Float costeTotal ( Integer CodigoPostal);
}
