

# PostVendorChartIQTimeSeriesEodSubsampleListRequestData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | [**PostVendorChartIQTimeSeriesEodListRequestDataIdentifier**](PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.md) |  | 
**type** | [**TypeEnum**](#TypeEnum) | Type of the price as configured for the customer. |  [optional]
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**intervalSelection** | [**PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection**](PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection.md) |  | 
**newestFirst** | **Boolean** | Deliver the chronological last part of the requested data first. |  [optional]
**adjustments** | [**PostVendorChartIQTimeSeriesEodListRequestDataAdjustments**](PostVendorChartIQTimeSeriesEodListRequestDataAdjustments.md) |  |  [optional]



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


