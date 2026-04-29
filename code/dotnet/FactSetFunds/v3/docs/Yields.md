# FactSet.SDK.FactSetFunds.Model.Yields
Fund yield metrics including 30-day and 7-day SEC yields (net and gross), coupon rate, yield to maturity, yield to worst, and real yield

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**Sec30DayYieldNet** | **double?** | 30 Days Net SEC yield is the subsidized or after waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only | [optional] 
**Sec30DayYieldGross** | **double?** | 30 Gross SEC yield is the unsubsidized or before waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only | [optional] 
**Sec7DayYieldNet** | **double?** | 7 Days Net SEC yield is the subsidized or after waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only | [optional] 
**Sec7DayYieldGross** | **double?** | 7 Gross SEC yield is the unsubsidized or before waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only. | [optional] 
**CouponRate** | **double?** | Coupon Rate for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**YieldToMaturity** | **double?** | Yield to Maturity for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**YieldToWorst** | **double?** | Yield to Worst for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**RealYield** | **double?** | Real Yield for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

