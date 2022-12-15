

# InlineResponse20014Instrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | **String** | Name of the instrument. |  [optional]
**shortName** | **String** | Short name of the instrument. |  [optional]
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. |  [optional]
**nsin** | [**InlineResponse20014InstrumentNsin**](InlineResponse20014InstrumentNsin.md) |  |  [optional]
**fsym** | [**InlineResponse200DataFsym**](InlineResponse200DataFsym.md) |  |  [optional]
**stockType** | [**StockTypeEnum**](#StockTypeEnum) | Type of stock. |  [optional]
**industryClassification** | [**InlineResponse20014InstrumentIndustryClassification**](InlineResponse20014InstrumentIndustryClassification.md) |  |  [optional]
**company** | [**InlineResponse20014InstrumentCompany**](InlineResponse20014InstrumentCompany.md) |  |  [optional]



## Enum: StockTypeEnum

Name | Value
---- | -----
COMMON | &quot;common&quot;
PREFERRED | &quot;preferred&quot;
DEPOSITORYRECEIPT | &quot;depositoryReceipt&quot;
OTHER | &quot;other&quot;


## Implemented Interfaces

* Serializable


