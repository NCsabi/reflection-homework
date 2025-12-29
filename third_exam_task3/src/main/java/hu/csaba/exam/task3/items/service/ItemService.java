package hu.csaba.exam.task3.items.service;

import hu.csaba.exam.task3.items.exporter.ItemExporter;
import hu.csaba.exam.task3.items.model.Item;

import java.util.List;

public class ItemService {

    private final ItemExporter exporter;

    public ItemService(ItemExporter exporter) {
        this.exporter = exporter;
    }

    public void exportItems(List<Item> items) throws Exception {
        exporter.export(items);
    }
}