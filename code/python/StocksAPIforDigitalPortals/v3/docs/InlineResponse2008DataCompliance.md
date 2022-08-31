# InlineResponse2008DataCompliance

Compliance properties. A given compliance property may appear in combination with other compliance properties. The attribute `count` represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint `/instrument/complianceProperty/list` for the full list of compliance properties associated with instruments (across all asset classes).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**france** | [**[InlineResponse2008DataComplianceFrance]**](InlineResponse2008DataComplianceFrance.md) | Compliance properties in accordance with the French law. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


