import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        int alcool = 0;
        int gasolina =0;
        int diesel =0;
        int tipo = sc.nextInt();
        while(tipo!=4){
            if(tipo ==1){
                alcool+=1;

            }
            else if(tipo ==2){
                gasolina+=1;

            }
            else if (tipo==3){
                diesel+=1;
            }
            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("alcool "+alcool);
        System.out.println("gasolina "+gasolina);
        System.out.println("diesel "+diesel);
    }
}
