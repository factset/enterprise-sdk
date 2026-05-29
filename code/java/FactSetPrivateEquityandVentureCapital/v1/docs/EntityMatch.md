

# EntityMatch

An individual object representing a potential or actual match for a submitted entity name, providing the FactSet ID and related descriptive attributes. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityId** | **String** | The definitive **FactSet Permanent Entity Identifier** (FactSet ID) of the entity matched, typically in the format &#39;XXXXXX-E&#39;. This is the key identifier used for subsequent data retrieval endpoints in the API. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)  |  [optional]
**entityName** | **String** | The full, standardized legal name corresponding to the matched entity as recorded in the FactSet database. |  [optional]
**countryCode** | **String** | The two-character ISO 3166-1 alpha-2 country code corresponding to the primary country of the matched entity. |  [optional]
**entityTypeCode** | **String** | Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions. |  [optional]
**matchFlag** | **Boolean** | A boolean flag indicating whether the &#x60;entityId&#x60; is a FactSet match based on the input name and country. When &#x60;true&#x60;, the FactSet &#x60;entityId&#x60; was confidently matched to the input name and country. When &#x60;false&#x60;, the FactSet &#x60;entityId&#x60; could not be confidently matched to the input name and country. |  [optional]


## Implemented Interfaces

* Serializable


