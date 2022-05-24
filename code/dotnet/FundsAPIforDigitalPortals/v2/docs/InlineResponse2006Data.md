# FactSet.SDK.FundsAPIforDigitalPortals.Model.InlineResponse2006Data
Fundamental data for a share class of a fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Isin** | **string** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**Nsin** | [**InlineResponse2006DataNsin**](InlineResponse2006DataNsin.md) |  | [optional] 
**Name** | **string** | Name of the instrument. | [optional] 
**ShortName** | **string** | Short name of the instrument. | [optional] 
**IsETF** | **bool** | If true, the fund is an ETF (exchange-traded fund). | [optional] 
**Currency** | [**InlineResponse2006DataCurrency**](InlineResponse2006DataCurrency.md) |  | [optional] 
**Type** | [**List&lt;InlineResponse2006DataType&gt;**](InlineResponse2006DataType.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). See endpoint &#x60;/category/get&#x60; for possible values. | [optional] 
**LifeCycle** | [**InlineResponse2006DataLifeCycle**](InlineResponse2006DataLifeCycle.md) |  | [optional] 
**Properties** | [**InlineResponse2006DataProperties**](InlineResponse2006DataProperties.md) |  | [optional] 
**LegalEntities** | [**InlineResponse2006DataLegalEntities**](InlineResponse2006DataLegalEntities.md) |  | [optional] 
**Earnings** | [**InlineResponse2006DataEarnings**](InlineResponse2006DataEarnings.md) |  | [optional] 
**Fees** | [**InlineResponse2006DataFees**](InlineResponse2006DataFees.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

