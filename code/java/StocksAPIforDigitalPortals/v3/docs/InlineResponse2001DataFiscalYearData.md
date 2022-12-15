

# InlineResponse2001DataFiscalYearData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fiscalYear** | [**InlineResponse2001DataFiscalYear**](InlineResponse2001DataFiscalYear.md) |  |  [optional]
**currency** | [**InlineResponse2001DataCurrency**](InlineResponse2001DataCurrency.md) |  |  [optional]
**price** | **BigDecimal** | End-of-day price as of the end of the fiscal year. It is used for calculation of all price-related data items corresponding to the end of the fiscal year. |  [optional]
**freeFloat** | **BigDecimal** | Free float, which is the number of shares outstanding available for trading to the public. Closely-held shares (e.g. held by a majority investor) and temporarily restricted shares (e.g. due to insider lock-up periods) are not part of the free float. |  [optional]
**sharesOutstanding** | [**InlineResponse2001DataSharesOutstanding**](InlineResponse2001DataSharesOutstanding.md) |  |  [optional]
**marketCapitalization** | **BigDecimal** | Market capitalization, which is the market value of the shares outstanding over all types of shares of the company. |  [optional]
**incomeStatement** | [**InlineResponse2001DataIncomeStatement**](InlineResponse2001DataIncomeStatement.md) |  |  [optional]
**balanceSheet** | [**InlineResponse2001DataBalanceSheet**](InlineResponse2001DataBalanceSheet.md) |  |  [optional]
**cashFlow** | [**InlineResponse2001DataCashFlow**](InlineResponse2001DataCashFlow.md) |  |  [optional]
**ratios** | [**InlineResponse2001DataRatios**](InlineResponse2001DataRatios.md) |  |  [optional]
**perShare** | [**InlineResponse2001DataPerShare**](InlineResponse2001DataPerShare.md) |  |  [optional]


## Implemented Interfaces

* Serializable


