import java.util.Scanner;
public class calculadora {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nOperacao;
        System.out.println("\n");
        System.out.println("escolha qual operaçao vc quer realizar");
        System.out.println("------------------------------------------------------");
        System.out.println(" 1-adicao\n 2-subtracao\n 3-multiplicacao\n 4-divisao\n 5-desconto\n 6-acrescimo ");
        System.out.println("------------------------------------------------------");
        nOperacao=scan.nextLine();
        if(nOperacao.equals("1")){
            System.out.println("ADICAO");
          int n1;
          int n2;
          System.out.println("escreva o primeiro numero");
          n1 = scan.nextInt();
          System.out.println("escreva o segundo");
          n2 = scan.nextInt();
          int res = n1 + n2;
          System.out.println("o valor da soma e: "+res);
        }else if(nOperacao.equals("2")){
            System.out.println("SUBTRACAO");
            int n1;
            int n2;
            System.out.println("escreva o primeiro numero: ");
            n1 = scan.nextInt();
            System.out.println("escreva o segundo numero: ");
            n2 = scan.nextInt();
            int res = n1 - n2;
            System.out.println("a subtracao desses numeros é: "+res);
        }else if(nOperacao.equals("3")){
            System.out.println("MULTIPLICACAO");
            int n1;
            int n2;
            System.out.println("escreva o primeiro numero: ");
            n1 = scan.nextInt();
            System.out.println("escreva o segundo numero: ");
            n2 = scan.nextInt();
            int res = n1 * n2;
            System.out.println("a multiplicacao desses numeros é: "+res);
    }else if(nOperacao.equals("4")){
        System.out.println("DIVISAO");
        int n1;
        int n2;
        System.out.println("escreva o primeiro numero: ");
        n1 = scan.nextInt();
        System.out.println("escreva o segundo numero: ");
        n2 = scan.nextInt();
        if(n2==0 || n1 == 0 ){
            System.out.println("não foi possivael realizar esta conta");
            return;
        }
        int res = n1 / n2;
        System.out.println("a divisao desses numeros é: "+res);
    }else if(nOperacao.equals("5")){
        System.out.println("DESCONTO");
       double precoOriginal;
       double desconto;
       System.out.println("qual o preço original ?");
       precoOriginal = scan.nextInt();
       System.out.println("qual o desconto ? ");
       desconto = scan.nextInt();
       double res = precoOriginal * (desconto/100);
       double precoNovo = precoOriginal - res;
       System.out.println("o valor ficara: " +precoNovo+ " com "+res+" reais de desconto ");
    }else if(nOperacao.equals("6")){
        System.out.println("ACRESCIMO");
       double precoOriginal;
       double acrescimo;
       System.out.println("qual o preço original ?");
       precoOriginal = scan.nextInt();
       System.out.println("qual o desconto ? ");
       acrescimo = scan.nextInt();
       double res = precoOriginal * (acrescimo/100);
       double precoNovo = precoOriginal + res;
       System.out.println("o valor ficara: " +precoNovo+ " com "+res+" reais de desconto ");
    }
}}
