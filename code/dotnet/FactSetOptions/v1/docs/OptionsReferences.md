# FactSet.SDK.FactSetOptions.Model.OptionsReferences
Options Reference Response Fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options) | [optional] 
**AdjustedFlag** | **string** | Indicates whether or not a given option contract is adjusted for corporate actions in Y/N format. | [optional] 
**CallPutFlag** | **int?** | Returns a 0 if the option is a call, returns a 1 if the option is a put. | [optional] 
**CallPutPairSymbol** | **string** | Returns the corresponding put symbol given a call symbol; and vice-versa. | [optional] 
**ContractSize** | **int?** | The Option Contract Size | [optional] 
**Currency** | **string** | Option Currency in ISO3 format. | [optional] 
**Exchange** | **string** | Option Exchange ISO. Visit [OA 14925](https://my.apps.factset.com/oa/pages/14925) for a list of Exchange ISOs. | [optional] 
**ExpirationDate** | **DateTime?** | The date on which an options contract is no longer valid and, therefore, ceases to exist, in YYYY-MM-DD format | [optional] 
**ExpirationFrequency** | **string** | Returns the corresponding expiration frequency for a given option symbol. If an option has more than four expiration months, then a Long-term Equity Anticipation Security (LEAPS) indicator will be returned. | [optional] 
**ExpirationMonth** | **string** | Option Expiration month in MMM format. | [optional] 
**LepoFlag** | **int?** | Indicates whether or not a given options contract is a Low Exercise Price Option \&quot;LEPO\&quot; (0/1). This is unique to European Options (e.g. ASX exchange). | [optional] 
**Name** | **string** | Option Descriptive Security Name | [optional] 
**Occ21Symbol** | **string** | Options Clearing Corporation OSI Series Key This option symbol has up to 21 alphanumeric characters (excluding -ISO and # sign) and uses the following syntax- (Underlying Symbol + # + Expiration Year + Expiration Month + Expiration Day + Call/Put Indicator + Five-Digit Strike Dollar + Three-Digit Strike Decimal + - + ISO)  | [optional] 
**Opra17Symbol** | **string** | Options Price Reporting Authority&#39;s OSI Series Key. This option symbol has up to 17 alphanumeric characters (excluding the -ISO and #) and uses the following syntax - (Underlying Symbol + # + Call/Put Expiration Month Code + Expiration Day + Expiration Year + Decimal Indicator + Strike Price + - + ISO)  | [optional] 
**RootTicker** | **string** | The Root Ticker for the underlying security. | [optional] 
**Style** | **int?** | Returns the style of the option id requested, where -   |style|description| |- --|- --| |0|American| |1|European|  An American style option can be exercised anytime during its life. The majority of exchange-traded options are American.  Since investors have the freedom to exercise their American options at any point during the life of the contract, they are more valuable than European options which can only be exercised at maturity.  Consider this example -  If you bought a Ford March Call option expiring in March of 2006 in March 2005, you would have the right to exercise the call option at anytime up until its expiration date. Had the Ford option been a European option, you could only exercise the option at the expiry date in March &#39;06. During the year, the share price could have been most optimal for exercise in December of 2005, but you would have to wait to exercise your option until March 2006, where it could be out-of-the-money and virtually worthless.  Note that the name of this option style has nothing to do with the geographic location.  | [optional] 
**Type** | **int?** | The option type code, where  |code|description| |- --|- --| |0|Equity Option| |2|Index Option| |99|Option on an ETF| |60|Option on a Future| |19|Option on a Spot FX Rate|  | [optional] 
**UnderlyingFsymSecurityId** | **string** | Underlying FactSet Security Permanent Identifier in XXXXXX-S format. | [optional] 
**Date** | **DateTime?** | The date the data is as of in YYYY-MM-DD format. | [optional] 
**SettlementMethod** | **string** | The contract settlement method. Possible values are - |method|description| |- --|- --| |C|Cash| |P|Physical| |NA|Not Covered|  | [optional] 
**RequestId** | **string** | The requested identifier submitted in the query. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

