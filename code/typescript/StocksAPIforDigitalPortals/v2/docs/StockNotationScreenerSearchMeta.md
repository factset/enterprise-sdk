# stocksapifordigitalportals.StockNotationScreenerSearchMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | [optional] 
**pagination** | [**StockNotationScreenerSearchMetaPagination**](StockNotationScreenerSearchMetaPagination.md) |  | [optional] 



## Enum: [SortEnum]


* `valueUnit.code` (value: `"valueUnit.code"`)

* `-valueUnit.code` (value: `"-valueUnit.code"`)

* `market.name` (value: `"market.name"`)

* `-market.name` (value: `"-market.name"`)

* `symbol` (value: `"symbol"`)

* `-symbol` (value: `"-symbol"`)

* `instrument.name` (value: `"instrument.name"`)

* `-instrument.name` (value: `"-instrument.name"`)

* `instrument.shortName` (value: `"instrument.shortName"`)

* `-instrument.shortName` (value: `"-instrument.shortName"`)

* `instrument.stockType` (value: `"instrument.stockType"`)

* `-instrument.stockType` (value: `"-instrument.stockType"`)

* `instrument.industryClassification.rbics.level1.name` (value: `"instrument.industryClassification.rbics.level1.name"`)

* `-instrument.industryClassification.rbics.level1.name` (value: `"-instrument.industryClassification.rbics.level1.name"`)

* `instrument.industryClassification.rbics.level2.name` (value: `"instrument.industryClassification.rbics.level2.name"`)

* `-instrument.industryClassification.rbics.level2.name` (value: `"-instrument.industryClassification.rbics.level2.name"`)

* `instrument.industryClassification.rbics.level3.name` (value: `"instrument.industryClassification.rbics.level3.name"`)

* `-instrument.industryClassification.rbics.level3.name` (value: `"-instrument.industryClassification.rbics.level3.name"`)

* `instrument.industryClassification.rbics.level4.name` (value: `"instrument.industryClassification.rbics.level4.name"`)

* `-instrument.industryClassification.rbics.level4.name` (value: `"-instrument.industryClassification.rbics.level4.name"`)

* `instrument.industryClassification.rbics.level5.name` (value: `"instrument.industryClassification.rbics.level5.name"`)

* `-instrument.industryClassification.rbics.level5.name` (value: `"-instrument.industryClassification.rbics.level5.name"`)

* `instrument.industryClassification.rbics.level6.name` (value: `"instrument.industryClassification.rbics.level6.name"`)

* `-instrument.industryClassification.rbics.level6.name` (value: `"-instrument.industryClassification.rbics.level6.name"`)

* `instrument.company.name` (value: `"instrument.company.name"`)

* `-instrument.company.name` (value: `"-instrument.company.name"`)

* `instrument.company.country.name` (value: `"instrument.company.country.name"`)

* `-instrument.company.country.name` (value: `"-instrument.company.country.name"`)

* `reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.currency.isoCode` (value: `"reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.currency.isoCode"`)

* `-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.currency.isoCode` (value: `"-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.currency.isoCode"`)

* `reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.marketCapitalization` (value: `"reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.marketCapitalization"`)

* `-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.marketCapitalization` (value: `"-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.marketCapitalization"`)

* `reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.ebit` (value: `"reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.ebit"`)

* `-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.ebit` (value: `"-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.ebit"`)

* `reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.ebitda` (value: `"reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.ebitda"`)

* `-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.ebitda` (value: `"-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.ebitda"`)

* `reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.sales` (value: `"reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.sales"`)

* `-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.sales` (value: `"-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.sales"`)

* `reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings` (value: `"reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings"`)

* `-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings` (value: `"-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings"`)

* `reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.dividends` (value: `"reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.dividends"`)

* `-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.dividends` (value: `"-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.dividends"`)

* `reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.bookValue` (value: `"reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.bookValue"`)

* `-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.bookValue` (value: `"-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.bookValue"`)

* `reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.cashFlow` (value: `"reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.cashFlow"`)

* `-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.cashFlow` (value: `"-reportedKeyFigures.firstFiscalYear.currencyDependentKeyFigures.perShare.cashFlow"`)

* `reportedKeyFigures.firstFiscalYear.ebitMargin` (value: `"reportedKeyFigures.firstFiscalYear.ebitMargin"`)

* `-reportedKeyFigures.firstFiscalYear.ebitMargin` (value: `"-reportedKeyFigures.firstFiscalYear.ebitMargin"`)

* `reportedKeyFigures.firstFiscalYear.ebitdaMargin` (value: `"reportedKeyFigures.firstFiscalYear.ebitdaMargin"`)

* `-reportedKeyFigures.firstFiscalYear.ebitdaMargin` (value: `"-reportedKeyFigures.firstFiscalYear.ebitdaMargin"`)

* `reportedKeyFigures.firstFiscalYear.netIncomeMargin` (value: `"reportedKeyFigures.firstFiscalYear.netIncomeMargin"`)

* `-reportedKeyFigures.firstFiscalYear.netIncomeMargin` (value: `"-reportedKeyFigures.firstFiscalYear.netIncomeMargin"`)

* `reportedKeyFigures.firstFiscalYear.grossIncomeMargin` (value: `"reportedKeyFigures.firstFiscalYear.grossIncomeMargin"`)

* `-reportedKeyFigures.firstFiscalYear.grossIncomeMargin` (value: `"-reportedKeyFigures.firstFiscalYear.grossIncomeMargin"`)

* `reportedKeyFigures.firstFiscalYear.operatingMargin` (value: `"reportedKeyFigures.firstFiscalYear.operatingMargin"`)

* `-reportedKeyFigures.firstFiscalYear.operatingMargin` (value: `"-reportedKeyFigures.firstFiscalYear.operatingMargin"`)

* `reportedKeyFigures.firstFiscalYear.returnOnAssets` (value: `"reportedKeyFigures.firstFiscalYear.returnOnAssets"`)

