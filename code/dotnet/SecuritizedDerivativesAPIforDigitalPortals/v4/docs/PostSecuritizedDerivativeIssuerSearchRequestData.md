# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeIssuerSearchRequestData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **string** | Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned. | Value | Description | | - -- | - -- | | issuerGroup | Legal entities defined by FactSet and thus not representing an actual juristic person. | | issuer | Legal entities in the role of an issuer representing an actual juristic person. |   | [optional] [default to RoleEnum.IssuerGroup]
**Name** | [**PostSecuritizedDerivativeIssuerSearchRequestDataName**](PostSecuritizedDerivativeIssuerSearchRequestDataName.md) |  | 
**WithPriceEntitlement** | **bool** | If set to &#x60;true&#x60;, only issuers of securitized derivatives are considered for which there is at least one entitled notation. | [optional] [default to true]
**Category** | [**PostSecuritizedDerivativeIssuerSearchRequestDataCategory**](PostSecuritizedDerivativeIssuerSearchRequestDataCategory.md) |  | [optional] 
**Underlying** | [**PostSecuritizedDerivativeIssuerSearchRequestDataUnderlying**](PostSecuritizedDerivativeIssuerSearchRequestDataUnderlying.md) |  | [optional] 
**FactorCertificates** | [**PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificates**](PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificates.md) |  | [optional] 
**RegistrationCountry** | [**PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountry**](PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountry.md) |  | [optional] 
**Market** | [**PostSecuritizedDerivativeIssuerSearchRequestDataMarket**](PostSecuritizedDerivativeIssuerSearchRequestDataMarket.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

