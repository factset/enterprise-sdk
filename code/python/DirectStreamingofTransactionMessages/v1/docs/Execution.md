# Execution

Execution transaction attributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trade_date** | **str** | Trade date which is in the format YYYY-MM-DD | 
**transaction_id** | **str** | Unique Id of the execution | 
**transaction_status** | **str** | Status of the Execution | 
**net** | **float** | Cash value of the transaction, net of brokerage costs | 
**settlement_date** | **str** | Settlement date in YYYY-MM-DD format | 
**settlement_currency** | **str** | The iso currency code of the Settlement Value | 
**settlement_value** | **float** | Cash value of the transaction in settlement currency | 
**account** | **str** | Path of the account | 
**symbol** | **str** | Symbol corresponding to the traded instrument | 
**instrument_name** | **str** | Name or description of the traded instrument | 
**side** | **str** | Side of the order | 
**unit_type** | **str** | Unit type of the order. Indicates if the trade is driven by quantity or value | 
**quantity** | **float** | Quantity of the instrument traded | 
**gross** | **float** | Cash value of the transaction | 
**currency** | **str** | The iso currency code of cash valued fields, Net Amount and Gross Amount | 
**parent_id** | **str, none_type** | transactionId of the placement which spawned this execution | [optional] 
**order_id** | **str, none_type** | orderId of the order related to this execution | [optional] 
**foreign_exchange_rate** | **float, none_type** | FX rate to convert the net, gross fields to reporting currency | [optional] 
**broker** | **str, none_type** | Execution broker id | [optional] 
**custodian** | **str, none_type** | Execution custodian Id | [optional] 
**accrued_interest** | **float, none_type** | Execution accrued interest | [optional] 
**commission** | **float, none_type** | Execution commission value | [optional] 
**clearing_commission** | **float, none_type** | Execution clearing commission value | [optional] 
**local_tax** | **float, none_type** | Execution local tax value | [optional] 
**local_fee** | **float, none_type** | Execution local fee value | [optional] 
**broker_fee** | **float, none_type** | Execution broker fee value | [optional] 
**exchange_fee** | **float, none_type** | Execution exchange fee value | [optional] 
**miscellaneous_fee** | **float, none_type** | Execution miscellaneous fee value | [optional] 
**transaction_leaves** | **float, none_type** | Shares that have been ordered and not executed | [optional] 
**price** | **float, none_type** | The transaction price | [optional] 
**compliance_status** | **str** | Compliance check status | [optional] 
**added_date_time** | **str, none_type** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**updated_date_time** | **str, none_type** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**additional_fields** | [**[AdditionalField], none_type**](AdditionalField.md) | List of additional fields which can be used for dynamically populating other ofdb fields | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


