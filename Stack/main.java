
import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Stack A = new Stack();
        int n, x, y;
         
         try{
            A.push(10);
            A.push(20);
            A.push(30);
            Stack B = new Stack(A);
            A.pop(); // removi o topo de A

            System.out.println("A:");
            A.show();
            System.out.println("\nB:");
            B.show();
           
        } catch (Exception e){
           System.out.println(e.getMessage());
         }
// 2     
        System.out.print("Digite um valor n: ");
        n = read.nextInt();
        Stack pilha = new Stack(n);
        System.out.println("\nElementos empilhados (topo ate base):");
        pilha.show();
        try {
            while (!pilha.isEmpty()) {
                System.out.println("Removido: " + pilha.pop());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// 3    
        System.out.println("Preencher pilha 1");
        x = read.nextInt();
        System.out.println("Preencher pilha 2");
        y = read.nextInt();
        Stack D = new Stack(x);
        Stack E = new Stack(y);
        if (Stack.equals(D, E)) 
        System.out.println("Pilhas iguais");
        else
        System.out.println("Pilhas diferentes");
        read.close();
    }


        






        


}
