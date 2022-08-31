# FactSet.SDK.OpenRisk.Model.LaggingDates
Risk model lagging dates for data items to fetch and use. This field can be utilized to isolate each data item's impact on risk calculation. A typical use case is to analyze the risk change from one day to the other by fixing the risk model data date to one date while moving the portfolio holdings data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExposureDate** | [**ExposureDateFormatConvention**](ExposureDateFormatConvention.md) |  | [optional] 
**CovarianceDate** | [**CovarianceDateFormatConvention**](CovarianceDateFormatConvention.md) |  | [optional] 
**SsrDateIs** | **string** | Stock specific risk (SSR) date can take one of the other lagging dates | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