* `-reportedKeyFigures.firstFiscalYear.returnOnAssets` (value: `"-reportedKeyFigures.firstFiscalYear.returnOnAssets"`)

* `reportedKeyFigures.firstFiscalYear.returnOnEquity` (value: `"reportedKeyFigures.firstFiscalYear.returnOnEquity"`)

* `-reportedKeyFigures.firstFiscalYear.returnOnEquity` (value: `"-reportedKeyFigures.firstFiscalYear.returnOnEquity"`)

* `reportedKeyFigures.firstFiscalYear.ratios.priceSales` (value: `"reportedKeyFigures.firstFiscalYear.ratios.priceSales"`)

* `-reportedKeyFigures.firstFiscalYear.ratios.priceSales` (value: `"-reportedKeyFigures.firstFiscalYear.ratios.priceSales"`)

* `reportedKeyFigures.firstFiscalYear.ratios.priceEarnings` (value: `"reportedKeyFigures.firstFiscalYear.ratios.priceEarnings"`)

* `-reportedKeyFigures.firstFiscalYear.ratios.priceEarnings` (value: `"-reportedKeyFigures.firstFiscalYear.ratios.priceEarnings"`)

* `reportedKeyFigures.firstFiscalYear.ratios.priceBookValue` (value: `"reportedKeyFigures.firstFiscalYear.ratios.priceBookValue"`)

* `-reportedKeyFigures.firstFiscalYear.ratios.priceBookValue` (value: `"-reportedKeyFigures.firstFiscalYear.ratios.priceBookValue"`)

* `reportedKeyFigures.firstFiscalYear.ratios.priceCashFlow` (value: `"reportedKeyFigures.firstFiscalYear.ratios.priceCashFlow"`)

* `-reportedKeyFigures.firstFiscalYear.ratios.priceCashFlow` (value: `"-reportedKeyFigures.firstFiscalYear.ratios.priceCashFlow"`)

* `reportedKeyFigures.firstFiscalYear.ratios.priceFreeCashFlow` (value: `"reportedKeyFigures.firstFiscalYear.ratios.priceFreeCashFlow"`)

* `-reportedKeyFigures.firstFiscalYear.ratios.priceFreeCashFlow` (value: `"-reportedKeyFigures.firstFiscalYear.ratios.priceFreeCashFlow"`)

* `reportedKeyFigures.firstFiscalYear.ratios.dividendYield` (value: `"reportedKeyFigures.firstFiscalYear.ratios.dividendYield"`)

* `-reportedKeyFigures.firstFiscalYear.ratios.dividendYield` (value: `"-reportedKeyFigures.firstFiscalYear.ratios.dividendYield"`)

* `reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueEbit` (value: `"reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueEbit"`)

* `-reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueEbit` (value: `"-reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueEbit"`)

* `reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueEbitda` (value: `"reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueEbitda"`)

* `-reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueEbitda` (value: `"-reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueEbitda"`)

* `reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueSales` (value: `"reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueSales"`)

* `-reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueSales` (value: `"-reportedKeyFigures.firstFiscalYear.ratios.enterpriseValueSales"`)

* `reportedKeyFigures.firstFiscalYear.ratios.debtEquity` (value: `"reportedKeyFigures.firstFiscalYear.ratios.debtEquity"`)

* `-reportedKeyFigures.firstFiscalYear.ratios.debtEquity` (value: `"-reportedKeyFigures.firstFiscalYear.ratios.debtEquity"`)

* `reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.currency.isoCode` (value: `"reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.currency.isoCode"`)

* `-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.currency.isoCode` (value: `"-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.currency.isoCode"`)

* `reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.marketCapitalization` (value: `"reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.marketCapitalization"`)

* `-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.marketCapitalization` (value: `"-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.marketCapitalization"`)

* `reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.ebit` (value: `"reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.ebit"`)

* `-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.ebit` (value: `"-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.ebit"`)

* `reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.ebitda` (value: `"reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.ebitda"`)

* `-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.ebitda` (value: `"-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.ebitda"`)

* `reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.sales` (value: `"reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.sales"`)

* `-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.sales` (value: `"-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.sales"`)

* `reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings` (value: `"reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings"`)

* `-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings` (value: `"-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings"`)

* `reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.dividends` (value: `"reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.dividends"`)

* `-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.dividends` (value: `"-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.dividends"`)

* `reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.bookValue` (value: `"reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.bookValue"`)

* `-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.bookValue` (value: `"-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.bookValue"`)

* `reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.cashFlow` (value: `"reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.cashFlow"`)

* `-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.cashFlow` (value: `"-reportedKeyFigures.secondFiscalYear.currencyDependentKeyFigures.perShare.cashFlow"`)

* `reportedKeyFigures.secondFiscalYear.ebitMargin` (value: `"reportedKeyFigures.secondFiscalYear.ebitMargin"`)

* `-reportedKeyFigures.secondFiscalYear.ebitMargin` (value: `"-reportedKeyFigures.secondFiscalYear.ebitMargin"`)

* `reportedKeyFigures.secondFiscalYear.ebitdaMargin` (value: `"reportedKeyFigures.secondFiscalYear.ebitdaMargin"`)

* `-reportedKeyFigures.secondFiscalYear.ebitdaMargin` (value: `"-reportedKeyFigures.secondFiscalYear.ebitdaMargin"`)

* `reportedKeyFigures.secondFiscalYear.netIncomeMargin` (value: `"reportedKeyFigures.secondFiscalYear.netIncomeMargin"`)

* `-reportedKeyFigures.secondFiscalYear.netIncomeMargin` (value: `"-reportedKeyFigures.secondFiscalYear.netIncomeMargin"`)

* `reportedKeyFigures.secondFiscalYear.grossIncomeMargin` (value: `"reportedKeyFigures.secondFiscalYear.grossIncomeMargin"`)

