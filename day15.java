public class day15 {
    static class InnerClass {
        void show() {
            System.out.println("Inside Static Inner Class");
        }
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass(); 
        obj.show();
    }
}
