package aplicacion;
import mates.*;

public class Principal {

    public static void main(String[] args){
        System.out.println("El número PI es " +
                Matematicas.generarNumeroPiIterativo(Integer.parseInt(args[0]), 0));
    }
}
