package Praktikum.Modul7;//package Modul7;
//
//public class Stack {
//    private Tree tree;
//    Node data;
//
//    public Stack(){
//        this.data = null;
//        tree = new Tree();
//    }
//
//    public void push(Node item){
//        if (item == null){
//            System.out.println("Data tidak boleh null");
//        } else {
//            tree.insert(item.id, item.data);
//        }
//    }
//
//    public Node pop(){
//        if (isEmpty()){
//            System.out.println("Stack Kosong");
//            return null;
//        }
//        Node node = tree.getRoot();
//        tree.delete(node.id);
//        return node;
//    }
//
//    public Node peek(){
//        if (isEmpty()){
//            System.out.println("Stack Kosong");
//            return null;
//        }
//        return tree.getRoot();
//    }
//
//    public boolean isEmpty(){
//        return tree.isEmpty();
//    }
//
////    public void display() {
////        if (isEmpty()) {
////            System.out.println("Stack kosong.");
////            return;
////        }
////        System.out.println("Stack (top --> bottom):");
////        linkedList.displayList();
////        System.out.println();
////    }
//}