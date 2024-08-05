# PlacementParameters


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction_status** | **str** | Transaction Status of a Placement could be any of the following values: Placed, PartialFilled, Filled, Expired, Cancelled, Rejected. | 
**transaction_id** | **str** | Unique Id for the transaction | 
**portfolio** | **str** | Path of the portfolio (Ex: Client:/folder1/testing.ofdb) | 
**symbol** | **str** | Symbol corresponding to the traded instrument. | 
**description** | **str** | Description | 
**trade_type** | **str** | Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively. | 
**unit_type** | **str** | Unit type could be one of Quantity or Value. | 
**quantity** | **float** | Quantity of the instrument traded. | 
**gross** | **float** | Cash value of the transaction | 
**currency_iso** | **str** | The currency code of cash valued fields, Net Amount and Gross Amount. | 
**trade_date** | **str** | Trade date which is in the format YYYY-MM-DD | 
**parent_id** | **str, none_type** | Unique Id of the order which spawned this placement | [optional] 
**instruction_type** | **str** | Instruction Type of a Placement could be any of the following values: Market, Limit, Stop | [optional] 
**instruction_value** | **float** | InstructionValue for a Placement | [optional] 
**tif** | **str** | TIF of an Order could be any of the following values: GTC, GTD, D, W | [optional] 
**tif_date** | **str** | TIF date which is in the format YYYY-MM-DD | [optional] 
**order_id** | **str, none_type** | Unique Id of the order which originated the record | [optional] 
**transaction_leaves** | **float** | Shares that have been ordered and not executed | [optional] 
**price** | **float** | The transaction price | [optional] 
**added_date_time** | **str** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**updated_date_time** | **str** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**entity** | **str** |  | [optional] [readonly] 
**status** | **str** |  | [optional] [readonly] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


