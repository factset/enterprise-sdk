# FactSet.SDK.DirectStreamingofTransactionMessages.Model.OrderParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TransactionStatus** | **string** | Transaction Status of an Order could be any of the following values: PendingApproval, Open, Placed, PartialFilled, Filled, Expired, Cancelled, Rejected, Booked. | 
**InstructionType** | **string** | Instruction Type of an Order could be any of the following values: Market, Limit, Stop | [optional] 
**InstructionValue** | **double** | Instruction Value of an Order | [optional] 
**Tif** | **string** | TIF of an Order could be any of the following values: GTC, GTD, D, W | [optional] 
**TifDate** | **string** | TIF date which is in the format YYYY-MM-DD | [optional] 
**FundTeam** | **string** | Fund Team of an Order | [optional] 
**TradingTeam** | **string** | Trading Team of an Order | [optional] 
**Trader** | **string** | User Id of assigned trader. | [optional] 
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

