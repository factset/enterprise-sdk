

# Document

Array of data objects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primaryIds** | **java.util.List&lt;String&gt;** | Refers to the main companies a particular document pertains to. |  [optional]
**allIds** | **java.util.List&lt;String&gt;** | Refers to all companies mentioned in the document.  |  [optional]
**headline** | **String** | Headline of the story. |  [optional]
**storyDateTime** | **OffsetDateTime** | Refers to either the date and time of the story, when it is available in workstation (in the specified timeZone) or the date and time FactSet received it from the vendor. |  [optional]
**categories** | **java.util.List&lt;String&gt;** | Categories are Country, Industry, and Subject codes. This is a list retrieved from &#x60;/meta/categories&#x60; |  [optional]
**transcriptIntelligenceUrl** | **String** | This is the URL for downloading the document with an expiration duration of 24 hours. |  [optional]
**reportId** | **String** | This is a unique identifier for a specific transcript. |  [optional]
**uploadDateTime** | **OffsetDateTime** | It is the time when transcript is created (in the specified timeZone).                     |  [optional]


## Implemented Interfaces

* Serializable


