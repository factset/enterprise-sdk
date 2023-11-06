# EMSOrder

EMS Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | [**Instrument**](Instrument.md) |  | 
**side** | **str** | Side of the order. | 
**order_type** | **str** | Type of the order | 
**client_order_id** | **str, none_type** | Unique id for the order | [optional] 
**order_quantity** | **float** | Number of shares/Quantity. | [optional] 
**price** | **float, none_type** | Order price per share | [optional] 
**stop_price** | **float, none_type** | Stop-loss price to buy/sell stock at market. | [optional] 
**strike_price** | **float, none_type** | Strike Price for an Option. | [optional] 
**currency** | **str, none_type** | Currency used for price in ISO format. | [optional] 
**is_covered** | **bool, none_type** | Signifies if a specific order is a covered order. A covered order is one that involves an investment strategy with the capability to limit the potential loss of the order | [optional] 
**max_show** | **float, none_type** | Maximum number of shares within an order to be shown to other customers. | [optional] 
**max_floor** | **float, none_type** | Maximum number of shares within an order to be shown on the exchange floor at any given time. | [optional] 
**prev_close_price** | **float, none_type** | Previous closing price of security. | [optional] 
**settlement_type** | **str, none_type** | Order settlement period. | [optional] 
**settlement_date** | **str, none_type** | Settlement date of trade settlement in YYYYMMDD format | [optional] 
**handling_instructions** | **str, none_type** | Instructions for order handling on Broker trading floor. | [optional] 
**execution_instructions** | **str, none_type** | Instructions for order handling on exchange trading floor. | [optional] 
**locate_required** | **bool, none_type** | Indicates whether the broker is to locate the stock in conjunction with a short sell order. | [optional] 
**effective_time** | **str, none_type** | Effective time in YYYYMMDD-HH:MM:SS format expressed in UTC | [optional] 
**account** | **str, none_type** | Account for the basket, parent basket or position. | [optional] 
**time_in_force** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**inbound_destination** | **str, none_type** | To facilitate integration with translators that transform orders into a format compatible with the internal order routing and execution infrastructure. | [optional] 
**user_defined_fields** | **{str: (str,)}, none_type** | User defined fields | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


