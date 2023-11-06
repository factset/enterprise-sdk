

# EMSOrder

EMS Order

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
**isCovered** | **Boolean** | Signifies if a specific order is a covered order. A covered order is one that involves an investment strategy with the capability to limit the potential loss of the order |  [optional]
**maxShow** | **Double** | Maximum number of shares within an order to be shown to other customers. |  [optional]
**maxFloor** | **Double** | Maximum number of shares within an order to be shown on the exchange floor at any given time. |  [optional]
**prevClosePrice** | **Double** | Previous closing price of security. |  [optional]
**settlementType** | **String** | Order settlement period. |  [optional]
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
SELL_SHORT | &quot;sell_short&quot;
SELL_SHORT_EXEMPT | &quot;sell_short_exempt&quot;



## Enum: OrderTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
LIMIT | &quot;limit&quot;
STOP | &quot;stop&quot;
STOP_LIMIT | &quot;stop_limit&quot;
MARKET_ON_CLOSE | &quot;market_on_close&quot;
LIMIT_OR_BETTER | &quot;limit_or_better&quot;



## Enum: HandlingInstructionsEnum

Name | Value
---- | -----
AUTO_ORD_PVT | &quot;auto_ord_pvt&quot;
AUTO_ORD_PUB | &quot;auto_ord_pub&quot;
BEST_EXECUTION | &quot;best_execution&quot;



## Enum: ExecutionInstructionsEnum

Name | Value
---- | -----
NOT_HELD | &quot;not_held&quot;
WORK | &quot;work&quot;
GO_ALONG | &quot;go_along&quot;
OVER_THE_DAY | &quot;over_the_day&quot;
HELD | &quot;held&quot;
PARTICIPATE_DONT_INITIATE | &quot;participate_dont_initiate&quot;
STRICT_SCALE | &quot;strict_scale&quot;
TRY_TO_SCALE | &quot;try_to_scale&quot;
STAY_ON_BIDSIDE | &quot;stay_on_bidside&quot;
STAY_ON_OFFERSIDE | &quot;stay_on_offerside&quot;
NO_CROSS | &quot;no_cross&quot;
OK_TO_CROSS | &quot;ok_to_cross&quot;
CALL_FIRST | &quot;call_first&quot;
PERCENT_OF_VOLUME | &quot;percent_of_volume&quot;
DO_NOT_INCREASE | &quot;do_not_increase&quot;
DO_NOT_REDUCE | &quot;do_not_reduce&quot;
ALL_OR_NONE | &quot;all_or_none&quot;
REINSTATE_ON_SYSTEM_FAILURE | &quot;reinstate_on_system_failure&quot;
INSTITUTIONS_ONLY | &quot;institutions_only&quot;
REINSTATE_ON_TRADING_HALT | &quot;reinstate_on_trading_halt&quot;
CANCEL_ON_TRADING_HALT | &quot;cancel_on_trading_halt&quot;
LAST_PEG | &quot;last_peg&quot;
MID_PRICE_PEG | &quot;mid_price_peg&quot;
NON_NEGOTIABLE | &quot;non_negotiable&quot;
OPENING_PEG | &quot;opening_peg&quot;
MARKET_PEG | &quot;market_peg&quot;
CANCEL_ON_SYSTEM_FAILURE | &quot;cancel_on_system_failure&quot;
PRIMARY_PEG | &quot;primary_peg&quot;
SUSPEND | &quot;suspend&quot;
FIXED_PEG_TO_LOCAL_BEST_BID | &quot;fixed_peg_to_local_best_bid&quot;
CUSTOMER_DISPLAY_INSTRUCTION | &quot;customer_display_instruction&quot;
NETTING | &quot;netting&quot;
PEG_TO_VWAP | &quot;peg_to_vwap&quot;
TRADE_ALONG | &quot;trade_along&quot;
TRY_TO_STOP | &quot;try_to_stop&quot;
CANCEL_IF_NOT_BEST | &quot;cancel_if_not_best&quot;
TRAILING_STOP_PEG | &quot;trailing_stop_peg&quot;
STRICT_LIMIT | &quot;strict_limit&quot;
IGNORE_PRICE_VALIDITY_CHECKS | &quot;ignore_price_validity_checks&quot;
PEG_TO_LIMIT_PRICE | &quot;peg_to_limit_price&quot;
WORK_TO_TARGET_STRATEGY | &quot;work_to_target_strategy&quot;
INTERMARKET_SWEEP | &quot;intermarket_sweep&quot;
EXTERNAL_ROUTING_ALLOWED | &quot;external_routing_allowed&quot;
EXTERNAL_ROUTING_NOT_ALLOWED | &quot;external_routing_not_allowed&quot;
IMBALANCE_ONLY | &quot;imbalance_only&quot;
SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE | &quot;single_execution_requested_for_block_trade&quot;
BEST_EXECUTION | &quot;best_execution&quot;


## Implemented Interfaces

* Serializable


