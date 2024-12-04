# eventsandtranscripts.SlidesObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primaryIds** | **[String]** | Refers to the main companies a particular document pertains to. | [optional] 
**allIds** | **[String]** | Refers to all companies mentioned in the document.  | [optional] 
**searchId** | **String** | Returns IDs used in the ids parameter. The identifier type is based on what was used in the parameter. | [optional] 
**headline** | **String** | Headline of the story. | [optional] 
**storyDateTime** | **Date** | Refers to either the date and time of the story, when it is available in workstation (in the specified timezone) or the date and time FactSet received it from the vendor. | [optional] 
**categories** | **[String]** | Categories are country, industry, and subject codes. This is a comma-separated list. | [optional] 
**slidesLink** | **String** | This is a link for downloading the document with an expiration duration of 24 hours. | [optional] 
**eventId** | **String** | Unique identifier derived from report_id with a &#39;t&#39; appended, indicating a transcript or slide. | [optional] 


