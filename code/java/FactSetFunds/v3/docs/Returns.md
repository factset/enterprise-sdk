

# Returns

Fund return data for the requested date and identifier with optional dividend adjustments

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**date** | **LocalDate** | The date in YYYY-MM-DD format. |  [optional]
**currency** | **String** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**_return** | **Double** | The Return for the requested ID and date. Adjusting the frequency of the time-series does not adjust the return calculation, and simply controls the display frequency. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. |  [optional]


## Implemented Interfaces

* Serializable


