import java.util.Scanner;

public class ListasLPATemplate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        byte lVal=11;
        String nFeita = new String("N/A");
        String[] lista = new String[10];
        String qualquer;
        for(int i=0; i>10;i++){
            lista[i]=nFeita;
        }

        while (lVal!=0){
            System.out.println();
            System.out.println("Digite o valor da lista a ser acessada:");
            System.out.println();
            System.out.println("1 -  "+ lista[0]);
            System.out.println("2 -  "+ lista[1]);
            System.out.println("3 -  "+ lista[2]);
            System.out.println("4 -  "+ lista[3]);
            System.out.println("5 -  "+ lista[4]);
            System.out.println("6 -  "+ lista[5]);
            System.out.println("7 -  "+ lista[6]);
            System.out.println("8 -  "+ lista[7]);
            System.out.println("9 -  "+ lista[8]);
            System.out.println("10 - "+ lista[9]);
            System.out.println("0 - Fechar");
            System.out.println();

            lVal = sc.nextByte();

            switch(lVal){
                case 0:
                    break;
                case 1:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                case 2:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                case 3:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                case 4:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                case 5:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                case 6:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                case 7:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                case 8:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                case 9:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                case 10:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                default:
                    System.out.println("!!Problema não existe!! Escolha um numero listado na lista");
                    break;
            }

            try {
            Thread.sleep(3500);
            } catch (InterruptedException e) {
            }

        }
        System.out.println();
        System.out.println("chau chau!!");
    }
}
