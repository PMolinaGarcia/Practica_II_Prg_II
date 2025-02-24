package mates;

/**
 * Clase Matematicas, en la que encontramos los métodos que realizan los cálculos numéricos para obtener una aproximación a pi.
 */
public class Matematicas {

   /**
     * Método para generar puntos aleatorios:
     * <p>
     * En primer lugar, se definen las variables coordenadaX y coordenadaY,
     * que son las que tendrá cada punto generado y cuyos valores serán aleatorios;
     * para esto, empleamos el método random(), de la librería Math de Java.
     * <p>
     * Después, si el punto generado por dichas coordenadas cumple que está dentro o en el borde de un círculo de radio 1,
     * aumentaremos en 1 el contador de dardos, indicando que ahora hay un dardo más dentro;
     * si no se da el caso de que el punto está dentro o en el borde del círculo, no sucede nada.
     */
    public static int generarPuntoAleatorio(){
        double coordenadaX = Math.random();
        double coordenadaY = Math.random();

        if (coordenadaX*coordenadaX+coordenadaY*coordenadaY<=1){
            return 1;
        }
        else {
            return 0;
        }
    }

    /**
     * Método recursivo para calcular el número pi a partir de los puntos generados:
     * <p>
     * Se nos presenta el caso base como el momento en el que hemos generado todos los puntos que deseábamos, donde devolvemos la fórmula para el cálculo de pi.
     * En caso de no llegar al caso base, generamos el siguiente punto aleatorio y provocamos que se llame el método a sí mismo hasta lograr la recursión.
     *
     * @param pasos Es el parámetro numérico que indica la cantidad de puntos totales con los que queremos trabajar.
     * @param i Es el parámetro numérico que indica la posición del bucle que estamos imitando (sin llegar a serlo) para efectuar una recursión con memoria.
     * @return Retornamos el método, ya que es recursivo, introduciendo como variación que provocamos que se aplique para i+1 en vez de para i, y que así avancemos hasta el caso base.
     */

    public static double generarNumeroPiRecursivo(long pasos, long i, long dardosDentro){

        if (i==pasos){
            return 4.0*dardosDentro/pasos;
        }

        else {
            return generarNumeroPiRecursivo(pasos, i+1, dardosDentro + generarPuntoAleatorio());
        }
    }
}

