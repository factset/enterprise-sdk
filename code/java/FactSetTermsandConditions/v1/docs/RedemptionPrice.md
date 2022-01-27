

# RedemptionPrice

Redemption Price Data Items for a Fixed Income security.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Security identifier used in the request. | 
**fsymId** | **String** | FactSet Permanent Security Identifier. | 
**date** | **LocalDate** | Date of the Redemption Price. | 
**category** | [**CategoryEnum**](#CategoryEnum) | Redemption Price Category - * **CALL** &#x3D; Call prices. * **PUT** &#x3D; Put prices. * **SF** &#x3D; Sinking Fund prices.  | 
**minAmt** | **Double** | Sinking Fund minimum amount. |  [optional]
**price** | **Double** | Redemption price for the category. |  [optional]



## Enum: CategoryEnum

Name | Value
---- | -----
CALL | &quot;CALL&quot;
PUT | &quot;PUT&quot;
SF | &quot;SF&quot;


## Implemented Interfaces

* Serializable


