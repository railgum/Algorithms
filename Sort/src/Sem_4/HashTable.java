package Sem_4;

public class HashTable<K, V> {
    private static final int DEFAULT_SIZE = 4;
    private static final double LOAD_FACTOR = 0.75;
    private int size;
    private Bucket[] buckets;
    public HashTable(int _size) {
        if(_size < DEFAULT_SIZE){

        }
    }
    private class Bucket{
        Node root;
        public boolean add(Entity entity){
            Node newNode = new Node();
            newNode.entity = entity;
            if(root == null) {
                root = newNode;
                return true;
            }
            Node currentNode = root;
            while (currentNode != null){
                if(currentNode.entity.equals(entity))
                    return false;
                if (currentNode.next == null){
                    currentNode.next = newNode;
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }
        public boolean add(K key, V value){
            Entity entity = new Entity(key, value);
            return this.add(entity);
        }
        public V get(K key) {
            Node currentNode = root;
            while (currentNode !=null){
                if (currentNode.entity.key.equals(key))
                    return currentNode.entity.value;
                else
                    currentNode = currentNode.next;
            }
            return null;
        }
        public boolean delete(K key){
            if (root == null)
                return false;
            if (root.entity.key.equals(key)){
                root = root.next;
                return true;
            }
            Node currentNode = root;
            while (currentNode.next !=null){
                if (currentNode.next.entity.key.equals(key)){
                    currentNode.next = currentNode.next.next;
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }
        public boolean set(K key, V value){
            Node currentNode = root;
            while (currentNode != null){
                if (currentNode.entity.key.equals(key)){
                    currentNode.entity.value = value;
                    return true;
                } else
                    currentNode = currentNode.next;
            }
            return false;
        }
    }
    private class Node {
        Entity entity;
        Node next;
    }
    private class Entity {
        K key;
        V value;
        public Entity() { }
        public Entity(K _key, V _value){
            this.key = _key;
            this.value = _value;
        }
    }
}
