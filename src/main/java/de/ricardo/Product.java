package de.ricardo;

public record Product(
        String name,
        String brand,
        String type,
        double price,
        int id
) {
}
