class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Bora adicionar os valores:");
        list.insertValue(10);
        list.insertValue(20);
        list.insertValue(29);
        list.insertValue(57);

        list.printList();
        System.out.println("Tamanho agora: " + list.getSize());

        System.out.println("\nTirando o 29 (que ta no meio):");
        list.deleteValue(29);
        list.printList();

        System.out.println("\nArrancando o 10 (primeiro da fila):");
        list.deleteValue(10);
        list.printList();

        System.out.println("\nRemovendo o 57 (ultimo):");
        list.deleteValue(57);
        list.printList();

        System.out.println("\nTamanho no fim das contas: " + list.getSize());
    }
}
