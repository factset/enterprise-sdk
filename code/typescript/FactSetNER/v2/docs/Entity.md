# factsetner.Entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type of the extracted named entity (NE). | [optional] 
**text** | **String** | Text for the named entity, as found in the source text. | [optional] 
**startChar** | **Number** | Starting character position of the entity text. | [optional] 
**endChar** | **Number** | Ending character position of the entity text. | [optional] 
**lookupText** | **String** | Name of the FactSet entity linked to the text. | [optional] 
**entityId** | **String** | FactSet Entity ID for the extracted entity. | [optional] 
**lookupUrl** | **String** | URL to the extracted entity in FactSet. | [optional] 
**associatedOrgs** | [**[AssociatedOrganization]**](AssociatedOrganization.md) | Organizations associated with this entity. | [optional] 



## Enum: TypeEnum


* `GPE` (value: `"NE_GPE"`)

* `ORG` (value: `"NE_ORG"`)

* `PERSON` (value: `"NE_PERSON"`)

* `NUMBER` (value: `"NE_NUMBER"`)

* `MONEY` (value: `"NE_MONEY"`)

* `DATETIME` (value: `"NE_DATETIME"`)

* `DRUG` (value: `"NE_DRUG"`)

* `HEALTH_INDICATION` (value: `"NE_HEALTH_INDICATION"`)




