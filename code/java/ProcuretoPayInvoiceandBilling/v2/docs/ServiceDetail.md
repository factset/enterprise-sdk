

# ServiceDetail

Details of services

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | Unique Invoice Reference |  [optional]
**invoiceId** | **String** | Concatenation of AccountID and Date as YYMM |  [optional]
**productId** | **Integer** | FactSet product identifier |  [optional]
**quantity** | **Integer** | Quantity of entitlement |  [optional]
**displayName** | **String** | ProductId name |  [optional]
**unitPrice** | **BigDecimal** | Cost per unit of product |  [optional]
**discount** | **BigDecimal** | Discount on item |  [optional]
**lastMonthAdd** | **Boolean** | True/false if the product it new to invoice as of this invoice |  [optional]


## Implemented Interfaces

* Serializable


