# FactSet.SDK.DirectStreamingofTransactionMessages.Model.ExecutionParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TransactionStatus** | **string** | Transaction Status of an Execution could be any of the following values: Executed, Booked, Cancelled. | 
**ParentId** | **string** | Unique Id of the placement which spawned this execution | [optional] 
**Net** | **double** | Cash value of the transaction, net of brokerage costs. | 
**SettlementDate** | **string** | Settlement date in YYYY-MM-DD format | 
**SettlementCurrencyISO** | **string** | Currency code for Settlement Value | 
**SettlementValue** | **double** | Cash value of the transaction in settlement currency | 
**ForeignExchangeRate** | **float** | FX rate to convert the net, gross fields to reporting currency. | [optional] 
**Broker** | **string** | Execution broker id. | [optional] 
**Custodian** | **string** | Execution custodian Id. | [optional] 
**AccruedInterest** | **double** | Execution accrued interest. | [optional] 
**Commission** | **double** | Execution commission value. | [optional] 
**ClearingCommission** | **double** | Execution clearing commission value. | [optional] 
**LocalTax** | **double** | Execution local tax value. | [optional] 
**LocalFee** | **double** | Execution local fee value. | [optional] 
**BrokerFee** | **double** | Execution broker fee value. | [optional] 
**ExchangeFee** | **double** | Execution exchange fee value. | [optional] 
**MiscellaneousFee** | **double** | Execution miscellaneous fee value. | [optional] 
**TransactionId** | **string** | Unique Id for the transaction | 
**OrderId** | **string** | Unique Id of the order which originated the record | [optional] 
**Portfolio** | **string** | Path of the portfolio (Ex: Client:/folder1/testing.ofdb) | 
**Symbol** | **string** | Symbol corresponding to the traded instrument. | 
**Description** | **string** | Description | 
**TradeType** | **string** | Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively. | 
**UnitType** | **string** | Unit type could be one of Quantity or Value. | 
**TransactionLeaves** | **double** | Shares that have been ordered and not executed | [optional] 
**Quantity** | **double** | Quantity of the instrument traded. | 
**Gross** | **double** | Cash value of the transaction | 
**Price** | **double** | The transaction price | [optional] 
**CurrencyISO** | **string** | The currency code of cash valued fields, Net Amount and Gross Amount. | 
**TradeDate** | **string** | Trade date which is in the format YYYY-MM-DD | 
**AddedDateTime** | **string** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**UpdatedDateTime** | **string** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**Entity** | **string** |  | [optional] [readonly] 
**Status** | **string** |  | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

