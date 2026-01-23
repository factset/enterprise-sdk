# FactSet.SDK.ProcuretoPayInvoiceandBilling.Model.ServiceDetail
Details of services

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountId** | **string** | Unique Invoice Reference | [optional] 
**InvoiceId** | **string** | Concatenation of AccountID and Date as YYMM | [optional] 
**ProductId** | **int** | FactSet product identifier | [optional] 
**Quantity** | **int** | Quantity of entitlement | [optional] 
**DisplayName** | **string** | ProductId name | [optional] 
**UnitPrice** | **decimal** | Cost per unit of product | [optional] 
**Discount** | **decimal** | Discount on item | [optional] 
**LastMonthAdd** | **bool** | True/false if the product it new to invoice as of this invoice | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

