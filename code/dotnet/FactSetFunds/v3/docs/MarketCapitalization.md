# FactSet.SDK.FactSetFunds.Model.MarketCapitalization
Market capitalization breakdown showing portfolio allocation across large, mid, small, and micro-cap holdings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**AnalyticsType** | **MarketCapitalizationType** |  | 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**LargeCapPercent** | **double?** | Percentage of the aggregate that is composed of large-cap holdings. Large cap is defined as having a company market value greater than 12.9 billion USD | [optional] 
**MidCapPercent** | **double?** | Percentage of the aggregate that is composed of Mid-cap holdings. Mid cap is defined as having a company market value greater than 2.7 billion USD but less than 12.9 billion USD. | [optional] 
**SmallCapPercent** | **double?** | Percentage of the aggregate that is composed of Small-cap holdings. Small cap is defined as having a company market value greater than 600 million USD but less than 2.7 billion USD | [optional] 
**MicroCapPercent** | **double?** | Percentage of the aggregate that is composed of Micro-cap holdings. Micro cap is defined as having a company market value less than 600 million USD. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

