package com.nuvissoft.commerce.creditsservice.api;

import java.util.List;

import com.nuvissoft.commerce.creditsservice.data.domain.Credit;
import com.nuvissoft.commerce.creditsservice.services.CreditService;
import com.nuvissoft.commerce.creditsservice.services.KafkaProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/credits/")
@RestController
public class CreditController {

    @Autowired
    CreditService service;
    @Autowired
    KafkaProducerService producerService;

    @GetMapping("/all")
    public ResponseEntity<List<Credit>> getAll() {

        return new ResponseEntity<List<Credit>>(
                service.readAll(),
                HttpStatus.OK);
    }

    @GetMapping("/{dni}")
    public ResponseEntity<Credit> getByDni(@PathVariable String dni) {
        System.out.println("Inside");
        return new ResponseEntity<Credit>(
                service.readByDni(dni),
                HttpStatus.OK);
    }

    @PutMapping("/edit")
    public String editCredit(@RequestBody Credit toUpdatCredit) {
        String message = "Hello Fulanito, your credit was saved done." + "your id is: "
                + toUpdatCredit.getId().toString();
                
        producerService.sendMessage(message);
        return message;
    }

    @PostMapping("/add")
    public String addNewCredit(@RequestBody Credit toAddNewCredit) {
        Credit addedCredit = service.save(toAddNewCredit);

        // producerService.sendMessage("Credit was saved!");

        return (addedCredit != null) ? new StringBuilder(addedCredit.getDni())
                .append("'s credit was added done!")
                .toString()
                : "Not saved";
    }

}
