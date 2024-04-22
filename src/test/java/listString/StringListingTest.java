package listString;

import edu.fltoshi.stringlist.listString.StringListing;
import org.junit.jupiter.api.Test;

public class StringListingTest {


    // Добавление элемента
    @Test
    void justAdd() {
        StringListing testing = new StringListing(10);
        testing.add("AMD FX-9590");
    }

    // Добавление элемента по индексу
    @Test
    void indexAdd() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");
    }

    // Установка элемента на место существующего, с затиркой второго.
    @Test
    void set() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.set(3, "FX-4100");
    }

    // Удаление. Просто удаление.
    @Test
    void justRemove() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.remove("FX");
    }

    // Удаление по индексу
    @Test
    void indexRemove() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.remove(4);
    }

    // Проверка на существование
    @Test
    void contains() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.contains("Opteron");
    }

    // Поиск элемента
    @Test
    void indexOf() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.indexOf("ЧТО?");
    }

    // Поиск элемента с конца
    @Test
    void lastIndexOf() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.lastIndexOf("Athlon 64");
    }

    // Получение элемента по индексу
    @Test
    void get() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.get(0);
    }

    // Сравнение одного с другим
    @Test
    void equals() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");

        StringListing testing1 = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");

        testing.equals(testing1);
    }

    // Возвращение фактического количества элементов
    @Test
    void size() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.size();
    }

    // Проверка на пустоту
    @Test
    void isEmpty() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.isEmpty();
    }

    // Удаление ВСЕХ элементов
    @Test
    void clear() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.clear();
    }

    // Создание нового массива.
    @Test
    void toArray() {
        StringListing testing = new StringListing(10);
        testing.add(0, "Athlon");
        testing.add(1, "Phenom");
        testing.add(2, "Sempron");
        testing.add(3, "FX");
        testing.add(4, "Ryzen");
        testing.add(5, "Opteron");

        testing.toArray();
    }
}