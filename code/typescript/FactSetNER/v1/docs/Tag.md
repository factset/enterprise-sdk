# factsetner.Tag

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type of the extracted named-entity (NE). | [optional] 
**subType** | **String** | More specific sub-type (e.g., NE_COUNTRY) of the named-entity (if applicable). | [optional] 
**text** | **String** | Text for the named-entity (NE), as extracted from the given document. | [optional] 
**score** | **Number** |  | [optional] 
**startChar** | **Number** | Starting character position of the named-entity text (relative to any offset provided (default offset&#x3D;0)). | [optional] 
**endChar** | **Number** | Ending character position of the named-entity text (relative to any offset provided (default offset&#x3D;0)) | [optional] 
**lookupText** | **String** | Best-matching (FactSet) looked-up name for the extracted named-entity. | [optional] 
**neId** | **String** | Best-matching (FactSet) entity-id for the extracted named-entity | [optional] 



## Enum: TypeEnum


* `GPE` (value: `"NE_GPE"`)

* `ORG` (value: `"NE_ORG"`)

* `PERSON` (value: `"NE_PERSON"`)

* `PHARMACEUTICAL` (value: `"NE_PHARMACEUTICAL"`)

* `DATETIME` (value: `"NE_DATETIME"`)

* `NUMBER` (value: `"NE_NUMBER"`)

* `MONEY` (value: `"NE_MONEY"`)





## Enum: SubTypeEnum


* `GENERIC_DRUG` (value: `"NE_GENERIC_DRUG"`)

* `BRANDED_DRUG` (value: `"NE_BRANDED_DRUG"`)

* `DRUG_CLASS` (value: `"NE_DRUG_CLASS"`)

* `PIPELINE_DRUG` (value: `"NE_PIPELINE_DRUG"`)

* `INDICATION` (value: `"NE_INDICATION"`)




