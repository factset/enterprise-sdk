# FactSet.SDK.ETFProfileandPrices.Model.InlineResponse20033Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NavDate** | **DateTime** | Historice NAV date value. | [optional] 
**Nav** | **decimal** | Returns historic Net Asset Value of the ETP. | [optional] 
**NavChange** | **decimal** | Absolute change in NAV value. | [optional] 
**NavChangePercent** | **decimal** | Related change in the NAV value. | [optional] 
**PremiumDiscount** | **decimal** | Difference between market price and NAV of the ETP. | [optional] 
**FundFlows** | **decimal** | This value returns factset&#39;s ETF fundflow history. Rolling one day fund flows are calculated using the difference of shares outstanding at previous close and shares outstanding one day prior to close mulitplied by the NAV of one day prior to close. | [optional] 
**SharesOutstanding** | **decimal** | Returns the historic share Outstanding values of the ETP. | [optional] 
**Aum** | **decimal** | Returns the historic Total Asset Value of the ETP. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

