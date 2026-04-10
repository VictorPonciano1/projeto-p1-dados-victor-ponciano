public class CentralAtendimento {
    
    // PILHA PRINCIPAL - ATENDIMENTOS PENDENTES
    private PilhaProcesso pendentes;
    // PILHA AUXILIAR - HISTORICO PARA DESFAZER
    private PilhaProcesso historico;

    // CONSTRUTOR PARA INICIALIZAR AS VARIAVEIS
    public CentralAtendimento() {
        pendentes = new PilhaProcesso();
        historico = new PilhaProcesso();
    }

    // EMPILHA NA PRINCIPAL E LIMPA NA AUXILIAR
    public void abrirProcesso(Processo p) {
        pendentes.push(p);
        
        while (!historico.estaVazia()) {
            historico.pop();
        }
    }

    // DESEMPILHA DA PILHA PRINCIPAL E REGISTRA O PROCESSO ATENDIDO NA PILHA AUXILIAR
    public Processo atenderProximo() {
        Processo p = pendentes.pop();
        historico.push(p);
        return p;
    }

    // DESEMPILHA DA PILHA AUXILIAR E REEMPILHA NA PILHA PRINCIPAL
    public Processo desfazerUltimoAtendimento() {
        // FAZ A OPERACAO
        Processo p = historico.pop();
        pendentes.push(p);
        return p;
    }

    // EXIBE TODOS OS PROCESSOS AGUARDANDO O ATENDIMENTO
    public void listarPendentes() {
        System.out.println("=== PENDENTES ===");
        pendentes.imprimir();
    }

    // EXIBES TODOS OS PROCESSOS JA ATENDIDOS
    public void listarHistorico() {
        System.out.println("=== HISTORICO ===");
        historico.imprimir();
    }
}
