# factsetprices.References

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**name** | **String** | The name of the security. | [optional] 
**secType** | **String** | Security Type Description. For more details, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149). | [optional] 
**secTypeCode** | **String** | General Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149). | [optional] 
**secTypeCodeDet** | **String** | Detailed Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149). | [optional] 
**currency** | **String** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**country** | **String** | Country Name. Returns the country where the security is *traded* from the North American Pricing database. Therefore, for securities covered by the North American Pricing database, will return either UNITED STATES. or CANADA. For securities covered by the Global Pricing database, the item returns the country where the company is *incorporated*. | [optional] 
**primaryExchange** | **String** | Primary Exchange Name. For more details, visit [Online Assistant Page #16610](https://oa.apps.factset.com/pages/16610). | [optional] 
**exchangeCountry** | **String** | Returns the location of the exchange where the company&#39;s stock is traded. | [optional] 
**localIndex** | **String** | The Local Index ID for the company&#39;s home country benchmark. For more details, visit [Online Assistant Page #10698](https://oa.apps.factset.com/pages/10698). | [optional] 
**nextTradingHolidayDate** | **Date** | The Next Trading Holiday. For more details regarding Global Trading Holiday Schedules, visit [Online Assistant Page #10397](https://oa.apps.factset.com/pages/10397). | [optional] 
**firstDate** | **Date** | The Security&#39;s Date of First Trade. It will return the first date that the FactSet Pricing database began to cover the security and it may not coincide with the actual IPO date. Pricing information for this security will not be available before the date returned. For more details. | [optional] 
**lastDate** | **Date** | Date of Last Trade.  It will return the last date that the FactSet Pricing database as a record for this security listing. | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 


