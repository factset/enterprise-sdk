# securitizedderivativesapifordigitalportals.PostSecuritizedDerivativeIssuerSearchRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **String** | Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned. | Value | Description | | --- | --- | | issuerGroup | Legal entities defined by FactSet and thus not representing an actual juristic person. | | issuer | Legal entities in the role of an issuer representing an actual juristic person. |   | [optional] [default to &#39;issuerGroup&#39;]
**name** | [**PostSecuritizedDerivativeIssuerSearchRequestDataName**](PostSecuritizedDerivativeIssuerSearchRequestDataName.md) |  | 
**withPriceEntitlement** | **Boolean** | If set to &#x60;true&#x60;, only issuers of securitized derivatives are considered for which there is at least one entitled notation. | [optional] [default to true]
**category** | [**PostSecuritizedDerivativeIssuerSearchRequestDataCategory**](PostSecuritizedDerivativeIssuerSearchRequestDataCategory.md) |  | [optional] 
**underlying** | [**PostSecuritizedDerivativeIssuerSearchRequestDataUnderlying**](PostSecuritizedDerivativeIssuerSearchRequestDataUnderlying.md) |  | [optional] 
**factorCertificates** | [**PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificates**](PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificates.md) |  | [optional] 
**registrationCountry** | [**PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountry**](PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountry.md) |  | [optional] 
**market** | [**PostSecuritizedDerivativeIssuerSearchRequestDataMarket**](PostSecuritizedDerivativeIssuerSearchRequestDataMarket.md) |  | [optional] 



## Enum: RoleEnum


* `issuerGroup` (value: `"issuerGroup"`)

* `issuer` (value: `"issuer"`)




