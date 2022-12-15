# FactSet.SDK.StocksAPIforDigitalPortals.Model.InlineResponse2001Data
Selected fundamentals for a stock with values as of the end of a fiscal year.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Isin** | **string** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**Nsin** | [**InlineResponse2001DataNsin**](InlineResponse2001DataNsin.md) |  | [optional] 
**Name** | **string** | Name of the instrument. | [optional] 
**ShortName** | **string** | Short name of the instrument. | [optional] 
**Type** | [**List&lt;InlineResponse2001DataType&gt;**](InlineResponse2001DataType.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). See endpoint &#x60;/category/get&#x60; for possible values. | [optional] 
**Company** | [**InlineResponse2001DataCompany**](InlineResponse2001DataCompany.md) |  | [optional] 
**FiscalYearData** | [**List&lt;InlineResponse2001DataFiscalYearData&gt;**](InlineResponse2001DataFiscalYearData.md) | Values as of the end of a fiscal year for the set of selected figures. The figures are clustered based on their specifics but do not exhaust all potentially available data from that cluster. The default sorting is from the most recent fiscal year requested to the most distant in time. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

