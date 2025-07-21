# directstreamingoftransactionmessages.Placement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placementDate** | **String** | Placement date which is in the format YYYY-MM-DD | 
**transactionId** | **String** | Unique Id of the placement | 
**parentId** | **String** | transactionId of the order which spawned this placement | [optional] 
**orderId** | **String** | orderId of the order related to this placement | [optional] 
**transactionStatus** | **String** | Status of the Placement | 
**orderType** | **String** | Order type indicating the price type of the Placement | [optional] 
**limitPrice** | **Number** | Price related to limit and stopLimit order types | [optional] 
**stopPrice** | **Number** | Price related to stop and stopLimit order types | [optional] 
**tif** | **String** | Time In Force of the Placement | [optional] 
**tifDate** | **String** | Time In Force date for goodTilDate placements in YYYY-MM-DD format | [optional] 
**settlementType** | **String** | Indicates placement settlement period | [optional] 
**settlementDate** | **String** | Settlement date in YYYY-MM-DD format | [optional] 
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


* `placed` (value: `"placed"`)

* `partialFilled` (value: `"partialFilled"`)

* `filled` (value: `"filled"`)

* `expired` (value: `"expired"`)

* `cancelled` (value: `"cancelled"`)

* `rejected` (value: `"rejected"`)





## Enum: OrderTypeEnum


* `market` (value: `"market"`)

* `limit` (value: `"limit"`)

* `stopLimit` (value: `"stopLimit"`)

* `stop` (value: `"stop"`)





## Enum: TifEnum


* `goodTilCancel` (value: `"goodTilCancel"`)

* `goodTilDate` (value: `"goodTilDate"`)

* `day` (value: `"day"`)

* `week` (value: `"week"`)

* `atMarketOpen` (value: `"atMarketOpen"`)

* `atMarketClose` (value: `"atMarketClose"`)

* `immediateOrCancel` (value: `"immediateOrCancel"`)

* `fillOrKill` (value: `"fillOrKill"`)

* `goodTilCrossing` (value: `"goodTilCrossing"`)





## Enum: SettlementTypeEnum


* `regular` (value: `"regular"`)

* `cash` (value: `"cash"`)

* `nextDay` (value: `"nextDay"`)

* `tPlus2` (value: `"tPlus2"`)

* `tPlus3` (value: `"tPlus3"`)

* `tPlus4` (value: `"tPlus4"`)

* `future` (value: `"future"`)

* `whenIssued` (value: `"whenIssued"`)

* `sellersOption` (value: `"sellersOption"`)

* `tPlus5` (value: `"tPlus5"`)





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

* `warn` (value: `"warn"`)