* `-reportedKeyFigures.secondFiscalYear.grossIncomeMargin` (value: `"-reportedKeyFigures.secondFiscalYear.grossIncomeMargin"`)

* `reportedKeyFigures.secondFiscalYear.operatingMargin` (value: `"reportedKeyFigures.secondFiscalYear.operatingMargin"`)

* `-reportedKeyFigures.secondFiscalYear.operatingMargin` (value: `"-reportedKeyFigures.secondFiscalYear.operatingMargin"`)

* `reportedKeyFigures.secondFiscalYear.returnOnAssets` (value: `"reportedKeyFigures.secondFiscalYear.returnOnAssets"`)

* `-reportedKeyFigures.secondFiscalYear.returnOnAssets` (value: `"-reportedKeyFigures.secondFiscalYear.returnOnAssets"`)

* `reportedKeyFigures.secondFiscalYear.returnOnEquity` (value: `"reportedKeyFigures.secondFiscalYear.returnOnEquity"`)

* `-reportedKeyFigures.secondFiscalYear.returnOnEquity` (value: `"-reportedKeyFigures.secondFiscalYear.returnOnEquity"`)

* `reportedKeyFigures.secondFiscalYear.ratios.priceSales` (value: `"reportedKeyFigures.secondFiscalYear.ratios.priceSales"`)

* `-reportedKeyFigures.secondFiscalYear.ratios.priceSales` (value: `"-reportedKeyFigures.secondFiscalYear.ratios.priceSales"`)

* `reportedKeyFigures.secondFiscalYear.ratios.priceEarnings` (value: `"reportedKeyFigures.secondFiscalYear.ratios.priceEarnings"`)

* `-reportedKeyFigures.secondFiscalYear.ratios.priceEarnings` (value: `"-reportedKeyFigures.secondFiscalYear.ratios.priceEarnings"`)

* `reportedKeyFigures.secondFiscalYear.ratios.priceBookValue` (value: `"reportedKeyFigures.secondFiscalYear.ratios.priceBookValue"`)

* `-reportedKeyFigures.secondFiscalYear.ratios.priceBookValue` (value: `"-reportedKeyFigures.secondFiscalYear.ratios.priceBookValue"`)

* `reportedKeyFigures.secondFiscalYear.ratios.priceCashFlow` (value: `"reportedKeyFigures.secondFiscalYear.ratios.priceCashFlow"`)

* `-reportedKeyFigures.secondFiscalYear.ratios.priceCashFlow` (value: `"-reportedKeyFigures.secondFiscalYear.ratios.priceCashFlow"`)

* `reportedKeyFigures.secondFiscalYear.ratios.priceFreeCashFlow` (value: `"reportedKeyFigures.secondFiscalYear.ratios.priceFreeCashFlow"`)

* `-reportedKeyFigures.secondFiscalYear.ratios.priceFreeCashFlow` (value: `"-reportedKeyFigures.secondFiscalYear.ratios.priceFreeCashFlow"`)

* `reportedKeyFigures.secondFiscalYear.ratios.dividendYield` (value: `"reportedKeyFigures.secondFiscalYear.ratios.dividendYield"`)

* `-reportedKeyFigures.secondFiscalYear.ratios.dividendYield` (value: `"-reportedKeyFigures.secondFiscalYear.ratios.dividendYield"`)

* `reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueEbit` (value: `"reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueEbit"`)

* `-reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueEbit` (value: `"-reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueEbit"`)

* `reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueEbitda` (value: `"reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueEbitda"`)

* `-reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueEbitda` (value: `"-reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueEbitda"`)

* `reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueSales` (value: `"reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueSales"`)

* `-reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueSales` (value: `"-reportedKeyFigures.secondFiscalYear.ratios.enterpriseValueSales"`)

* `reportedKeyFigures.secondFiscalYear.ratios.debtEquity` (value: `"reportedKeyFigures.secondFiscalYear.ratios.debtEquity"`)

* `-reportedKeyFigures.secondFiscalYear.ratios.debtEquity` (value: `"-reportedKeyFigures.secondFiscalYear.ratios.debtEquity"`)

* `reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.currency.isoCode` (value: `"reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.currency.isoCode"`)

* `-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.currency.isoCode` (value: `"-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.currency.isoCode"`)

* `reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.marketCapitalization` (value: `"reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.marketCapitalization"`)

* `-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.marketCapitalization` (value: `"-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.marketCapitalization"`)

* `reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.ebit` (value: `"reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.ebit"`)

* `-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.ebit` (value: `"-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.ebit"`)

* `reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.ebitda` (value: `"reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.ebitda"`)

* `-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.ebitda` (value: `"-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.ebitda"`)

* `reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.sales` (value: `"reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.sales"`)

* `-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.sales` (value: `"-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.sales"`)

* `reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings` (value: `"reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings"`)

* `-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings` (value: `"-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.recurringDilutedEarnings"`)

* `reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.dividends` (value: `"reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.dividends"`)

* `-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.dividends` (value: `"-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.dividends"`)

* `reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.bookValue` (value: `"reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.bookValue"`)

* `-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.bookValue` (value: `"-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.bookValue"`)

* `reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.cashFlow` (value: `"reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.cashFlow"`)

* `-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.cashFlow` (value: `"-reportedKeyFigures.thirdFiscalYear.currencyDependentKeyFigures.perShare.cashFlow"`)

* `reportedKeyFigures.thirdFiscalYear.ebitMargin` (value: `"reportedKeyFigures.thirdFiscalYear.ebitMargin"`)

* `-reportedKeyFigures.thirdFiscalYear.ebitMargin` (value: `"-reportedKeyFigures.thirdFiscalYear.ebitMargin"`)

* `reportedKeyFigures.thirdFiscalYear.ebitdaMargin` (value: `"reportedKeyFigures.thirdFiscalYear.ebitdaMargin"`)

* `-reportedKeyFigures.thirdFiscalYear.ebitdaMargin` (value: `"-reportedKeyFigures.thirdFiscalYear.ebitdaMargin"`)

