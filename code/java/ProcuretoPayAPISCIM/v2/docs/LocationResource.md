

# LocationResource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **java.util.List&lt;String&gt;** |  |  [optional]
**id** | **String** |  |  [optional] [readonly]
**externalId** | **String** | An arbitrary identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. |  [optional]
**name** | **String** | Name of the location. | 
**description** | **String** | Description of the location. |  [optional]
**address1** | **String** | First line of location&#39;s address. | 
**address2** | **String** | Second line of location&#39;s address. |  [optional]
**address3** | **String** | Third line of location&#39;s address. |  [optional]
**locality** | **String** | City of location. | 
**region** | **String** | State or province of location. |  [optional]
**postalCode** | **String** | Postal code of location. | 
**country** | **String** | Country of location. | 
**phoneNumber** | **String** | Phone number of location. |  [optional] [readonly]
**firmDescription** | [**LocationResourceFirmDescription**](LocationResourceFirmDescription.md) |  | 
**emailDomains** | **java.util.List&lt;String&gt;** | The domain names that are valid for use with email addresses associated with users in this location. |  [optional]
**partnerAssertedEntityId** | **String** | Identifier assigned to the Corporate Entity. Value is provided as \&quot;fsymEntityId\&quot; from FactSet&#39;s Symbology API. |  [optional]
**companyAgreementUrls** | [**java.util.List&lt;LocationResourceCompanyAgreementUrl&gt;**](LocationResourceCompanyAgreementUrl.md) | Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet. |  [optional]
**managedLocations** | [**java.util.List&lt;LocationResourceReference&gt;**](LocationResourceReference.md) | Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements. |  [optional]
**managingLocation** | [**LocationResourceManagingLocation**](LocationResourceManagingLocation.md) |  |  [optional]
**mainLocation** | [**LocationResourceMainLocation**](LocationResourceMainLocation.md) |  |  [optional]
**usernames** | **java.util.List&lt;String&gt;** | The FactSet usernames that are valid for users in this location. |  [optional] [readonly]
**meta** | [**LocationResourceMeta**](LocationResourceMeta.md) |  |  [optional]


## Implemented Interfaces

* Serializable


