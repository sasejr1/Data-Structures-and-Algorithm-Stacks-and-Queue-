public class Main1 {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(45);
        stack.push(13);
        stack.push(10);
        stack.push(13);
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