* `reportedKeyFigures.thirdFiscalYear.netIncomeMargin` (value: `"reportedKeyFigures.thirdFiscalYear.netIncomeMargin"`)

* `-reportedKeyFigures.thirdFiscalYear.netIncomeMargin` (value: `"-reportedKeyFigures.thirdFiscalYear.netIncomeMargin"`)

* `reportedKeyFigures.thirdFiscalYear.grossIncomeMargin` (value: `"reportedKeyFigures.thirdFiscalYear.grossIncomeMargin"`)

* `-reportedKeyFigures.thirdFiscalYear.grossIncomeMargin` (value: `"-reportedKeyFigures.thirdFiscalYear.grossIncomeMargin"`)

* `reportedKeyFigures.thirdFiscalYear.operatingMargin` (value: `"reportedKeyFigures.thirdFiscalYear.operatingMargin"`)

* `-reportedKeyFigures.thirdFiscalYear.operatingMargin` (value: `"-reportedKeyFigures.thirdFiscalYear.operatingMargin"`)

* `reportedKeyFigures.thirdFiscalYear.returnOnAssets` (value: `"reportedKeyFigures.thirdFiscalYear.returnOnAssets"`)

* `-reportedKeyFigures.thirdFiscalYear.returnOnAssets` (value: `"-reportedKeyFigures.thirdFiscalYear.returnOnAssets"`)

* `reportedKeyFigures.thirdFiscalYear.returnOnEquity` (value: `"reportedKeyFigures.thirdFiscalYear.returnOnEquity"`)

* `-reportedKeyFigures.thirdFiscalYear.returnOnEquity` (value: `"-reportedKeyFigures.thirdFiscalYear.returnOnEquity"`)

* `reportedKeyFigures.thirdFiscalYear.ratios.priceSales` (value: `"reportedKeyFigures.thirdFiscalYear.ratios.priceSales"`)

* `-reportedKeyFigures.thirdFiscalYear.ratios.priceSales` (value: `"-reportedKeyFigures.thirdFiscalYear.ratios.priceSales"`)

* `reportedKeyFigures.thirdFiscalYear.ratios.priceEarnings` (value: `"reportedKeyFigures.thirdFiscalYear.ratios.priceEarnings"`)

* `-reportedKeyFigures.thirdFiscalYear.ratios.priceEarnings` (value: `"-reportedKeyFigures.thirdFiscalYear.ratios.priceEarnings"`)

* `reportedKeyFigures.thirdFiscalYear.ratios.priceBookValue` (value: `"reportedKeyFigures.thirdFiscalYear.ratios.priceBookValue"`)

* `-reportedKeyFigures.thirdFiscalYear.ratios.priceBookValue` (value: `"-reportedKeyFigures.thirdFiscalYear.ratios.priceBookValue"`)

* `reportedKeyFigures.thirdFiscalYear.ratios.priceCashFlow` (value: `"reportedKeyFigures.thirdFiscalYear.ratios.priceCashFlow"`)

* `-reportedKeyFigures.thirdFiscalYear.ratios.priceCashFlow` (value: `"-reportedKeyFigures.thirdFiscalYear.ratios.priceCashFlow"`)

* `reportedKeyFigures.thirdFiscalYear.ratios.priceFreeCashFlow` (value: `"reportedKeyFigures.thirdFiscalYear.ratios.priceFreeCashFlow"`)

* `-reportedKeyFigures.thirdFiscalYear.ratios.priceFreeCashFlow` (value: `"-reportedKeyFigures.thirdFiscalYear.ratios.priceFreeCashFlow"`)

* `reportedKeyFigures.thirdFiscalYear.ratios.dividendYield` (value: `"reportedKeyFigures.thirdFiscalYear.ratios.dividendYield"`)

* `-reportedKeyFigures.thirdFiscalYear.ratios.dividendYield` (value: `"-reportedKeyFigures.thirdFiscalYear.ratios.dividendYield"`)

* `reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueEbit` (value: `"reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueEbit"`)

* `-reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueEbit` (value: `"-reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueEbit"`)

* `reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueEbitda` (value: `"reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueEbitda"`)

* `-reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueEbitda` (value: `"-reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueEbitda"`)

* `reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueSales` (value: `"reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueSales"`)

* `-reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueSales` (value: `"-reportedKeyFigures.thirdFiscalYear.ratios.enterpriseValueSales"`)

* `reportedKeyFigures.thirdFiscalYear.ratios.debtEquity` (value: `"reportedKeyFigures.thirdFiscalYear.ratios.debtEquity"`)

* `-reportedKeyFigures.thirdFiscalYear.ratios.debtEquity` (value: `"-reportedKeyFigures.thirdFiscalYear.ratios.debtEquity"`)

* `performance.intraday` (value: `"performance.intraday"`)

* `-performance.intraday` (value: `"-performance.intraday"`)

* `performance.endOfDay.day1` (value: `"performance.endOfDay.day1"`)

* `-performance.endOfDay.day1` (value: `"-performance.endOfDay.day1"`)

* `performance.endOfDay.week1` (value: `"performance.endOfDay.week1"`)

* `-performance.endOfDay.week1` (value: `"-performance.endOfDay.week1"`)

* `performance.endOfDay.month1` (value: `"performance.endOfDay.month1"`)

* `-performance.endOfDay.month1` (value: `"-performance.endOfDay.month1"`)

* `performance.endOfDay.months3` (value: `"performance.endOfDay.months3"`)

* `-performance.endOfDay.months3` (value: `"-performance.endOfDay.months3"`)

* `performance.endOfDay.months6` (value: `"performance.endOfDay.months6"`)

* `-performance.endOfDay.months6` (value: `"-performance.endOfDay.months6"`)

* `performance.endOfDay.year1` (value: `"performance.endOfDay.year1"`)

* `-performance.endOfDay.year1` (value: `"-performance.endOfDay.year1"`)

