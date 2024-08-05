

# ExecutionParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionStatus** | **String** | Transaction Status of an Execution could be any of the following values: Executed, Booked, Cancelled. | 
**parentId** | **String** | Unique Id of the placement which spawned this execution |  [optional]
**net** | **Double** | Cash value of the transaction, net of brokerage costs. | 
**settlementDate** | **String** | Settlement date in YYYY-MM-DD format | 
**settlementCurrencyISO** | **String** | Currency code for Settlement Value | 
**settlementValue** | **Double** | Cash value of the transaction in settlement currency | 
**foreignExchangeRate** | **Float** | FX rate to convert the net, gross fields to reporting currency. |  [optional]
**broker** | **String** | Execution broker id. |  [optional]
**custodian** | **String** | Execution custodian Id. |  [optional]
**accruedInterest** | **Double** | Execution accrued interest. |  [optional]
**commission** | **Double** | Execution commission value. |  [optional]
**clearingCommission** | **Double** | Execution clearing commission value. |  [optional]
**localTax** | **Double** | Execution local tax value. |  [optional]
**localFee** | **Double** | Execution local fee value. |  [optional]
**brokerFee** | **Double** | Execution broker fee value. |  [optional]
**exchangeFee** | **Double** | Execution exchange fee value. |  [optional]
**miscellaneousFee** | **Double** | Execution miscellaneous fee value. |  [optional]
**transactionId** | **String** | Unique Id for the transaction | 
**orderId** | **String** | Unique Id of the order which originated the record |  [optional]
**portfolio** | **String** | Path of the portfolio (Ex: Client:/folder1/testing.ofdb) | 
**symbol** | **String** | Symbol corresponding to the traded instrument. | 
**description** | **String** | Description | 
**tradeType** | **String** | Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively. | 
**unitType** | **String** | Unit type could be one of Quantity or Value. | 
**transactionLeaves** | **Double** | Shares that have been ordered and not executed |  [optional]
**quantity** | **Double** | Quantity of the instrument traded. | 
**gross** | **Double** | Cash value of the transaction | 
**price** | **Double** | The transaction price |  [optional]
**currencyISO** | **String** | The currency code of cash valued fields, Net Amount and Gross Amount. | 
**tradeDate** | **String** | Trade date which is in the format YYYY-MM-DD | 
**addedDateTime** | **String** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF |  [optional]
**updatedDateTime** | **String** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF |  [optional]
**entity** | **String** |  |  [optional] [readonly]
**status** | **String** |  |  [optional] [readonly]


## Implemented Interfaces

* Serializable


