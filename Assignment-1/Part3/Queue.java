import java.util.*;

public class Queue<E>
{

    int size;
    List<E> queue;

 
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