* `performance.endOfDay.years3` (value: `"performance.endOfDay.years3"`)

* `-performance.endOfDay.years3` (value: `"-performance.endOfDay.years3"`)

* `performance.endOfDay.years5` (value: `"performance.endOfDay.years5"`)

* `-performance.endOfDay.years5` (value: `"-performance.endOfDay.years5"`)

* `performance.endOfDay.yearToDate` (value: `"performance.endOfDay.yearToDate"`)

* `-performance.endOfDay.yearToDate` (value: `"-performance.endOfDay.yearToDate"`)

* `volatility.week1` (value: `"volatility.week1"`)

* `-volatility.week1` (value: `"-volatility.week1"`)

* `volatility.month1` (value: `"volatility.month1"`)

* `-volatility.month1` (value: `"-volatility.month1"`)

* `volatility.months3` (value: `"volatility.months3"`)

* `-volatility.months3` (value: `"-volatility.months3"`)

* `volatility.months6` (value: `"volatility.months6"`)

* `-volatility.months6` (value: `"-volatility.months6"`)

* `volatility.year1` (value: `"volatility.year1"`)

* `-volatility.year1` (value: `"-volatility.year1"`)

* `volatility.years3` (value: `"volatility.years3"`)

* `-volatility.years3` (value: `"-volatility.years3"`)

* `volatility.years5` (value: `"volatility.years5"`)

* `-volatility.years5` (value: `"-volatility.years5"`)

* `volatility.yearToDate` (value: `"volatility.yearToDate"`)

* `-volatility.yearToDate` (value: `"-volatility.yearToDate"`)

* `tradingValue.average.days5` (value: `"tradingValue.average.days5"`)

* `-tradingValue.average.days5` (value: `"-tradingValue.average.days5"`)

* `tradingValue.average.days30` (value: `"tradingValue.average.days30"`)

* `-tradingValue.average.days30` (value: `"-tradingValue.average.days30"`)

* `simpleMovingAverage.tradingDaysSinceCrossover.sma20vs50.numberDays` (value: `"simpleMovingAverage.tradingDaysSinceCrossover.sma20vs50.numberDays"`)

* `-simpleMovingAverage.tradingDaysSinceCrossover.sma20vs50.numberDays` (value: `"-simpleMovingAverage.tradingDaysSinceCrossover.sma20vs50.numberDays"`)

* `simpleMovingAverage.tradingDaysSinceCrossover.sma20vs50.direction` (value: `"simpleMovingAverage.tradingDaysSinceCrossover.sma20vs50.direction"`)

* `-simpleMovingAverage.tradingDaysSinceCrossover.sma20vs50.direction` (value: `"-simpleMovingAverage.tradingDaysSinceCrossover.sma20vs50.direction"`)

* `simpleMovingAverage.tradingDaysSinceCrossover.sma50vs200.numberDays` (value: `"simpleMovingAverage.tradingDaysSinceCrossover.sma50vs200.numberDays"`)

* `-simpleMovingAverage.tradingDaysSinceCrossover.sma50vs200.numberDays` (value: `"-simpleMovingAverage.tradingDaysSinceCrossover.sma50vs200.numberDays"`)

* `simpleMovingAverage.tradingDaysSinceCrossover.sma50vs200.direction` (value: `"simpleMovingAverage.tradingDaysSinceCrossover.sma50vs200.direction"`)

* `-simpleMovingAverage.tradingDaysSinceCrossover.sma50vs200.direction` (value: `"-simpleMovingAverage.tradingDaysSinceCrossover.sma50vs200.direction"`)

* `rsiWilder.days14` (value: `"rsiWilder.days14"`)

* `-rsiWilder.days14` (value: `"-rsiWilder.days14"`)

* `recommendation.counts.total` (value: `"recommendation.counts.total"`)

* `-recommendation.counts.total` (value: `"-recommendation.counts.total"`)

* `recommendation.consensus` (value: `"recommendation.consensus"`)

* `-recommendation.consensus` (value: `"-recommendation.consensus"`)

* `estimates.firstFiscalYear.currencyDependentEstimates.currency.isoCode` (value: `"estimates.firstFiscalYear.currencyDependentEstimates.currency.isoCode"`)

* `-estimates.firstFiscalYear.currencyDependentEstimates.currency.isoCode` (value: `"-estimates.firstFiscalYear.currencyDependentEstimates.currency.isoCode"`)

* `estimates.firstFiscalYear.currencyDependentEstimates.ebit.mean` (value: `"estimates.firstFiscalYear.currencyDependentEstimates.ebit.mean"`)

* `-estimates.firstFiscalYear.currencyDependentEstimates.ebit.mean` (value: `"-estimates.firstFiscalYear.currencyDependentEstimates.ebit.mean"`)

* `estimates.firstFiscalYear.currencyDependentEstimates.ebitda.mean` (value: `"estimates.firstFiscalYear.currencyDependentEstimates.ebitda.mean"`)

* `-estimates.firstFiscalYear.currencyDependentEstimates.ebitda.mean` (value: `"-estimates.firstFiscalYear.currencyDependentEstimates.ebitda.mean"`)

* `estimates.firstFiscalYear.currencyDependentEstimates.perShare.sales.mean` (value: `"estimates.firstFiscalYear.currencyDependentEstimates.perShare.sales.mean"`)

* `-estimates.firstFiscalYear.currencyDependentEstimates.perShare.sales.mean` (value: `"-estimates.firstFiscalYear.currencyDependentEstimates.perShare.sales.mean"`)

* `estimates.firstFiscalYear.currencyDependentEstimates.perShare.earnings.mean` (value: `"estimates.firstFiscalYear.currencyDependentEstimates.perShare.earnings.mean"`)

* `-estimates.firstFiscalYear.currencyDependentEstimates.perShare.earnings.mean` (value: `"-estimates.firstFiscalYear.currencyDependentEstimates.perShare.earnings.mean"`)

