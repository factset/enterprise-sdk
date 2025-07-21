

# ResponseTypeData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionId** | **String** | Used to distinguish the corrected reports. As such, one &#x60;reportId&#x60; can have many &#x60;versionIds&#x60;. |  [optional]
**primaryIds** | **java.util.List&lt;String&gt;** | Refers to the main companies a particular document pertains to. |  [optional]
**allIds** | **java.util.List&lt;String&gt;** | Refers to all companies mentioned in the document.  |  [optional]
**reportId** | **String** | This is a unique identifier for a specific transcript (audio or video) returned. |  [optional]
**eventId** | **String** | ID of the conference call. |  [optional]
**headline** | **String** | Headline of the story. |  [optional]
**storyDateTime** | **OffsetDateTime** | Refers to either the date and time of the story, when it is available in workstation (in the specified timeZone) or the date and time FactSet received it from the vendor. |  [optional]
**transcriptsUrl** | **String** | This is the URL for downloading the document with an expiration duration of 24 hours. |  [optional]


## Implemented Interfaces

* Serializable


