

# InlineResponse2007Instrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | **String** | Name of the instrument. |  [optional]
**shortName** | **String** | Short name of the instrument. |  [optional]
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. |  [optional]
**nsin** | [**InlineResponse2007InstrumentNsin**](InlineResponse2007InstrumentNsin.md) |  |  [optional]
**fsym** | [**InlineResponse2006InstrumentFsym**](InlineResponse2006InstrumentFsym.md) |  |  [optional]
**stockType** | [**StockTypeEnum**](#StockTypeEnum) | Type of stock. |  [optional]
**industryClassification** | [**InlineResponse2007InstrumentIndustryClassification**](InlineResponse2007InstrumentIndustryClassification.md) |  |  [optional]
**company** | [**InlineResponse2007InstrumentCompany**](InlineResponse2007InstrumentCompany.md) |  |  [optional]



## Enum: StockTypeEnum

Name | Value
---- | -----
COMMON | &quot;common&quot;
PREFERRED | &quot;preferred&quot;
DEPOSITORYRECEIPT | &quot;depositoryReceipt&quot;
OTHER | &quot;other&quot;


## Implemented Interfaces

* Serializable


