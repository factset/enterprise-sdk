

# NEREntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associatedOrgs** | [**java.util.List&lt;NEROrganization&gt;**](NEROrganization.md) | Organizations that are associated with this entity |  [optional]
**endChar** | **Integer** | The index of the last character of the entity text | 
**entityId** | **String** | The FactSet Entity ID that is linked to this text. |  [optional]
**lookupText** | **String** | Name of the FactSet entity that is linked to this text. |  [optional]
**lookupUrl** | **String** | A link to the information page for the given entity |  [optional]
**startChar** | **Integer** | The index of the starting character of the entity text | 
**text** | **String** | The substring of the source text that ws found as an entity | 
**type** | [**TypeEnum**](#TypeEnum) | The type of entity (organization, person, etc.) that was found | 



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


