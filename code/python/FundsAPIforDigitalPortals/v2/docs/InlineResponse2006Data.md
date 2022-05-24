# InlineResponse2006Data

Fundamental data for a share class of a fund.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isin** | **str** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**nsin** | [**InlineResponse2006DataNsin**](InlineResponse2006DataNsin.md) |  | [optional] 
**name** | **str** | Name of the instrument. | [optional] 
**short_name** | **str** | Short name of the instrument. | [optional] 
**is_etf** | **bool** | If true, the fund is an ETF (exchange-traded fund). | [optional] 
**currency** | [**InlineResponse2006DataCurrency**](InlineResponse2006DataCurrency.md) |  | [optional] 
**type** | [**[InlineResponse2006DataType]**](InlineResponse2006DataType.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). See endpoint &#x60;/category/get&#x60; for possible values. | [optional] 
**life_cycle** | [**InlineResponse2006DataLifeCycle**](InlineResponse2006DataLifeCycle.md) |  | [optional] 
**properties** | [**InlineResponse2006DataProperties**](InlineResponse2006DataProperties.md) |  | [optional] 
**legal_entities** | [**InlineResponse2006DataLegalEntities**](InlineResponse2006DataLegalEntities.md) |  | [optional] 
**earnings** | [**InlineResponse2006DataEarnings**](InlineResponse2006DataEarnings.md) |  | [optional] 
**fees** | [**InlineResponse2006DataFees**](InlineResponse2006DataFees.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


