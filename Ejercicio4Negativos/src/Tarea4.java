import java.util.Scanner;

public class Tarea4 {

    //definimos nuestro arreglo
    Integer[] vector;
    double x;//primitivo
    Double Y;//objeto

    Scanner scanner;

    //Metodo constructor
    public Tarea4() {
        this.vector = new Integer[10];

        scanner = new Scanner(System.in);
    }

    public void ejecutar(){
        //llenamos el vector segun sus condiciones

       int i = 0;
       while (i < vector.length){
           int numero =scanner.nextInt();
           if (numero >= 0){
               vector[i] = numero;

               i++;
           }else {// si el numero es negativo
              break; //rompe el ciclo while
           }

       }

       //mostrar solo los elementos introducidos
        int j = 0;
        while (j < vector.length){
            if (vector[j] != null){
                System.out.println("vector[" + j + "]: " + vector [j] );

                j++;
            }else {// si el numero es negativo
                break; //rompe el ciclo while
            }

        }

    }

}
