import java.util.Scanner;

public class Beecrowd1035 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int A, B, C, D;
        String sequencia;
        String[] partes;

        //ler sequência
        sequencia = leitor.nextLine();

        //separar os números
        partes = sequencia.split(" ");

        //atribuir os valores às variáveis
        A = Integer.parseInt(partes[0]);
        B = Integer.parseInt(partes[1]);
        C = Integer.parseInt(partes[2]);
        D = Integer.parseInt(partes[3]);

        //verificar condições e mostrar resultado no console
        if (B > C && D > A && C + D > A + B && C >= 0 && D >= 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
