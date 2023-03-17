import javax.swing.*;
public class FactoryTransport {
    public static final int CAMION = 1;
    public static final int BICILETA = 2;

    public static final int BARCO = 3;
    public static  Integer codigoDePostal = null;
    public static  Float lineaX = null;
    public static  Float lineaY = null;
    public static  Float lineaZ = null;
    public static  Float peso = null;
    public static ITransporte getProduct(int tipo){
        codigoDePostal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo postal"));
        lineaX = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la linea de tierra")));
        lineaY = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la linea de aire")));
        lineaZ = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la profundidad")));
        peso = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso")));
        switch (tipo){
            case CAMION: return new Camion(codigoDePostal,lineaX,lineaY,lineaZ,peso);
            case BICILETA: return new Bicileta(codigoDePostal,lineaX,lineaY,lineaZ,peso);
            case BARCO: return new Barco(codigoDePostal,lineaX,lineaY,lineaZ,peso);
            default: return null;
        }
}}
