# lista-duplamente-encadeada

Nome completo: André Luiz Fontana Duarte

 Sobre o projeto
Trabalho da matéria de Estrutura de Dados pra implementar uma Lista Duplamente Encadeada do zero em Java. A regra da atividade era não usar as coleções prontas do Java (tipo ArrayList ou LinkedList), então a construção foi toda feita na raça.

Estrutura do código
O projeto foi dividido em duas classes:
- Node: É o nó da lista. Guarda o valor inteiro e os ponteiros pro próximo elemento (`next`) e pro anterior (`previous`).
- DoublyLinkedList: É a classe principal que controla a lista, guardando o primeiro (`begin`) e o último (`end`) elemento. Os métodos de inserir e deletar cuidam de atualizar os ponteiros dependendo se o valor tá no começo, no meio ou no fim, pra não dar ruim nas referências.


Exemplo de uso
Aqui um exemplo básico de como usar a lista no código principal:

```java
DoublyLinkedList list = new DoublyLinkedList();

// Adicionando alguns números na lista
list.insertValue(10);
list.insertValue(20);
list.insertValue(30);

// Mostrando no console (Resultado: 10 <~> 20 <~> 30)
list.printList(); 

// Tirando o 20 do meio da lista
list.deleteValue(20);

// Mostrando como ficou depois de remover (Resultado: 10 <~> 30)
list.printList();
