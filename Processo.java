public class Processo {

    /* ATRIBUTOS */

    private int protocolo; // NUMERO UNICO DO PROCESSO - AUTOMATICO E SEQUENCIAL

    // ATRIBUTO ESTATICO CONTADOR
    private static int contador = 001;

    private String solicitante; // NOME DE QUEM ABRIU O PROCESSO
    private String tipoServico; // DESCRICAO DE TIPO DE ATENDIMENTO
    private int prioridade; // VALOR INTEIRO: 1 = BAIXA ; 2 = NORMAL ; 3 = URGENTE
    private String dataHora; // DATA E HORA DA ABERTURA - FORMATO: dd/MM/yyyy HH:mm

    public Processo (String solicitante, String tipoServico, int prioridade) {
        protocolo = contador++;
        this.solicitante = solicitante;
        this.tipoServico = tipoServico;
        this.prioridade = prioridade;
    }

    /* GETTERS E SETTERS */
    
    // PROTOCOLO
    public int getProtocolo() {
        return protocolo;
    }

    // SOLICITANTE
    public String getSolicitante() {
        return solicitante;
    }
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    // TIPO DE SERVICO (CATEGORIA)
    public String getTipoServico () {
        return tipoServico;
    }
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    // PRIORIDADE (URGENCIA)
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    // DATA E HORA
    public String getDataHora() {
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    /* METODO TOSTRING */

    @Override
    public String toString() {
        return "[#" + protocolo + "] " + solicitante + " | " + tipoServico + " | " + prioridade + " | " + dataHora;
    }

    /* METODO EQUALS */

    // public boolean equals() {}

}