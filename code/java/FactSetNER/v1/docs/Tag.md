

# Tag


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of the extracted named-entity (NE). |  [optional]
**subType** | [**SubTypeEnum**](#SubTypeEnum) | More specific sub-type (e.g., NE_COUNTRY) of the named-entity (if applicable). |  [optional]
**text** | **String** | Text for the named-entity (NE), as extracted from the given document. |  [optional]
**score** | **BigDecimal** |  |  [optional]
**startChar** | **Integer** | Starting character position of the named-entity text (relative to any offset provided (default offset&#x3D;0)). |  [optional]
**endChar** | **Integer** | Ending character position of the named-entity text (relative to any offset provided (default offset&#x3D;0)) |  [optional]
**lookupText** | **String** | Best-matching (FactSet) looked-up name for the extracted named-entity. |  [optional]
**neId** | **String** | Best-matching (FactSet) entity-id for the extracted named-entity |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
GPE | &quot;NE_GPE&quot;
ORG | &quot;NE_ORG&quot;
PERSON | &quot;NE_PERSON&quot;
PHARMACEUTICAL | &quot;NE_PHARMACEUTICAL&quot;
DATETIME | &quot;NE_DATETIME&quot;
NUMBER | &quot;NE_NUMBER&quot;
MONEY | &quot;NE_MONEY&quot;



## Enum: SubTypeEnum

Name | Value
---- | -----
GENERIC_DRUG | &quot;NE_GENERIC_DRUG&quot;
BRANDED_DRUG | &quot;NE_BRANDED_DRUG&quot;
DRUG_CLASS | &quot;NE_DRUG_CLASS&quot;
PIPELINE_DRUG | &quot;NE_PIPELINE_DRUG&quot;
INDICATION | &quot;NE_INDICATION&quot;


## Implemented Interfaces

* Serializable