* `estimates.firstFiscalYear.currencyDependentEstimates.perShare.dividends.mean` (value: `"estimates.firstFiscalYear.currencyDependentEstimates.perShare.dividends.mean"`)

* `-estimates.firstFiscalYear.currencyDependentEstimates.perShare.dividends.mean` (value: `"-estimates.firstFiscalYear.currencyDependentEstimates.perShare.dividends.mean"`)

* `estimates.firstFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean` (value: `"estimates.firstFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean"`)

* `-estimates.firstFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean` (value: `"-estimates.firstFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean"`)

* `estimates.firstFiscalYear.returnOnAssets.mean` (value: `"estimates.firstFiscalYear.returnOnAssets.mean"`)

* `-estimates.firstFiscalYear.returnOnAssets.mean` (value: `"-estimates.firstFiscalYear.returnOnAssets.mean"`)

* `estimates.firstFiscalYear.returnOnEquity.mean` (value: `"estimates.firstFiscalYear.returnOnEquity.mean"`)

* `-estimates.firstFiscalYear.returnOnEquity.mean` (value: `"-estimates.firstFiscalYear.returnOnEquity.mean"`)

* `estimates.firstFiscalYear.ratios.priceSales.mean` (value: `"estimates.firstFiscalYear.ratios.priceSales.mean"`)

* `-estimates.firstFiscalYear.ratios.priceSales.mean` (value: `"-estimates.firstFiscalYear.ratios.priceSales.mean"`)

* `estimates.firstFiscalYear.ratios.priceEarnings.mean` (value: `"estimates.firstFiscalYear.ratios.priceEarnings.mean"`)

* `-estimates.firstFiscalYear.ratios.priceEarnings.mean` (value: `"-estimates.firstFiscalYear.ratios.priceEarnings.mean"`)

* `estimates.firstFiscalYear.ratios.priceEarningsGrowth.mean` (value: `"estimates.firstFiscalYear.ratios.priceEarningsGrowth.mean"`)

* `-estimates.firstFiscalYear.ratios.priceEarningsGrowth.mean` (value: `"-estimates.firstFiscalYear.ratios.priceEarningsGrowth.mean"`)

* `estimates.firstFiscalYear.ratios.priceBookValue.mean` (value: `"estimates.firstFiscalYear.ratios.priceBookValue.mean"`)

* `-estimates.firstFiscalYear.ratios.priceBookValue.mean` (value: `"-estimates.firstFiscalYear.ratios.priceBookValue.mean"`)

* `estimates.firstFiscalYear.ratios.priceCashFlow.mean` (value: `"estimates.firstFiscalYear.ratios.priceCashFlow.mean"`)

* `-estimates.firstFiscalYear.ratios.priceCashFlow.mean` (value: `"-estimates.firstFiscalYear.ratios.priceCashFlow.mean"`)

* `estimates.firstFiscalYear.ratios.priceFreeCashFlow.mean` (value: `"estimates.firstFiscalYear.ratios.priceFreeCashFlow.mean"`)

* `-estimates.firstFiscalYear.ratios.priceFreeCashFlow.mean` (value: `"-estimates.firstFiscalYear.ratios.priceFreeCashFlow.mean"`)

* `estimates.firstFiscalYear.ratios.dividendYield.mean` (value: `"estimates.firstFiscalYear.ratios.dividendYield.mean"`)

* `-estimates.firstFiscalYear.ratios.dividendYield.mean` (value: `"-estimates.firstFiscalYear.ratios.dividendYield.mean"`)

* `estimates.firstFiscalYear.ratios.enterpriseValueEbit.mean` (value: `"estimates.firstFiscalYear.ratios.enterpriseValueEbit.mean"`)

* `-estimates.firstFiscalYear.ratios.enterpriseValueEbit.mean` (value: `"-estimates.firstFiscalYear.ratios.enterpriseValueEbit.mean"`)

* `estimates.firstFiscalYear.ratios.enterpriseValueEbitda.mean` (value: `"estimates.firstFiscalYear.ratios.enterpriseValueEbitda.mean"`)

* `-estimates.firstFiscalYear.ratios.enterpriseValueEbitda.mean` (value: `"-estimates.firstFiscalYear.ratios.enterpriseValueEbitda.mean"`)

* `estimates.firstFiscalYear.ratios.enterpriseValueSales.mean` (value: `"estimates.firstFiscalYear.ratios.enterpriseValueSales.mean"`)

* `-estimates.firstFiscalYear.ratios.enterpriseValueSales.mean` (value: `"-estimates.firstFiscalYear.ratios.enterpriseValueSales.mean"`)

* `estimates.secondFiscalYear.currencyDependentEstimates.currency.isoCode` (value: `"estimates.secondFiscalYear.currencyDependentEstimates.currency.isoCode"`)

* `-estimates.secondFiscalYear.currencyDependentEstimates.currency.isoCode` (value: `"-estimates.secondFiscalYear.currencyDependentEstimates.currency.isoCode"`)

* `estimates.secondFiscalYear.currencyDependentEstimates.ebit.mean` (value: `"estimates.secondFiscalYear.currencyDependentEstimates.ebit.mean"`)

* `-estimates.secondFiscalYear.currencyDependentEstimates.ebit.mean` (value: `"-estimates.secondFiscalYear.currencyDependentEstimates.ebit.mean"`)

* `estimates.secondFiscalYear.currencyDependentEstimates.ebitda.mean` (value: `"estimates.secondFiscalYear.currencyDependentEstimates.ebitda.mean"`)

* `-estimates.secondFiscalYear.currencyDependentEstimates.ebitda.mean` (value: `"-estimates.secondFiscalYear.currencyDependentEstimates.ebitda.mean"`)

* `estimates.secondFiscalYear.currencyDependentEstimates.perShare.sales.mean` (value: `"estimates.secondFiscalYear.currencyDependentEstimates.perShare.sales.mean"`)

