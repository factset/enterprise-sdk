# factsettrading.InboundOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientOrderId** | **String** | Unique id for the order | [optional] 
**instrument** | [**Instrument**](Instrument.md) |  | 
**side** | **String** | Side of the order. | 
**orderType** | **String** | Type of the order | 
**orderQuantity** | **Number** | Number of shares/Quantity. | [optional] 
**price** | **Number** | Order price per share | [optional] 
**stopPrice** | **Number** | Stop-loss price to buy/sell stock at market. | [optional] 
**strikePrice** | **Number** | Strike Price for an Option. | [optional] 
**currency** | **String** | Currency used for price in ISO format. | [optional] 
**isCovered** | **Boolean** | Signifies if a specific order is a covered order. A covered order is one that involves an investment strategy with the capability to limit the potential loss of the order. | [optional] 
**maxShow** | **Number** | Maximum number of shares within an order to be shown to other customers. | [optional] 
**maxFloor** | **Number** | Maximum number of shares within an order to be shown on the exchange floor at any given time. | [optional] 
**prevClosePrice** | **Number** | Previous closing price of security. | [optional] 
**settlementType** | **String** | Order settlement period. | [optional] 
**settlementDate** | **String** | Settlement date of trade settlement in YYYYMMDD format | [optional] 
**handlingInstructions** | **String** | Instructions for order handling on Broker trading floor. | [optional] 
**executionInstructions** | **String** | Instructions for order handling on exchange trading floor. | [optional] 
**locateRequired** | **Boolean** | Indicates whether the broker is to locate the stock in conjunction with a short sell order. | [optional] 
**effectiveTime** | **String** | Effective time in YYYYMMDD-HH:MM:SS format expressed in UTC | [optional] 
**account** | **String** | Account for the basket, parent basket or position. | [optional] 
**timeInForce** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**inboundDestination** | **String** | To facilitate integration with translators that transform orders into a format compatible with the internal order routing and execution infrastructure. | [optional] 
**userDefinedFields** | **{String: String}** | User defined fields | [optional] 



## Enum: SideEnum


* `buy` (value: `"buy"`)

* `sell` (value: `"sell"`)

* `sellShort` (value: `"sellShort"`)

* `sellShortExempt` (value: `"sellShortExempt"`)





## Enum: OrderTypeEnum


* `market` (value: `"market"`)

* `limit` (value: `"limit"`)

* `stop` (value: `"stop"`)

* `stopLimit` (value: `"stopLimit"`)

* `marketOnClose` (value: `"marketOnClose"`)

* `limitOrBetter` (value: `"limitOrBetter"`)





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





## Enum: HandlingInstructionsEnum


* `autoOrderPrivate` (value: `"autoOrderPrivate"`)

* `autoOrderPublic` (value: `"autoOrderPublic"`)

* `bestExecution` (value: `"bestExecution"`)





## Enum: ExecutionInstructionsEnum


* `notHeld` (value: `"notHeld"`)

* `work` (value: `"work"`)

* `goAlong` (value: `"goAlong"`)

* `overTheDay` (value: `"overTheDay"`)

* `held` (value: `"held"`)

* `participateDoNotInitiate` (value: `"participateDoNotInitiate"`)

* `strictScale` (value: `"strictScale"`)

* `tryToScale` (value: `"tryToScale"`)

* `stayOnBidSide` (value: `"stayOnBidSide"`)

* `stayOnOfferSide` (value: `"stayOnOfferSide"`)

* `noCross` (value: `"noCross"`)

* `okToCross` (value: `"okToCross"`)

* `callFirst` (value: `"callFirst"`)

* `percentOfVolume` (value: `"percentOfVolume"`)

* `doNotIncrease` (value: `"doNotIncrease"`)

* `doNotReduce` (value: `"doNotReduce"`)

* `allOrNone` (value: `"allOrNone"`)

* `reinstateOnSystemFailure` (value: `"reinstateOnSystemFailure"`)

* `institutionsOnly` (value: `"institutionsOnly"`)

* `reinstateOnTradingHalt` (value: `"reinstateOnTradingHalt"`)

* `cancelOnTradingHalt` (value: `"cancelOnTradingHalt"`)

* `lastPeg` (value: `"lastPeg"`)

* `midPricePeg` (value: `"midPricePeg"`)

* `nonNegotiable` (value: `"nonNegotiable"`)

* `openingPeg` (value: `"openingPeg"`)

* `marketPeg` (value: `"marketPeg"`)

* `cancelOnSystemFailure` (value: `"cancelOnSystemFailure"`)

* `primaryPeg` (value: `"primaryPeg"`)

* `suspend` (value: `"suspend"`)

* `fixedPegToLocalBestBid` (value: `"fixedPegToLocalBestBid"`)

* `customerDisplayInstruction` (value: `"customerDisplayInstruction"`)

* `netting` (value: `"netting"`)

* `pegToVWAP` (value: `"pegToVWAP"`)

* `tradeAlong` (value: `"tradeAlong"`)

* `tryToStop` (value: `"tryToStop"`)

* `cancelIfNotBest` (value: `"cancelIfNotBest"`)

* `trailingStopPeg` (value: `"trailingStopPeg"`)

* `strictLimit` (value: `"strictLimit"`)

* `ignorePriceValidityChecks` (value: `"ignorePriceValidityChecks"`)

* `pegToLimitPrice` (value: `"pegToLimitPrice"`)

* `workToTargetStrategy` (value: `"workToTargetStrategy"`)

* `intermarketSweep` (value: `"intermarketSweep"`)

* `externalRoutingAllowed` (value: `"externalRoutingAllowed"`)

* `externalRoutingNotAllowed` (value: `"externalRoutingNotAllowed"`)

* `imbalanceOnly` (value: `"imbalanceOnly"`)

* `singleExecutionRequestedForBlockTrade` (value: `"singleExecutionRequestedForBlockTrade"`)

* `bestExecution` (value: `"bestExecution"`)




