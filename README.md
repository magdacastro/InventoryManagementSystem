# Sistema de Gestão de Estoque

Este projeto implementa um sistema de gestão de estoque em Java, com foco na manipulação de produtos em estoque, considerando vendas, adição e remoção de itens.

## Descrição

A classe `StockProduct` é responsável por gerenciar a quantidade de produtos em estoque. Ela permite adicionar novas unidades ao estoque, remover unidades (vendas) e atualizar o total disponível.


### Regras de Negócio

- A quantidade de produtos vendidos (`qtdSold`) não pode ser maior do que o estoque disponível (`qtdInStock` + `qtdAddStock`).
- Ao adicionar ou remover produtos, o estoque é automaticamente atualizado para refletir as mudanças.
