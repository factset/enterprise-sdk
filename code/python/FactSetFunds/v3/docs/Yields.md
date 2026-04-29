# Yields

Fund yield metrics including 30-day and 7-day SEC yields (net and gross), coupon rate, yield to maturity, yield to worst, and real yield

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**date** | **date, none_type** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**sec30_day_yield_net** | **float, none_type** | 30 Days Net SEC yield is the subsidized or after waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only | [optional] 
**sec30_day_yield_gross** | **float, none_type** | 30 Gross SEC yield is the unsubsidized or before waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only | [optional] 
**sec7_day_yield_net** | **float, none_type** | 7 Days Net SEC yield is the subsidized or after waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only | [optional] 
**sec7_day_yield_gross** | **float, none_type** | 7 Gross SEC yield is the unsubsidized or before waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only. | [optional] 
**coupon_rate** | **float, none_type** | Coupon Rate for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**yield_to_maturity** | **float, none_type** | Yield to Maturity for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**yield_to_worst** | **float, none_type** | Yield to Worst for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**real_yield** | **float, none_type** | Real Yield for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


