package Trie.SearchInsert;

public class Trie {
    private Node root;

     Trie(){
        root=new Node();
    }

    void insert(String word){
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();

    }
    boolean search(String word){
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i)))return false;
            node=node.get(word.charAt(i));
        }
        return node.isEnd();
    }

    boolean startsWith(String word){
         Node node=root;
         for(int i=0;i<word.length();i++){
             if(!node.containsKey(word.charAt(i)))return false;
             node=node.get(word.charAt(i));
         }
         return true;
    }


    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("apple");
        trie.insert("appl");
        trie.insert("appx");

        if(trie.search("apple")){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

        if(trie.search("app")){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }


        if(trie.startsWith("ch")){
            System.out.println("app starts with is found");
        }else{
            System.out.println("not found");
        }
    }
}
