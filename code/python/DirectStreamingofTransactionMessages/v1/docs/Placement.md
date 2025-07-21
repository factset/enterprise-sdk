# Placement

Placement transaction attributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placement_date** | **str** | Placement date which is in the format YYYY-MM-DD | 
**transaction_id** | **str** | Unique Id of the placement | 
**transaction_status** | **str** | Status of the Placement | 
**account** | **str** | Path of the account | 
**symbol** | **str** | Symbol corresponding to the traded instrument | 
**instrument_name** | **str** | Name or description of the traded instrument | 
**side** | **str** | Side of the order | 
**unit_type** | **str** | Unit type of the order. Indicates if the trade is driven by quantity or value | 
**quantity** | **float** | Quantity of the instrument traded | 
**gross** | **float** | Cash value of the transaction | 
**currency** | **str** | The iso currency code of cash valued fields, Net Amount and Gross Amount | 
**parent_id** | **str, none_type** | transactionId of the order which spawned this placement | [optional] 
**order_id** | **str, none_type** | orderId of the order related to this placement | [optional] 
**order_type** | **str** | Order type indicating the price type of the Placement | [optional] 
**limit_price** | **float, none_type** | Price related to limit and stopLimit order types | [optional] 
**stop_price** | **float, none_type** | Price related to stop and stopLimit order types | [optional] 
**tif** | **str** | Time In Force of the Placement | [optional] 
**tif_date** | **str, none_type** | Time In Force date for goodTilDate placements in YYYY-MM-DD format | [optional] 
**settlement_type** | **str** | Indicates placement settlement period | [optional] 
**settlement_date** | **str, none_type** | Settlement date in YYYY-MM-DD format | [optional] 
**transaction_leaves** | **float, none_type** | Shares that have been ordered and not executed | [optional] 
**price** | **float, none_type** | The transaction price | [optional] 
**compliance_status** | **str** | Compliance check status | [optional] 
**added_date_time** | **str, none_type** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**updated_date_time** | **str, none_type** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**additional_fields** | [**[AdditionalField], none_type**](AdditionalField.md) | List of additional fields which can be used for dynamically populating other ofdb fields | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


