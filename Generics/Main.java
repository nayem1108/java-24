package Generics;

import Generics.Impl.ContainerImpl;
import Generics.Impl.GenericContainerImpl;

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
        // we need to manual type casting generics help to solve this issue
        // String str1 = (String) box.getValue();
        // // System.out.println(str1);
        // System.out.println(str);

        // Generics Use
        // Box<Integer> box1 = new Box<>();

        // box1.setValue(10);
        // System.out.println(box1.getValue());

        // Box<String> boxstr = new Box<>();

        // boxstr.setValue("10");
        // System.out.println(boxstr.getValue());

        // Pair<String, String> pair = new Pair<>("Name", "Nayem");

        // System.out.println(pair.getKey());
        // System.out.println(pair.getValue());

        // generics Interface
        // Normal class implementation of genericinterface
        // ContainerImpl cImpl = new ContainerImpl();

        // cImpl.set(10);
        // System.out.println(cImpl.get());

        // Generic class implements generics Interface
        GenericContainerImpl<Integer> gContainerImpl = new GenericContainerImpl<>();

        gContainerImpl.set(100);
        System.out.println(gContainerImpl.get());

    }
}
