package de.ricardo;

import java.util.List;

public record Order(
        int id,
        List<Product> products,
        double totalPrice
) {
}
