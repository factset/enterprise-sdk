

# InlineResponse2004Instrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | **String** | Name of the instrument. |  [optional]
**shortName** | **String** | Short name of the instrument. |  [optional]
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. |  [optional]
**nsin** | [**InlineResponse2004InstrumentNsin**](InlineResponse2004InstrumentNsin.md) |  |  [optional]
**fsym** | [**InlineResponse2003InstrumentFsym**](InlineResponse2003InstrumentFsym.md) |  |  [optional]
**stockType** | [**StockTypeEnum**](#StockTypeEnum) | Type of stock. |  [optional]
**industryClassification** | [**InlineResponse2004InstrumentIndustryClassification**](InlineResponse2004InstrumentIndustryClassification.md) |  |  [optional]
**company** | [**InlineResponse2004InstrumentCompany**](InlineResponse2004InstrumentCompany.md) |  |  [optional]



## Enum: StockTypeEnum

Name | Value
---- | -----
COMMON | &quot;common&quot;
PREFERRED | &quot;preferred&quot;
DEPOSITORYRECEIPT | &quot;depositoryReceipt&quot;
OTHER | &quot;other&quot;


## Implemented Interfaces

* Serializable


