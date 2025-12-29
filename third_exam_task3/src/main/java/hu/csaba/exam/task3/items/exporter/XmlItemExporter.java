package hu.csaba.exam.task3.items.exporter;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import hu.csaba.exam.task3.items.model.Item;

import java.io.File;
import java.util.List;

public class XmlItemExporter implements ItemExporter {

    @Override
    public void export(List<Item> items) throws Exception {
        XmlMapper mapper = new XmlMapper();
        mapper.writeValue(new File("items.xml"), items);
    }
}