* `-estimates.secondFiscalYear.currencyDependentEstimates.perShare.sales.mean` (value: `"-estimates.secondFiscalYear.currencyDependentEstimates.perShare.sales.mean"`)

* `estimates.secondFiscalYear.currencyDependentEstimates.perShare.earnings.mean` (value: `"estimates.secondFiscalYear.currencyDependentEstimates.perShare.earnings.mean"`)

* `-estimates.secondFiscalYear.currencyDependentEstimates.perShare.earnings.mean` (value: `"-estimates.secondFiscalYear.currencyDependentEstimates.perShare.earnings.mean"`)

* `estimates.secondFiscalYear.currencyDependentEstimates.perShare.dividends.mean` (value: `"estimates.secondFiscalYear.currencyDependentEstimates.perShare.dividends.mean"`)

* `-estimates.secondFiscalYear.currencyDependentEstimates.perShare.dividends.mean` (value: `"-estimates.secondFiscalYear.currencyDependentEstimates.perShare.dividends.mean"`)

* `estimates.secondFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean` (value: `"estimates.secondFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean"`)

* `-estimates.secondFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean` (value: `"-estimates.secondFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean"`)

* `estimates.secondFiscalYear.returnOnAssets.mean` (value: `"estimates.secondFiscalYear.returnOnAssets.mean"`)

* `-estimates.secondFiscalYear.returnOnAssets.mean` (value: `"-estimates.secondFiscalYear.returnOnAssets.mean"`)

* `estimates.secondFiscalYear.returnOnEquity.mean` (value: `"estimates.secondFiscalYear.returnOnEquity.mean"`)

* `-estimates.secondFiscalYear.returnOnEquity.mean` (value: `"-estimates.secondFiscalYear.returnOnEquity.mean"`)

* `estimates.secondFiscalYear.ratios.priceSales.mean` (value: `"estimates.secondFiscalYear.ratios.priceSales.mean"`)

* `-estimates.secondFiscalYear.ratios.priceSales.mean` (value: `"-estimates.secondFiscalYear.ratios.priceSales.mean"`)

* `estimates.secondFiscalYear.ratios.priceEarnings.mean` (value: `"estimates.secondFiscalYear.ratios.priceEarnings.mean"`)

* `-estimates.secondFiscalYear.ratios.priceEarnings.mean` (value: `"-estimates.secondFiscalYear.ratios.priceEarnings.mean"`)

* `estimates.secondFiscalYear.ratios.priceEarningsGrowth.mean` (value: `"estimates.secondFiscalYear.ratios.priceEarningsGrowth.mean"`)

* `-estimates.secondFiscalYear.ratios.priceEarningsGrowth.mean` (value: `"-estimates.secondFiscalYear.ratios.priceEarningsGrowth.mean"`)

* `estimates.secondFiscalYear.ratios.priceBookValue.mean` (value: `"estimates.secondFiscalYear.ratios.priceBookValue.mean"`)

* `-estimates.secondFiscalYear.ratios.priceBookValue.mean` (value: `"-estimates.secondFiscalYear.ratios.priceBookValue.mean"`)

* `estimates.secondFiscalYear.ratios.priceCashFlow.mean` (value: `"estimates.secondFiscalYear.ratios.priceCashFlow.mean"`)

* `-estimates.secondFiscalYear.ratios.priceCashFlow.mean` (value: `"-estimates.secondFiscalYear.ratios.priceCashFlow.mean"`)

* `estimates.secondFiscalYear.ratios.priceFreeCashFlow.mean` (value: `"estimates.secondFiscalYear.ratios.priceFreeCashFlow.mean"`)

* `-estimates.secondFiscalYear.ratios.priceFreeCashFlow.mean` (value: `"-estimates.secondFiscalYear.ratios.priceFreeCashFlow.mean"`)

* `estimates.secondFiscalYear.ratios.dividendYield.mean` (value: `"estimates.secondFiscalYear.ratios.dividendYield.mean"`)

* `-estimates.secondFiscalYear.ratios.dividendYield.mean` (value: `"-estimates.secondFiscalYear.ratios.dividendYield.mean"`)

* `estimates.secondFiscalYear.ratios.enterpriseValueEbit.mean` (value: `"estimates.secondFiscalYear.ratios.enterpriseValueEbit.mean"`)

* `-estimates.secondFiscalYear.ratios.enterpriseValueEbit.mean` (value: `"-estimates.secondFiscalYear.ratios.enterpriseValueEbit.mean"`)

* `estimates.secondFiscalYear.ratios.enterpriseValueEbitda.mean` (value: `"estimates.secondFiscalYear.ratios.enterpriseValueEbitda.mean"`)

* `-estimates.secondFiscalYear.ratios.enterpriseValueEbitda.mean` (value: `"-estimates.secondFiscalYear.ratios.enterpriseValueEbitda.mean"`)

* `estimates.secondFiscalYear.ratios.enterpriseValueSales.mean` (value: `"estimates.secondFiscalYear.ratios.enterpriseValueSales.mean"`)

* `-estimates.secondFiscalYear.ratios.enterpriseValueSales.mean` (value: `"-estimates.secondFiscalYear.ratios.enterpriseValueSales.mean"`)

* `estimates.thirdFiscalYear.currencyDependentEstimates.currency.isoCode` (value: `"estimates.thirdFiscalYear.currencyDependentEstimates.currency.isoCode"`)

* `-estimates.thirdFiscalYear.currencyDependentEstimates.currency.isoCode` (value: `"-estimates.thirdFiscalYear.currencyDependentEstimates.currency.isoCode"`)

* `estimates.thirdFiscalYear.currencyDependentEstimates.ebit.mean` (value: `"estimates.thirdFiscalYear.currencyDependentEstimates.ebit.mean"`)

* `-estimates.thirdFiscalYear.currencyDependentEstimates.ebit.mean` (value: `"-estimates.thirdFiscalYear.currencyDependentEstimates.ebit.mean"`)

