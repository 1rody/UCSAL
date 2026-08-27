
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("LIVRARIA DAS FRUTAS");

        int bookType = 0;

        String userBookType;

        String userGender;

        int gender;

        int age;

        int romanceTotals;

        int ficcaoTotals;

        int aventuraTotals;

        int i = 0;

        while (i < 1) {

            System.out.println("Informe o genero de livro que deseja");

            System.out.println("Digite 0 ou sair para retomr caso haja algum erro.");

            userBookType = sc.next();

            if (userBookType.equals("Sair") || userBookType.equals("0") ) {

                System.out.println("Informe o genero de livro que deseja");

                userBookType = sc.next();

            }

            if (userBookType.equals("Romance") || userBookType.equals("romance") ) {

                bookType = 1;

                i++;

            }

            if (userBookType.equals("Aventura") || userBookType.equals("aventura") ) {

                bookType = 2;

                i++;

            }

            if (userBookType.equals("Ficcao") || userBookType.equals("ficcao") ) {

                bookType = 3;

                i++;

            }

        }

        switch (bookType) {

            case 1:

                System.out.println("Otimo voce escolheu romance!");

                System.out.println("Agora informe seu sexo e sua idade!");

                userGender = sc.next();

                if (userGender.equals("Masculino") || userGender.equals("masculino")) {

                    gender = 1;

                    System.out.println("Otimo seu genero e mascuino!");

                }

                if (userGender.equals("homem") || userGender.equals("homen")) {

                    gender = 1;

                    System.out.println("Otimo seu genero e mascuino!");

                }

                if (userGender.equals("mulher") || userGender.equals("feminino")) {

                    gender = 1;

                    System.out.println("Otimo seu genero e Feminino!");

                }

                if (userGender.equals("Mulher") || userGender.equals("mulher")) {

                    gender = 1;

                    System.out.println("Otimo seu genero e Feminino!");

                }

                if (userGender.equals("Outros") || userGender.equals("Nao informar")) {

                    gender = 1;

                    System.out.println("Otimo seu genero e Privado!");

                }

                break;

        }

    }

}
