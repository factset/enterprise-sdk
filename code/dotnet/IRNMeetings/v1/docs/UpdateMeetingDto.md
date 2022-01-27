# FactSet.SDK.IRNMeetings.Model.UpdateMeetingDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Title** | **string** |  | 
**Identifier** | **string** |  | 
**Start** | **string** |  | 
**End** | **string** |  | 
**Locations** | **List&lt;string&gt;** |  | [optional] 
**Organizer** | **string** |  | [optional] 
**OrganizerId** | **Guid** |  | [optional] 
**Attendees** | [**List&lt;ReferenceAttendeeDto&gt;**](ReferenceAttendeeDto.md) |  | [optional] 
**AlertAttendees** | **bool** |  | [optional] [default to false]
**AlertAuthor** | **bool** |  | [optional] [default to false]
**RelatedRecords** | [**RelatedRecordsDto**](RelatedRecordsDto.md) |  | [optional] 
**RelatedContacts** | **List&lt;Guid&gt;** |  | [optional] 
**RelatedSymbols** | **List&lt;string&gt;** |  | [optional] 
**Body** | [**CreateBodyDto**](CreateBodyDto.md) |  | [optional] 
**CustomFieldValues** | [**List&lt;CreateCustomFieldValueDto&gt;**](CreateCustomFieldValueDto.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

