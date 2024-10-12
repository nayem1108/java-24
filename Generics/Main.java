package Generics;

import Generics.Impl.ContainerImpl;
import Generics.Impl.GenericContainerImpl;
import Generics.Impl.GenericPairImpl;
import Generics.Impl.PairImpl;

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
        // GenericContainerImpl<Integer> gContainerImpl = new GenericContainerImpl<>();

        // gContainerImpl.set(100);
        // System.out.println(gContainerImpl.get());

        // Pair Class implements generics
        // PairImpl pairImpl = new PairImpl();
        // pairImpl.set("Age", 10);
        // System.out.println(pairImpl.getKey());
        // pairImpl.get();
        // System.out.println(pairImpl.getValue());

        // Generic Pair Class Implements Generic Interface
        GenericPairImpl<String, String> genericPairImpl = new GenericPairImpl<>();

        genericPairImpl.get();

        genericPairImpl.set("Name", "Nayem");
        genericPairImpl.get();
        genericPairImpl.set("Age", "30");
        genericPairImpl.get();
        genericPairImpl.set("Title", "Java Developer");
        genericPairImpl.get();

    }
}
