# factsetfunds.Prices

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**date** | **Date** | The date in YYYY-MM-DD format. | [optional] 
**currency** | **String** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**price** | **Number** | The NAV for the requested share class. NOTE - FactSet Mutual Funds does not use seven-day yields to price money market funds. | [optional] 
**firstNAVDate** | **Date** | Returns the earliest date on which a price was available for the specified share class.  | [optional] 


