

# EMSOrder


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Unique id for the order |  [optional]
**instrument** | [**Instrument**](Instrument.md) |  | 
**side** | [**SideEnum**](#SideEnum) | Side can be buy or sell | 
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Type of the order | 
**orderQuantity** | **Double** | Order quantity |  [optional]
**price** | **Double** | Order Price |  [optional]
**stopPrice** | **Double** | Stop Price |  [optional]
**strikePrice** | **Double** | Strike Price |  [optional]
**currency** | **String** | Currency |  [optional]
**isCovered** | **Boolean** | Currency |  [optional]
**maxShow** | **Double** | Max Show |  [optional]
**maxFloor** | **Double** | Max Floor |  [optional]
**prevClosePrice** | **Double** | Previous close price |  [optional]
**settlementType** | **String** | Settlement type |  [optional]
**settlementDate** | **String** | Settlement date in YYYYMMDD format |  [optional]
**handlingInstructions** | [**HandlingInstructionsEnum**](#HandlingInstructionsEnum) | Handling instructions | 
**executionInstructions** | [**ExecutionInstructionsEnum**](#ExecutionInstructionsEnum) | Execution instructions |  [optional]
**locateRequired** | **Boolean** | Locate Required |  [optional]
**effectiveTime** | **String** | Effective time in YYYYMMDD-HH:MM:SS format expressed in UTC |  [optional]
**account** | **String** | Account |  [optional]
**timeInForce** | [**TimeInForce**](TimeInForce.md) |  |  [optional]
**userDefinedFields** | **Map&lt;String, String&gt;** | User defined fields |  [optional]



## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;



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


