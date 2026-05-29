# TransactionSummary


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str, none_type** | Unique identifier of the issuer portfolio company in the request | [optional] 
**transaction_id** | **int, none_type** | Unique identifier of the respective transaction | [optional] 
**portfolio_company_name** | **str, none_type** | Portfolio company name | [optional] 
**announcement_date** | **date, none_type** | Date transaction was announced | [optional] 
**close_date** | **date, none_type** | Date transaction closed | [optional] 
**total_amount_usd** | **float, none_type** | Total transaction amount in USD | [optional] 
**stage** | **str, none_type** | The stage type of the transaction | [optional] 
**status** | **str, none_type** | Transaction status code | [optional] 
**round_of_funding** | **str, none_type** | Funding round designation | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


