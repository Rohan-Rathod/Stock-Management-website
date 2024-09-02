package com.example.stocks.service;

import com.example.stocks.model.Stock;
import java.util.List;
import java.util.Optional;

public interface StockService {
    List<Stock> getAllStocks();
    Optional<Stock> getStockById(Long id);
    void saveStock(Stock stock);
    void deleteStock(Long id);
}
