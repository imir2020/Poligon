package all_of_trees.binary_tree;

public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();//Создание дерева
        //tree.root
        tree.insert(50, 1.5);//Вставка трёх узлов
        tree.insert(25, 1.7);
        tree.insert(75, 1.9);

        Node found = tree.find(25);//Поиск узла с ключом 25
        if (found!=null) {
            System.out.println("Found the node with key 25");
        } else
            System.out.println("Could not node with key 25");

    }
}
