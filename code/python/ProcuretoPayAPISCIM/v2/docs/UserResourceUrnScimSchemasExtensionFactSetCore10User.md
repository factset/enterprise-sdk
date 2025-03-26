# UserResourceUrnScimSchemasExtensionFactSetCore10User


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **str** | A FactSet \&quot;username\&quot; is FactSet&#39;s logical structure for grouping serial numbers into like-groups based on roleName, geographical location or line of business. | 
**serial_number** | **str** | A serial number represents an individual&#39;s unique FactSet account identifier and base-workstation access. Serial numbers are allocated to an individual when a valid RoleName is present. | [optional] [readonly] 
**unique_id** | **str** | User identifier from the legacy User Provisioning API. | [optional] [readonly] 
**location** | [**LocationResourceReference**](LocationResourceReference.md) |  | [optional] 
**user_taxonomy_data** | [**UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData**](UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData.md) |  | [optional] 
**role_name** | **str** | Predetermined role of specific individual. Issues individual a base FactSet workstation and serial number. If passed as NULL a base-FactSet workstation will be allocated to the individual granting the individual a FactSet SerialNumber | [optional] 
**royalty_class** | **str** | Determines the type of client the individual and the royalty fee to be remitted to FactSet for the individual. Expected Royalty Class values will be provided to you by your FactSet account representative. | [optional] 
**products** | [**[ProductResourceReference]**](ProductResourceReference.md) | An array of FactSet products to allocate/remove from an individual. Individual must have a FactSet serial number associated with them. | [optional] 
**pending_product_orders** | [**[PendingProductOrder]**](PendingProductOrder.md) | An array of pending FactSet product orders. | [optional] [readonly] 
**federations** | [**[FederationResourceReference]**](FederationResourceReference.md) | References to the federations in which the user has at least one assertion value. | [optional] 
**invoice_id** | **str** | The identifier of the invoice that should be associated with a new user for billing purposes. Note once an invoice ID has been assigned to a user, it cannot be modified via this API. If invoice ID re-assignment is necessary, please contact your FactSet representative. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


