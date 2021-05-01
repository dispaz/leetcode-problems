package preparing.datastructures.hashtable;


public class HashMap {
    private static final int DEFAULT_TABLE_SIZE = 2;
    private int size = 0;
    private int maxSize = DEFAULT_TABLE_SIZE;
    private HashEntry[] table;

    public HashMap(){
        table = new HashEntry[DEFAULT_TABLE_SIZE];
        for(int i = 0; i < table.length; i++){
            table[i] = null;
        }
    }

    public int get(int key){
        int hash = key % table.length;
        HashEntry tmp = table[hash];
        while(tmp != null && tmp.getKey() != key){
            tmp = tmp.next;
        }
        if(tmp != null){
            return tmp.getValue();
        } else {
            return -1;
        }
    }

    public void put(int key, int value){
        int hash = key % table.length;
        HashEntry tmp = table[hash];

        if(tmp == null){
            table[hash] = new HashEntry(key, value);
            size++;
        } else {

            while (tmp.next != null && tmp.getKey() != key) {
                tmp = tmp.next;
            }
            if (tmp.getKey() == key) {
                tmp.setValue(value);
            } else if (tmp.next == null) {
                tmp.next = new HashEntry(key, value);
                size++;
            }
        }
        if(size >= maxSize){
            resize();
        }
    }

    public void remove(int key){
        int hash = (key % table.length);
        HashEntry tmp = table[hash];
        if(tmp == null){
            return;
        }
        HashEntry prev = null;
        while(tmp.next != null && tmp.getKey() != key){
            prev = tmp;
            tmp = tmp.next;
        }

        if(tmp.getKey() == key){
            if(prev == null)
                table[hash] = null;
            else
                prev.next = tmp.next;

            size = size > 0 ? size - 1 : size;
        }
    }

    public int size(){
        return size;
    }

    private void resize() {
        int tableSize = table.length * 2;
        maxSize = tableSize;
        HashEntry[] old = table;
        table = new HashEntry[tableSize];
        size = 0;
        for(int i = 0; i < old.length; i++){
            HashEntry tmp = old[i];
            while(tmp != null){
                put(tmp.getKey(), tmp.getValue());
                tmp = tmp.next;
            }
        }
    }

}

class HashEntry {
    private int key;
    private int value;
    public HashEntry next;
    public HashEntry(){

    }

    public HashEntry(int key, int value){
        this.key = key;
        this.value = value;
    }

    public int getKey(){
        return key;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
}
