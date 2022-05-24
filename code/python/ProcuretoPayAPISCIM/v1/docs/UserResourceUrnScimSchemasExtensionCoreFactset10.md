# UserResourceUrnScimSchemasExtensionCoreFactset10


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **str** | A FactSet \&quot;username\&quot; is FactSet&#39;s logical structure for grouping serial numbers into like-groups based on roleName, geographical location or line of business. | 
**location** | [**LocationResourceReference**](LocationResourceReference.md) |  | 
**serial_number** | **str** | A serial number represents an individual&#39;s unique FactSet account identifier and base-workstation access. Serial numbers are allocated to an individual when a valid RoleName is present. | [optional] [readonly] 
**fact_set_net_id** | **str** | FactSet.net ID. | [optional] [readonly] 
**role_name** | **str** | Predetermined role of specific individual. Issues individual a base FactSet workstation and serial number. If passed as NULL a base-FactSet workstation will be allocated to the individual granting the individual a FactSet SerialNumber | [optional] 
**products** | [**[ProductResourceReference]**](ProductResourceReference.md) | An array of FactSet products to allocate/remove from an individual. Individual must have a FactSet serial number associated with them. | [optional] 
**pending_product_orders** | [**[PendingProductOrder]**](PendingProductOrder.md) | An array of pending FactSet product orders. | [optional] [readonly] 
**assertion_value** | **str** | Field containing the value, passed as nameID, used to assert the identity of an individual via SAML2.0 which maps service-provider-side to a FactSet serial number. Only applicable to individuals with a FactSet serial number with a Federation setup between your domain and FactSet&#39;s | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


