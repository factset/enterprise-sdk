# FactSet.SDK.ProcuretoPayAPISCIM.Model.UserResourceUrnScimSchemasExtensionFactSetCore10User

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Username** | **string** | A FactSet \&quot;username\&quot; is FactSet&#39;s logical structure for grouping serial numbers into like-groups based on roleName, geographical location or line of business. | 
**SerialNumber** | **string** | A serial number represents an individual&#39;s unique FactSet account identifier and base-workstation access. Serial numbers are allocated to an individual when a valid RoleName is present. | [optional] [readonly] 
**UniqueId** | **string** | User identifier from the legacy User Provisioning API. | [optional] [readonly] 
**Location** | [**LocationResourceReference**](LocationResourceReference.md) |  | [optional] 
**UserTaxonomyData** | [**UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData**](UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData.md) |  | [optional] 
**RoleName** | **string** | Predetermined role of specific individual. Issues individual a base FactSet workstation and serial number. If passed as NULL a base-FactSet workstation will be allocated to the individual granting the individual a FactSet SerialNumber | [optional] 
**RoyaltyClass** | **string** | Determines the type of client the individual and the royalty fee to be remitted to FactSet for the individual. Expected Royalty Class values will be provided to you by your FactSet account representative. | [optional] 
**Products** | [**List&lt;ProductResourceReference&gt;**](ProductResourceReference.md) | An array of FactSet products to allocate/remove from an individual. Individual must have a FactSet serial number associated with them. | [optional] 
**PendingProductOrders** | [**List&lt;PendingProductOrder&gt;**](PendingProductOrder.md) | An array of pending FactSet product orders. | [optional] [readonly] 
**Federations** | [**List&lt;FederationResourceReference&gt;**](FederationResourceReference.md) | References to the federations in which the user has at least one assertion value. | [optional] 
**InvoiceId** | **string** | The identifier of the invoice that should be associated with a new user for billing purposes. Note once an invoice ID has been assigned to a user, it cannot be modified via this API. If invoice ID re-assignment is necessary, please contact your FactSet representative. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

