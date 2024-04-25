package be.intrcbrussel.Les2;

public class InsertMethodExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("walter, mike");
        str.insert(6,", edwin");
        System.out.println(str);
    }
}
