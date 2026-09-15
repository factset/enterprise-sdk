

# PowerPriceRecord

Spot power price record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**locationId** | **String** | Location identifier, as submitted in the request. | 
**locationName** | **String** | Full location name. |  [optional]
**isoCode** | **String** | ISO/TSO market code. |  [optional]
**category** | **CategoryPower** |  | 
**priceDate** | **LocalDate** | Trade or settlement date (YYYY-MM-DD). |  [optional]
**onPeakPriceMwh** | **Double** | On-peak spot power price in $/MWh. |  [optional]
**offPeakPriceMwh** | **Double** | Off-peak spot power price in $/MWh. |  [optional]
**aroundTheClockPriceMwh** | **Double** | Around-the-clock (flat) spot power price in $/MWh. |  [optional]


## Implemented Interfaces

* Serializable


