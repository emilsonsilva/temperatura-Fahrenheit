
package temperaturafahrenheit;

import java.util.Scanner;


public class TemperaturaFahrenheit {

    
    public static void main(String[] args) {
        double F, C;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a temperatura em fahrenheit:");
        F = leia.nextDouble();
        C = (F-32)*0.55;
        System.out.println("A temperatura em Celsius é:"+ C);
    }
    
}
