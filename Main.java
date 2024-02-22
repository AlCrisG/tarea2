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

       media(arreglo,celdas); 
    }
    
    public static void media(int a[], int n){
        float media;
        if(n%2==0){
                n=n/2;
                media = (a[n-1]+a[n])/2f;
        }else{
            n=n/2;
            media = a[n];
        }
        System.out.println("La media es: "+media);
    }
    
}