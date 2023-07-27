# EMSOrder


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | [**Instrument**](Instrument.md) |  | 
**side** | **str** | Side | 
**order_type** | **str** | Type of the order | 
**order_id** | **str, none_type** | Unique id for the order | [optional] 
**order_quantity** | **float** | Order quantity | [optional] 
**price** | **float, none_type** | Order Price | [optional] 
**stop_price** | **float, none_type** | Stop Price | [optional] 
**strike_price** | **float, none_type** | Strike Price | [optional] 
**currency** | **str, none_type** | Currency | [optional] 
**is_covered** | **bool, none_type** | Currency | [optional] 
**max_show** | **float, none_type** | Max Show | [optional] 
**max_floor** | **float, none_type** | Max Floor | [optional] 
**prev_close_price** | **float, none_type** | Previous close price | [optional] 
**settlement_type** | **str, none_type** | Settlement type | [optional] 
**settlement_date** | **str, none_type** | Settlement date in YYYYMMDD format | [optional] 
**handling_instructions** | **str, none_type** | Handling instructions | [optional] 
**execution_instructions** | **str, none_type** | Execution instructions | [optional] 
**locate_required** | **bool, none_type** | Locate Required | [optional] 
**effective_time** | **str, none_type** | Effective time in YYYYMMDD-HH:MM:SS format expressed in UTC | [optional] 
**account** | **str, none_type** | Account | [optional] 
**time_in_force** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**inbound_destination** | **str, none_type** | Inbound Destination | [optional] 
**user_defined_fields** | **{str: (str,)}, none_type** | User defined fields | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


