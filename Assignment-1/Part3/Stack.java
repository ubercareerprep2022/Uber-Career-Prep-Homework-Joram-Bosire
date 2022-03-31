import java.util.*;

public class Stack<E>
{
    
    int size;
    List<E> stack;

    
    public Stack()
    {
        this.stack = new ArrayList<>();
        this.size = 0;
    }

    public void push(E elem){
        this.stack.add(0,elem);
        this.size++;
    }
    
    public E pop(){
        if(size == 0){
            return null;
        }
        
        E res = stack.get(0);
        stack.remove(0);
        size--;
        return res;
    }
    
    public E top(){
        if(this.size == 0){
            return null;
        }
        
        return stack.get(0);
    }
    
    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        
        return false;
    }
    
    public int size(){
        return this.size;
    }
    
    
}
