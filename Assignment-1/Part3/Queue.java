import java.util.*;
/**
 * Write a description of class Queue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Queue<E>
{
    // instance variables - replace the example below with your own
    int size;
    List<E> queue;

    /**
     * Constructor for objects of class Queue
     */
    public Queue()
    {
        this.queue = new ArrayList<>();
        this.size = 0;
    }

    public void enqueue(E elem){
        queue.add(0,elem);
        size++;
    }
    
    public E dequeue(){
        if(size == 0){
            return null;
        }
        
        E res = queue.get(size - 1);
        queue.remove(size - 1);
        size--;
        return res;
    }
    
    public E rear(){
        if(this.size == 0){
            return null;
        }
        
        return queue.get(0);
    }
    
    public E front(){
        if(this.size == 0){
            return null;
        }
        
        return queue.get(size - 1);
    }
    
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        
        return false;
    }
    
    public int size(){
        return size;
    }
    
    
}

