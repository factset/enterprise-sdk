# EMSChildOrder

EMS Child Orders

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parent_id** | [**ParentId**](ParentId.md) |  | 
**order_type** | **str** | Type of the order | 
**order_quantity** | **float** | Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order. | 
**destination** | **str** | Represents the designated venue or location to which an order is intended to be routed. | 
**side** | **str, none_type** | Side of the order.If the parent order side is &#39;buy&#39;, valid values are &#39;buy&#39; or &#39;buyMinus&#39;. If the parent order side is &#39;sell&#39;, valid values are &#39;sell&#39; or &#39;sellPlus&#39; | [optional] 
**price** | **float, none_type** | Order price per share. | [optional] 
**time_in_force** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**handling_instructions** | **str, none_type** | Instructions for order handling on Broker trading floor. | [optional] 
**ex_destination** | **str, none_type** | Execution destination as defined by institution when order is entered. | [optional]  if omitted the server will use the default value of "America Stock Exchange"
**stop_price** | **float, none_type** | Stop-loss price to buy/sell stock at market. | [optional] 
**max_floor** | **float, none_type** | Maximum number of shares within an order to be shown on the exchange floor at any given time. | [optional] 
**min_quantity** | **float, none_type** | Minimum quantity of an order to be executed. | [optional] 
**settlement_type** | **str, none_type** | Order settlement period | [optional] 
**settlement_date** | **str, none_type** | Specific date of trade settlement in YYYYMMDD format. | [optional] 
**execution_instructions** | **str, none_type** | Instructions for order handling on exchange trading floor. | [optional] 
**locate_required** | **bool, none_type** | Indicates whether the broker is to locate the stock in conjunction with a short sell order. | [optional] 
**text** | **str, none_type** | Free format text string. | [optional] 
**profile** | **str, none_type** | A name given to broker algo | [optional] 
**user_defined_fields** | **{str: (str,)}, none_type** | User defined fields | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


