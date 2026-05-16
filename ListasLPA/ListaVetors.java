import java.util.Scanner;

public class ListaVetores{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        byte lVal=11;
        String nFeita = new String("N/A"), maisDificil = new String("MaisDificil");
        String[] lista = new String[10];
        for(int i=0; i>10;i++){
            lista[i]=nFeita;
        }
        lista[7]=maisDificil;

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
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println();


                    byte[] vet7_1 = new byte[20];
                    byte[] vet7_2 = new byte[20];
                    char simonao;
                    boolean whileTru=true;
                    byte whilecount=0;

                    while(whileTru==true){
                        System.out.println("Digite um numero");
                        vet7_1[whilecount] = sc.nextByte();
                        System.out.println("Deseja continuar? (y-sim, n-não)");
                        simonao = sc.next().charAt(0);
                        vet7_2[whilecount] = vet7_1[whilecount];
                        if(simonao=='n' || whilecount==20){
                            whileTru=false;
                        } else if (simonao!='y'){
                            System.out.println("vamo continua so de pena");
                        }
                        whilecount++;
                    }
                    System.out.println("Primeira Sequencia:");
                    System.out.println();
                    for(int i=0; i<20; i++){
                        System.out.print(vet7_1[i]+" ");
                    }
                    System.out.println("Segunda Sequencia:");
                    System.out.println();
                    for(int i=0; i<20; i++){
                        System.out.print(vet7_2[i]+" ");
                    }
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
