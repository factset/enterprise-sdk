# etfprofileandprices.InlineResponse200Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **Date** | Date data was published. This data is available only for US region. | [optional] 
**holdingsDate** | **Date** | The as of data for holdings statistics. This data available only for US region | [optional] 
**symbol** | **String** | Ticker of the ETP. This data is available for all region. | [optional] 
**exchange** | [**InlineResponse200DataExchange**](InlineResponse200DataExchange.md) |  | [optional] 
**name** | **String** | Name of the ETP. This data is available for all the regions. | [optional] 
**issuer** | [**InlineResponse200DataIssuer**](InlineResponse200DataIssuer.md) |  | [optional] 
**brand** | [**InlineResponse200DataBrand**](InlineResponse200DataBrand.md) |  | [optional] 
**launchDate** | **Date** | Launch date of the ETP. This data is available for all the regions. | [optional] 
**description** | **String** | A brief description of the ETP. This data is available for all the regions. | [optional] 
**website** | **String** | Link to the ETP&#39;s homepage. This data is available for the US and Canada region. | [optional] 
**domicile** | **String** | ETP country of domicile. This data is available for all the regions and country code is in format ISO 3166-1 alpha-2. | [optional] 
**status** | **String** | Staus of the ETP. This data is available for all the regions. | [optional] 
**currency** | [**InlineResponse200DataCurrency**](InlineResponse200DataCurrency.md) |  | [optional] 
**index** | [**InlineResponse200DataIndex**](InlineResponse200DataIndex.md) |  | [optional] 
**financialReport** | [**InlineResponse200DataFinancialReport**](InlineResponse200DataFinancialReport.md) |  | [optional] 
**createRedeem** | [**InlineResponse200DataCreateRedeem**](InlineResponse200DataCreateRedeem.md) |  | [optional] 
**aum** | **Number** | The market value of the total assets that a individual ETP manages on behalf of it&#39;s investors. This data is available for all the regions. | [optional] 
**trading** | [**InlineResponse200DataTrading**](InlineResponse200DataTrading.md) |  | [optional] 
**documentation** | [**InlineResponse200DataDocumentation**](InlineResponse200DataDocumentation.md) |  | [optional] 
**insight** | [**InlineResponse200DataInsight**](InlineResponse200DataInsight.md) |  | [optional] 



## Enum: StatusEnum


* `Active` (value: `"Active"`)

* `Delisted` (value: `"Delisted"`)

* `Not trading yet` (value: `"Not trading yet"`)




