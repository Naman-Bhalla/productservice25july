package com.scaler.productservice25july.services.filteringService;

public class FilterFactory {

    public static Filter getFilterFromKey(String key) {
        return switch (key) {
            case "ram" -> new RAMFilter();
            case "brand" -> new BrandFilter();
            case null, default -> null;
        };
    }
}
