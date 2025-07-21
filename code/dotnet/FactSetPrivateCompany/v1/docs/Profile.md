# FactSet.SDK.FactSetPrivateCompany.Model.Profile
Profile object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request | [optional] 
**Currency** | **string** | Code representing the currency | [optional] 
**Ceo** | **string** | Currently listed company CEO | [optional] 
**Founders** | **List&lt;string&gt;** | Currently listed company founders | [optional] 
**Chair** | **string** | Current chairperson | [optional] 
**PeBackingCurrent** | **bool?** | Flag for whether the specified company currently has PE backing | [optional] 
**PeBackingEver** | **bool?** | Flag for whether the specified company has ever had PE backing | [optional] 
**VcBackingCurrent** | **bool?** | Flag for whether the specified company currently has VC backing | [optional] 
**VcBackingEver** | **bool?** | Flag for whether the specified company has ever had VC backing | [optional] 
**TotalInvestors** | **int?** | Total number of investment rounds for the portfolio company | [optional] 
**ActiveInvestors** | **int?** | Number of active portfolio companies for the specified private equity firm | [optional] 
**ActiveInvestorsList** | **List&lt;string&gt;** | List of investors that are active investors in the given portfolio company itemized by security | [optional] 
**ExitedInvestorsList** | **List&lt;string&gt;** | List of investors that had previously invested in the given portfolio company itemized by security | [optional] 
**AmountRaisedUSD** | **double?** | Current estimated total of venture capital raised in USD.  Each investment amount is currency converted on the day of the investment. Then all values are summed.   | [optional] 
**AmountRaisedLocalCurrency** | **double?** | Current estimated total of venture capital raised in local currency. | [optional] 
**VcpeAmountRaisedUSD** | **double?** | Current estimated total of venture capital and private equity raised in USD.  Each investment amount is currency converted on the day of the investment. Then all values are summed.  | [optional] 
**VcpeAmountRaisedLocalCurrency** | **double?** | Current estimated total of venture capital raised in all rounds of the portfolio company. This item applies to venture capital raised rounds only.    | [optional] 
**InvestmentStats** | **double?** | Investment stats summary for the specified portfolio company. Always represented in USD.   | [optional] 
**LastInvestmentDate** | **DateTime?** | The date that is associated with the most recent amount of money that was invested into the portfolio company | [optional] 
**FirstInvestmentDate** | **DateTime?** | The date that is associated with the amount of money that was first invested into the portfolio company. | [optional] 
**BusinessTags** | **List&lt;string&gt;** | Tag(s) that describe what the company does based on the most common language (text snippets)  found on their website and/or social media sites.  | [optional] 
**LatestPostMoneyValuation** | **decimal?** | The value of a company, post capital injection. This is the latest value and may not include  the most recent rounds of funding. Always represented in USD  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

