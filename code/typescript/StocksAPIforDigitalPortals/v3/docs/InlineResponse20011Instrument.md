# stocksapifordigitalportals.InlineResponse20011Instrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. | [optional] 
**name** | **String** | Name of the instrument. | [optional] 
**shortName** | **String** | Short name of the instrument. | [optional] 
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**nsin** | [**InlineResponse20011InstrumentNsin**](InlineResponse20011InstrumentNsin.md) |  | [optional] 
**fsym** | [**InlineResponse20010InstrumentFsym**](InlineResponse20010InstrumentFsym.md) |  | [optional] 
**stockType** | **String** | Type of stock. | [optional] 
**industryClassification** | [**InlineResponse20011InstrumentIndustryClassification**](InlineResponse20011InstrumentIndustryClassification.md) |  | [optional] 
**company** | [**InlineResponse20011InstrumentCompany**](InlineResponse20011InstrumentCompany.md) |  | [optional] 



## Enum: StockTypeEnum


* `common` (value: `"common"`)

* `preferred` (value: `"preferred"`)

* `depositoryReceipt` (value: `"depositoryReceipt"`)

* `other` (value: `"other"`)




