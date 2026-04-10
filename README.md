# PROJETO P1

> Autor: Victor Ponciano - https://github.com/VictorPonciano1

> Professora: Andréia Machion

Projeto realizado para estudo e complemento de nota da P1 (Primeira Avaliação) da disciplina de Estrutura de Dados da Fatec Carapicuiba do Curso de Análise e Desenvolvimento de Sistemas.

Este documento tem o proprósito de orientar, guiar e demonstrar todo o projeto desenvolvido.

## DESENVOLVIMENTO

O desenvolvimento do projeto foi dividio em etapas, onde cada etapa possuiu *"commits"* para indicar o avanço do projeto.

As etapas foram 3:
1. **Etapa 1 - Fundamentos da OO e Vetor Dinâmico**
2. **Etapa 2 - Pilha e Pilha com Desfazer**
3. **Etapa 3 - Pilha de Prioridade**

As etapas e o projeto utilizaram como referência códigos realizados em aula que foram retrabalhados para um melhor aproveitamento e adequação com o que cada etapa propunha.

### ETAPA 1

Esta etapa conteve o desenvolvimento dos códigos:
- Processo.java
- VetorDinamico.java

Códigos da aula usados como referência: `NossoVetor.Java`, `TesteNossoVetor.java` e `Carta.java`.

A Etapa pedia o teste: "Crie um programa de teste que demonstre: inserção em massa até forçar ao menos dois redimensionamentos crescentes; remoção em massa até forçar ao menos um redimensionamento decrescente; impressão da capacidade atual do array a cada operação."

Seguem os logs dos testes realizados:

Inserção forçada até ao menos dois redimensionamentos.
![Log Adiciona Etapa 1](Fotos-Templates/LogAdiciona-Etapa1.png)


Remoção em massa até forçar ao menos um redimensionamento descrescente.
![Log Remove Etapa 1](Fotos-Templates/LogRemove-Etapa1.png)

> Nota: caso haja curiosidade de saber o motivo de o terminal estar estilizado, utilizo o tema "Oh My Posh" no Windows Terminal.

### ETAPA 2

Esta Etapa conteve o desenvolvimento dos códigos:
- PilhaProcesso.java
- TestePilhaProcesso.java
- CentralAtendimento.java
- PilhaVaziaException.java
- TesteEtapa2.java

Cada código possui sua importância e foi desenvolvido conforme requisitado no PDF de explicação do projeto.

Códigos da aula usados como referência: `PilhaCartas.java`, `Pilha.java`, `TestePilha.java` e `TestePilhaCarta.java`.

A Etapa 2 pedia o teste: "Crie um menu de console que permita testar todas as operações de forma interativa, incluindo cenários de erro (tentar atender com pilha vazia, tentar desfazer sem histórico)".

Seguem os resultados do teste.

`PilhaVaziaException.java` - Para um entendimento da mensagem que aparece.
```
public class PilhaVaziaException extends RuntimeException {
    
    public PilhaVaziaException() {
        super("Pilha Vazia!");
    }
}
```

Seguem prints do log:

![Teste 1 Etapa 2](Fotos-Templates/Teste1-Etapa2.png)

![Teste 2 Etapa 2](Fotos-Templates/Teste2-Etapa2.png)

![Teste 3 Etapa 2](Fotos-Templates/Teste3-Etapa2.png)

![Teste 4 Etapa 2](Fotos-Templates/Teste4-Etapa2.png)

![Teste 5 Etapa 2](Fotos-Templates/Teste5-Etapa2.png)

![Teste 6 Etapa 2](Fotos-Templates/Teste6-Etapa2.png)

![Teste 7 Etapa 2](Fotos-Templates/Teste7-Etapa2.png)

### ETAPA 3

A ser realizado
