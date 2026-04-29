# ContentSetItem

objects of content set items.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_set** | **str** | The content set the field belongs to, e.g., \&quot;Factset Fundamentals\&quot; or \&quot;Factset Estimates\&quot;. | 
**fields** | **[str]** | Fields to be returned in the response.  Default fields are: &#x60;tickerRegion&#x60;, &#x60;fsymId&#x60;, &#x60;entityId&#x60;, &#x60;instrumentName&#x60;.  Requesting any additional fields beyond these default fields will result in an error unless proper permissions are granted.   Please contact FactSet Support for access permissions to additional fields.  | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


