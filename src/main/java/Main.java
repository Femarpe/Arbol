public class Main {
    public static void main(String[] args) {
        Node<String> nodo = new Node<>();
        Node<String> nodo1 = new Node<>();
        Node<String> nodo2 = new Node<>();
        Node<String> nodo3 = new Node<>();
        Node<String> nodo4 = new Node<>();
        Node<String> nodo5 = new Node<>();
        Node<String> nodo6 = new Node<>();
        Node<String> nodo7 = new Node<>();

        nodo1.item = "x";

        nodo.addChild(nodo1);
        nodo.addChild(nodo2);
        nodo2.addChild(nodo3);

        nodo3.getAscendentCount();
        System.out.println(nodo.getClildcount());
    }
}
