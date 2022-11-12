package all_of_trees.binary_tree;

import java.util.NavigableMap;

public class Tree {
    private Node root;//Единственное поле данных

    public Node find(int key) {                      //Поиск узла с заданным ключом(предполагается, что дерево не пустое)
        // if(root == null)root = new Node();
        Node current = root;                        //Начать с корневого узла
        while (current.iData != key) {              //Пока не найдено совпадение
            if (key < current.iData)
                current = current.leftChild;        //Двигаться налево?
            else current = current.rightChild;       //Или направо?
            if (current == null) return null;       //Если потомка нет, поиск завершился неудачей
        }
        return current;                             //Элемент найден

    }

    public void insert(int id, double dd) {
        //Node newNode = (root == null) ? new Node() : root;
        Node newNode = new Node();                               //Создание нового узла
        newNode.iData = id;                                      //Вставка данных
        newNode.fData = dd;

        if (root == null) root = newNode;                        //Корневой узел не существует
        else {  // --------------------------------------------  Корневой узел занят
            Node current = root;                                //Начать с корневого узла
            Node parent;
            while (true) {                                      //Внутренний выход из цикла
                parent = current;
                if (id < current.iData) {                       //Двигаться налево
                    current = current.leftChild;
                    if (current == null) {//
                        parent.leftChild = newNode;             //Если достигнут конец цепочки - вставить слева
                        return;
                    }
                } else { // -----------------------------------//Или направо
                    current = current.rightChild;
                    if (current == null) {                     //Если достигнут конец цепочки, вставить слева
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void delete(int id) {

    }
    //Другие методы

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.println(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }
    //Конец класса Tree
}
