# factsetfunds.ReturnsRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**_return** | **Number** | The Return calculated between two dates. The return type is determined by including or excluding dividends through the &#x60;dividendAdjust&#x60; parameter. | [optional] 
**returnStartDate** | **Date** | The start date of the return in YYYY-MM-DD format. *NOTE - the &#x60;startDate&#x60; cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint. | [optional] 
**returnEndDate** | **Date** | The end date of the return in YYYY-MM-DD format. | [optional] 


