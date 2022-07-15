package com.nuvisoft.commerce.order.business;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuvisoft.commerce.order.data.domain.Order;


@RestController
@RequestMapping("/reports/")
public class OrderReportsController {
    
    @GetMapping("/allSales")
    public ResponseEntity<Order> getAllSalesReports(){

        return null;
    }

    @GetMapping("/salesFrom/{fromDate}")
    public ResponseEntity<Order> getFromDate(@PathVariable String fromDate) {
        return null;
    }
    
    @GetMapping("/salesByProductBarcode/{barcode}")
    public ResponseEntity<Order> getByProduct(@PathVariable String barcode){

        return null;
    }
}
