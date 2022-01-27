

# Entity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of the extracted named entity (NE). |  [optional]
**text** | **String** | Text for the named entity, as found in the source text. |  [optional]
**startChar** | **Integer** | Starting character position of the entity text. |  [optional]
**endChar** | **Integer** | Ending character position of the entity text. |  [optional]
**lookupText** | **String** | Name of the FactSet entity linked to the text. |  [optional]
**entityId** | **String** | FactSet Entity ID for the extracted entity. |  [optional]
**lookupUrl** | **String** | URL to the extracted entity in FactSet. |  [optional]
**associatedOrgs** | [**java.util.List&lt;AssociatedOrganization&gt;**](AssociatedOrganization.md) | Organizations associated with this entity. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
GPE | &quot;NE_GPE&quot;
ORG | &quot;NE_ORG&quot;
PERSON | &quot;NE_PERSON&quot;
NUMBER | &quot;NE_NUMBER&quot;
MONEY | &quot;NE_MONEY&quot;
DATETIME | &quot;NE_DATETIME&quot;
DRUG | &quot;NE_DRUG&quot;
HEALTH_INDICATION | &quot;NE_HEALTH_INDICATION&quot;


## Implemented Interfaces

* Serializable


