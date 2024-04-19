# LocationResource


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the location. | 
**schemas** | **[str]** |  | [optional] 
**id** | **str** |  | [optional] [readonly] 
**external_id** | **str** | An identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. Note: for clients that are not FactSet partners, this identifier must be unique within the main location associated with the client&#39;s FactSet username. | [optional] 
**description** | **str** | Description of the location. | [optional] 
**address1** | **str** | First line of location&#39;s address. | [optional] 
**address2** | **str** | Second line of location&#39;s address. | [optional] 
**address3** | **str** | Third line of location&#39;s address. | [optional] 
**locality** | **str** | City of location. | [optional] 
**region** | **str** | State or province of location. | [optional] 
**postal_code** | **str** | Postal code of location. | [optional] 
**country** | **str** | Country of location. | [optional] 
**phone_number** | **str** | Phone number of location. | [optional] [readonly] 
**firm_description** | **bool, date, datetime, dict, float, int, list, str, none_type** |  | [optional] 
**email_domains** | **[str]** | The domain names that are valid for use with email addresses associated with users in this location. | [optional] 
**partner_asserted_entity_id** | **str** | Identifier assigned to the Corporate Entity. Value is provided as \&quot;fsymEntityId\&quot; from FactSet&#39;s Symbology API. | [optional] 
**company_agreement_urls** | [**[LocationResourceCompanyAgreementUrls]**](LocationResourceCompanyAgreementUrls.md) | Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet. | [optional] 
**managed_locations** | [**[LocationResourceReference]**](LocationResourceReference.md) | Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements. | [optional] 
**managing_location** | **bool, date, datetime, dict, float, int, list, str, none_type** | FactSet location ID managing this location for a Research Entitlements Administrator and requesting location-based entitlements for all managed locations associated. | [optional] 
**main_location** | **bool, date, datetime, dict, float, int, list, str, none_type** | The managing or otherwise parent location associated with this location. All locations associated with the mainLocation are viewed as related and within the same business unit in FactSet&#39;s CRM systems. | [optional] 
**usernames** | **[str]** | The FactSet usernames that are valid for users in this location. | [optional] [readonly] 
**meta** | [**LocationResourceMeta**](LocationResourceMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


