# FactSet.SDK.DirectStreamingofTransactionMessages.Model.Placement
Placement transaction attributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PlacementDate** | **string** | Placement date which is in the format YYYY-MM-DD | 
**TransactionId** | **string** | Unique Id of the placement | 
**ParentId** | **string** | transactionId of the order which spawned this placement | [optional] 
**OrderId** | **string** | orderId of the order related to this placement | [optional] 
**TransactionStatus** | **string** | Status of the Placement | 
**OrderType** | **string** | Order type indicating the price type of the Placement | [optional] 
**LimitPrice** | **double** | Price related to limit and stopLimit order types | [optional] 
**StopPrice** | **double** | Price related to stop and stopLimit order types | [optional] 
**Tif** | **string** | Time In Force of the Placement | [optional] 
**TifDate** | **string** | Time In Force date for goodTilDate placements in YYYY-MM-DD format | [optional] 
**SettlementType** | **string** | Indicates placement settlement period | [optional] 
**SettlementDate** | **string** | Settlement date in YYYY-MM-DD format | [optional] 
**Account** | **string** | Path of the account | 
**Symbol** | **string** | Symbol corresponding to the traded instrument | 
**InstrumentName** | **string** | Name or description of the traded instrument | 
**Side** | **string** | Side of the order | 
**UnitType** | **string** | Unit type of the order. Indicates if the trade is driven by quantity or value | 
**TransactionLeaves** | **double?** | Shares that have been ordered and not executed | [optional] 
**Quantity** | **double** | Quantity of the instrument traded | 
**Gross** | **double** | Cash value of the transaction | 
**Price** | **double?** | The transaction price | [optional] 
**Currency** | **string** | The iso currency code of cash valued fields, Net Amount and Gross Amount | 
**ComplianceStatus** | **string** | Compliance check status | [optional] 
**AddedDateTime** | **string** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**UpdatedDateTime** | **string** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**AdditionalFields** | [**List&lt;AdditionalField&gt;**](AdditionalField.md) | List of additional fields which can be used for dynamically populating other ofdb fields | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

