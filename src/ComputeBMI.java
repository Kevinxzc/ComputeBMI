
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args){ //Calculando IMC usando Math
         
          Scanner in = new Scanner (System.in);
          System.out.println("Informe seu peso em libras");
          double weight = in.nextDouble();
          System.out.println("Informe sua altura em polegadas");
          double height = in.nextDouble();
          double bmi=(weight/Math.pow(height,2))*703;
          System.out.println(" Seu Indice de Massa Corporal e: " + Math.round(bmi));
          in.close(); 
    }
}