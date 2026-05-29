# TransactionDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **int, none_type** | Unique identifier of the respective transaction used in request | [optional] 
**factset_port_co_entity_id** | **str, none_type** | Portfolio company entity ID | [optional] 
**portfolio_company_name** | **str, none_type** | Portfolio company name | [optional] 
**investment_type** | **str, none_type** | Investment type of the transaction | [optional] 
**status** | **str, none_type** | Status of the transaction | [optional] 
**announcement_date** | **date, none_type** | Date transaction was announced | [optional] 
**close_date** | **date, none_type** | Date transaction closed | [optional] 
**financial** | [**TransactionDetailFinancial**](TransactionDetailFinancial.md) |  | [optional] 
**details** | [**TransactionDetailDetails**](TransactionDetailDetails.md) |  | [optional] 
**investors** | [**[TransactionInvestor], none_type**](TransactionInvestor.md) |  | [optional] 
**securities** | [**[TransactionSecurity], none_type**](TransactionSecurity.md) |  | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


