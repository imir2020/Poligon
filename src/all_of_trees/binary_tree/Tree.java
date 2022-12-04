package all_of_trees.binary_tree;

import java.util.NavigableMap;

public class Tree {
    private Node root;//Единственное поле данных

    public Node find(int key) {                      //Поиск узла с заданным ключом(предполагается, что дерево не пустое)
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


    //Другие методы
    // Симметричный обход дерева
    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.println(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }

    //Удаление листового узла бинарного дерева
    // Удаление узла с заданным ключом, предполагается, что дерево не пусто
    public boolean delete(int key) {
        // Удаление узла без потомков
        Node current = root;
        Node parrent = root;
        boolean isLeftChild = true;

        while (current.iData != key) {
            parrent = current;
            if (key < current.iData) {                     //Двигаться налево?
                isLeftChild = true;
                current = current.leftChild;
            } else {                                       //Или направо?
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) return false;              //Узел не найден, конец цепочки
        }

        //Удаляемый узел найден
        //Если узел не имеет потомков, он просто удаляется
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) root = null;                      //Если узел является корневым,
                // - дерево полностью очищается

            else if (isLeftChild) parrent.leftChild = null;         //Узел отсоединяется от родителя
            else parrent.rightChild = null;
        }

        //Удаление узла с одним потомком
        //Если нет правого потомка, узел заменяется левым поддеревом
        else if (current.rightChild == null)
            if (current == root) root = current.leftChild;
            else if (isLeftChild) parrent.leftChild = current.leftChild; //Левый потомок родителя
            else parrent.rightChild = current.leftChild;                 //Правый потомок родителя

        //Если нет левого потомка, узел заменяется правым поддеревом
            else if(current.leftChild ==null)
                if (current ==null)root = current.rightChild;
                else if (isLeftChild)parrent.leftChild = current.rightChild;  // Левый потомок родителя
                else parrent.rightChild = current.rightChild;                 // Правый потомок родителя
        return isLeftChild;
    }


}