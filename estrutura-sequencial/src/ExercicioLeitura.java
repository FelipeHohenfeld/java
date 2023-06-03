import java.util.Locale;
import java.util.Scanner;

    public class ExercicioLeitura {
        public static void main(String[] args){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int cod1, cod2, num1, num2;
            double valor1, valor2, valortotal1, valortotal2, valortotal3;

            cod1 = sc.nextInt();
            num1 = sc.nextInt();
            valor1 = sc.nextDouble();
            cod2 = sc.nextInt();
            num2 = sc.nextInt();
            valor2 = sc.nextDouble();
            
                valortotal1 = num1 * valor1;
                valortotal2 = num2 * valor2;
                valortotal3 = valortotal1 + valortotal2;
                    System.out.printf("VALOR A PAGAR: R$ %.2f%n", valortotal3);

                    sc.close();

        }

    
}
