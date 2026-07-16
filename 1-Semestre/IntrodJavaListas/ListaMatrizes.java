import java.util.Scanner;

public class ListaMatrizes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        byte lVal=11;
        String nFeita = new String("N/A"), cordenadas = new String("Cordenadas"), calcMaMe = new String("Maior e Menor Elemento"), matizmatiz = new String("Matriz, Matriz");
        String[] lista = new String[10];
        String qualquer;
        for(int i=0; i>10;i++){
            lista[i]=nFeita;
        }
        lista[2]=cordenadas;
        lista[3]=calcMaMe;
        lista[6]=matizmatiz;

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
                    System.out.println();
                    
                    System.out.println("Digite 15 numeros:");
                    System.out.println();
                    int[][] mat=new int[3][5];
                    byte revCon=15, numVer;
                    boolean ver=false;

                    for(int i=0; i<5; i++){
                        for(int j=0; j<3; j++){
                            System.out.println("(Restam "+revCon+" numeros.)");
                            System.out.println();
                            mat[j][i]=sc.nextInt();
                            revCon--;
                        }
                    }

                    System.out.println("Digite o numero a ser encontrado:");
                    numVer=sc.nextByte();

                    for(int i=0; i<5; i++){
                        for(int j=0; j<3; j++){
                            if(mat[j][i]==numVer){
                                System.out.println("O numero está na '"+(j+1)+"°' coluna,");
                                System.out.println("e na '"+(i+1)+"°' linha!");
                                ver=true;
                                i=6;
                                j=4;
                            }
                        }
                    }
                    if(ver==false){
                        System.out.println("Elemento não encontradoo!!");
                    }                    
                    break;
                case 4:
        int[][] Z = new int[3][4];

        int O = 0, s = 0, j = 10000, v = 0;

        System.out.println("Informe numeros: ");
        for(int i = 0; i < 3; i++ ){
            for(int a = 0; a < 4; a++){
                Z[i][a] = sc.nextInt();
            }

        }
        for(int i = 0; i < 3; i++){
            for(int a = 0; a < 4; a++){
                if(Z[i][a] >= s){
                    s = Z[i][a];
                }
                if(Z[i][a] <= j){
                    j = Z[i][a];
                }
                v = v + Z[i][a];
            }

        }
        System.out.println("Menor numero: " + j +
               " Maior numero: " + s +
                " Resultado geral: " + v );
    }
}
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
                    break;
                case 5:
                    System.out.println("!!Problema não reslovido/em andamento!! Escolha outra sem marcação N/A");
                    break;
                case 6:
                    int[][] za = new int[4][4];

                    int s2;

                    System.out.println("Informe numeros: ");
                    for(int i = 0; i < 4; i++){
                        for(int a = 0; a < 4; a++){
                            za[i][a] = sc.nextInt();
                        }
                    }
                    for(int i = 0; i < 4; i++){
                        s2 = s2 + za[i][i];
                        //O za[i][i] vai adicionando  para a diagonal por consequencia da equilateriedade.
                    }
                    System.out.println("A sequencia da diagonal é" + s2);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
                    break;
                case 7:
                    int[][] matriz=new int[20][20];
                    int[][] at=new int[20][20];


                    System.out.println("Digite 40 (sim) numeros:");
                    for(int i=0; i<20; i++){
                        for(int c=0; c<20; c++){
                            matriz[i][c]=sc.nextInt();
                        }
                    }

                    System.out.println();

                    for(int i=0; i<20; i++){
                       for(int c=0; c<20; c++){
                            at[c][i]=matriz[i][c];
                        }
                    }

                    for(int i=0; i<20; i++){
                       for(int c=0; c<20; c++){
                          System.out.print(at[i][c]+" ");
                        }
                        System.out.println();
                    }
                    
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
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
