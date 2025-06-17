/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    stack.push(20);
	    stack.push(10);
	    stack.push(40);
	    stack.push(30);
	    stack.push(50);
	    stack.push(20);
	    stack.pop();
	    stack.print();
	    
	    
		System.out.println("the peak value is "+stack.peak);
	}
}
class stack{
    int [] stack;
    
    int size;
    int top;
    stack(int size){
        this.size=size;
        this.stack=new int[size];
        this.top=-1;
    }
    boolean isFull(){
        if(top==size-1){
            System.err.println("stack is full");
            return true;
        }else{
            return false;
        }
    }
    boolean isEmpty(){
        if(top==-1){
            System.out.println("stack is empty");
            return true;
            
            
        }else{
            return false;
        }
        
    }
    void push(int value){
        if(Isfull()){
            return true;
        }else{
            top=top-1;
            stack[top]=value;
        }
    }
    int pop(){
        if(IsEmpty()){
            return -1;
            }
            int value=stack[top];
            top=top-1;
            return val;
    }
    return stack[top];
    
}
void print(){
    for (int i=top; i>=0; i--){
        System.out.println("|"+stack[i]+"|");
    }
}