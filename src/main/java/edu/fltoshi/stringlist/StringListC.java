package edu.fltoshi.stringlist;


import java.lang.reflect.Array;
import java.util.List;

public class StringListC implements StringList {

    String[] stringArray = new String[100];

    @Override
    public String add(String list) {
        stringArray[0] = list;
        return list;
    }

    @Override
    public String add(int index, String item) {
        try {
            stringArray[0] = item;
            return item;
        } catch (Exception exception) {
            System.out.println("Выход за пределы массива.");
        }
        return item;
    }

    @Override
    public String set(int index, String item) {
        try {
            stringArray[0] = item;
            return item;
        } catch (Exception exception) {
            System.out.println("Индекс больше фактического количества элементов.");
        }
        return item;
    }

    @Override
    public String remove(String item) {
        try {
            stringArray[0] = item;
            return item;
        } catch (Exception exception) {
            System.out.println("Выбранный элемент отсутствует в списке.");
        }
        return item;
    }

    @Override
    public String remove(int index) {
        try {
//            stringArray[] = index;
//            return index;
        } catch (Exception exception) {
            System.out.println("Выбранный элемент отсутствует в списке.");
        }
        return null;
    }

    @Override
    public boolean contains(String item) {
        try {
            if (stringArray[0].contains(item)) {
                return true;
            } else return false;
        } catch (Exception exception) {
            System.out.println("ОТВАЛ!");
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        try {
            stringArray[0].indexOf(item);
        } catch (Exception exception) {
            System.out.println("ОТВАЛ");
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        try {
            stringArray[0].lastIndexOf(item);
        } catch (Exception exception) {
            System.out.println("ОТВАЛ!");
        }
        return -1;
    }

    @Override
    public String get(int index) {
        try {
            System.out.println(stringArray[index]);
        } catch (Exception exception) {
            System.out.println("ОТВАЛ");
        }
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        try {
            stringArray.equals(otherList);
        } catch (Exception exception) {
            System.out.println("ОТВАЛ");
        }
        return true;
    }

    @Override
    public int size() {
        return stringArray.length;
    }

    @Override
    public boolean isEmpty() {
        if (stringArray.length == 0) {
            return true;
        } else return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public String[] toArray() {
        return null;
    }
}
