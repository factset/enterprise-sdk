

# PriceRecordBase

Fields common to every power market price record. Record shape matches the requested `category` — see `PowerPriceRecord`, `SparkSpreadPriceRecord`, `CapacityPriceRecord`, and `ForwardPriceRecord` for the category-specific fields layered on top via `allOf`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**locationId** | **String** | Location identifier, as submitted in the request. | 
**locationName** | **String** | Full location name. |  [optional]
**isoCode** | **String** | ISO/TSO market code. |  [optional]


## Implemented Interfaces

* Serializable


