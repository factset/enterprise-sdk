# factsettrading.ReplaceChildOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ticketId** | **String** | Ticket Id for the child order to be replaced | 
**orderType** | **String** | Type of the order | [optional] 
**orderQuantity** | **Number** | Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order. | [optional] 
**price** | **Number** | Order price per share. | [optional] 
**timeInForce** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**handlingInstructions** | **String** | Instructions for order handling on Broker trading floor. | [optional] 
**stopPrice** | **Number** | Stop-loss price to buy/sell stock at market. | [optional] 
**maxFloor** | **Number** | Maximum number of shares within an order to be shown on the exchange floor at any given time. | [optional] 
**minQuantity** | **Number** | Minimum quantity of an order to be executed. | [optional] 
**settlementType** | **String** | Order settlement period | [optional] 
**settlementDate** | **String** | Specific date of trade settlement in YYYYMMDD format. | [optional] 
**executionInstructions** | **String** | Instructions for order handling on exchange trading floor. | [optional] 
**locateRequired** | **Boolean** | Indicates whether the broker is to locate the stock in conjunction with a short sell order. | [optional] 
**text** | **String** | Free format text string. | [optional] 
**userDefinedFields** | **{String: String}** | User defined fields | [optional] 



## Enum: OrderTypeEnum


* `market` (value: `"market"`)

* `limit` (value: `"limit"`)

* `stop` (value: `"stop"`)

* `stopLimit` (value: `"stopLimit"`)

* `marketOnClose` (value: `"marketOnClose"`)

* `limitOrBetter` (value: `"limitOrBetter"`)





## Enum: HandlingInstructionsEnum


* `autoOrderPrivate` (value: `"autoOrderPrivate"`)

* `autoOrderPublic` (value: `"autoOrderPublic"`)

* `bestExecution` (value: `"bestExecution"`)





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




