package hu.csaba.exam.task3.items.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item {
    private String title;
    private String description;
    private double price;
    private String category;
}