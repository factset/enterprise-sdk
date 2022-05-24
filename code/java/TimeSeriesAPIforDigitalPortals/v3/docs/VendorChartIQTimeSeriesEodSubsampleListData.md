

# VendorChartIQTimeSeriesEodSubsampleListData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the notation. | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the price as configured for the customer. |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**intervals** | **java.util.List&lt;LocalDate&gt;** | Non-empty intervals of days to consider for the request. The array contains a list of at least two days in increasing order. Each pair of adjacent entries day_n and day_(n+1) specifies a half-open interval, that is a range of days d where day_n &lt;&#x3D; d &lt; day_(n+1). A subsample is computed for each interval. The valid range of intervals is between 1900-01-01 and the day after the current day. | 
**adjustments** | [**VendorChartIQTimeSeriesEodListDataAdjustments**](VendorChartIQTimeSeriesEodListDataAdjustments.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRADE | &quot;trade&quot;
BID | &quot;bid&quot;
ASK | &quot;ask&quot;
YIELD | &quot;yield&quot;
ESTIMATE | &quot;estimate&quot;



## Enum: QualityEnum

Name | Value
---- | -----
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;
BST | &quot;BST&quot;


## Implemented Interfaces

* Serializable


