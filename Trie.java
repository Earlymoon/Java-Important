
public class Trie {
    class Node{
        Node[]node=new Node[26];
        boolean flag=false;
        Node get(char ch){
            return node[ch-'a'];
        }
        boolean constainsKey(char ch){
            return node[ch-'a']!=null;
        }

        void put(char ch,Node curr){
            node[ch-'a']=curr;
        }

        boolean isEnd(){
            return flag;
        }

        void setEnd(){
            flag=true;
        }

    }

    static Node root;

    public Trie(){
        root=new Node();
    }

    public void insert(String word){
        Node node=root;

        for(int i=0;i<word.length();i++){
            if(!node.constainsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
//          move to the next
            node=node.get(word.charAt(i));

        }
        node.setEnd();
    }

    public boolean search(String word){
        Node node=root;


        for(char ch:word.toCharArray()){
            if(!node.constainsKey(ch)){
                return false;
            }
            node=node.get(ch);
        }
        return node.isEnd();
    }

    public boolean isStartsWith(String word){
        Node node=root;
        for(char ch:word.toCharArray()){
            if(!node.constainsKey(ch)){
                return false;
            }
            node=node.get(ch);
        }
        return true;
    }


    public static void main(String[] args) {
        Trie trie=new Trie();
        System.out.println("Inserting words: chandra, chand, cp, chan");
        trie.insert("chandra");
        trie.insert("chand");
        trie.insert("cp");
        trie.insert("chan");

        System.out.println("Search is priya exists in the array ? "+(trie.search("priya")?"True":"False"));
        System.out.println("Search is chandra exists in the array ? "+(trie.search("chandra")?"True":"False"));
        System.out.println("If words start with cha exists in the array ? "+(trie.isStartsWith("cha")?"True":"False"));

    }

}
