# FactSet.SDK.ProcuretoPayAPISCIM.Model.UserResourceUrnScimSchemasExtensionFactSetCore10User

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Username** | **string** | A FactSet \&quot;username\&quot; is FactSet&#39;s logical structure for grouping serial numbers into like-groups based on roleName, geographical location or line of business. | 
**SerialNumber** | **string** | A serial number represents an individual&#39;s unique FactSet account identifier and base-workstation access. Serial numbers are allocated to an individual when a valid RoleName is present. | [optional] [readonly] 
**FactSetNetId** | **string** | FactSet.net ID. | [optional] [readonly] 
**Location** | [**LocationResourceReference**](LocationResourceReference.md) |  | [optional] 
**RoleName** | **string** | Predetermined role of specific individual. Issues individual a base FactSet workstation and serial number. If passed as NULL a base-FactSet workstation will be allocated to the individual granting the individual a FactSet SerialNumber | [optional] 
**Products** | [**List&lt;ProductResourceReference&gt;**](ProductResourceReference.md) | An array of FactSet products to allocate/remove from an individual. Individual must have a FactSet serial number associated with them. | [optional] 
**PendingProductOrders** | [**List&lt;PendingProductOrder&gt;**](PendingProductOrder.md) | An array of pending FactSet product orders. | [optional] [readonly] 
**AssertionValue** | **string** | Field containing the value, passed as nameID, used to assert the identity of an individual via SAML2.0 which maps service-provider-side to a FactSet serial number. Only applicable to individuals with a FactSet serial number with a Federation setup between your domain and FactSet&#39;s | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

