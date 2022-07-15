package com.nuvisoft.commerce.order.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nuvisoft.commerce.order.data.domain.Order;
import com.nuvisoft.commerce.order.service.OrderService;


@RequestMapping("/api/orders")
@RestController
@CrossOrigin
public class OrderController {
    
    @Autowired OrderService service;


    @GetMapping("/all")
    public List<Order> getAll() {

        return service.getAll();
    }

    @GetMapping("/find-dni/{dni}")
    public ResponseEntity<Order> getByDni(@PathVariable String dni) {
       return null;
    }

    @GetMapping("/findByDate/{date}")
    public ResponseEntity<List<Order>> getByDate(@PathVariable String date){
        return ResponseEntity.ok(this.service.findByDate(date));
    }

    @PutMapping("/edit")
    public String editOrder(@RequestBody Order toUpdatOrder) {
        return null;
    }

    @PostMapping("/add")
    public ResponseEntity<Order> addN5ewOrder(@RequestBody Order toAddNewOrder) {
        Order savedOrder = service.save(toAddNewOrder);
    
        return ResponseEntity.ok().body(savedOrder);
    }

    @DeleteMapping("/remove-dni/{dni}")
    public String removeOrder (@PathVariable String dni){
        return null;
    }
}
