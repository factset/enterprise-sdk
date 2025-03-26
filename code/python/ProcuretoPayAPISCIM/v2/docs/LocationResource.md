# LocationResource


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the location. | 
**address1** | **str** | First line of location&#39;s address. | 
**locality** | **str** | City of location. | 
**postal_code** | **str** | Postal code of location. | 
**country** | **str** | Country of location. | 
**firm_description** | [**LocationResourceFirmDescription**](LocationResourceFirmDescription.md) |  | 
**schemas** | **[str]** |  | [optional] 
**id** | **str** |  | [optional] [readonly] 
**external_id** | **str** | An arbitrary identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. | [optional] 
**description** | **str** | Description of the location. | [optional] 
**address2** | **str** | Second line of location&#39;s address. | [optional] 
**address3** | **str** | Third line of location&#39;s address. | [optional] 
**region** | **str** | State or province of location. | [optional] 
**phone_number** | **str** | Phone number of location. | [optional] [readonly] 
**email_domains** | **[str]** | The domain names that are valid for use with email addresses associated with users in this location. | [optional] 
**partner_asserted_entity_id** | **str** | Identifier assigned to the Corporate Entity. Value is provided as \&quot;fsymEntityId\&quot; from FactSet&#39;s Symbology API. | [optional] 
**company_agreement_urls** | [**[LocationResourceCompanyAgreementUrl]**](LocationResourceCompanyAgreementUrl.md) | Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet. | [optional] 
**managed_locations** | [**[LocationResourceReference]**](LocationResourceReference.md) | Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements. | [optional] 
**managing_location** | [**LocationResourceManagingLocation**](LocationResourceManagingLocation.md) |  | [optional] 
**main_location** | [**LocationResourceMainLocation**](LocationResourceMainLocation.md) |  | [optional] 
**usernames** | **[str]** | The FactSet usernames that are valid for users in this location. | [optional] [readonly] 
**meta** | [**LocationResourceMeta**](LocationResourceMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


