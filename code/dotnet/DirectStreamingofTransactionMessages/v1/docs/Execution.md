# FactSet.SDK.DirectStreamingofTransactionMessages.Model.Execution
Execution transaction attributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TradeDate** | **string** | Trade date which is in the format YYYY-MM-DD | 
**TransactionId** | **string** | Unique Id of the execution | 
**ParentId** | **string** | transactionId of the placement which spawned this execution | [optional] 
**OrderId** | **string** | orderId of the order related to this execution | [optional] 
**TransactionStatus** | **string** | Status of the Execution | 
**Net** | **double** | Cash value of the transaction, net of brokerage costs | 
**SettlementDate** | **string** | Settlement date in YYYY-MM-DD format | 
**SettlementCurrency** | **string** | The iso currency code of the Settlement Value | 
**SettlementValue** | **double** | Cash value of the transaction in settlement currency | 
**ForeignExchangeRate** | **float?** | FX rate to convert the net, gross fields to reporting currency | [optional] 
**Broker** | **string** | Execution broker id | [optional] 
**Custodian** | **string** | Execution custodian Id | [optional] 
**AccruedInterest** | **double?** | Execution accrued interest | [optional] 
**Commission** | **double?** | Execution commission value | [optional] 
**ClearingCommission** | **double?** | Execution clearing commission value | [optional] 
**LocalTax** | **double?** | Execution local tax value | [optional] 
**LocalFee** | **double?** | Execution local fee value | [optional] 
**BrokerFee** | **double?** | Execution broker fee value | [optional] 
**ExchangeFee** | **double?** | Execution exchange fee value | [optional] 
**MiscellaneousFee** | **double?** | Execution miscellaneous fee value | [optional] 
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

