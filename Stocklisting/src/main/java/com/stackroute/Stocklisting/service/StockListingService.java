package com.stackroute.Stocklisting.service;

import com.stackroute.Stocklisting.model.Data;
import com.stackroute.Stocklisting.model.Stock;
import com.stackroute.Stocklisting.model.TimeSeries;
import com.stackroute.Stocklisting.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

// Mark class as service
@Service
public class StockListingService {

    // Spring Autowired StockRepo Interface
    @Autowired
    StockRepo stockRepo;
}
