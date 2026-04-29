# factsetfunds.YieldsAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**sec30DayYieldNet** | **Number** | 30 Days Net SEC yield is the subsidized or after waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only | [optional] 
**sec30DayYieldGross** | **Number** | 30 Gross SEC yield is the unsubsidized or before waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only | [optional] 
**sec7DayYieldNet** | **Number** | 7 Days Net SEC yield is the subsidized or after waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only | [optional] 
**sec7DayYieldGross** | **Number** | 7 Gross SEC yield is the unsubsidized or before waivers. The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived. SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. Available for US Funds Only. | [optional] 
**couponRate** | **Number** | Coupon Rate for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**yieldToMaturity** | **Number** | Yield to Maturity for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**yieldToWorst** | **Number** | Yield to Worst for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**realYield** | **Number** | Real Yield for a given fund. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 


