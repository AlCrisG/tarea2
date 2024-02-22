import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Random ran = new Random();

        int celdas;
        System.out.println("Ingrese el número de celdas para el arreglo: ");
        celdas = read.nextInt();

        int arreglo[] = new int[celdas];

        arreglo[0] = ran.nextInt(898)+3;

        for(int i=1; i < celdas; i++){
            arreglo[i] = ran.nextInt(898)+3;
            while (arreglo[i]<arreglo[i-1]) {
                arreglo[i] = ran.nextInt(898)+3;
            }
        }

        for(int i=0; i < celdas; i++){
            System.out.print("["+arreglo[i]+"] ");
        }
    }
}