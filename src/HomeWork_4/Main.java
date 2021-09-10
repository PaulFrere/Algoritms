package HomeWork_4;

import java.util.Iterator;
import java.util.ListIterator;
import static junit.framework.Assert.assertEquals;

public class Main extends RuntimeException{
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("Maria");
        mll.insertFirst("Katya");
        mll.insertFirst("Luba");

//        for (int i = 0; i < 3; i++) {
//            System.out.println(mll.removeFirst());
//        }
//
//        mll.insertLast("Maria");
//        mll.insertLast("Katya");
//        mll.insertLast("Luba");
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(mll.removeLast());
//        }


//        System.out.println(mll.indexOf("Maria"));
//
//        System.out.println(mll);
//        mll.insert(2, "mmm");
//        System.out.println(mll);
//        System.out.println(mll.remove(2));
////        mll.remove("mmm");
//        System.out.println(mll);
//
//        for (String s : mll) {
//            System.out.println(s);
//        }

//        MyQueue<String> mq = new MyQueue<>();
//        mq.enqueue("qwe");
//        mq.enqueue("asd");
//        mq.enqueue("zxc");
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(mq.dequeue());
//        }


//        Iterator<String> it = mll.iterator();
//        while (it.hasNext()) {
//            String el = it.next();
//            if (el.equals("")) {
//                it.remove();
//            }
//        }
//        System.out.println(mll.iterator());

//        ListIterator<String> iterator = mll.listIterator();
//        try {
//            iterator.next();
//            iterator.add("Anna");
//        }catch (NullPointerException e){
//            System.out.println("NullPointerException");
//        }
        System.out.println(mll.iterator());

            MyLinkedList<Integer> stack = new MyLinkedList<>();
            stack.insertFirst(1);
            stack.insertFirst(2);
            assertEquals("2, 1", stack.toString());
            assertEquals(2, (int) stack.removeFirst());
            assertEquals("1", stack.toString());
        }
    }

