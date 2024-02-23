

# Returns


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. |  [optional]
**_return** | **Double** | The Return for the requested id and date. Adjusting the frequency of the time-series does not adjust the return calculation, and simply controls the display frequency. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**date** | **LocalDate** | The date of the return in YYYY-MM-DD format. |  [optional]
**currency** | **String** | ISO3 Currency |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]


## Implemented Interfaces

* Serializable


