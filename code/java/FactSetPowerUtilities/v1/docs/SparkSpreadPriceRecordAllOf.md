

# SparkSpreadPriceRecordAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **CategorySparkSpread** |  | 
**priceDate** | **LocalDate** | Trade or settlement date (YYYY-MM-DD). |  [optional]
**ngiLocName** | **String** | Corresponding natural gas delivery point name, as given by Natural Gas Intelligence. |  [optional]
**sparkSpreadType** | [**SparkSpreadTypeEnum**](#SparkSpreadTypeEnum) | Spark spread type. |  [optional]
**sparkSpreadPricesMwh** | [**SparkSpreadPricesMwh**](SparkSpreadPricesMwh.md) |  |  [optional]



## Enum: SparkSpreadTypeEnum

Name | Value
---- | -----
PEAK | &quot;Peak&quot;
OFFPEAK | &quot;OffPeak&quot;
AVERAGE | &quot;Average&quot;


## Implemented Interfaces

* Serializable


