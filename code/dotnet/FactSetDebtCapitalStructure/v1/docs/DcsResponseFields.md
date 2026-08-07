# FactSet.SDK.FactSetDebtCapitalStructure.Model.DcsResponseFields
Debt Capital Structure Totals Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FysmId** | **string** | Identifier that was used for the request. | [optional] 
**Metric** | **string** | The requested &#x60;metric&#x60; input, representing the Liquidity data item. For a definition of the item please use the &#x60;/metrics&#x60; endpoint. | [optional] 
**FiscalYear** | **int?** | Fiscal year of the reported period in YYYY format. | [optional] 
**ReportDate** | **DateTime?** | Reporting date for the debt instrument. | [optional] 
**Date** | **DateTime?** | Date for the period requested expressed in YYYY-MM-DD format | [optional] 
**Currency** | **string** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**Value** | [**DCSValue**](DCSValue.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

