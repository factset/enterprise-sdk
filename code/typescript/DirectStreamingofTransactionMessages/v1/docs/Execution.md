# directstreamingoftransactionmessages.Execution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tradeDate** | **String** | Trade date which is in the format YYYY-MM-DD | 
**transactionId** | **String** | Unique Id of the execution | 
**parentId** | **String** | transactionId of the placement which spawned this execution | [optional] 
**orderId** | **String** | orderId of the order related to this execution | [optional] 
**transactionStatus** | **String** | Status of the Execution | 
**net** | **Number** | Cash value of the transaction, net of brokerage costs | 
**settlementDate** | **String** | Settlement date in YYYY-MM-DD format | 
**settlementCurrency** | **String** | The iso currency code of the Settlement Value | 
**settlementValue** | **Number** | Cash value of the transaction in settlement currency | 
**foreignExchangeRate** | **Number** | FX rate to convert the net, gross fields to reporting currency | [optional] 
**broker** | **String** | Execution broker id | [optional] 
**custodian** | **String** | Execution custodian Id | [optional] 
**accruedInterest** | **Number** | Execution accrued interest | [optional] 
**commission** | **Number** | Execution commission value | [optional] 
**clearingCommission** | **Number** | Execution clearing commission value | [optional] 
**localTax** | **Number** | Execution local tax value | [optional] 
**localFee** | **Number** | Execution local fee value | [optional] 
**brokerFee** | **Number** | Execution broker fee value | [optional] 
**exchangeFee** | **Number** | Execution exchange fee value | [optional] 
**miscellaneousFee** | **Number** | Execution miscellaneous fee value | [optional] 
**account** | **String** | Path of the account | 
**symbol** | **String** | Symbol corresponding to the traded instrument | 
**instrumentName** | **String** | Name or description of the traded instrument | 
**side** | **String** | Side of the order | 
**unitType** | **String** | Unit type of the order. Indicates if the trade is driven by quantity or value | 
**transactionLeaves** | **Number** | Shares that have been ordered and not executed | [optional] 
**quantity** | **Number** | Quantity of the instrument traded | 
**gross** | **Number** | Cash value of the transaction | 
**price** | **Number** | The transaction price | [optional] 
**currency** | **String** | The iso currency code of cash valued fields, Net Amount and Gross Amount | 
**complianceStatus** | **String** | Compliance check status | [optional] 
**addedDateTime** | **String** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**updatedDateTime** | **String** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**additionalFields** | [**[AdditionalField]**](AdditionalField.md) | List of additional fields which can be used for dynamically populating other ofdb fields | [optional] 



## Enum: TransactionStatusEnum


* `executed` (value: `"executed"`)

* `booked` (value: `"booked"`)

* `cancelled` (value: `"cancelled"`)





## Enum: SideEnum


* `buy` (value: `"buy"`)

* `buyCover` (value: `"buyCover"`)

* `sell` (value: `"sell"`)

* `sellShort` (value: `"sellShort"`)





## Enum: UnitTypeEnum


* `quantity` (value: `"quantity"`)

* `value` (value: `"value"`)





## Enum: ComplianceStatusEnum


* `unchecked` (value: `"unchecked"`)

* `pass` (value: `"pass"`)

* `fail` (value: `"fail"`)




