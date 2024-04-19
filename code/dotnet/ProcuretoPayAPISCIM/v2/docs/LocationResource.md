# FactSet.SDK.ProcuretoPayAPISCIM.Model.LocationResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** |  | [optional] 
**Id** | **string** |  | [optional] [readonly] 
**ExternalId** | **string** | An identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. Note: for clients that are not FactSet partners, this identifier must be unique within the main location associated with the client&#39;s FactSet username. | [optional] 
**Name** | **string** | Name of the location. | 
**Description** | **string** | Description of the location. | [optional] 
**Address1** | **string** | First line of location&#39;s address. | [optional] 
**Address2** | **string** | Second line of location&#39;s address. | [optional] 
**Address3** | **string** | Third line of location&#39;s address. | [optional] 
**Locality** | **string** | City of location. | [optional] 
**Region** | **string** | State or province of location. | [optional] 
**PostalCode** | **string** | Postal code of location. | [optional] 
**Country** | **string** | Country of location. | [optional] 
**PhoneNumber** | **string** | Phone number of location. | [optional] [readonly] 
**FirmDescription** | [**FirmDescriptionResourceReference**](FirmDescriptionResourceReference.md) |  | [optional] 
**EmailDomains** | **List&lt;string&gt;** | The domain names that are valid for use with email addresses associated with users in this location. | [optional] 
**PartnerAssertedEntityId** | **string** | Identifier assigned to the Corporate Entity. Value is provided as \&quot;fsymEntityId\&quot; from FactSet&#39;s Symbology API. | [optional] 
**CompanyAgreementUrls** | [**List&lt;LocationResourceCompanyAgreementUrls&gt;**](LocationResourceCompanyAgreementUrls.md) | Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet. | [optional] 
**ManagedLocations** | [**List&lt;LocationResourceReference&gt;**](LocationResourceReference.md) | Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements. | [optional] 
**ManagingLocation** | [**LocationResourceReference**](LocationResourceReference.md) | FactSet location ID managing this location for a Research Entitlements Administrator and requesting location-based entitlements for all managed locations associated. | [optional] 
**MainLocation** | [**LocationResourceReference**](LocationResourceReference.md) | The managing or otherwise parent location associated with this location. All locations associated with the mainLocation are viewed as related and within the same business unit in FactSet&#39;s CRM systems. | [optional] 
**Usernames** | **List&lt;string&gt;** | The FactSet usernames that are valid for users in this location. | [optional] [readonly] 
**Meta** | [**LocationResourceMeta**](LocationResourceMeta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

