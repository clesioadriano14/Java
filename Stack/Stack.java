public class Stack {

    private Node top;
    private int size;

    public Stack(){ //criando uma pilha vazia
        this.top = null;
        this.size = 0;
    }

    public Stack(int n) {
        this.top = null;
        this.size = 0;
        
        for (int i = 1; i <= n; i++) {
            this.push(i);
        }
    }
    
    public Stack(Stack outro){ //criando construtor de copia
        Node t = outro.top;
        Stack S = new Stack();
        while (t != null) {
            S.push(t.item);
            t = t.next;
        }
        this.size = 0;
        this.top = null;
        try{
            while (!S.isEmpty()) {
                this.push(S.pop());
            }
            }catch(Exception e){

            }
    }


    public void push(int item){ // empilhar item
        Node t = new Node(item);
        t.next = this.top;
        this.top = t;
        this.size++;
    }    

    public static boolean equals (Stack A, Stack B){ // verificando se as pilhas são iguais

        if (A.size != B.size) {
            return false;
        }else{
            Node t1 = A.top;
            Node t2 = B.top;
             while (t1 != null ) {
                if(t1.item != t2.item){
                    return false;
                }
                t1 = t1.next;
                t2 = t2.next;
             }

            }
            return true;
        }

    public boolean isEmpty (){ // verificar se está vazia
        return this.top == null;
    }

    public int size(){ // retornar tamanho
        return this.size;
    }

    public int pop () throws Exception{ // desempilhar item
        
        if (this.isEmpty()) {
            throw new Exception("A pilha está vazia.");
        }
        int item = this.top.item;
        this.top = this.top.next;
        this.size--;
        return item;
    }

    public int top(){ // retorno o item do topo
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia");
        }
        return this.top.item;
    }
    public void show (){
        Node t = this.top;
        
        while (t != null) {
            System.out.println(t.item);
            t = t.next;
        }
    }
}
class Node {
    public int item;
    public Node next;

    public Node(int item){
        this.item = item;
        this.next = null;
    }
    
}