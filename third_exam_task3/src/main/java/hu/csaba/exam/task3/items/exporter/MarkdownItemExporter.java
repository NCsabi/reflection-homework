package hu.csaba.exam.task3.items.exporter;

import hu.csaba.exam.task3.items.model.Item;

import java.io.FileWriter;
import java.util.List;

public class MarkdownItemExporter implements ItemExporter {

    @Override
    public void export(List<Item> items) throws Exception {
        try (FileWriter writer = new FileWriter("items.md")) {
            for (Item item : items) {
                writer.write("- Description: " + item.getDescription() + "\n");
                writer.write("- Price: " + item.getPrice() + "\n");
                writer.write("- Category: " + item.getCategory() + "\n\n");
            }
        }
        System.out.println("Ready");
    }
}