

# ForwardsRequest

Forwards Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470) | 
**forwardPeriod** | **ForwardPeriod** |  |  [optional]
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  |  [optional]
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  |  [optional]
**frequency** | **Frequency** |  |  [optional]


## Implemented Interfaces

* Serializable


