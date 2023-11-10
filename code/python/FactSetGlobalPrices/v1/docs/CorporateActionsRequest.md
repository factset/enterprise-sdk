# CorporateActionsRequest

Corporate Actions Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IdsBatchMax10000**](IdsBatchMax10000.md) |  | 
**event_category** | [**EventCategory**](EventCategory.md) |  | [optional] 
**fields** | [**FieldsCorporateActions**](FieldsCorporateActions.md) |  | [optional] 
**start_date** | **str** | The start date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \&quot;event\&quot; frequency- meaning the service will return only events within those inclusive boundaries. Leaving both startDate and endDate blank will pull \&quot;all\&quot; events for each requested ids.  | [optional] 
**end_date** | **str** | The end date requested for a given date range in **YYYY-MM-DD** format. In the context of corporate actions, this filters the response to only include events within the date range. The frequency between the startDate and endDate is always set to the \&quot;event\&quot; frequency- meaning the service will return only events within those inclusive boundaries. Leaving both startDate and endDate blank will pull \&quot;all\&quot; events for each requested ids.  | [optional] 
**currency** | **str** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**cancelled_dividend** | [**CancelledDividend**](CancelledDividend.md) |  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


