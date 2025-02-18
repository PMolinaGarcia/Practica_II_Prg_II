# Práctica_II_Prg_II

## Descripción del contenido de este repositorio

El siguiente repositorio contiene la Práctica 2 de la asignatura de Programación II del primer curso del grado en Ingeniería de Sistemas de Información de la Universidad San Pablo CEU, cuyo código ha sido programado por Pablo Molina García.

Encontramos dos paquetes que dividen el contenido de las clases: aplicación, que contiene la clase Principal, para la ejecución del programa; y mates, que contiene la clase Matematicas, donde encontraremos los métodos utilizados.

Además, tendrá acceso a la documentación en javadoc de cada clase y un diagrama de clases UML.

## Propósito de la práctica

La práctica resuelta tenía como objetivo el cálculo del número PI mediante el Método de Monte Carlo, diferenciándose de la práctica anterior en que la resolución sería de forma recursiva en vez de iterativa.

## Instrucciones de uso del programa

Para ejecutar el código, debe introducirse en una terminal y entrar en el directorio "src"; una vez ahí, deberá ejecutar el comando java aplicación/Principal.java [inserte número de intentos]. Tras esto, el código realizará el cálculo de pi y obtendrá un resultado.

### Comentarios del autor

Tras ejecutar el código y realizar pruebas, se ha comprobado que este método, aunque arroja resultados bastante buenos y aproximados al número pi que conocemos, es limitado, puesto que, al menos en el ordenador donde ha sido programado, ofrece limitaciones al llegar a los 100000 puntos generados, puesto que la naturaleza recursiva del programa provoca un desbordamiento de pila en la máquina. Sin embargo, en un uso doméstico y como demostración del poder de la recursividad, es bastante práctico y efectivo. 