

# Order

Order transaction attributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderDate** | **String** | Order date which is in the format YYYY-MM-DD | 
**transactionId** | **String** | Unique Id of the order | 
**orderId** | **String** | Id of the order as assigned by the OMS. If not specified then transactionId is used. |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | Status of the Order | 
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Order type indicating the price type of the Order |  [optional]
**limitPrice** | **Double** | Price related to limit and stopLimit order types |  [optional]
**stopPrice** | **Double** | Price related to stop and stopLimit order types |  [optional]
**tif** | [**TifEnum**](#TifEnum) | Time In Force of the Order |  [optional]
**tifDate** | **String** | Time In Force date for goodTilDate orders in YYYY-MM-DD format |  [optional]
**settlementType** | [**SettlementTypeEnum**](#SettlementTypeEnum) | Indicates order settlement period |  [optional]
**settlementDate** | **String** | Settlement date in YYYY-MM-DD format |  [optional]
**fundTeam** | **String** | Fund Team Id of the Order |  [optional]
**tradingTeam** | **String** | Trading Team Id of the Order |  [optional]
**trader** | **String** | User Id of assigned trader. |  [optional]
**account** | **String** | Path of the account | 
**symbol** | **String** | Symbol corresponding to the traded instrument | 
**instrumentName** | **String** | Name or description of the traded instrument | 
**side** | [**SideEnum**](#SideEnum) | Side of the order | 
**unitType** | [**UnitTypeEnum**](#UnitTypeEnum) | Unit type of the order. Indicates if the trade is driven by quantity or value | 
**transactionLeaves** | **Double** | Shares that have been ordered and not executed |  [optional]
**quantity** | **Double** | Quantity of the instrument traded | 
**gross** | **Double** | Cash value of the transaction | 
**price** | **Double** | The transaction price |  [optional]
**currency** | **String** | The iso currency code of cash valued fields, Net Amount and Gross Amount | 
**complianceStatus** | [**ComplianceStatusEnum**](#ComplianceStatusEnum) | Compliance check status |  [optional]
**addedDateTime** | **String** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF |  [optional]
**updatedDateTime** | **String** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF |  [optional]
**additionalFields** | [**java.util.List&lt;AdditionalField&gt;**](AdditionalField.md) | List of additional fields which can be used for dynamically populating other ofdb fields |  [optional]



## Enum: TransactionStatusEnum

Name | Value
---- | -----
PENDINGAPPROVAL | &quot;pendingApproval&quot;
OPEN | &quot;open&quot;
PLACED | &quot;placed&quot;
PARTIALFILLED | &quot;partialFilled&quot;
FILLED | &quot;filled&quot;
EXPIRED | &quot;expired&quot;
CANCELLED | &quot;cancelled&quot;
REJECTED | &quot;rejected&quot;
BOOKED | &quot;booked&quot;



## Enum: OrderTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
LIMIT | &quot;limit&quot;
STOPLIMIT | &quot;stopLimit&quot;
STOP | &quot;stop&quot;



## Enum: TifEnum

Name | Value
---- | -----
GOODTILCANCEL | &quot;goodTilCancel&quot;
GOODTILDATE | &quot;goodTilDate&quot;
DAY | &quot;day&quot;
WEEK | &quot;week&quot;



## Enum: SettlementTypeEnum

Name | Value
---- | -----
REGULAR | &quot;regular&quot;
CASH | &quot;cash&quot;
NEXTDAY | &quot;nextDay&quot;
TPLUS2 | &quot;tPlus2&quot;
TPLUS3 | &quot;tPlus3&quot;
TPLUS4 | &quot;tPlus4&quot;
FUTURE | &quot;future&quot;
WHENISSUED | &quot;whenIssued&quot;
SELLERSOPTION | &quot;sellersOption&quot;
TPLUS5 | &quot;tPlus5&quot;



## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
BUYCOVER | &quot;buyCover&quot;
SELL | &quot;sell&quot;
SELLSHORT | &quot;sellShort&quot;



## Enum: UnitTypeEnum

Name | Value
---- | -----
QUANTITY | &quot;quantity&quot;
VALUE | &quot;value&quot;



## Enum: ComplianceStatusEnum

Name | Value
---- | -----
UNCHECKED | &quot;unchecked&quot;
PASS | &quot;pass&quot;
FAIL | &quot;fail&quot;


## Implemented Interfaces

* Serializable


