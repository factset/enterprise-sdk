

# CapacityPriceRecord

Capacity auction clearing price record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**locationId** | **String** | Location identifier, as submitted in the request. | 
**locationName** | **String** | Full location name. |  [optional]
**isoCode** | **String** | ISO/TSO market code. |  [optional]
**category** | **CategoryCapacity** |  | 
**mnemonic** | **String** | FactSet-assigned code for this price series. |  [optional]
**auctionType** | **String** | Type of capacity auction. |  [optional]
**auctionDate** | **LocalDate** | Date of the capacity auction. |  [optional]
**deliveryYear** | **Integer** | Capacity delivery year, derived from the price effective date. |  [optional]
**auctionPriceMw** | **Double** | Capacity auction clearing price in $/MW-day. |  [optional]


## Implemented Interfaces

* Serializable


