# factsetfunds.Summaries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**fsymEntityId** | **String** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E), resolved from the requestId of the Fund requested. | [optional] 
**fsymRegionalId** | **String** | FactSet Regional Identifier. Six alpha-numeric characters, excluding vowels, with a -R suffix (XXXXXX-R), resolved from the requestId of the Fund requested. | [optional] 
**fsymTickerRegion** | **String** | FactSet Ticker-Region for the requested fund. | [optional] 
**fsymUltimateParentId** | **String** | The FactSet Ultimate Parent Entity Identifer, with a -E suffix (XXXXXX-E). | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**activeFlag** | **Number** | Binary flag to indicate whether the fund is currently active, where 1 is active and 0 is inactive. | [optional] 
**activelyManagedFlag** | **Number** | Binary indicator of whether the fund is actively managed, where 1 is active and 0 is inactive. | [optional] 
**brand** | **String** | The Funds Brand Name in proper format. | [optional] 
**countryDomicile** | **String** | Returns the fund&#39;s country of domicile in ISO2 format. Only available for Mutual Funds. | [optional] 
**currency** | **String** | The fund&#39;s currency. | [optional] 
**descInfo** | **String** | The Fund&#39;s Investment Strategy short description. | [optional] 
**fundOfFundsId** | **String** | The fund of fund&#39;s id if applicable. Will provide plain Fund of Funds text. | [optional] 
**inceptionDate** | **String** | The fund&#39;s inception date in YYYY-MM-DD format. | [optional] 
**insight** | **String** | The fund&#39;s investment strategy long description. Use &#x60;descInfo&#x60; if needing short description. | [optional] 
**issuerId** | **String** | The Issuer Identifier. | [optional] 
**issuerName** | **String** | The Issuer Name in proper format. | [optional] 
**legalStructure** | **String** | The legal structure of the fund, e.g. Open-Ended Fund, close-ended fund | [optional] 
**leverageFactor** | **Number** | The leverage factor of the fund. | [optional] 
**leverageInverse** | **String** | Indicates whether the fund is leveraged, inverse, or neither in proper format. | [optional] 
**name** | **String** | The Fund security&#39;s name in proper format. | [optional] 
**navCurrency** | **String** | The NAV currency for the specified share class. | [optional] 
**objective** | **String** | The Fund&#39;s objective long description. | [optional] 
**priceFirstDate** | **String** | The fund&#39;s first available date for prices (NAV) in YYYY-MM-DD format. This can be used to fetch the first available price from FactSet. *NOTE: This is not the inception date of fund.* | [optional] 
**priceRecentDate** | **String** | The fund&#39;s most recent available date for prices (NAV) in YYYY-MM-DD format. | [optional] 
**shrClass** | **String** | The Funds Share class type name in proper format. | [optional] 
**shrClassActiveFlag** | **Number** | Returns a binary indicator of whether the specified share class is currently active, where 1 is active and 0 is inactive. | [optional] 
**shrClsCurrency** | **String** | The currency for the specified share class. | [optional] 
**shrClsInceptDate** | **String** | The specified share class&#39;s inception date in YYYY-MM-DD format. | [optional] 
**shrClsName** | **String** | The specified share class name for the fund in proper format. | [optional] 
**shrClsTermDate** | **String** | The Share class Termination Date in YYYY-MM-DD format. If still active, value will be null. | [optional] 
**terminationDate** | **String** | The Termination Date in YYYY-MM-DD format. If still active, value will be null. | [optional] 
**type** | **String** | The Type of Fund, e.g. Mutual Fund, Unit Investment Trust | [optional] 
**webSite** | **String** | The URL of the Fund. | [optional] 


