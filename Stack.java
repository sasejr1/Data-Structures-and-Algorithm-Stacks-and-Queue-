public class Stack {
    int size;
    int top;
    int[] array;

    Stack(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull(){
        return (top == size-1);
    }
    boolean isEmpty(){
        return (top == -1);
    }

    void push(int item){
        if (isFull()){
            System.out.println("stack overflow");
            
        }else{
            array[top + 1] = item;
            top++;
        }
        
    }

    int pop(){
        int previousTop = top;
        if (isEmpty()){
            System.out.println("stack underflow");
        } else {
            top--;
        }
        return array[previousTop];
    }

    void printStack(){
         if (isEmpty()) {
        System.out.println("Stack is empty");
    } else {
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    
    }
}
       
        public static void main(String[] args) {
            Stack stack = new Stack(5);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(76);
            stack.printStack(); 
    
    }
}
