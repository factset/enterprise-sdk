# FactSet.SDK.FactSetTrading.Model.EMSOrder
EMS Order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientOrderId** | **string** | Unique id for the order | [optional] 
**Instrument** | [**Instrument**](Instrument.md) |  | 
**Side** | **string** | Side of the order. | 
**OrderType** | **string** | Type of the order | 
**OrderQuantity** | **double** | Number of shares/Quantity. | [optional] 
**Price** | **double?** | Order price per share | [optional] 
**StopPrice** | **double?** | Stop-loss price to buy/sell stock at market. | [optional] 
**StrikePrice** | **double?** | Strike Price for an Option. | [optional] 
**Currency** | **string** | Currency used for price in ISO format. | [optional] 
**IsCovered** | **bool?** | Signifies if a specific order is a covered order. A covered order is one that involves an investment strategy with the capability to limit the potential loss of the order | [optional] 
**MaxShow** | **double?** | Maximum number of shares within an order to be shown to other customers. | [optional] 
**MaxFloor** | **double?** | Maximum number of shares within an order to be shown on the exchange floor at any given time. | [optional] 
**PrevClosePrice** | **double?** | Previous closing price of security. | [optional] 
**SettlementType** | **string** | Order settlement period. | [optional] 
**SettlementDate** | **string** | Settlement date of trade settlement in YYYYMMDD format | [optional] 
**HandlingInstructions** | **string** | Instructions for order handling on Broker trading floor. | [optional] 
**ExecutionInstructions** | **string** | Instructions for order handling on exchange trading floor. | [optional] 
**LocateRequired** | **bool?** | Indicates whether the broker is to locate the stock in conjunction with a short sell order. | [optional] 
**EffectiveTime** | **string** | Effective time in YYYYMMDD-HH:MM:SS format expressed in UTC | [optional] 
**Account** | **string** | Account for the basket, parent basket or position. | [optional] 
**TimeInForce** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**InboundDestination** | **string** | To facilitate integration with translators that transform orders into a format compatible with the internal order routing and execution infrastructure. | [optional] 
**UserDefinedFields** | **Dictionary&lt;string, string&gt;** | User defined fields | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

