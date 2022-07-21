# EventRequestBody


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **bool, date, datetime, dict, float, int, list, str, none_type** | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional] 
**updated** | **bool, date, datetime, dict, float, int, list, str, none_type** | A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 24 hours if omitted. | [optional] 
**signal_ids** | **str** | Comma delimited string of signalIds | [optional] 
**ids** | **str** | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. Only the first 1,000 ids are processed. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional] 
**portfolios** | **str** | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional] 
**themes** | **str** | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
**categories** | **str** | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
**user_relevance_score** | **bool, date, datetime, dict, float, int, list, str, none_type** | A range for filtering signal events based on their relevancy score. | [optional] 
**sort** | **str** | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


