# SedolTranslation

SEDOL Translation data object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) | [optional] 
**name** | **str** | Proper Name of company or issuer. | [optional] 
**sedol** | **str** | SEDOL | [optional] 
**sedol_primary** | **str** | The SEDOL for the Primary Listing of the requested security. If you request a specific exchange (e.g. -MEX), the SEDOL will translate for that listing, while the SEDOL Primary will always resolve back to the primary region (e.g. -US). | [optional] 
**request_id** | **str** | Identifier specified in the request | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


