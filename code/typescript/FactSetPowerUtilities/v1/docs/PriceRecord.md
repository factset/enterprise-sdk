# factsetpowerutilities.PriceRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**locationId** | **String** | Location identifier, as submitted in the request. | 
**locationName** | **String** | Full location name. | [optional] 
**isoCode** | **String** | ISO/TSO market code. | [optional] 
**category** | [**CategoryForward**](CategoryForward.md) |  | 
**priceDate** | **Date** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**onPeakPriceMwh** | **Number** | On-peak spot power price in $/MWh. | [optional] 
**offPeakPriceMwh** | **Number** | Off-peak spot power price in $/MWh. | [optional] 
**aroundTheClockPriceMwh** | **Number** | Around-the-clock (flat) spot power price in $/MWh. | [optional] 
**ngiLocName** | **String** | Corresponding natural gas delivery point name, as given by Natural Gas Intelligence. | [optional] 
**sparkSpreadType** | **String** | Spark spread type. | [optional] 
**sparkSpreadPricesMwh** | [**SparkSpreadPricesMwh**](SparkSpreadPricesMwh.md) |  | [optional] 
**mnemonic** | **String** | FactSet-assigned code for this price series. | [optional] 
**auctionType** | **String** | Type of capacity auction. | [optional] 
**auctionDate** | **Date** | Date of the capacity auction. | [optional] 
**deliveryYear** | **Number** | Delivery year, derived from the delivery start date. | [optional] 
**auctionPriceMw** | **Number** | Capacity auction clearing price in $/MW-day. | [optional] 
**deliveryMonth** | **Number** | Delivery month (1–12), derived from the delivery start date. | [optional] 
**interconnection** | **String** | Higher-level US power market region the location belongs to. | [optional] 
**periodType** | **String** | Term type of the forward delivery period. | [optional] 
**priceType** | **String** | Forward price type. | [optional] 
**avgForwardPriceMwh** | **Number** | Forward price in $/MWh, reported as a rolling 3-day average. | [optional] 



## Enum: SparkSpreadTypeEnum


* `Peak` (value: `"Peak"`)

* `OffPeak` (value: `"OffPeak"`)

* `Average` (value: `"Average"`)





## Enum: PriceTypeEnum


* `OnPeak` (value: `"OnPeak"`)

* `OffPeak` (value: `"OffPeak"`)

* `AroundTheClock` (value: `"AroundTheClock"`)




