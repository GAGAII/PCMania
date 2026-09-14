# PCMania

Exercício prático da disciplina **C06 - Programação Orientada a Objetos**.

## Identificação

- **Aluno:** Gabriel Brandão
- **Curso:** Engenharia de Software
- **Matrícula:** 480

## Descrição

O projeto simula o sistema de compras da loja PC Mania. O usuário pode escolher entre três promoções de computadores pelo terminal e encerrar a compra digitando `0`. Ao final, o sistema mostra os dados do cliente, as configurações dos computadores adquiridos e o valor total da compra.

Os preços das promoções são definidos a partir da matrícula:

- Promoção 1 - Apple: R$ 480,00
- Promoção 2 - Samsung: R$ 481,00
- Promoção 3 - Dell: R$ 482,00

## Estrutura

```text
src/
├── Main.java
├── model/
│   ├── Cliente.java
│   ├── Computador.java
│   ├── HardwareBasico.java
│   ├── MemoriaUSB.java
│   └── SistemaOperacional.java
└── service/
    └── ProcessarPedido.java
```

## Como executar

A partir da raiz do projeto:

```bash
javac -d out src/model/*.java src/service/*.java src/Main.java
java -cp out Main
```

## Uso de Inteligência Artificial

Foi utilizada IA como apoio na elaboração da descrição do `README.md` e também na revisão do projeto.

**Modelo utilizado:** ChatGPT - GPT-5.6 Sol.

**Prompt informado para apoio na descrição do README:**

`Chat, preciso de ajuda com a descrição deste projeto de C06 (PDF) e para revisão final do código. Descreva para mim com Identificação, descrição, estrutura e se achar que tem algo a mais de interessante para acrescentar me diga.`


