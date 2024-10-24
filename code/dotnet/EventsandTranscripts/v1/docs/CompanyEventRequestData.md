# FactSet.SDK.EventsandTranscripts.Model.CompanyEventRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateTime** | [**CompanyEventRequestDataDateTime**](CompanyEventRequestDataDateTime.md) |  | [optional] 
**Universe** | [**CompanyEventRequestDataUniverse**](CompanyEventRequestDataUniverse.md) |  | [optional] 
**EventTypes** | **List&lt;string&gt;** | The type of events returned in the response | [optional] 
**LastModifiedWithin** | **string** | The duration within which the events were last modified.  **Note 1:** When using &#x60;lastModifiedWithin&#x60; without providing &#x60;startDate&#x60; or &#x60;endDate&#x60;, the default period will be the previous and upcoming 45 days from the current date.  **Note 2:** If both &#x60;dateTime&#x60; and &#x60;lastModifiedWithin&#x60; are provided in the same request, the API will return an error.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

