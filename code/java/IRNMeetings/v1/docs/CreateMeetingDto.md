

# CreateMeetingDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**UserSerialDto**](UserSerialDto.md) |  | 
**title** | **String** |  |  [optional]
**identifier** | **String** |  |  [optional]
**start** | **String** |  | 
**end** | **String** |  | 
**locations** | **java.util.List&lt;String&gt;** |  |  [optional]
**organizer** | **String** |  |  [optional]
**organizerId** | **java.util.UUID** |  |  [optional]
**attendees** | [**java.util.List&lt;ReferenceAttendeeDto&gt;**](ReferenceAttendeeDto.md) |  |  [optional]
**alertAttendees** | **Boolean** |  |  [optional]
**alertAuthor** | **Boolean** |  |  [optional]
**relatedRecords** | [**RelatedRecordsDto**](RelatedRecordsDto.md) |  |  [optional]
**relatedContacts** | **java.util.List&lt;java.util.UUID&gt;** |  |  [optional]
**relatedSymbols** | **java.util.List&lt;String&gt;** |  |  [optional]
**body** | [**CreateBodyDto**](CreateBodyDto.md) |  |  [optional]
**customFieldValues** | [**java.util.List&lt;CreateCustomFieldValueDto&gt;**](CreateCustomFieldValueDto.md) |  |  [optional]


## Implemented Interfaces

* Serializable


