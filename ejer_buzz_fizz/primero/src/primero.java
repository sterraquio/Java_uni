/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "@fizz".
 * - Múltiplos de 5 por la palabra "@buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "@fizzbuzz".
 */
public class primero {
    public static void main(String[] args) throws Exception {
        int i = 1;
        //Bucle de los números del 1 - 100
        while (i <= 100) {

            //Desición en si es multiplo de 3 y 5 a la vez
            if (i%3 == 0 && i%5 ==0) {
                System.out.println("fizzbuzz");
            }
            else if (i%3 ==0) {
                //Para ver si la división con el número da cero, indicando así que es multiplo de 3    
                System.out.println("fizz");
            }
            //Para ver si la división con el número da cero, indicando así que es multiplo de 5
            else if(i%5 ==0){
                System.out.println("buzz");
            }
            else {
                //si no cumple ningun condición solo imprime el numero
                System.out.println(i);
            }

            i +=1; /*variable de aumento*/
            
        }
    }
}
