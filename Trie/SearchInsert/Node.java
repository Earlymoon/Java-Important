package Trie.SearchInsert;

public class Node {
    Node node[]=new Node[26];

//    for checking if words compleete or not
    boolean flag=false;

    boolean containsKey(char ch){
        return node[ch-'a']!=null;
    }

    void put(char ch,Node node){
        this.node[ch-'a']=node;
    }

    Node get(char ch){
        return node[ch-'a'];
    }

    boolean isEnd(){
        return flag;
    }
    void setEnd(){
        flag=true;
    }

}
