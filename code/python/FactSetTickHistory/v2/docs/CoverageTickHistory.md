# CoverageTickHistory

Returns Coverage Response of the requested ticker with unique isocode within a date range

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ticker** | **str** | a unique ticker given to a company | [optional] 
**factset_exchange_code** | **str** | FactSet specific exchange code. | [optional] 
**start_date** | **date** | The date for (or from which) the coverage is required.  | [optional] 
**latest_trade_date** | **date** | This specifies the latest traded date from tick history. | [optional] 
**company_name** | **str** | Name of the firm | [optional] 
**isin** | **str** | returns the ISIN of the requested company  | [optional] 
**currency** | **str** | Represents 3 digit ISO code for the currency | [optional] 
**last_exchange_code** | **str** | the last traded exhange code from tick history | [optional] 
**last_exchange_name** | **str** | the last traded exchange name from tick history | [optional] 
**primary_ticker_exchange** | **str** | the primary ticker iso | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


