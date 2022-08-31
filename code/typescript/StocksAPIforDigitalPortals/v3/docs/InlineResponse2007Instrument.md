# stocksapifordigitalportals.InlineResponse2007Instrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. | [optional] 
**name** | **String** | Name of the instrument. | [optional] 
**shortName** | **String** | Short name of the instrument. | [optional] 
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**nsin** | [**InlineResponse2007InstrumentNsin**](InlineResponse2007InstrumentNsin.md) |  | [optional] 
**fsym** | [**InlineResponse2006InstrumentFsym**](InlineResponse2006InstrumentFsym.md) |  | [optional] 
**stockType** | **String** | Type of stock. | [optional] 
**industryClassification** | [**InlineResponse2007InstrumentIndustryClassification**](InlineResponse2007InstrumentIndustryClassification.md) |  | [optional] 
**company** | [**InlineResponse2007InstrumentCompany**](InlineResponse2007InstrumentCompany.md) |  | [optional] 



## Enum: StockTypeEnum


* `common` (value: `"common"`)

* `preferred` (value: `"preferred"`)

* `depositoryReceipt` (value: `"depositoryReceipt"`)

* `other` (value: `"other"`)




