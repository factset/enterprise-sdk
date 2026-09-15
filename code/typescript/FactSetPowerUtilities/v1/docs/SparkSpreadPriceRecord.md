# factsetpowerutilities.SparkSpreadPriceRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**locationId** | **String** | Location identifier, as submitted in the request. | 
**locationName** | **String** | Full location name. | [optional] 
**isoCode** | **String** | ISO/TSO market code. | [optional] 
**category** | [**CategorySparkSpread**](CategorySparkSpread.md) |  | 
**priceDate** | **Date** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**ngiLocName** | **String** | Corresponding natural gas delivery point name, as given by Natural Gas Intelligence. | [optional] 
**sparkSpreadType** | **String** | Spark spread type. | [optional] 
**sparkSpreadPricesMwh** | [**SparkSpreadPricesMwh**](SparkSpreadPricesMwh.md) |  | [optional] 



## Enum: SparkSpreadTypeEnum


* `Peak` (value: `"Peak"`)

* `OffPeak` (value: `"OffPeak"`)

* `Average` (value: `"Average"`)




