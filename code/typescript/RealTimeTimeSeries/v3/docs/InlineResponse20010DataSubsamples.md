# realtimetimeseries.InlineResponse20010DataSubsamples

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **String** | Date and time of the start of the subsample. | [optional] 
**first** | **Number** | First price of the subsample. | [optional] 
**last** | **Number** | Last price of the subsample. | [optional] 
**low** | **Number** | Lowest price of the subsample. | [optional] 
**high** | **Number** | Highest price of the subsample. | [optional] 
**tradingVolume** | **Number** | Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. | [optional] 
**tradingValue** | **Number** | Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit. | [optional] 


