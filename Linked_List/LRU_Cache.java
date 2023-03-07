package Linked_List;

import java.util.HashMap;

public class LRU_Cache {

    public class Node {

        int key, value;
        Node prev = null, next = null;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    class LRUCache {

        Node head;
        Node tail;
        HashMap<Integer, Node> map = null;
        int cap = 0;

        public LRUCache(int capacity) {
            this.cap = capacity;
            this.map = new HashMap<>();
        }

        public int get(int key) {
            if (map.get(key) == null) {
                return -1;
            }

            //move to tail
            Node t = map.get(key);

            remove(t);
            insert(t);

            return t.value;
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                Node t = map.get(key);
                t.value = value;

                //move to tail
                remove(t);
                insert(t);
            } else {
                if (map.size() >= cap) {
                    //delete head
                    map.remove(head.key);
                    remove(head);
                }

                //add to tail
                Node node = new Node(key, value);
                insert(node);
                map.put(key, node);
            }
        }

        private void remove(Node n) {
            if (n.prev != null) {
                n.prev.next = n.next;
            } else {
                head = n.next;
            }

            if (n.next != null) {
                n.next.prev = n.prev;
            } else {
                tail = n.prev;
            }
        }

        private void insert(Node n) {
            if (tail != null) {
                tail.next = n;
            }

            n.prev = tail;
            n.next = null;
            tail = n;

            if (head == null) {
                head = tail;
            }
        }
    }
}
