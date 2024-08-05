# ExecutionParameters


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction_status** | **str** | Transaction Status of an Execution could be any of the following values: Executed, Booked, Cancelled. | 
**net** | **float** | Cash value of the transaction, net of brokerage costs. | 
**settlement_date** | **str** | Settlement date in YYYY-MM-DD format | 
**settlement_currency_iso** | **str** | Currency code for Settlement Value | 
**settlement_value** | **float** | Cash value of the transaction in settlement currency | 
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
**parent_id** | **str, none_type** | Unique Id of the placement which spawned this execution | [optional] 
**foreign_exchange_rate** | **float** | FX rate to convert the net, gross fields to reporting currency. | [optional] 
**broker** | **str** | Execution broker id. | [optional] 
**custodian** | **str** | Execution custodian Id. | [optional] 
**accrued_interest** | **float** | Execution accrued interest. | [optional] 
**commission** | **float** | Execution commission value. | [optional] 
**clearing_commission** | **float** | Execution clearing commission value. | [optional] 
**local_tax** | **float** | Execution local tax value. | [optional] 
**local_fee** | **float** | Execution local fee value. | [optional] 
**broker_fee** | **float** | Execution broker fee value. | [optional] 
**exchange_fee** | **float** | Execution exchange fee value. | [optional] 
**miscellaneous_fee** | **float** | Execution miscellaneous fee value. | [optional] 
**order_id** | **str, none_type** | Unique Id of the order which originated the record | [optional] 
**transaction_leaves** | **float** | Shares that have been ordered and not executed | [optional] 
**price** | **float** | The transaction price | [optional] 
**added_date_time** | **str** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**updated_date_time** | **str** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**entity** | **str** |  | [optional] [readonly] 
**status** | **str** |  | [optional] [readonly] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


