

# Profile

Profile object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request |  [optional]
**currency** | **String** | Code representing the currency |  [optional]
**ceo** | **String** | Currently listed company CEO |  [optional]
**founders** | **java.util.List&lt;String&gt;** | Currently listed company founders |  [optional]
**chair** | **String** | Current chairperson |  [optional]
**peBackingCurrent** | **Boolean** | Flag for whether the specified company currently has PE backing |  [optional]
**peBackingEver** | **Boolean** | Flag for whether the specified company has ever had PE backing |  [optional]
**vcBackingCurrent** | **Boolean** | Flag for whether the specified company currently has VC backing |  [optional]
**vcBackingEver** | **Boolean** | Flag for whether the specified company has ever had VC backing |  [optional]
**totalInvestors** | **Integer** | Total number of investment rounds for the portfolio company |  [optional]
**activeInvestors** | **Integer** | Number of active portfolio companies for the specified private equity firm |  [optional]
**activeInvestorsList** | **java.util.List&lt;String&gt;** | List of investors that are active investors in the given portfolio company itemized by security |  [optional]
**exitedInvestorsList** | **java.util.List&lt;String&gt;** | List of investors that had previously invested in the given portfolio company itemized by security |  [optional]
**amountRaisedUSD** | **Double** | Current estimated total of venture capital raised in USD.  Each investment amount is currency converted on the day of the investment. Then all values are summed.   |  [optional]
**amountRaisedLocalCurrency** | **Double** | Current estimated total of venture capital raised in local currency. |  [optional]
**vcpeAmountRaisedUSD** | **Double** | Current estimated total of venture capital and private equity raised in USD.  Each investment amount is currency converted on the day of the investment. Then all values are summed.  |  [optional]
**vcpeAmountRaisedLocalCurrency** | **Double** | Current estimated total of venture capital raised in all rounds of the portfolio company. This item applies to venture capital raised rounds only.    |  [optional]
**investmentStats** | **Double** | Investment stats summary for the specified portfolio company. Always represented in USD.   |  [optional]
**lastInvestmentDate** | **LocalDate** | The date that is associated with the most recent amount of money that was invested into the portfolio company |  [optional]
**firstInvestmentDate** | **LocalDate** | The date that is associated with the amount of money that was first invested into the portfolio company. |  [optional]
**businessTags** | **java.util.List&lt;String&gt;** | Tag(s) that describe what the company does based on the most common language (text snippets)  found on their website and/or social media sites.  |  [optional]
**latestPostMoneyValuation** | **BigDecimal** | The value of a company, post capital injection. This is the latest value and may not include  the most recent rounds of funding. Always represented in USD  |  [optional]


## Implemented Interfaces

* Serializable


