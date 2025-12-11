

# HeadlinesRequestByViewData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the view to return headlines for. | 
**predefinedRange** | [**PredefinedRangeEnum**](#PredefinedRangeEnum) | See list of valid date ranges. Date range is mutually exlusive to start/end time. |  [optional]
**searchTime** | [**HeadlinesRequestByViewDataSearchTime**](HeadlinesRequestByViewDataSearchTime.md) |  |  [optional]



## Enum: PredefinedRangeEnum

Name | Value
---- | -----
TODAY | &quot;today&quot;
TWODAYS | &quot;twoDays&quot;
ONEWEEK | &quot;oneWeek&quot;
ONEMONTH | &quot;oneMonth&quot;
THREEMONTHS | &quot;threeMonths&quot;
SIXMONTHS | &quot;sixMonths&quot;
ONEYEAR | &quot;oneYear&quot;
THREEYEARS | &quot;threeYears&quot;
FIVEYEARS | &quot;fiveYears&quot;
TENYEARS | &quot;tenYears&quot;
ALLAVAILABLE | &quot;allAvailable&quot;


## Implemented Interfaces

* Serializable


