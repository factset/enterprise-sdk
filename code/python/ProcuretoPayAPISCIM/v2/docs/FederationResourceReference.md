# FederationResourceReference

A reference to a Federation resource.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Identifier of the Federation. | 
**assertion_values** | [**[FederationResourceReferenceAssertionValue]**](FederationResourceReferenceAssertionValue.md) | References to the federations in which the user has at least one assertion value. | 
**ref** | **str** | The URI corresponding to a SCIM resource that is this Federation. | [optional] [readonly] 
**display** | **str** | A human-readable name, primarily used for display purposes. | [optional] [readonly] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


