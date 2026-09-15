# factsetpowerutilities.PowerPriceRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**locationId** | **String** | Location identifier, as submitted in the request. | 
**locationName** | **String** | Full location name. | [optional] 
**isoCode** | **String** | ISO/TSO market code. | [optional] 
**category** | [**CategoryPower**](CategoryPower.md) |  | 
**priceDate** | **Date** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**onPeakPriceMwh** | **Number** | On-peak spot power price in $/MWh. | [optional] 
**offPeakPriceMwh** | **Number** | Off-peak spot power price in $/MWh. | [optional] 
**aroundTheClockPriceMwh** | **Number** | Around-the-clock (flat) spot power price in $/MWh. | [optional] 


