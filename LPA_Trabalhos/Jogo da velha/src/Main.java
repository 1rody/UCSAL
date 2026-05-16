import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Armazenamento de localizacao dos  0 e X de players;

        int[] playerOne = new int[9];
        int[] playerTwo = new int[9];
        String selectType;

        //vars que armazenam os nomes dos players;

        String[] playerNames = new String[2];

        //byte 'h' sendo declarada para ser um contador ultilitario para o registro E exibição dessa matriz;
        byte h=0;
        byte defaultValue=1;
        char[][] matriz = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i][j] = (char) ('1' + h);
                h++;
            }
        }
        //byte 'h' zerada para reutilização depois;
        h=0;

        //Posicao escolhida do simbolo na partida (string por causa da String 'velha');
        char pos;

        //resultado da partida/flag para o fim dela
        //0 = partida em andamento (default pro loop funcionar); 1 = jogador 1 vence; 2 = jogador 2 vence; 3 = velha;
        byte resultado=0;

        //contador simples para o loop na partida (nao e byte por causa do rand);
        int con;

        //boolean simples para o teste/registro do input do jogador na partida;
        boolean valInp=false;

        //escolha de simbolo do jogador iniciante (x = 1, o = 0)
        //possui valor pois compiladores sao chatos e requerem inicialização fora de switch tambem aff;
        byte escolha=67;


        //sorteio que definira aleatoriamente qual o jogador;
        //menu de escolha quem e o jogador1 e qual o jogador 2;

        System.out.println("Digite o nome do jogador 1:");
        playerNames[0] = sc.nextLine();
        System.out.println(playerNames[0] + " Confirmado!");
        System.out.println();

        System.out.println("Digite o nome do jogador 2:");
        playerNames[1] = sc.nextLine();
        System.out.println(playerNames[1] + " Confirmado!");
        System.out.println();

        //soteio para definir qual jogador comeca;

        int drawnResult;

        Random rand = new Random();
        drawnResult = rand.nextInt(2);

        // drawnResult=0; //sorteio definido APENAS PARA CASO DE TESTE!!!!;

        System.out.println("Jogador "+playerNames[drawnResult]+" vai iniciar a partida dessa vez!");
        System.out.println();

        //partida
        switch (drawnResult) {
            case 0:

                System.out.println("Jogador " + playerNames[0] + " qual simbolo voce deseja 1- X 2- O");
                selectType = sc.nextLine();

                if(selectType.equals("x")) {
                    System.out.println("Jogador " + playerNames[0] + " Possui o simbolo X");
                    System.out.println("Jogador " + playerNames[1] + " Possui o simbolo O");
                    escolha=1;

                }
                else {
                    System.out.println("Jogador " + playerNames[0] + " Possui o simbolo 0");
                    System.out.println("Jogador " + playerNames[1] + " Possui o simbolo X");
                    escolha=2;

                }
                System.out.println( " ");
                System.out.println(" ");

                break;
            case 1:
                System.out.println("Jogador " + playerNames[1] + " Qual simbolo voce deseja 1- X 2- O");
                selectType = sc.nextLine();

                if(selectType.equals("x")) {
                    System.out.println("Jogador " + playerNames[0] + " Possui o simbolo X");
                    System.out.println("Jogador " + playerNames[1] + " Possui o simbolo O");
                    escolha=1;

                }
                else {
                    System.out.println("Jogador " + playerNames[0] + " Possui o simbolo 0");
                    System.out.println("Jogador " + playerNames[1] + " Possui o simbolo X");
                    escolha=2;

                }
                System.out.println( " ");
                System.out.println(" ");

                //----------------------

                break;
        }
        System.out.println("Partida iniciada!");

        //assinalando o contador a o valor sorteado, para servir como alternador no loop da partida
        //ao invez de usar o drawnResult direto, o contador separa a operação para favor de organização;
        con=drawnResult;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Armazenamento de localizacao dos  0 e X de players;

        int[] playerOne = new int[9];
        int[] playerTwo = new int[9];
        String selectType;

        //vars que armazenam os nomes dos players;

        String[] playerNames = new String[2];

        //byte 'h' sendo declarada para ser um contador ultilitario para o registro E exibição dessa matriz;
        byte h=0;
        byte defaultValue=1;
        char[][] matriz = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i][j] = (char) ('1' + h);
                h++;
            }
        }
        //byte 'h' zerada para reutilização depois;
        h=0;

        //Posicao escolhida do simbolo na partida (string por causa da String 'velha');
        char pos;

        //resultado da partida/flag para o fim dela
        //0 = partida em andamento (default pro loop funcionar); 1 = jogador 1 vence; 2 = jogador 2 vence; 3 = velha;
        byte resultado=0;

        //contador simples para o loop na partida (nao e byte por causa do rand);
        int con;

        //boolean simples para o teste/registro do input do jogador na partida;
        boolean valInp=false;

        //escolha de simbolo do jogador iniciante (x = 1, o = 0)
        //possui valor pois compiladores sao chatos e requerem inicialização fora de switch tambem aff;
        byte escolha=67;


        //sorteio que definira aleatoriamente qual o jogador;
        //menu de escolha quem e o jogador1 e qual o jogador 2;

        System.out.println("Digite o nome do jogador 1:");
        playerNames[0] = sc.nextLine();
        System.out.println(playerNames[0] + " Confirmado!");
        System.out.println();

        System.out.println("Digite o nome do jogador 2:");
        playerNames[1] = sc.nextLine();
        System.out.println(playerNames[1] + " Confirmado!");
        System.out.println();

        //soteio para definir qual jogador comeca;

        int drawnResult;

        Random rand = new Random();
        drawnResult = rand.nextInt(2);

        // drawnResult=0; //sorteio definido APENAS PARA CASO DE TESTE!!!!;

        System.out.println("Jogador "+playerNames[drawnResult]+" vai iniciar a partida dessa vez!");
        System.out.println();

        //partida
        switch (drawnResult) {
            case 0:

                System.out.println("Jogador " + playerNames[0] + " qual simbolo voce deseja 1- X 2- O");
                selectType = sc.nextLine();

                if(selectType.equals("x")) {
                    System.out.println("Jogador " + playerNames[0] + " Possui o simbolo X");
                    System.out.println("Jogador " + playerNames[1] + " Possui o simbolo O");
                    escolha=1;

                }
                else {
                    System.out.println("Jogador " + playerNames[0] + " Possui o simbolo 0");
                    System.out.println("Jogador " + playerNames[1] + " Possui o simbolo X");
                    escolha=2;

                }
                System.out.println( " ");
                System.out.println(" ");

                break;
            case 1:
                System.out.println("Jogador " + playerNames[1] + " Qual simbolo voce deseja 1- X 2- O");
                selectType = sc.nextLine();

                if(selectType.equals("x")) {
                    System.out.println("Jogador " + playerNames[0] + " Possui o simbolo X");
                    System.out.println("Jogador " + playerNames[1] + " Possui o simbolo O");
                    escolha=1;

                }
                else {
                    System.out.println("Jogador " + playerNames[0] + " Possui o simbolo 0");
                    System.out.println("Jogador " + playerNames[1] + " Possui o simbolo X");
                    escolha=2;

                }
                System.out.println( " ");
                System.out.println(" ");

                //----------------------

                break;
        }
        System.out.println("Partida iniciada!");

        //assinalando o contador a o valor sorteado, para servir como alternador no loop da partida
        //ao invez de usar o drawnResult direto, o contador separa a operação para favor de organização;
        con=drawnResult;

        //a partida se encontra nesse while;
        while(resultado==0){
            System.out.println();
            System.out.println();
            //exibe todas as linhas da matriz;
            for(int i=0; i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println();
            }

            /*for (int[] lin : matriz) {
                for (int ele : lin){
                    System.out.print(ele+" ");

                }
                System.out.println();
            }*/

            System.out.println();

            //definir o texto que declara de quem é o turno + alternar o jogador a cada turno;
            if(con==0){
                System.out.println(playerNames[0]+":   (con="+con+")");
                con++;
            } else {
                System.out.println(playerNames[1]+"::   (con="+con+")");
                con--;
            }
            //aqui o input do jogador sera registrado E testado (caso seja invalido);
            while(valInp==false){

                //O input do jogador será solicitado aq;
                pos=sc.next().charAt(0);

                //O input do jogador será testado e/ou registrado aq;
                for(int i=0; i<3; i++){
                    for(int j=0;j<3;j++){
                        if(pos==matriz[i][j] && pos!='X' && pos!='O'){
                            System.out.println("escolha="+escolha);
                            //caso encontrar a posição na matriz, um cheque de quem possue a rodada ira rodar
                            //antes de substituir o valor;
                            if(escolha==1){
                                if(con==0){
                                    matriz[i][j]='X';
                                } else {
                                    matriz[i][j]='O';
                                }
                            } else {
                                if(con==0){
                                    matriz[i][j]='O';
                                } else {
                                    matriz[i][j]='X';
                                }
                            }
                            //as condições dos dois fors e do boolean 'valInp' serão quebradas para evitar o caso do else
                            //o qual se tornaria uma eventualidade caso contrario;
                            valInp=true;
                            i=4;
                            j=4;

                        } else if(h==8){
                            //caso o teste chegue a 9 posição e mesmo assim o primeiro if não foi verdadeiro;
                            System.out.println();
                            System.out.println("!!VALOR INVALIDO!! verifique o tabuleiro e tente novamente:");
                            System.out.println();

                        }
                        h++;
                    }
                }

            }
            //tanto 'h' quanto 'valInp' serão reiniciados para o uso na proxima rodada;
            h=0;
            valInp=false;

            //o jogo aqui ira checar se a condição de vitoria foi atendida nessa rodada
            //0 = partida em andamento (default pro while do jogou funcionar); 1 = jogador 1 vence; 2 = jogador 2 vence; 3 = velha;
            for(int i=0; i<3; i++){
                for(int j=0;j<3;j++){

                }
            }
        }
    }
}
        //a partida se encontra nesse while;
        while(resultado==0){
            System.out.println();
            System.out.println();
            //exibe todas as linhas da matriz;
            for(int i=0; i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println();
            }

            /*for (int[] lin : matriz) {
                for (int ele : lin){
                    System.out.print(ele+" ");

                }
                System.out.println();
            }*/

            System.out.println();

            //definir o texto que declara de quem é o turno + alternar o jogador a cada turno;
            if(con==0){
                System.out.println(playerNames[0]+":   (con="+con+")");
                con++;
            } else {
                System.out.println(playerNames[1]+"::   (con="+con+")");
                con--;
            }
            //aqui o input do jogador sera registrado E testado (caso seja invalido);
            while(valInp==false){

                //O input do jogador será solicitado aq;
                pos=sc.next().charAt(0);

                //O input do jogador será testado e/ou registrado aq;
                for(int i=0; i<3; i++){
                    for(int j=0;j<3;j++){
                        if(pos==matriz[i][j] && pos!='X' && pos!='O'){
                            System.out.println("escolha="+escolha);
                            //caso encontrar a posição na matriz, um cheque de quem possue a rodada ira rodar
                            //antes de substituir o valor;
                            if(escolha==1){
                                if(con==0){
                                    matriz[i][j]='X';
                                } else {
                                    matriz[i][j]='O';
                                }
                            } else {
                                if(con==0){
                                    matriz[i][j]='O';
                                } else {
                                    matriz[i][j]='X';
                                }
                            }
                            //as condições dos dois fors e do boolean 'valInp' serão quebradas para evitar o caso do else
                            //o qual se tornaria uma eventualidade caso contrario;
                            valInp=true;
                            i=4;
                            j=4;

                        } else if(h==8){
                            //caso o teste chegue a 9 posição e mesmo assim o primeiro if não foi verdadeiro;
                            System.out.println();
                            System.out.println("!!VALOR INVALIDO!! verifique o tabuleiro e tente novamente:");
                            System.out.println();

                        }
                        h++;
                    }
                }

            }
            //tanto 'h' quanto 'valInp' serão reiniciados para o uso na proxima rodada;
            h=0;
            valInp=false;

            //o jogo aqui ira checar se a condição de vitoria foi atendida nessa rodada
            //0 = partida em andamento (default pro while do jogou funcionar); 1 = jogador 1 vence; 2 = jogador 2 vence; 3 = velha;
            for(int i=0; i<3; i++){
                for(int j=0;j<3;j++){

                }
            }
        }
    }
}
