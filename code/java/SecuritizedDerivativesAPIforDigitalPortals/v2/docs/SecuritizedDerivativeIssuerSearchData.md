

# SecuritizedDerivativeIssuerSearchData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned. |  [optional]
**name** | [**SecuritizedDerivativeIssuerSearchDataName**](SecuritizedDerivativeIssuerSearchDataName.md) |  |  [optional]
**category** | [**SecuritizedDerivativeIssuerSearchDataCategory**](SecuritizedDerivativeIssuerSearchDataCategory.md) |  |  [optional]
**underlying** | [**SecuritizedDerivativeIssuerSearchDataUnderlying**](SecuritizedDerivativeIssuerSearchDataUnderlying.md) |  |  [optional]
**factorCertificates** | [**SecuritizedDerivativeIssuerSearchDataFactorCertificates**](SecuritizedDerivativeIssuerSearchDataFactorCertificates.md) |  |  [optional]
**registrationCountry** | [**SecuritizedDerivativeIssuerSearchDataRegistrationCountry**](SecuritizedDerivativeIssuerSearchDataRegistrationCountry.md) |  |  [optional]
**market** | [**SecuritizedDerivativeIssuerSearchDataMarket**](SecuritizedDerivativeIssuerSearchDataMarket.md) |  |  [optional]



## Enum: RoleEnum

Name | Value
---- | -----
ISSUERGROUP | &quot;issuerGroup&quot;
ISSUER | &quot;issuer&quot;


## Implemented Interfaces

* Serializable


