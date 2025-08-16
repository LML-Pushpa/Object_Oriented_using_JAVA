package Stack;

import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        //Lifo
        Stack<Integer> stk =new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        for(int i=stk.size()-1;i>=0;i--){
            System.out.println(stk.get(i));
        }
        stk.pop();
        for(int i=stk.size()-1;i>0;i--){
            System.out.println(stk.get(i));
        }
        System.out.println("Peek : s"+stk.peek());

    }

}
