package Stack;

import LinkedList.*;

public class MyStack {
    private MyNode1 top;
    
    public void push (MyNode1 newData){
        if (this.top==null){
            this.top=newData;
        } else {
            newData.setNext(this.top);
            this.top=newData;
        }
    }

    public MyNode1 pop (){
        MyNode1 t=this.top;
        this.top=this.top.getNext();
        return t;
    }
    
    public MyNode1 getTop (){
        return this.top;
    }
}
