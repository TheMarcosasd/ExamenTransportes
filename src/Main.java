import javax.swing.*;
public class Main {

    static ITransporte it;

    /**
     * @param args
     */
    public static void main(String[] args) {
        /** Tiene que estar asi
         * * Son nulos
         * no se que mas poner
         */
        String tipo = null;
        Float costeTotal = null;
        Integer numeroDelTipo = null;

        //Basico para mostrar por pantalla
        int palanca = Integer.parseInt(JOptionPane.showInputDialog("1 para Camion, 2 para Bicicleta y 3 para Barco"));


        switch(palanca){

            case 1: it = FactoryTransport.getProduct(FactoryTransport.CAMION);
                break;
            case 2: it = FactoryTransport.getProduct(FactoryTransport.BICILETA);
                break;
            case 3: it = FactoryTransport.getProduct(FactoryTransport.BARCO);
                break;
            default: break;
        }
        costeTotal = it.costeTotal(FactoryTransport.codigoDePostal);

        System.out.println("Coste Total =" + costeTotal);
    }


    }