import java.util.Scanner;

public class ExercicioHora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        
            int hora = sc.nextInt();

            if (hora < 12){
                System.out.println("Bom dia :D");
            }
            else if (hora < 18) {
                System.out.println("Boa tarde :D");
            }
            else {
                System.out.println("Boa noite :D");
            }
            
            
        sc.close();


    }
    
}
