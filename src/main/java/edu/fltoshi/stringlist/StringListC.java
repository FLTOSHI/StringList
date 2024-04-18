package edu.fltoshi.stringlist;

public class StringListC implements StringList {

    String[] stringArray = new String[2];

    @Override
    public String add(String list) {
        stringArray[0] = list;
        return list;
    }

    // Добавление элемента на определенную позицию списка.
    // Если выходит за пределы фактического количества элементов или массива, выбросить исключение.
    // Вернуть добавленный элемент в качестве результата выполнения.

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

    // Установить элемент на определенную позицию, затерев существующий.
    // Выбросить исключение, если индекс больше фактического количества элементов,
    // или выходит за пределы массива.
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

    // Удаление элемента. Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
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

    // Удаление элемента по индексу. Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    @Override
    public String remove(int index) {
        return null;
    }

    // Проверка на существование элемента. Вернуть true/false;
    @Override
    public boolean contains(String item) {
        if (stringArray[0].contains(item)) {
            return true;
        } else return false;
    }

    // Поиск элемента. Вернуть индекс элемента или -1 в случае отсутствия.
    @Override
    public int indexOf(String item) {
        stringArray[0].indexOf(item);
        return 0;
    }

    // Поиск элемента с конца. Вернуть индекс элемента, -1 в случае отсутствия.
    @Override
    public int lastIndexOf(String item) {
        try {
            stringArray[0].lastIndexOf(item);
        } catch (Exception exception) {
            System.out.println("ОТВАЛ!");
        }
        return -1;
    }

    // Получить элемент по индексу. Вернуть элемент или исключение, если выходит за рамки фактического количества элементов.
    @Override
    public String get(int index) {
        try {
            System.out.println(stringArray[index]);
        } catch (Exception exception) {
            System.out.println("ОТВАЛ");
        }
        return null;
    }

    // Сравнить текущий список с другим. Вернуть true/false или исключение, если передан null.
    @Override
    public boolean equals(StringList otherList) {
        try {
            stringArray.equals(otherList);
        } catch (Exception exception) {
            System.out.println("ОТВАЛ");
        }
        return true;
    }

    // Вернуть фактическое количество элементов.
    @Override
    public int size() {
        return stringArray.length;
    }


    // Вернуть true, если элементов в списке нет, иначе вернуть false.
    @Override
    public boolean isEmpty() {
        if (stringArray.length == 0) {
            return true;
        } else return false;
    }

    // Удалить все элементы из списка.
    @Override
    public void clear() {
    }

    // Создать новый массив из строк в списке и вернуть его.
    @Override
    public String[] toArray() {
        return null;
    }
}
