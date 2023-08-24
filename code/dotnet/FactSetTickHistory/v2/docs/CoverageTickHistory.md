# FactSet.SDK.FactSetTickHistory.Model.CoverageTickHistory
Returns Coverage Response of the requested ticker with unique isocode within a date range

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ticker** | **string** | a unique ticker given to a company | [optional] 
**FactsetExchangeCode** | **string** | FactSet specific exchange code. | [optional] 
**StartDate** | **DateTime** | The date for (or from which) the coverage is required.  | [optional] 
**LatestTradeDate** | **DateTime** | This specifies the latest traded date from tick history. | [optional] 
**CompanyName** | **string** | Name of the firm | [optional] 
**Isin** | **string** | returns the ISIN of the requested company  | [optional] 
**Currency** | **string** | Represents 3 digit ISO code for the currency | [optional] 
**LastExchangeCode** | **string** | the last traded exhange code from tick history | [optional] 
**LastExchangeName** | **string** | the last traded exchange name from tick history | [optional] 
**PrimaryTickerExchange** | **string** | the primary ticker iso | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

