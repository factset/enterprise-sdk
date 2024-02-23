

# ReturnsRange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. |  [optional]
**_return** | **Double** | The Return calculated between two dates. The return type is determined by including or excluding dividends through the dividendAdjust parameter. |  [optional]
**returnStartDate** | **LocalDate** | The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint. |  [optional]
**returnEndDate** | **LocalDate** | The end date of the return in YYYY-MM-DD format. The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]


## Implemented Interfaces

* Serializable


