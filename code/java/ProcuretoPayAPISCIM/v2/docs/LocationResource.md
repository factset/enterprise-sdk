

# LocationResource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **java.util.List&lt;String&gt;** |  |  [optional]
**id** | **String** |  |  [optional] [readonly]
**externalId** | **String** | An identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. Note: for clients that are not FactSet partners, this identifier must be unique within the main location associated with the client&#39;s FactSet username. |  [optional]
**name** | **String** | Name of the location. | 
**description** | **String** | Description of the location. |  [optional]
**address1** | **String** | First line of location&#39;s address. |  [optional]
**address2** | **String** | Second line of location&#39;s address. |  [optional]
**address3** | **String** | Third line of location&#39;s address. |  [optional]
**locality** | **String** | City of location. |  [optional]
**region** | **String** | State or province of location. |  [optional]
**postalCode** | **String** | Postal code of location. |  [optional]
**country** | **String** | Country of location. |  [optional]
**phoneNumber** | **String** | Phone number of location. |  [optional] [readonly]
**firmDescription** | [**FirmDescriptionResourceReference**](FirmDescriptionResourceReference.md) |  |  [optional]
**emailDomains** | **java.util.List&lt;String&gt;** | The domain names that are valid for use with email addresses associated with users in this location. |  [optional]
**partnerAssertedEntityId** | **String** | Identifier assigned to the Corporate Entity. Value is provided as \&quot;fsymEntityId\&quot; from FactSet&#39;s Symbology API. |  [optional]
**companyAgreementUrls** | [**java.util.List&lt;LocationResourceCompanyAgreementUrls&gt;**](LocationResourceCompanyAgreementUrls.md) | Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet. |  [optional]
**managedLocations** | [**java.util.List&lt;LocationResourceReference&gt;**](LocationResourceReference.md) | Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements. |  [optional]
**managingLocation** | [**LocationResourceReference**](LocationResourceReference.md) | FactSet location ID managing this location for a Research Entitlements Administrator and requesting location-based entitlements for all managed locations associated. |  [optional]
**mainLocation** | [**LocationResourceReference**](LocationResourceReference.md) | The managing or otherwise parent location associated with this location. All locations associated with the mainLocation are viewed as related and within the same business unit in FactSet&#39;s CRM systems. |  [optional]
**usernames** | **java.util.List&lt;String&gt;** | The FactSet usernames that are valid for users in this location. |  [optional] [readonly]
**meta** | [**LocationResourceMeta**](LocationResourceMeta.md) |  |  [optional]


## Implemented Interfaces

* Serializable


