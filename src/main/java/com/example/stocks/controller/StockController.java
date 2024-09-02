package com.example.stocks.controller;

import com.example.stocks.model.Stock;
import com.example.stocks.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/stocks")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping
    public String listStocks(Model model) {
        model.addAttribute("stocks", stockService.getAllStocks());
        return "stock-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("stock", new Stock());
        return "add-stock";
    }

    @PostMapping("/add")
    public String addStock(@ModelAttribute Stock stock) {
        stockService.saveStock(stock);
        return "redirect:/stocks";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Stock stock = stockService.getStockById(id).orElseThrow(() -> new IllegalArgumentException("Invalid stock Id:" + id));
        model.addAttribute("stock", stock);
        return "update-stock";
    }

    @PostMapping("/update/{id}")
    public String updateStock(@PathVariable Long id, @ModelAttribute Stock stock) {
        stock.setId(id);
        stockService.saveStock(stock);
        return "redirect:/stocks";
    }

    @GetMapping("/delete/{id}")
    public String deleteStock(@PathVariable Long id) {
        stockService.deleteStock(id);
        return "redirect:/stocks";
    }
}
