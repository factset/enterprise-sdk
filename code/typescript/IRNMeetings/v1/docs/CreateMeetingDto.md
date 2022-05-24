# irnmeetings.CreateMeetingDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**UserSerialDto**](UserSerialDto.md) |  | 
**title** | **String** |  | [optional] 
**identifier** | **String** |  | [optional] 
**start** | **String** |  | 
**end** | **String** |  | 
**locations** | **[String]** |  | [optional] 
**organizer** | **String** |  | [optional] 
**organizerId** | **String** |  | [optional] 
**attendees** | [**[ReferenceAttendeeDto]**](ReferenceAttendeeDto.md) |  | [optional] 
**alertAttendees** | **Boolean** |  | [optional] [default to false]
**alertAuthor** | **Boolean** |  | [optional] [default to false]
**relatedRecords** | [**RelatedRecordsDto**](RelatedRecordsDto.md) |  | [optional] 
**relatedContacts** | **[String]** |  | [optional] 
**relatedSymbols** | **[String]** |  | [optional] 
**body** | [**CreateBodyDto**](CreateBodyDto.md) |  | [optional] 
**customFieldValues** | [**[CreateCustomFieldValueDto]**](CreateCustomFieldValueDto.md) |  | [optional] 


