

# InboundOrder

Inbound Order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientOrderId** | **String** | Unique id for the order |  [optional]
**instrument** | [**Instrument**](Instrument.md) |  | 
**side** | [**SideEnum**](#SideEnum) | Side of the order. | 
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Type of the order | 
**orderQuantity** | **Double** | Number of shares/Quantity. |  [optional]
**price** | **Double** | Order price per share |  [optional]
**stopPrice** | **Double** | Stop-loss price to buy/sell stock at market. |  [optional]
**strikePrice** | **Double** | Strike Price for an Option. |  [optional]
**currency** | **String** | Currency used for price in ISO format. |  [optional]
**isCovered** | **Boolean** | Signifies if a specific order is a covered order. A covered order is one that involves an investment strategy with the capability to limit the potential loss of the order. |  [optional]
**maxShow** | **Double** | Maximum number of shares within an order to be shown to other customers. |  [optional]
**maxFloor** | **Double** | Maximum number of shares within an order to be shown on the exchange floor at any given time. |  [optional]
**prevClosePrice** | **Double** | Previous closing price of security. |  [optional]
**settlementType** | [**SettlementTypeEnum**](#SettlementTypeEnum) | Order settlement period. |  [optional]
**settlementDate** | **String** | Settlement date of trade settlement in YYYYMMDD format |  [optional]
**handlingInstructions** | [**HandlingInstructionsEnum**](#HandlingInstructionsEnum) | Instructions for order handling on Broker trading floor. |  [optional]
**executionInstructions** | [**ExecutionInstructionsEnum**](#ExecutionInstructionsEnum) | Instructions for order handling on exchange trading floor. |  [optional]
**locateRequired** | **Boolean** | Indicates whether the broker is to locate the stock in conjunction with a short sell order. |  [optional]
**effectiveTime** | **String** | Effective time in YYYYMMDD-HH:MM:SS format expressed in UTC |  [optional]
**account** | **String** | Account for the basket, parent basket or position. |  [optional]
**timeInForce** | [**TimeInForce**](TimeInForce.md) |  |  [optional]
**inboundDestination** | **String** | To facilitate integration with translators that transform orders into a format compatible with the internal order routing and execution infrastructure. |  [optional]
**userDefinedFields** | **Map&lt;String, String&gt;** | User defined fields |  [optional]



## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;
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



## Enum: HandlingInstructionsEnum

Name | Value
---- | -----
AUTOORDERPRIVATE | &quot;autoOrderPrivate&quot;
AUTOORDERPUBLIC | &quot;autoOrderPublic&quot;
BESTEXECUTION | &quot;bestExecution&quot;



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


