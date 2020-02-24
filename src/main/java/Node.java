import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Node<T> {

    List<Node<T>> childList = new ArrayList();
    WeakReference<Node<T>> parent;
    public T item;

    public Node<T> getParent() {
        if (this.parent == null) {
            return null;
        } else {
            return this.parent.get();
        }


    }

    public void addChild(Node<T> node) {
        if (node != null || node != this) {
            node.parent = new WeakReference<>(this);
            childList.add(node);
        }
    }

    public void removechild(T item) {
        if (item != null) {
            for (int i = 0; i < getClildcount(); i++) {
                if (childList.get(i).item.equals(item)) {
                    childList.remove(childList.get(i));
                }
            }
        }
    }

    public void clearChildren() {
        childList.clear();
    }

    public int getClildcount() {
        int salida = childList.size();
        return salida;
    }

    public Node<T> getChilAtIndex(int index) {
        return (Node<T>) childList.get(index);
    }

    public void unlink() {
        Node<T> parent = this.parent.get();
        parent.childList.remove(this);
    }

    public Node<T> find(T item) {
        Node<T> salida = null;

        for (int i = 0; i < getClildcount(); i++) {
            if (childList.get(i).equals(item)) {
                salida = childList.get(i);
            }
        }
        return salida;
    }

    public void forEach(Iterator<Node<T>> it) {
        it.iterator(this);
        for (int i = 0; i < getClildcount(); i++) {
            Node<T> child = childList.get(i);
            child.childList.get(i).forEach(it);

        }
    }


    public int getAscendentCount() {
        int salida = 0;
        Node<T> node = this;


        while (node.parent != null) {

            node = node.getParent();

            salida++;

        }
        return salida;
    }

    public int getDescendentCount() {
        int salida = 0;

        for (int i = 0; i < getClildcount() ; i++) {
            Node hijoI = childList.get(1);

        }

        return salida;
    }

    public Node getroot() {
        Node salida = null;
        Node<T> node = this;

        while (node.parent != null) {

            node = node.getParent();

        }

        return node;
    }

}
