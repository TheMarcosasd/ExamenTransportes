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
        codigoDePostal = Integer.parseInt(JOptionPane.showInputDialog("Codigo postal"));
        lineaX = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese x")));
        lineaY = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese y")));
        lineaZ = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese z")));
        peso = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Peso")));
        switch (tipo){
            case CAMION: return new Camion(codigoDePostal,lineaX,lineaY,lineaZ,peso);
            case BICILETA: return new Bicileta(codigoDePostal,lineaX,lineaY,lineaZ,peso);
            case BARCO: return new Barco(codigoDePostal,lineaX,lineaY,lineaZ,peso);
            default: return null;
        }
}}
