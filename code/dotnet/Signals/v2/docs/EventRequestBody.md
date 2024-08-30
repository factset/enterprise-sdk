# FactSet.SDK.Signals.Model.EventRequestBody
The POST request's body containing the request criterion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Created** | [**DateTimeInterval**](DateTimeInterval.md) | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. Users with limited access can only provide the default or a smaller date window. | [optional] 
**Updated** | [**DateTimeInterval**](DateTimeInterval.md) | A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. Users with limited access can only provide the default or a smaller date window. | [optional] 
**SignalIds** | **string** | Comma delimited string of signalIds | [optional] 
**Ids** | **string** | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. Users with limited access can use only the ids filter and provide at most 10 ids. | [optional] 
**Portfolios** | **string** | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed (e.g. client:techstocks.ofdb). Please note that using this parameter requires full subscription to Signals API. | [optional] 
**Themes** | **string** | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
**Categories** | **string** | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
**UserRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md) | A range for filtering signal events based on their relevancy score. | [optional] 
**Sort** | **string** | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. | [optional] 
**ResolveIdentifiers** | **bool** | The api will return resolved identifiers in the meta section of the response by default (true). If the parameter is false, the api will not attempt to resolve the identifiers. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

