# fundsapifordigitalportals.InlineResponse2006Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**nsin** | [**InlineResponse2006DataNsin**](InlineResponse2006DataNsin.md) |  | [optional] 
**name** | **String** | Name of the instrument. | [optional] 
**shortName** | **String** | Short name of the instrument. | [optional] 
**isETF** | **Boolean** | If true, the fund is an ETF (exchange-traded fund). | [optional] 
**currency** | [**InlineResponse2006DataCurrency**](InlineResponse2006DataCurrency.md) |  | [optional] 
**type** | [**[InlineResponse2006DataType]**](InlineResponse2006DataType.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). See endpoint &#x60;/category/get&#x60; for possible values. | [optional] 
**lifeCycle** | [**InlineResponse2006DataLifeCycle**](InlineResponse2006DataLifeCycle.md) |  | [optional] 
**properties** | [**InlineResponse2006DataProperties**](InlineResponse2006DataProperties.md) |  | [optional] 
**legalEntities** | [**InlineResponse2006DataLegalEntities**](InlineResponse2006DataLegalEntities.md) |  | [optional] 
**earnings** | [**InlineResponse2006DataEarnings**](InlineResponse2006DataEarnings.md) |  | [optional] 
**fees** | [**InlineResponse2006DataFees**](InlineResponse2006DataFees.md) |  | [optional] 


