package com.stackroute.Stocklisting.controller;

import com.stackroute.Stocklisting.model.Data;
import com.stackroute.Stocklisting.model.Stock;
import com.stackroute.Stocklisting.model.TimeSeries;
import com.stackroute.Stocklisting.service.StockListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Mark as RestController
@RestController
// Mark cross origin
@CrossOrigin("*")
public class StockController {

    // Autowired StockListingService class
    @Autowired
    StockListingService stockListingService;
}
