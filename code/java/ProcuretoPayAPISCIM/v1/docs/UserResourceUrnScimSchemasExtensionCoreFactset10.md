

# UserResourceUrnScimSchemasExtensionCoreFactset10


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | A FactSet \&quot;username\&quot; is FactSet&#39;s logical structure for grouping serial numbers into like-groups based on roleName, geographical location or line of business. | 
**serialNumber** | **String** | A serial number represents an individual&#39;s unique FactSet account identifier and base-workstation access. Serial numbers are allocated to an individual when a valid RoleName is present. |  [optional] [readonly]
**factSetNetId** | **String** | FactSet.net ID. |  [optional] [readonly]
**location** | [**LocationResourceReference**](LocationResourceReference.md) |  | 
**roleName** | **String** | Predetermined role of specific individual. Issues individual a base FactSet workstation and serial number. If passed as NULL a base-FactSet workstation will be allocated to the individual granting the individual a FactSet SerialNumber |  [optional]
**products** | [**java.util.List&lt;ProductResourceReference&gt;**](ProductResourceReference.md) | An array of FactSet products to allocate/remove from an individual. Individual must have a FactSet serial number associated with them. |  [optional]
**pendingProductOrders** | [**java.util.List&lt;PendingProductOrder&gt;**](PendingProductOrder.md) | An array of pending FactSet product orders. |  [optional] [readonly]
**assertionValue** | **String** | Field containing the value, passed as nameID, used to assert the identity of an individual via SAML2.0 which maps service-provider-side to a FactSet serial number. Only applicable to individuals with a FactSet serial number with a Federation setup between your domain and FactSet&#39;s |  [optional]


## Implemented Interfaces

* Serializable


