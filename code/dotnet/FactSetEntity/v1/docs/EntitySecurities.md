# FactSet.SDK.FactSetEntity.Model.EntitySecurities

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Ultimate Parent ID of the Requested Security ID | [optional] 
**FsymSecurityId** | **string** | FactSet Security ID (-S). | [optional] 
**FsymListingId** | **string** | FactSet Listing ID (-L). Corresponds to the listing exchange for the requested security. Not applicable for FI instruments. | [optional] 
**SecurityType** | **string** | The Security Type Code. Security Type Code details and mapping are described on Online Assistant Page 15776 for Equity and Page 16014 for Fixed Income. | [optional] 
**ListingExchange** | **string** | The securities primary listing exchange. | [optional] 
**SecurityName** | **string** | Security name | [optional] 
**FsymEntityId** | **string** | Unique FactSet-generated identifier representing an entity. | [optional] 
**FsymTickerExchange** | **string** | The security&#39;s ticker-exchange, representing the listing exchange symbol. | [optional] 
**FsymTickerRegion** | **string** | The security&#39;s regional ticker. | [optional] 
**ActiveFlag** | **int** | Indicates if security is active. 1 &#x3D; Active; 0 &#x3D; Inactive. | [optional] 
**RequestId** | **string** | Identifier used in &#x60;ids&#x60; parameter.  When list of identifiers used, they will be parsed and resolved individually. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

