/* TESTE INICIAL PARA A PILHA PROCESSO */

public class TestePilhaProcesso {
    
     public static void main(String[] args) {

        PilhaProcesso pilha = new PilhaProcesso();

        pilha.push(new Processo("A", "Servico", 1));
        pilha.push(new Processo("B", "Servico", 2));
        pilha.push(new Processo("C", "Servico", 3));

        System.out.println("Topo: " + pilha.peek());

        pilha.imprimir();

        System.out.println("Removendo: " + pilha.pop());

        pilha.imprimir();
    }
}
