

# EMSChildOrder

EMS Child Orders

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parentId** | [**ParentId**](ParentId.md) |  | 
**side** | [**SideEnum**](#SideEnum) | Side of the order.If the parent order side is &#39;buy&#39;, valid values are &#39;buy&#39; or &#39;buyMinus&#39;. If the parent order side is &#39;sell&#39;, valid values are &#39;sell&#39; or &#39;sellPlus&#39; |  [optional]
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Type of the order | 
**orderQuantity** | **Double** | Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order. | 
**price** | **Double** | Order price per share. |  [optional]
**timeInForce** | [**TimeInForce**](TimeInForce.md) |  |  [optional]
**handlingInstructions** | [**HandlingInstructionsEnum**](#HandlingInstructionsEnum) | Instructions for order handling on Broker trading floor. |  [optional]
**exDestination** | **String** | Execution destination as defined by institution when order is entered. |  [optional]
**destination** | **String** | Represents the designated venue or location to which an order is intended to be routed. | 
**stopPrice** | **Double** | Stop-loss price to buy/sell stock at market. |  [optional]
**maxFloor** | **Double** | Maximum number of shares within an order to be shown on the exchange floor at any given time. |  [optional]
**minQuantity** | **Double** | Minimum quantity of an order to be executed. |  [optional]
**settlementType** | [**SettlementTypeEnum**](#SettlementTypeEnum) | Order settlement period |  [optional]
**settlementDate** | **String** | Specific date of trade settlement in YYYYMMDD format. |  [optional]
**executionInstructions** | [**ExecutionInstructionsEnum**](#ExecutionInstructionsEnum) | Instructions for order handling on exchange trading floor. |  [optional]
**locateRequired** | **Boolean** | Indicates whether the broker is to locate the stock in conjunction with a short sell order. |  [optional]
**text** | **String** | Free format text string. |  [optional]
**profile** | **String** | A name given to broker algo |  [optional]
**userDefinedFields** | **Map&lt;String, String&gt;** | User defined fields |  [optional]



## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;
BUYMINUS | &quot;buyMinus&quot;
SELLPLUS | &quot;sellPlus&quot;
SELLSHORT | &quot;sellShort&quot;
SELLSHORTEXEMPT | &quot;sellShortExempt&quot;



## Enum: OrderTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
LIMIT | &quot;limit&quot;
STOP | &quot;stop&quot;
STOPLIMIT | &quot;stopLimit&quot;
MARKETONCLOSE | &quot;marketOnClose&quot;
LIMITORBETTER | &quot;limitOrBetter&quot;



## Enum: HandlingInstructionsEnum

Name | Value
---- | -----
AUTOORDERPRIVATE | &quot;autoOrderPrivate&quot;
AUTOORDERPUBLIC | &quot;autoOrderPublic&quot;
BESTEXECUTION | &quot;bestExecution&quot;



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



## Enum: ExecutionInstructionsEnum

Name | Value
---- | -----
NOTHELD | &quot;notHeld&quot;
WORK | &quot;work&quot;
GOALONG | &quot;goAlong&quot;
OVERTHEDAY | &quot;overTheDay&quot;
HELD | &quot;held&quot;
PARTICIPATEDONOTINITIATE | &quot;participateDoNotInitiate&quot;
STRICTSCALE | &quot;strictScale&quot;
TRYTOSCALE | &quot;tryToScale&quot;
STAYONBIDSIDE | &quot;stayOnBidSide&quot;
STAYONOFFERSIDE | &quot;stayOnOfferSide&quot;
NOCROSS | &quot;noCross&quot;
OKTOCROSS | &quot;okToCross&quot;
CALLFIRST | &quot;callFirst&quot;
PERCENTOFVOLUME | &quot;percentOfVolume&quot;
DONOTINCREASE | &quot;doNotIncrease&quot;
DONOTREDUCE | &quot;doNotReduce&quot;
ALLORNONE | &quot;allOrNone&quot;
REINSTATEONSYSTEMFAILURE | &quot;reinstateOnSystemFailure&quot;
INSTITUTIONSONLY | &quot;institutionsOnly&quot;
REINSTATEONTRADINGHALT | &quot;reinstateOnTradingHalt&quot;
CANCELONTRADINGHALT | &quot;cancelOnTradingHalt&quot;
LASTPEG | &quot;lastPeg&quot;
MIDPRICEPEG | &quot;midPricePeg&quot;
NONNEGOTIABLE | &quot;nonNegotiable&quot;
OPENINGPEG | &quot;openingPeg&quot;
MARKETPEG | &quot;marketPeg&quot;
CANCELONSYSTEMFAILURE | &quot;cancelOnSystemFailure&quot;
PRIMARYPEG | &quot;primaryPeg&quot;
SUSPEND | &quot;suspend&quot;
FIXEDPEGTOLOCALBESTBID | &quot;fixedPegToLocalBestBid&quot;
CUSTOMERDISPLAYINSTRUCTION | &quot;customerDisplayInstruction&quot;
NETTING | &quot;netting&quot;
PEGTOVWAP | &quot;pegToVWAP&quot;
TRADEALONG | &quot;tradeAlong&quot;
TRYTOSTOP | &quot;tryToStop&quot;
CANCELIFNOTBEST | &quot;cancelIfNotBest&quot;
TRAILINGSTOPPEG | &quot;trailingStopPeg&quot;
STRICTLIMIT | &quot;strictLimit&quot;
IGNOREPRICEVALIDITYCHECKS | &quot;ignorePriceValidityChecks&quot;
PEGTOLIMITPRICE | &quot;pegToLimitPrice&quot;
WORKTOTARGETSTRATEGY | &quot;workToTargetStrategy&quot;
INTERMARKETSWEEP | &quot;intermarketSweep&quot;
EXTERNALROUTINGALLOWED | &quot;externalRoutingAllowed&quot;
EXTERNALROUTINGNOTALLOWED | &quot;externalRoutingNotAllowed&quot;
IMBALANCEONLY | &quot;imbalanceOnly&quot;
SINGLEEXECUTIONREQUESTEDFORBLOCKTRADE | &quot;singleExecutionRequestedForBlockTrade&quot;
BESTEXECUTION | &quot;bestExecution&quot;


## Implemented Interfaces

* Serializable


