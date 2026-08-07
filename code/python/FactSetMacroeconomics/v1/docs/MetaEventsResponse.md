# MetaEventsResponse

Response object containing reference values for filtering and metadata. Fields vary by reference type (indicators and countries include `name`; FDS codes include `country`, `eventName`, and `sourceName`).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**[ReferenceItem]**](ReferenceItem.md) | An array of reference items. Field structure depends on the requested &#x60;type&#x60; parameter. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


