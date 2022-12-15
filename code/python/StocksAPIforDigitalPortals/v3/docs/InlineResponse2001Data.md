# InlineResponse2001Data

Selected fundamentals for a stock with values as of the end of a fiscal year.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isin** | **str, none_type** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**nsin** | [**InlineResponse2001DataNsin**](InlineResponse2001DataNsin.md) |  | [optional] 
**name** | **str, none_type** | Name of the instrument. | [optional] 
**short_name** | **str, none_type** | Short name of the instrument. | [optional] 
**type** | [**[InlineResponse2001DataType]**](InlineResponse2001DataType.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). See endpoint &#x60;/category/get&#x60; for possible values. | [optional] 
**company** | [**InlineResponse2001DataCompany**](InlineResponse2001DataCompany.md) |  | [optional] 
**fiscal_year_data** | [**[InlineResponse2001DataFiscalYearData]**](InlineResponse2001DataFiscalYearData.md) | Values as of the end of a fiscal year for the set of selected figures. The figures are clustered based on their specifics but do not exhaust all potentially available data from that cluster. The default sorting is from the most recent fiscal year requested to the most distant in time. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


