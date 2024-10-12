package Generics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learn Generics");

        // Box box = new Box();

        // box.setValue(10);

        // this is not type safe now
        // int val = (Integer) box.getValue();
        // System.out.println(val);

        // box.setValue("box");

        // Not type safe
        // String str = box.getValue();

        // Type cast
        // String str1 = (String) box.getValue();
        // // System.out.println(str1);
        // System.out.println(str);

        // we need to manual type casting generics help to solve this issue
        Box<Integer> box1 = new Box<>();

        box1.setValue(10);
        System.out.println(box1.getValue());

        Box<String> boxstr = new Box<>();

        boxstr.setValue("10");
        System.out.println(boxstr.getValue());
    }
}
