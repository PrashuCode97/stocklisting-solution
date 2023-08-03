Tasks to be performed:

1. Create a Stock Entity class in Stocklisting/model/Stock.java with varibales
symbol, name, currency, exchange, mic_code, country, type as private strings

2. Create a service layer with below mentioned methods in service/StockListingService.java

   2a. Get stock by country name: 
    - Create a method `getStocksByCountry` 
    - Taking country name as parameter
    - Use RestTemplate to make third party api call: `https://api.twelvedata.com/stocks?country=" + country`
    - Return data in form of model/Data.java

    2b. Get stock by symbol: 
    - Create a method `getStockbySymbol` 
    - Taking symbol as parameter
    - Use RestTemplate to make third party api call: `https://api.twelvedata.com/time_series?symbol=" + symbol + "&interval=1min&apikey=0975893c35e04bc59419ad713796a678&outputsize=20` 
    - Return data in form of model/TimeSeries.java

    2c. Store wishlisted stock: 
    - Create a method `saveStock` 
    - Taking Stock.java details as parameter 
    - Store stock details into H2 database using stockRepo.save();

    2d. Get all wishlisted stock: 
    - Create a method `getAllStocks`
    - Use stockRepo.findAll(); to get all stock details
    - Return data in form of model/Stock.java

3. Create a controller layer with below mentioned menthods in controller/StockController.java
   
    3a. Get stocks by country name: 
    - Create a GET request `@GetMapping("/stocks/{country}")` 
    - Receive stock by receiving {country} name as PathVariable
    - Call `getStocksByCountry` method of service
    - Return data as ResponseEntity.

    3b. Get stock by symbol: 
    - Create a GET request `@GetMapping("/stocks/{symbol}/timeseries")` 
    - Receive {symbol} as PathVariable
    - Call `getStockbySymbol` method of service
    - Return data as ResponseEntity.

    3c. Post stock details: 
    - Create a POST request `@PostMapping("/stocks")` 
    - Receive stock details as RequestBody
    - Call `saveStock` method of service.
    - Return data as ResponseEntity 

    3d. Get all stock details:
    - Create a GET request `@GetMapping("/stocks")`
    - Call `getAllStocks` method of service.
    - Return data as ResponseEntity.

4. Document Controller, Service and Repository layer using copilot brushes
