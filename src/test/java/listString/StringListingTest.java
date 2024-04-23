package listString;

import edu.fltoshi.stringlist.listString.StringListing;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringListingTest {

    @Test
    @DisplayName("Создание нового массива строк.")
    public void createNewStringArray() {
        final StringListing[] trup = new StringListing[1];

        // Исключение на создание массива строк с ёмкостью 0 (ну и дела)
        assertThrows(IllegalArgumentException.class, () -> trup[0] = new StringListing(0));
    }

    @Test
    @DisplayName("Добавление элементов без индекса в массив.")
    public void addElementWithoutIndexIntoArray() {
        StringListing list = new StringListing(1);

        assertEquals("1", list.add("1"));

        assertThrows(IllegalArgumentException.class, () -> list.add(null)); // Проверка на пустоту добавляемого элемента
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.add("ъеъ")); // Проверка на заполненность массива
    }

    @Test
    @DisplayName("Добавление элементов с индексом в массив.")
    public void addElementWithIndexIntoArray() {
        StringListing list = new StringListing(1);

        assertEquals("1", list.add(0, "1"));

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.add(999, "!!!")); // Исключение на выход за пределы массива
    }

    @Test
    @DisplayName("Удаление элемента без индекса из массива.")
    public void removeElementWithoutIndexFromArray() {
        StringListing list = new StringListing(3);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals("1", list.remove("1"));
        assertFalse(list.contains("1"));

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(6));
    }

    @Test
    @DisplayName("Удаление элемента с индексом из массива.")
    public void removeElementWithIndexFromArray() {
        StringListing list = new StringListing(3);
        list.add(0, "1");
        list.add(1, "2");
        list.add(2, "3");

        assertEquals("1", list.remove(0));
        assertFalse(list.contains("1"));

        assertThrows(IllegalArgumentException.class, () -> list.remove(null)); // Проверка исключения на пустоту удаляемого элемента
        assertThrows(IllegalArgumentException.class, () -> list.remove("420")); // Проверка исключения на отсутствие удаляемого элемента
    }

    @Test
    @DisplayName("Поиск элемента с начала массива.")
    public void indexOf() {
        StringListing list = new StringListing(3);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals(1, list.indexOf("2"));
        assertEquals(-1, list.indexOf("4"));
    }

    @Test
    @DisplayName("Поиск элемента с конца массива.")
    public void lastIndexOf() {
        StringListing list = new StringListing(7);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("6");
        list.add("9");

        assertEquals(3, list.lastIndexOf("5"));
        assertEquals(-1, list.lastIndexOf("10"));
    }

    @Test
    @DisplayName("Получение элемента в массиве по его индексу.")
    public void getElementInArrayByIndex() {
        StringListing list = new StringListing(3);
        list.add(0, "1");
        list.add(1, "2");
        list.add(2, "3");

        assertEquals("3", list.get(2));
        // Исключение на получение элемента с индексом -999
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(-999));
    }

    @Test
    @DisplayName("Добавление элемента в массив на место уже существующего.")
    public void set() {
        StringListing list = new StringListing(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals("2", list.set(1, "5"));
        assertEquals("5", list.get(1));

        assertThrows(IllegalArgumentException.class, () -> list.set(0, null)); // Исключение на пустой элемент с индексом
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.set(999, "!!!")); // Исключение на выход за пределы массива
    }

    @Test
    @DisplayName("Удаление элемента из массива.")
    public void remove() {
        StringListing list = new StringListing(5);
        list.add(0, "1");
        list.add(1, "2");
        list.add(2, "3");

        assertEquals("3", list.remove("3"));
    }

    @Test
    @DisplayName("Проверка на равенство двух массивов по размеру.")
    public void isEquals() {
        StringListing list = new StringListing(3);
        StringListing list2 = new StringListing(3);

        list.add(0, "1");
        list.add(1, "2");
        list.add(2, "3");

        list2.add(0, "4");
        list2.add(1, "5");
        list2.add(1, "5");

        assertTrue(list.equals(list)); // Проверка на равенство двух списков
        assertThrows(IllegalArgumentException.class, () -> list.equals(null)); // Исключение на пустой сравниваемый список
    }

    @Test
    @DisplayName("Проверка на неравенство двух массивов по размеру.")
    public void notEquals() {
        StringListing list = new StringListing(3);
        StringListing list2 = new StringListing(3);
        list.add("1");

        list2.add("5");
        list2.add("2");

        assertFalse(list.equals(list2)); // Проверка на равенство двух списков
        assertTrue(list.equals(list2)); // Проверка на равенство двух списков
    }


    @Test
    @DisplayName("Проверка на существование элемента в массиве.")
    public void contains() {
        StringListing list = new StringListing(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertTrue(list.contains("3"));
    }

    @Test
    @DisplayName("Проверка на несуществование элемента в массиве")
    public void notContains() {
        StringListing list = new StringListing(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertFalse(list.contains("5"));
    }

    @Test
    @DisplayName("Проверка по размеру массива.")
    public void size() {
        StringListing list = new StringListing(5);
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals(3, list.size());
    }

    @Test
    @DisplayName("Проверка очищения массива.")
    public void clear() {
        StringListing list = new StringListing(5);
        list.add("1");
        list.add("2");
        list.add("3");

        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    @DisplayName("Проверка создания нового массива.")
    public void toArray() {
        StringListing list = new StringListing(5);
        list.add("0");
        list.add("1");
        list.add("2");

        list.toArray();
        assertEquals(list.size(), 3);
    }
}

// TODO: исправить в соответствии с подмеченными косяками.