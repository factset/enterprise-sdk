# CompanyEventRequestData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_time** | [**CompanyEventRequestDataDateTime**](CompanyEventRequestDataDateTime.md) |  | [optional] 
**universe** | [**CompanyEventRequestDataUniverse**](CompanyEventRequestDataUniverse.md) |  | [optional] 
**event_types** | **[str]** | The type of events returned in the response | [optional] 
**last_modified_within** | **str** | The duration within which the events were last modified.  **Note 1:** When using &#x60;lastModifiedWithin&#x60; without providing &#x60;startDate&#x60; or &#x60;endDate&#x60;, the default period will be the previous and upcoming 45 days from the current date.  **Note 2:** If both &#x60;dateTime&#x60; and &#x60;lastModifiedWithin&#x60; are provided in the same request, the API will return an error.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


