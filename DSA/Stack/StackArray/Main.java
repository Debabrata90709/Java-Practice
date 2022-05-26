public class Main {
    public static void main(String args[]) {
        Stack newStack = new Stack(4);
        boolean result = newStack.isEmpty();
        boolean result1 = newStack.isFull();
        System.out.println(result);
        System.out.println(result1);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.push(6);
        newStack.push(7);
        int result3 = newStack.pop();
        System.out.println(result3);
        int result4 = newStack.peek();
        System.out.println(result4);
        newStack.deleteStack();
    }
}
