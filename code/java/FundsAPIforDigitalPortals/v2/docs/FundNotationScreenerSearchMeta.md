

# FundNotationScreenerSearchMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. |  [optional]
**pagination** | [**FundNotationScreenerSearchMetaPagination**](FundNotationScreenerSearchMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
CURRENCY_CODE | &quot;currency.code&quot;
_CURRENCY_CODE | &quot;-currency.code&quot;
INSTRUMENT_NAME | &quot;instrument.name&quot;
_INSTRUMENT_NAME | &quot;-instrument.name&quot;
INSTRUMENT_SHORTNAME | &quot;instrument.shortName&quot;
_INSTRUMENT_SHORTNAME | &quot;-instrument.shortName&quot;
FUND_ETF | &quot;fund.etf&quot;
_FUND_ETF | &quot;-fund.etf&quot;
FUND_CURRENCY_ISOCODE | &quot;fund.currency.isoCode&quot;
_FUND_CURRENCY_ISOCODE | &quot;-fund.currency.isoCode&quot;
FUND_DOMICILE_NAME | &quot;fund.domicile.name&quot;
_FUND_DOMICILE_NAME | &quot;-fund.domicile.name&quot;
FUND_HOLDINGTYPE_NAME | &quot;fund.holdingType.name&quot;
_FUND_HOLDINGTYPE_NAME | &quot;-fund.holdingType.name&quot;
FUND_COUNTRYDEVELOPMENT_NAME | &quot;fund.countryDevelopment.name&quot;
_FUND_COUNTRYDEVELOPMENT_NAME | &quot;-fund.countryDevelopment.name&quot;
FUND_REGIONALEXPOSURE_BROAD_NAME | &quot;fund.regionalExposure.broad.name&quot;
_FUND_REGIONALEXPOSURE_BROAD_NAME | &quot;-fund.regionalExposure.broad.name&quot;
FUND_REGIONALEXPOSURE_SPECIFIC_NAME | &quot;fund.regionalExposure.specific.name&quot;
_FUND_REGIONALEXPOSURE_SPECIFIC_NAME | &quot;-fund.regionalExposure.specific.name&quot;
FUND_STRATEGY_LEVEL1_NAME | &quot;fund.strategy.level1.name&quot;
_FUND_STRATEGY_LEVEL1_NAME | &quot;-fund.strategy.level1.name&quot;
FUND_STRATEGY_LEVEL2_NAME | &quot;fund.strategy.level2.name&quot;
_FUND_STRATEGY_LEVEL2_NAME | &quot;-fund.strategy.level2.name&quot;
FUND_STRATEGY_LEVEL3_NAME | &quot;fund.strategy.level3.name&quot;
_FUND_STRATEGY_LEVEL3_NAME | &quot;-fund.strategy.level3.name&quot;
FUND_INDUSTRY_NAME | &quot;fund.industry.name&quot;
_FUND_INDUSTRY_NAME | &quot;-fund.industry.name&quot;
FUND_SRRI_GRADE | &quot;fund.srri.grade&quot;
_FUND_SRRI_GRADE | &quot;-fund.srri.grade&quot;
FUND_ISSUER_NAME | &quot;fund.issuer.name&quot;
_FUND_ISSUER_NAME | &quot;-fund.issuer.name&quot;
FUND_ISSUER_COUNTRY_NAME | &quot;fund.issuer.country.name&quot;
_FUND_ISSUER_COUNTRY_NAME | &quot;-fund.issuer.country.name&quot;
FUND_ASSETSUNDERMANAGEMENT | &quot;fund.assetsUnderManagement&quot;
_FUND_ASSETSUNDERMANAGEMENT | &quot;-fund.assetsUnderManagement&quot;
SHARECLASS_LIFECYCLE_ISSUE | &quot;shareClass.lifeCycle.issue&quot;
_SHARECLASS_LIFECYCLE_ISSUE | &quot;-shareClass.lifeCycle.issue&quot;
SHARECLASS_MINIMUMINVESTMENT_INITIAL | &quot;shareClass.minimumInvestment.initial&quot;
_SHARECLASS_MINIMUMINVESTMENT_INITIAL | &quot;-shareClass.minimumInvestment.initial&quot;
SHARECLASS_MINIMUMINVESTMENT_SUBSEQUENT | &quot;shareClass.minimumInvestment.subsequent&quot;
_SHARECLASS_MINIMUMINVESTMENT_SUBSEQUENT | &quot;-shareClass.minimumInvestment.subsequent&quot;
SHARECLASS_ASSETSUNDERMANAGEMENT | &quot;shareClass.assetsUnderManagement&quot;
_SHARECLASS_ASSETSUNDERMANAGEMENT | &quot;-shareClass.assetsUnderManagement&quot;
SHARECLASS_FEE_ONGOING_CURRENT | &quot;shareClass.fee.ongoing.current&quot;
_SHARECLASS_FEE_ONGOING_CURRENT | &quot;-shareClass.fee.ongoing.current&quot;
SHARECLASS_FEE_ALLIN_CURRENT | &quot;shareClass.fee.allIn.current&quot;
_SHARECLASS_FEE_ALLIN_CURRENT | &quot;-shareClass.fee.allIn.current&quot;
SHARECLASS_FEE_PERFORMANCE_CURRENT | &quot;shareClass.fee.performance.current&quot;
_SHARECLASS_FEE_PERFORMANCE_CURRENT | &quot;-shareClass.fee.performance.current&quot;
SHARECLASS_FEE_MANAGEMENT_CURRENT | &quot;shareClass.fee.management.current&quot;
_SHARECLASS_FEE_MANAGEMENT_CURRENT | &quot;-shareClass.fee.management.current&quot;
SHARECLASS_FEE_INITIAL_MINIMUM | &quot;shareClass.fee.initial.minimum&quot;
_SHARECLASS_FEE_INITIAL_MINIMUM | &quot;-shareClass.fee.initial.minimum&quot;
SHARECLASS_FEE_INITIAL_CURRENT | &quot;shareClass.fee.initial.current&quot;
_SHARECLASS_FEE_INITIAL_CURRENT | &quot;-shareClass.fee.initial.current&quot;
SHARECLASS_FEE_INITIAL_MAXIMUM | &quot;shareClass.fee.initial.maximum&quot;
_SHARECLASS_FEE_INITIAL_MAXIMUM | &quot;-shareClass.fee.initial.maximum&quot;
SHARECLASS_FEE_DISTRIBUTION_MAXIMUM | &quot;shareClass.fee.distribution.maximum&quot;
_SHARECLASS_FEE_DISTRIBUTION_MAXIMUM | &quot;-shareClass.fee.distribution.maximum&quot;
SHARECLASS_FEE_HANDLING_MAXIMUM | &quot;shareClass.fee.handling.maximum&quot;
_SHARECLASS_FEE_HANDLING_MAXIMUM | &quot;-shareClass.fee.handling.maximum&quot;
SHARECLASS_FEE_REDEMPTION_CURRENT | &quot;shareClass.fee.redemption.current&quot;
_SHARECLASS_FEE_REDEMPTION_CURRENT | &quot;-shareClass.fee.redemption.current&quot;
SHARECLASS_FEE_REDEMPTION_MAXIMUM | &quot;shareClass.fee.redemption.maximum&quot;
_SHARECLASS_FEE_REDEMPTION_MAXIMUM | &quot;-shareClass.fee.redemption.maximum&quot;
SHARECLASS_FEE_CUSTODIANBANK_CURRENT | &quot;shareClass.fee.custodianBank.current&quot;
_SHARECLASS_FEE_CUSTODIANBANK_CURRENT | &quot;-shareClass.fee.custodianBank.current&quot;
SHARECLASS_FEE_12B_CURRENT | &quot;shareClass.fee.12b.current&quot;
_SHARECLASS_FEE_12B_CURRENT | &quot;-shareClass.fee.12b.current&quot;
SHARECLASS_FEE_SWITCHING_CURRENT | &quot;shareClass.fee.switching.current&quot;
_SHARECLASS_FEE_SWITCHING_CURRENT | &quot;-shareClass.fee.switching.current&quot;
PERFORMANCE_ENDOFDAY_DAY1 | &quot;performance.endOfDay.day1&quot;
_PERFORMANCE_ENDOFDAY_DAY1 | &quot;-performance.endOfDay.day1&quot;
PERFORMANCE_ENDOFDAY_WEEK1 | &quot;performance.endOfDay.week1&quot;
_PERFORMANCE_ENDOFDAY_WEEK1 | &quot;-performance.endOfDay.week1&quot;
PERFORMANCE_ENDOFDAY_MONTH1 | &quot;performance.endOfDay.month1&quot;
_PERFORMANCE_ENDOFDAY_MONTH1 | &quot;-performance.endOfDay.month1&quot;
PERFORMANCE_ENDOFDAY_MONTHS3 | &quot;performance.endOfDay.months3&quot;
_PERFORMANCE_ENDOFDAY_MONTHS3 | &quot;-performance.endOfDay.months3&quot;
PERFORMANCE_ENDOFDAY_MONTHS6 | &quot;performance.endOfDay.months6&quot;
_PERFORMANCE_ENDOFDAY_MONTHS6 | &quot;-performance.endOfDay.months6&quot;
PERFORMANCE_ENDOFDAY_YEAR1 | &quot;performance.endOfDay.year1&quot;
_PERFORMANCE_ENDOFDAY_YEAR1 | &quot;-performance.endOfDay.year1&quot;
PERFORMANCE_ENDOFDAY_YEARS3 | &quot;performance.endOfDay.years3&quot;
_PERFORMANCE_ENDOFDAY_YEARS3 | &quot;-performance.endOfDay.years3&quot;
PERFORMANCE_ENDOFDAY_YEARS5 | &quot;performance.endOfDay.years5&quot;
_PERFORMANCE_ENDOFDAY_YEARS5 | &quot;-performance.endOfDay.years5&quot;
PERFORMANCE_ENDOFDAY_YEARTODATE | &quot;performance.endOfDay.yearToDate&quot;
_PERFORMANCE_ENDOFDAY_YEARTODATE | &quot;-performance.endOfDay.yearToDate&quot;


## Implemented Interfaces

* Serializable


