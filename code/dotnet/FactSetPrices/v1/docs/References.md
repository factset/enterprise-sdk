# FactSet.SDK.FactSetPrices.Model.References

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Name** | **string** | The name of the security. | [optional] 
**SecType** | **string** | Security Type Description. For more details, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149). | [optional] 
**SecTypeCode** | **string** | General Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149). | [optional] 
**SecTypeCodeDet** | **string** | Detailed Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149). | [optional] 
**Currency** | **string** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**Country** | **string** | Country Name. Returns the country where the security is *traded* from the North American Pricing database. Therefore, for securities covered by the North American Pricing database, will return either UNITED STATES. or CANADA. For securities covered by the Global Pricing database, the item returns the country where the company is *incorporated*. | [optional] 
**PrimaryExchange** | **string** | Primary Exchange Name. For more details, visit [Online Assistant Page #16610](https://oa.apps.factset.com/pages/16610). | [optional] 
**ExchangeCountry** | **string** | Returns the location of the exchange where the company&#39;s stock is traded. | [optional] 
**LocalIndex** | **string** | The Local Index ID for the company&#39;s home country benchmark. For more details, visit [Online Assistant Page #10698](https://oa.apps.factset.com/pages/10698). | [optional] 
**NextTradingHolidayDate** | **DateTime?** | The Next Trading Holiday. For more details regarding Global Trading Holiday Schedules, visit [Online Assistant Page #10397](https://oa.apps.factset.com/pages/10397). | [optional] 
**FirstDate** | **DateTime?** | The Security&#39;s Date of First Trade. It will return the first date that the FactSet Pricing database began to cover the security and it may not coincide with the actual IPO date. Pricing information for this security will not be available before the date returned. For more details. | [optional] 
**LastDate** | **DateTime?** | Date of Last Trade.  It will return the last date that the FactSet Pricing database as a record for this security listing. | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