* `estimates.thirdFiscalYear.currencyDependentEstimates.ebitda.mean` (value: `"estimates.thirdFiscalYear.currencyDependentEstimates.ebitda.mean"`)

* `-estimates.thirdFiscalYear.currencyDependentEstimates.ebitda.mean` (value: `"-estimates.thirdFiscalYear.currencyDependentEstimates.ebitda.mean"`)

* `estimates.thirdFiscalYear.currencyDependentEstimates.perShare.sales.mean` (value: `"estimates.thirdFiscalYear.currencyDependentEstimates.perShare.sales.mean"`)

* `-estimates.thirdFiscalYear.currencyDependentEstimates.perShare.sales.mean` (value: `"-estimates.thirdFiscalYear.currencyDependentEstimates.perShare.sales.mean"`)

* `estimates.thirdFiscalYear.currencyDependentEstimates.perShare.earnings.mean` (value: `"estimates.thirdFiscalYear.currencyDependentEstimates.perShare.earnings.mean"`)

* `-estimates.thirdFiscalYear.currencyDependentEstimates.perShare.earnings.mean` (value: `"-estimates.thirdFiscalYear.currencyDependentEstimates.perShare.earnings.mean"`)

* `estimates.thirdFiscalYear.currencyDependentEstimates.perShare.dividends.mean` (value: `"estimates.thirdFiscalYear.currencyDependentEstimates.perShare.dividends.mean"`)

* `-estimates.thirdFiscalYear.currencyDependentEstimates.perShare.dividends.mean` (value: `"-estimates.thirdFiscalYear.currencyDependentEstimates.perShare.dividends.mean"`)

* `estimates.thirdFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean` (value: `"estimates.thirdFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean"`)

* `-estimates.thirdFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean` (value: `"-estimates.thirdFiscalYear.currencyDependentEstimates.perShare.cashFlow.mean"`)

* `estimates.thirdFiscalYear.returnOnAssets.mean` (value: `"estimates.thirdFiscalYear.returnOnAssets.mean"`)

* `-estimates.thirdFiscalYear.returnOnAssets.mean` (value: `"-estimates.thirdFiscalYear.returnOnAssets.mean"`)

* `estimates.thirdFiscalYear.returnOnEquity.mean` (value: `"estimates.thirdFiscalYear.returnOnEquity.mean"`)

* `-estimates.thirdFiscalYear.returnOnEquity.mean` (value: `"-estimates.thirdFiscalYear.returnOnEquity.mean"`)

* `estimates.thirdFiscalYear.ratios.priceSales.mean` (value: `"estimates.thirdFiscalYear.ratios.priceSales.mean"`)

* `-estimates.thirdFiscalYear.ratios.priceSales.mean` (value: `"-estimates.thirdFiscalYear.ratios.priceSales.mean"`)

* `estimates.thirdFiscalYear.ratios.priceEarnings.mean` (value: `"estimates.thirdFiscalYear.ratios.priceEarnings.mean"`)

* `-estimates.thirdFiscalYear.ratios.priceEarnings.mean` (value: `"-estimates.thirdFiscalYear.ratios.priceEarnings.mean"`)

* `estimates.thirdFiscalYear.ratios.priceEarningsGrowth.mean` (value: `"estimates.thirdFiscalYear.ratios.priceEarningsGrowth.mean"`)

* `-estimates.thirdFiscalYear.ratios.priceEarningsGrowth.mean` (value: `"-estimates.thirdFiscalYear.ratios.priceEarningsGrowth.mean"`)

* `estimates.thirdFiscalYear.ratios.priceBookValue.mean` (value: `"estimates.thirdFiscalYear.ratios.priceBookValue.mean"`)

* `-estimates.thirdFiscalYear.ratios.priceBookValue.mean` (value: `"-estimates.thirdFiscalYear.ratios.priceBookValue.mean"`)

* `estimates.thirdFiscalYear.ratios.priceCashFlow.mean` (value: `"estimates.thirdFiscalYear.ratios.priceCashFlow.mean"`)

* `-estimates.thirdFiscalYear.ratios.priceCashFlow.mean` (value: `"-estimates.thirdFiscalYear.ratios.priceCashFlow.mean"`)

* `estimates.thirdFiscalYear.ratios.priceFreeCashFlow.mean` (value: `"estimates.thirdFiscalYear.ratios.priceFreeCashFlow.mean"`)

* `-estimates.thirdFiscalYear.ratios.priceFreeCashFlow.mean` (value: `"-estimates.thirdFiscalYear.ratios.priceFreeCashFlow.mean"`)

* `estimates.thirdFiscalYear.ratios.dividendYield.mean` (value: `"estimates.thirdFiscalYear.ratios.dividendYield.mean"`)

* `-estimates.thirdFiscalYear.ratios.dividendYield.mean` (value: `"-estimates.thirdFiscalYear.ratios.dividendYield.mean"`)

* `estimates.thirdFiscalYear.ratios.enterpriseValueEbit.mean` (value: `"estimates.thirdFiscalYear.ratios.enterpriseValueEbit.mean"`)

* `-estimates.thirdFiscalYear.ratios.enterpriseValueEbit.mean` (value: `"-estimates.thirdFiscalYear.ratios.enterpriseValueEbit.mean"`)

* `estimates.thirdFiscalYear.ratios.enterpriseValueEbitda.mean` (value: `"estimates.thirdFiscalYear.ratios.enterpriseValueEbitda.mean"`)

* `-estimates.thirdFiscalYear.ratios.enterpriseValueEbitda.mean` (value: `"-estimates.thirdFiscalYear.ratios.enterpriseValueEbitda.mean"`)

* `estimates.thirdFiscalYear.ratios.enterpriseValueSales.mean` (value: `"estimates.thirdFiscalYear.ratios.enterpriseValueSales.mean"`)

* `-estimates.thirdFiscalYear.ratios.enterpriseValueSales.mean` (value: `"-estimates.thirdFiscalYear.ratios.enterpriseValueSales.mean"`)




