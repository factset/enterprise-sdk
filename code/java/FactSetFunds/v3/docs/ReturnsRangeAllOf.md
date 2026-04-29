

# ReturnsRangeAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**_return** | **Double** | The Return calculated between two dates. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. |  [optional]
**returnStartDate** | **LocalDate** | The start date of the return in YYYY-MM-DD format. *NOTE - the &#x60;startDate&#x60; cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint. |  [optional]
**returnEndDate** | **LocalDate** | The end date of the return in YYYY-MM-DD format. |  [optional]


## Implemented Interfaces

* Serializable


