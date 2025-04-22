# FactSet.SDK.FactSetTrading.Model.ChildOrder
Child Order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ParentId** | [**ParentId**](ParentId.md) |  | 
**Side** | **string** | Side of the order.If the parent order side is &#39;buy&#39;, valid values are &#39;buy&#39; or &#39;buyMinus&#39;. If the parent order side is &#39;sell&#39;, valid values are &#39;sell&#39; or &#39;sellPlus&#39; | [optional] 
**OrderType** | **string** | Type of the order | 
**OrderQuantity** | **double** | Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order. | 
**Price** | **double?** | Order price per share. | [optional] 
**TimeInForce** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**HandlingInstructions** | **string** | Instructions for order handling on Broker trading floor. | [optional] 
**ExDestination** | **string** | Execution destination as defined by institution when order is entered. | [optional] [default to "America Stock Exchange"]
**Destination** | **string** | Represents the designated venue or location to which an order is intended to be routed. | 
**StopPrice** | **double?** | Stop-loss price to buy/sell stock at market. | [optional] 
**MaxFloor** | **double?** | Maximum number of shares within an order to be shown on the exchange floor at any given time. | [optional] 
**MinQuantity** | **double?** | Minimum quantity of an order to be executed. | [optional] 
**SettlementType** | **string** | Order settlement period | [optional] 
**SettlementDate** | **string** | Specific date of trade settlement in YYYYMMDD format. | [optional] 
**ExecutionInstructions** | **string** | Instructions for order handling on exchange trading floor. | [optional] 
**LocateRequired** | **bool?** | Indicates whether the broker is to locate the stock in conjunction with a short sell order. | [optional] 
**Text** | **string** | Free format text string. | [optional] 
**Profile** | **string** | A name given to broker algo | [optional] 
**UserDefinedFields** | **Dictionary&lt;string, string&gt;** | User defined fields | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

