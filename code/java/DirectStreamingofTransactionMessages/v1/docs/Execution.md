

# Execution

Execution transaction attributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tradeDate** | **String** | Trade date which is in the format YYYY-MM-DD | 
**transactionId** | **String** | Unique Id of the execution | 
**parentId** | **String** | transactionId of the placement which spawned this execution |  [optional]
**orderId** | **String** | orderId of the order related to this execution |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | Status of the Execution | 
**net** | **Double** | Cash value of the transaction, net of brokerage costs | 
**settlementDate** | **String** | Settlement date in YYYY-MM-DD format | 
**settlementCurrency** | **String** | The iso currency code of the Settlement Value | 
**settlementValue** | **Double** | Cash value of the transaction in settlement currency | 
**foreignExchangeRate** | **Float** | FX rate to convert the net, gross fields to reporting currency |  [optional]
**broker** | **String** | Execution broker id |  [optional]
**custodian** | **String** | Execution custodian Id |  [optional]
**accruedInterest** | **Double** | Execution accrued interest |  [optional]
**commission** | **Double** | Execution commission value |  [optional]
**clearingCommission** | **Double** | Execution clearing commission value |  [optional]
**localTax** | **Double** | Execution local tax value |  [optional]
**localFee** | **Double** | Execution local fee value |  [optional]
**brokerFee** | **Double** | Execution broker fee value |  [optional]
**exchangeFee** | **Double** | Execution exchange fee value |  [optional]
**miscellaneousFee** | **Double** | Execution miscellaneous fee value |  [optional]
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
EXECUTED | &quot;executed&quot;
BOOKED | &quot;booked&quot;
CANCELLED | &quot;cancelled&quot;



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
WARN | &quot;warn&quot;


## Implemented Interfaces

* Serializable


