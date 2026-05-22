import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random random =new Random();
        int dados = 1;

        System.out.println("Digite quantos dados temos: ");

        String entrada = ler.nextLine();

        if(!entrada.isEmpty()){
            dados = Integer.parseInt(entrada);
        }
        for(int i= 0; i<dados;i++){
       int face = (int) (Math.random()*6)+1;
       if(dados ==1){System.out.println("Dado soteado: ");
       }else {
           System.out.println("Dados soteados: ");
       }
       switch (face) {
           case 1:
               System.out.println("+---------+");
               System.out.println("|         |");
               System.out.println("|    o    |");
               System.out.println("|         |");
               System.out.println("+---------+");
               break;

           case 2:
               System.out.println("+---------+");
               System.out.println("| o       |");
               System.out.println("|         |");
               System.out.println("|       o |");
               System.out.println("+---------+");
               break;

           case 3:
               System.out.println("+---------+");
               System.out.println("| o       |");
               System.out.println("|    o    |");
               System.out.println("|       o |");
               System.out.println("+---------+");
               break;

           case 4:
               System.out.println("+---------+");
               System.out.println("| o     o |");
               System.out.println("|         |");
               System.out.println("| o     o |");
               System.out.println("+---------+");
               break;

           case 5:
               System.out.println("+---------+");
               System.out.println("| o     o |");
               System.out.println("|    o    |");
               System.out.println("| o     o |");
               System.out.println("+---------+");
               break;

           case 6:
               System.out.println("+---------+");
               System.out.println("| o     o |");
               System.out.println("| o     o |");
               System.out.println("| o     o |");
               System.out.println("+---------+");
               break;
       }
       }
        ler.close();
    }
}