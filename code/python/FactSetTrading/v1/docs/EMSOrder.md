# EMSOrder


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | [**Instrument**](Instrument.md) |  | 
**side** | **str** | Side | 
**order_type** | **str** | Type of the order | 
**order_id** | **str** | Unique id for the order | [optional] 
**order_quantity** | **float** | Order quantity | [optional] 
**price** | **float** | Order Price | [optional] 
**stop_price** | **float** | Stop Price | [optional] 
**strike_price** | **float** | Strike Price | [optional] 
**currency** | **str** | Currency | [optional] 
**is_covered** | **bool** | Currency | [optional] 
**max_show** | **float** | Max Show | [optional] 
**max_floor** | **float** | Max Floor | [optional] 
**prev_close_price** | **float** | Previous close price | [optional] 
**settlement_type** | **str** | Settlement type | [optional] 
**settlement_date** | **str** | Settlement date in YYYYMMDD format | [optional] 
**handling_instructions** | **str** | Handling instructions | [optional] 
**execution_instructions** | **str** | Execution instructions | [optional] 
**locate_required** | **bool** | Locate Required | [optional] 
**effective_time** | **str** | Effective time in YYYYMMDD-HH:MM:SS format expressed in UTC | [optional] 
**account** | **str** | Account | [optional] 
**time_in_force** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**user_defined_fields** | **{str: (str,)}** | User defined fields | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


