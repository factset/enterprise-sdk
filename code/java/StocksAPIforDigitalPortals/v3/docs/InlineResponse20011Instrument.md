

# InlineResponse20011Instrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | **String** | Name of the instrument. |  [optional]
**shortName** | **String** | Short name of the instrument. |  [optional]
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. |  [optional]
**nsin** | [**InlineResponse20011InstrumentNsin**](InlineResponse20011InstrumentNsin.md) |  |  [optional]
**fsym** | [**InlineResponse20010InstrumentFsym**](InlineResponse20010InstrumentFsym.md) |  |  [optional]
**stockType** | [**StockTypeEnum**](#StockTypeEnum) | Type of stock. |  [optional]
**industryClassification** | [**InlineResponse20011InstrumentIndustryClassification**](InlineResponse20011InstrumentIndustryClassification.md) |  |  [optional]
**company** | [**InlineResponse20011InstrumentCompany**](InlineResponse20011InstrumentCompany.md) |  |  [optional]



## Enum: StockTypeEnum

Name | Value
---- | -----
COMMON | &quot;common&quot;
PREFERRED | &quot;preferred&quot;
DEPOSITORYRECEIPT | &quot;depositoryReceipt&quot;
OTHER | &quot;other&quot;


## Implemented Interfaces

* Serializable


