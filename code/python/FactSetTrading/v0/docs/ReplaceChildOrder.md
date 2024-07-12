# ReplaceChildOrder

Replace Child Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ticket_id** | **str** | Ticket Id for the child order to be replaced | 
**order_type** | **str, none_type** | Type of the order | [optional] 
**order_quantity** | **float, none_type** | Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order. | [optional] 
**price** | **float, none_type** | Order price per share. | [optional] 
**time_in_force** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**handling_instructions** | **str, none_type** | Instructions for order handling on Broker trading floor. | [optional] 
**stop_price** | **float, none_type** | Stop-loss price to buy/sell stock at market. | [optional] 
**max_floor** | **float, none_type** | Maximum number of shares within an order to be shown on the exchange floor at any given time. | [optional] 
**min_quantity** | **float, none_type** | Minimum quantity of an order to be executed. | [optional] 
**settlement_type** | **str, none_type** | Order settlement period | [optional] 
**settlement_date** | **str, none_type** | Specific date of trade settlement in YYYYMMDD format. | [optional] 
**execution_instructions** | **str, none_type** | Instructions for order handling on exchange trading floor. | [optional] 
**locate_required** | **bool, none_type** | Indicates whether the broker is to locate the stock in conjunction with a short sell order. | [optional] 
**text** | **str, none_type** | Free format text string. | [optional] 
**user_defined_fields** | **{str: (str,)}, none_type** | User defined fields | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


