package Com.CodeGym.ss11_Stack_Queue.ThucHanh.ss1;

public class GenericStackClient {
    private static void stackOfIString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("six");
        stack.push("seven");
        stack.push("eight");
        System.out.println("1. size of stack" + stack.size());
        System.out.println("2. Pop element from stack");
        while (!stack.isEmpty()) {
            System.out.println( stack.pop());
        }
        System.out.println("3. Size of stack after pop " + stack.pop());
    }

    private static void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println("1. size of stack " + stack.size());
        System.out.println("2. pop element");
        while (!stack.isEmpty()) {
            System.out.println( stack.pop());
        }
        System.out.println("3. Size of stack " + stack.pop());
    }

    public static class GenericStackClients {
        public static void main(String[] args) {
            System.out.println("1. String");
            stackOfIString();
            System.out.println("2. Integer");
            stackOfInteger();
        }
    }
}
