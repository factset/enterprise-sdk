# FactSet.SDK.FactSetRBICS.Model.TradeNames

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TradeId** | **string** | Unique identifier for the product participation mapping | 
**ProductId** | **long?** | Unique identifier for the product | 
**ProductName** | **string** | Full name of the product/tradeName/brand. An asterisk (*) suffix indicates  an in-licensing agreement.  | 
**ShortProductName** | **string** | Shortened product name with extraneous company metadata removed | 
**L6Id** | **decimal?** | Unique identifier for the RBICS Level 6 sector to which the product is assigned | [optional] 
**L6Name** | **string** | The descriptive name for the Level 6 sector classification | [optional] 
**StartDate** | **DateTime?** | Date the record was first published | [optional] 
**EndDate** | **DateTime?** | Date the record was terminated. The end date may sometimes be null, indicating that the tradeName is currently active. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

