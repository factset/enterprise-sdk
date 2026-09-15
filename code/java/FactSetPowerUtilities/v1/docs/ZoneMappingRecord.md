

# ZoneMappingRecord

Capacity auction zone reference record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationId** | **String** | ISO/TSO load distribution area or zone code, used as input to &#x60;POST /prices?category&#x3D;Capacity&#x60;. |  [optional]
**locationName** | **String** | Full zone name. |  [optional]
**isoCode** | **String** | ISO/TSO market code. |  [optional]
**priceUnits** | **String** | Unit of the clearing price for this zone. |  [optional]
**frequency** | **String** | Frequency at which capacity auctions are held for this zone. |  [optional]


## Implemented Interfaces

* Serializable


