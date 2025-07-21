# FactSet.SDK.FactSetFunds.Model.Summaries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**FsymEntityId** | **string** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E), resolved from the requestId of the Fund requested. | [optional] 
**FsymRegionalId** | **string** | FactSet Regional Identifier. Six alpha-numeric characters, excluding vowels, with a -R suffix (XXXXXX-R), resolved from the requestId of the Fund requested. | [optional] 
**FsymTickerRegion** | **string** | FactSet Ticker-Region for the requested fund. | [optional] 
**FsymUltimateParentId** | **string** | The FactSet Ultimate Parent Entity Identifer, with a -E suffix (XXXXXX-E). | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**ActiveFlag** | **int?** | Binary flag to indicate whether the fund is currently active, where 1 is active and 0 is inactive. | [optional] 
**ActivelyManagedFlag** | **int?** | Binary indicator of whether the fund is actively managed, where 1 is active and 0 is inactive. | [optional] 
**Brand** | **string** | The Funds Brand Name in proper format. | [optional] 
**CountryDomicile** | **string** | Returns the fund&#39;s country of domicile in ISO2 format. Only available for Mutual Funds. | [optional] 
**CountryOfRegistration** | **string** | Countries where the mutual fund is registered and is available for sale, represented as ISO 3166 2-letter country codes. | [optional] 
**Currency** | **string** | The fund&#39;s currency. | [optional] 
**DescInfo** | **string** | The Fund&#39;s Investment Strategy short description. | [optional] 
**FundOfFundsId** | **string** | The fund of fund&#39;s id if applicable. Will provide plain Fund of Funds text. | [optional] 
**InceptionDate** | **DateTime?** | The fund&#39;s inception date in YYYY-MM-DD format. | [optional] 
**Insight** | **string** | The fund&#39;s investment strategy long description. Use &#x60;descInfo&#x60; if needing short description. | [optional] 
**IssuerId** | **string** | The Issuer Identifier. | [optional] 
**IssuerName** | **string** | The Issuer Name in proper format. | [optional] 
**LegalStructure** | **string** | The legal structure of the fund, e.g. Open-Ended Fund, close-ended fund | [optional] 
**LeverageFactor** | **double?** | The leverage factor of the fund. | [optional] 
**LeverageInverse** | **string** | Indicates whether the fund is leveraged, inverse, or neither in proper format. | [optional] 
**Name** | **string** | The Fund security&#39;s name in proper format. | [optional] 
**NavCurrency** | **string** | The NAV currency for the specified share class. | [optional] 
**Objective** | **string** | The Fund&#39;s objective long description. | [optional] 
**PriceFirstDate** | **DateTime?** | The fund&#39;s first available date for prices (NAV) in YYYY-MM-DD format. This can be used to fetch the first available price from FactSet. *NOTE: This is not the inception date of fund.* | [optional] 
**PriceRecentDate** | **DateTime?** | The fund&#39;s most recent available date for prices (NAV) in YYYY-MM-DD format. | [optional] 
**ShrClass** | **string** | The Funds Share class type name in proper format. | [optional] 
**ShrClassActiveFlag** | **int?** | Returns a binary indicator of whether the specified share class is currently active, where 1 is active and 0 is inactive. | [optional] 
**ShrClsActivelyManagedFlag** | **int?** | Returns a binary indicator of whether the specified share class is actively managed, where 1 is active and 0 is inactive. | [optional] 
**ShrClsCurrency** | **string** | The currency for the specified share class. | [optional] 
**ShrClsInceptDate** | **DateTime?** | The specified share class&#39;s inception date in YYYY-MM-DD format. | [optional] 
**ShrClsName** | **string** | The specified share class name for the fund in proper format. | [optional] 
**ShrClsTermDate** | **DateTime?** | The Share class Termination Date in YYYY-MM-DD format. If still active, value will be null. | [optional] 
**TerminationDate** | **DateTime?** | The Termination Date in YYYY-MM-DD format. If still active, value will be null. | [optional] 
**Type** | **string** | The Type of Fund, e.g. Mutual Fund, Unit Investment Trust | [optional] 
**WebSite** | **string** | The URL of the Fund. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

