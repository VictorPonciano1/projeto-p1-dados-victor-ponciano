/* CLASSE DA EXCECAO USADA PARA CASO A PILHA ESTEJA VAZIA */

public class PilhaVaziaException extends RuntimeException {
    
    public PilhaVaziaException() {
        super("Pilha Vazia!");
    }
}
