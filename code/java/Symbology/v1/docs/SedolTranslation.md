

# SedolTranslation

SEDOL Translation data object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) |  [optional]
**name** | **String** | Proper Name of company or issuer. |  [optional]
**sedol** | **String** | SEDOL |  [optional]
**sedolEffectiveStartDate** | **String** | The effective start date in which the CUSIP was valid for the security. |  [optional]
**sedolEffectiveEndDate** | **String** | The effective end date in which the Sedol was valid. If null, the Sedol is still active for the security and date requested. |  [optional]
**asOfDate** | **LocalDate** | The reqeuested date for the symbol. |  [optional]
**requestId** | **String** | Identifier specified in the request |  [optional]


## Implemented Interfaces

* Serializable


