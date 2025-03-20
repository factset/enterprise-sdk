# PostSecuritizedDerivativeIssuerSearchRequestData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**PostSecuritizedDerivativeIssuerSearchRequestDataName**](PostSecuritizedDerivativeIssuerSearchRequestDataName.md) |  | 
**role** | **str** | Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned. | Value | Description | | --- | --- | | issuerGroup | Legal entities defined by FactSet and thus not representing an actual juristic person. | | issuer | Legal entities in the role of an issuer representing an actual juristic person. |   | [optional]  if omitted the server will use the default value of "issuerGroup"
**with_price_entitlement** | **bool** | If set to &#x60;true&#x60;, only issuers of securitized derivatives are considered for which there is at least one entitled notation. | [optional]  if omitted the server will use the default value of True
**category** | [**PostSecuritizedDerivativeIssuerSearchRequestDataCategory**](PostSecuritizedDerivativeIssuerSearchRequestDataCategory.md) |  | [optional] 
**underlying** | [**PostSecuritizedDerivativeIssuerSearchRequestDataUnderlying**](PostSecuritizedDerivativeIssuerSearchRequestDataUnderlying.md) |  | [optional] 
**factor_certificates** | [**PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificates**](PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificates.md) |  | [optional] 
**registration_country** | [**PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountry**](PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountry.md) |  | [optional] 
**market** | [**PostSecuritizedDerivativeIssuerSearchRequestDataMarket**](PostSecuritizedDerivativeIssuerSearchRequestDataMarket.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


