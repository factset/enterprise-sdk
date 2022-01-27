# RedemptionPrice

Redemption Price Data Items for a Fixed Income security.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Security identifier used in the request. | 
**fsym_id** | **str** | FactSet Permanent Security Identifier. | 
**date** | **date** | Date of the Redemption Price. | 
**category** | **str** | Redemption Price Category - * **CALL** &#x3D; Call prices. * **PUT** &#x3D; Put prices. * **SF** &#x3D; Sinking Fund prices.  | 
**min_amt** | **float** | Sinking Fund minimum amount. | [optional] 
**price** | **float** | Redemption price for the category. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


