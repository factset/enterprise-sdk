# FactSet.SDK.ProcuretoPayAPISCIM.Model.LocationResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** |  | [optional] 
**Id** | **string** |  | [optional] [readonly] 
**ExternalId** | **string** | An arbitrary identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. | [optional] 
**Name** | **string** | Name of the location. | 
**Description** | **string** | Description of the location. | [optional] 
**Address1** | **string** | First line of location&#39;s address. | 
**Address2** | **string** | Second line of location&#39;s address. | [optional] 
**Address3** | **string** | Third line of location&#39;s address. | [optional] 
**Locality** | **string** | City of location. | 
**Region** | **string** | State or province of location. | [optional] 
**PostalCode** | **string** | Postal code of location. | 
**Country** | **string** | Country of location. | 
**PhoneNumber** | **string** | Phone number of location. | [optional] [readonly] 
**FirmDescription** | [**LocationResourceFirmDescription**](LocationResourceFirmDescription.md) |  | 
**EmailDomains** | **List&lt;string&gt;** | The domain names that are valid for use with email addresses associated with users in this location. | [optional] 
**PartnerAssertedEntityId** | **string** | Identifier assigned to the Corporate Entity. Value is provided as \&quot;fsymEntityId\&quot; from FactSet&#39;s Symbology API. | [optional] 
**CompanyAgreementUrls** | [**List&lt;LocationResourceCompanyAgreementUrl&gt;**](LocationResourceCompanyAgreementUrl.md) | Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet. | [optional] 
**ManagedLocations** | [**List&lt;LocationResourceReference&gt;**](LocationResourceReference.md) | Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements. | [optional] 
**ManagingLocation** | [**LocationResourceManagingLocation**](LocationResourceManagingLocation.md) |  | [optional] 
**MainLocation** | [**LocationResourceMainLocation**](LocationResourceMainLocation.md) |  | [optional] 
**Usernames** | **List&lt;string&gt;** | The FactSet usernames that are valid for users in this location. | [optional] [readonly] 
**Meta** | [**LocationResourceMeta**](LocationResourceMeta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

