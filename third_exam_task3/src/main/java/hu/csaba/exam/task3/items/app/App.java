package hu.csaba.exam.task3.items.app;

import hu.csaba.exam.task3.items.exporter.ItemExporter;
import hu.csaba.exam.task3.items.exporter.XmlItemExporter;
import hu.csaba.exam.task3.items.model.Item;
import hu.csaba.exam.task3.items.service.ItemService;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Item> items = List.of(
                Item.builder().title("Laptop").description("Fast and lightweight").price(1200).category("Electronics").build(),
                Item.builder().title("Chair").description("Comfortable office chair").price(150).category("Furniture").build(),
                Item.builder().title("Book").description("Interesting novel").price(20).category("Books").build()
        );
        ItemExporter exporter = new XmlItemExporter();
        ItemService service = new ItemService(exporter);
        service.exportItems(items);
        System.out.println("Export ready");
    }
}
