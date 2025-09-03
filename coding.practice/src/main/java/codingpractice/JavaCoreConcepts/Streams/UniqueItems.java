package codingpractice.JavaCoreConcepts.Streams;

import codingpractice.JavaCoreConcepts.Streams.model.Item;
import codingpractice.JavaCoreConcepts.Streams.model.Order;

import java.util.List;

public class UniqueItems {
    public static void main(String[] args) {
        List<Order> orderList = List.of(
                new Order(List.of(new Item("Pen"), new Item("Pencil"))),
                new Order(List.of( new Item("Pen"), new Item("Eraser"))),
                new Order(List.of( new Item("Ruler"), new Item("Eraser")))
        );

        List<String> uniqueItems = orderList.stream()
                .flatMap(o -> o.getItems().stream())
                .map(Item::getName)
                .distinct()
                .toList();

        System.out.println("Unique items are : "+ uniqueItems);




    }
}
