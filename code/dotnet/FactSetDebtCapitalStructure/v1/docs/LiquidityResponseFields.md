# FactSet.SDK.FactSetDebtCapitalStructure.Model.LiquidityResponseFields
Liquidity Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FysmId** | **string** | Identifier that was used for the request. | [optional] 
**Metric** | **string** | The requested &#x60;metric&#x60; input, representing the Liquidity data item. For a definition of the item please use the &#x60;/metrics&#x60; endpoint. | [optional] 
**FiscalYear** | **int?** | Fiscal year of the reported period in YYYY format. | [optional] 
**ReportDate** | **DateTime?** | Reporting date for the debt instrument. | [optional] 
**Currency** | **string** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**Value** | [**LiquidityValue**](LiquidityValue.md) |  | [optional] 
**InstrumentId** | **string** | Identifier for the debt instrument. | [optional] 
**InstrumentType** | **string** | Type of debt instrument. | [optional] 
**Description** | **string** | Description of the debt instrument. | [optional] 
**AmountOutstanding** | **decimal?** | Balance sheet amount outstanding. | [optional] 
**FacilityAmount** | **decimal?** | Facility Amount for liquidity. | [optional] 
**BorrowingBase** | **decimal?** | Borrowing Base for liquidity. | [optional] 
**MaturityDate** | **DateTime?** | Maturity date for the debt instrument. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

