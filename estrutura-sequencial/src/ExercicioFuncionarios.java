import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncionarios {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            int id, horas;
            double valorHora, salario;
            id = sc.nextInt();
            horas = sc.nextInt();
            valorHora = sc.nextDouble();

            salario = valorHora * horas;
            System.out.println("ID = " + id);
            System.out.printf("SALARIO = R$ %.2f%n", salario);

            sc.close();
    }
    
}
