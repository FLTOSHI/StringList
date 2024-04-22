package listString;

import edu.fltoshi.stringlist.listString.StringListing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringListingTest {
    @Test
    @DisplayName("Добавление элемента без индекса в массив.")
    void addingItemIntoArrayWithoutIndex() {
        StringListing test = new StringListing(1);
        test.add("ъуъ");
        Assertions.assertEquals(1, 1);
    }

    @Test
    @DisplayName("Добавление элемента с индексом в массив.")
    void addingItemIntoArrayWithIndex() {
    }

    @Test
    @DisplayName("Установка элемента на позицию существующего, с удалением оного.")
    void setItemOnHeldPosition() {
    }

    @Test
    @DisplayName("Удаление элемента без индекса из массива.")
    void removingAnElementWithoutIndex () {
    }

    @Test
    @DisplayName("Удаление элемента с индексом из массива.")
    void removingAnElementWithIndex () {
    }

    @Test
    @DisplayName("Проверка элемента на существование.")
    void isElementExist() {
    }

    @Test
    @DisplayName("Поиск элемента с начала массива.")
    void elementSearchFromFirst (){
    }

    @Test
    @DisplayName("Поиск элемента с конца массива.")
    void elementSearchFromEnd () {
    }

    @Test
    @DisplayName("Получение элемента в массиве по индексу.")
    void getElementWithIndex () {
    }

    @Test
    @DisplayName("Сравнение одного массива с другим массивом.")
    void isOneArrayEqualsWithAnotherArray () {
    }

    @Test
    @DisplayName("Проверка фактического числа элементов в массиве.")
    void howMuchElementsInTheArray () {
    }

    @Test
    @DisplayName("Проверка на пустоту массива.")
    void isArrayIsEmpty (){
    }

    @Test
    @DisplayName("Удаление всех элементов из массива.")
    void clearAllElementsFromArray () {
    }

    @Test
    @DisplayName("Создание нового массива.")
    void createANewArray () {
    }
}