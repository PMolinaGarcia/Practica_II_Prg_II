package mates;

public class Matematicas {

    public static int dardosDentro=0;

    public static void generarPuntoAleatorio(){
        double coordenadaX = Math.random();
        double coordenadaY = Math.random();

        if (coordenadaX*coordenadaX+coordenadaY*coordenadaY<=1){
            dardosDentro+=1;
        }
    }

    public static double generarNumeroPiIterativo(long pasos, long i){

        if (i==pasos){
            return 4.0*dardosDentro/pasos;
        }

        else {
            generarPuntoAleatorio();
            return generarNumeroPiIterativo(pasos, i+1);
        }
    }
}

