package hu.csaba.exam.task3.items.exporter;

import hu.csaba.exam.task3.items.model.Item;

import java.util.List;

public interface ItemExporter {
    void export(List<Item> items) throws Exception;
}
