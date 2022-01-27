# factsettermsandconditions.RedemptionPrice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Security identifier used in the request. | 
**fsymId** | **String** | FactSet Permanent Security Identifier. | 
**date** | **Date** | Date of the Redemption Price. | 
**category** | **String** | Redemption Price Category - * **CALL** &#x3D; Call prices. * **PUT** &#x3D; Put prices. * **SF** &#x3D; Sinking Fund prices.  | 
**minAmt** | **Number** | Sinking Fund minimum amount. | [optional] 
**price** | **Number** | Redemption price for the category. | [optional] 



## Enum: CategoryEnum


* `CALL` (value: `"CALL"`)

* `PUT` (value: `"PUT"`)

* `SF` (value: `"SF"`)




