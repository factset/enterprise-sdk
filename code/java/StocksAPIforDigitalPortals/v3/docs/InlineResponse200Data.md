

# InlineResponse200Data

Fundamentals of a share instrument and of the company it belongs to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the instrument. |  [optional]
**shortName** | **String** | Short name of the instrument. |  [optional]
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. |  [optional]
**nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  |  [optional]
**fsym** | [**InlineResponse200DataFsym**](InlineResponse200DataFsym.md) |  |  [optional]
**stockType** | [**StockTypeEnum**](#StockTypeEnum) | Type of stock. |  [optional]
**company** | [**InlineResponse200DataCompany**](InlineResponse200DataCompany.md) |  |  [optional]
**companyKeyFigures** | [**InlineResponse200DataCompanyKeyFigures**](InlineResponse200DataCompanyKeyFigures.md) |  |  [optional]
**shareInstrumentKeyFigures** | [**InlineResponse200DataShareInstrumentKeyFigures**](InlineResponse200DataShareInstrumentKeyFigures.md) |  |  [optional]



## Enum: StockTypeEnum

Name | Value
---- | -----
COMMON | &quot;common&quot;
PREFERRED | &quot;preferred&quot;
DEPOSITORYRECEIPT | &quot;depositoryReceipt&quot;
OTHER | &quot;other&quot;


## Implemented Interfaces

* Serializable


