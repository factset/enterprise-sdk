# factsetfunds.TopHoldings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**date** | **Date** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**numberOfHoldings** | **Number** | Total number of holdings considered. | [optional] 
**holdingsPercentWeight** | **Number** | Combined weight of top holdings. | [optional] 
**holdings** | [**[Holdings]**](Holdings.md) | List of top holdings with name, ticker, and weight. | [optional] 


