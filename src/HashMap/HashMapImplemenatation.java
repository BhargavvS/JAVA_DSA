package HashMap;

import  java.util.*;

class HashMap<K,V>{
    private class Node{
        K key;
        V value;

        Node(){
            this.key = null;
            this.value = null;
        }

        Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }

    int n; // no of nodes
    int N; // size of the array or bucket
    @SuppressWarnings("unchecked")
    private LinkedList<Node>[] bucket;

    public HashMap(){
        int N = 4;
        bucket = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            this.bucket[i] = new LinkedList<>();
        }
    }

    private int HashFunction(K key) {
        int bucketIndex = key.hashCode();
        return Math.abs(bucketIndex) % N; // to get it in the 0 - N-1 range and positive value
    }

    private int searchInLL(K key, int bucketIndex) {
        return -1;
    }

    private void removeInLL(int dataIndex, int bucketIndex) {

    }


    public void put(K key, V value){
        int bucketIndex = HashFunction(key);
        int dataIndex = searchInLL(key,bucketIndex);

        if (dataIndex == -1){
            bucket[bucketIndex].add(new Node(key,value));
            n++;
        }
        else{
            Node data = bucket[bucketIndex].get(dataIndex);
            data.value = value;
        }

    }


    public boolean containsKey(K key){

        int bucketIndex = HashFunction(key);
        int dataIndex = searchInLL(key,bucketIndex);

        if (dataIndex == -1){
            return false;
        }

        return true;

    }

    public V get(K key){
        Node data = null;

        int bucketIndex = HashFunction(key);
        int dataIndex = searchInLL(key,bucketIndex);

        if (dataIndex == -1){
            System.out.println("Key doesnot exist");
            return null;
        }
        else{
            data = bucket[bucketIndex].get(dataIndex);
        }

        return data.value;
    }

    public void remove(K key){
        int bucketIndex = HashFunction(key);
        int dataIndex = searchInLL(key,bucketIndex);

        if (dataIndex == -1){
            System.out.println("Key doesnot exist");
            return;
        }
        else{
//            removeInLL(dataIndex,bucketIndex);
        }

    }


    public int size(){
        return bucket.length;
    }



}

public class HashMapImplemenatation {
    public static void main(String[] args) {

    }
}
