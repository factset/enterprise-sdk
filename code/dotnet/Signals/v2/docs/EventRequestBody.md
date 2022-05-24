# FactSet.SDK.Signals.Model.EventRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Created** | [**DateTimeInterval**](DateTimeInterval.md) | A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional] 
**Updated** | [**DateTimeInterval**](DateTimeInterval.md) | A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 24 hours if omitted. | [optional] 
**SignalIds** | **string** | Comma delimited string of signalIds | [optional] 
**Ids** | **string** | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. Only the first 1,000 ids are processed. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional] 
**Portfolios** | **string** | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional] 
**Themes** | **string** | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
**Categories** | **string** | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
**UserRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md) | A range for filtering signal events based on their relevancy score. | [optional] 
**Sort** | **string** | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

