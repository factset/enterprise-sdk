# fundsapifordigitalportals.FundNotationScreenerSearchMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | [optional] 
**pagination** | [**FundNotationScreenerSearchMetaPagination**](FundNotationScreenerSearchMetaPagination.md) |  | [optional] 



## Enum: [SortEnum]


* `currency.code` (value: `"currency.code"`)

* `-currency.code` (value: `"-currency.code"`)

* `instrument.name` (value: `"instrument.name"`)

* `-instrument.name` (value: `"-instrument.name"`)

* `instrument.shortName` (value: `"instrument.shortName"`)

* `-instrument.shortName` (value: `"-instrument.shortName"`)

* `fund.etf` (value: `"fund.etf"`)

* `-fund.etf` (value: `"-fund.etf"`)

* `fund.currency.isoCode` (value: `"fund.currency.isoCode"`)

* `-fund.currency.isoCode` (value: `"-fund.currency.isoCode"`)

* `fund.domicile.name` (value: `"fund.domicile.name"`)

* `-fund.domicile.name` (value: `"-fund.domicile.name"`)

* `fund.holdingType.name` (value: `"fund.holdingType.name"`)

* `-fund.holdingType.name` (value: `"-fund.holdingType.name"`)

* `fund.countryDevelopment.name` (value: `"fund.countryDevelopment.name"`)

* `-fund.countryDevelopment.name` (value: `"-fund.countryDevelopment.name"`)

* `fund.regionalExposure.broad.name` (value: `"fund.regionalExposure.broad.name"`)

* `-fund.regionalExposure.broad.name` (value: `"-fund.regionalExposure.broad.name"`)

* `fund.regionalExposure.specific.name` (value: `"fund.regionalExposure.specific.name"`)

* `-fund.regionalExposure.specific.name` (value: `"-fund.regionalExposure.specific.name"`)

* `fund.strategy.level1.name` (value: `"fund.strategy.level1.name"`)

* `-fund.strategy.level1.name` (value: `"-fund.strategy.level1.name"`)

* `fund.strategy.level2.name` (value: `"fund.strategy.level2.name"`)

* `-fund.strategy.level2.name` (value: `"-fund.strategy.level2.name"`)

* `fund.strategy.level3.name` (value: `"fund.strategy.level3.name"`)

* `-fund.strategy.level3.name` (value: `"-fund.strategy.level3.name"`)

* `fund.industry.name` (value: `"fund.industry.name"`)

* `-fund.industry.name` (value: `"-fund.industry.name"`)

* `fund.srri.grade` (value: `"fund.srri.grade"`)

* `-fund.srri.grade` (value: `"-fund.srri.grade"`)

* `fund.issuer.name` (value: `"fund.issuer.name"`)

* `-fund.issuer.name` (value: `"-fund.issuer.name"`)

* `fund.issuer.country.name` (value: `"fund.issuer.country.name"`)

* `-fund.issuer.country.name` (value: `"-fund.issuer.country.name"`)

* `fund.assetsUnderManagement` (value: `"fund.assetsUnderManagement"`)

* `-fund.assetsUnderManagement` (value: `"-fund.assetsUnderManagement"`)

* `shareClass.lifeCycle.issue` (value: `"shareClass.lifeCycle.issue"`)

* `-shareClass.lifeCycle.issue` (value: `"-shareClass.lifeCycle.issue"`)

* `shareClass.minimumInvestment.initial` (value: `"shareClass.minimumInvestment.initial"`)

* `-shareClass.minimumInvestment.initial` (value: `"-shareClass.minimumInvestment.initial"`)

* `shareClass.minimumInvestment.subsequent` (value: `"shareClass.minimumInvestment.subsequent"`)

* `-shareClass.minimumInvestment.subsequent` (value: `"-shareClass.minimumInvestment.subsequent"`)

* `shareClass.assetsUnderManagement` (value: `"shareClass.assetsUnderManagement"`)

* `-shareClass.assetsUnderManagement` (value: `"-shareClass.assetsUnderManagement"`)

* `shareClass.fee.ongoing.current` (value: `"shareClass.fee.ongoing.current"`)

* `-shareClass.fee.ongoing.current` (value: `"-shareClass.fee.ongoing.current"`)

* `shareClass.fee.allIn.current` (value: `"shareClass.fee.allIn.current"`)

* `-shareClass.fee.allIn.current` (value: `"-shareClass.fee.allIn.current"`)

* `shareClass.fee.performance.current` (value: `"shareClass.fee.performance.current"`)

* `-shareClass.fee.performance.current` (value: `"-shareClass.fee.performance.current"`)

* `shareClass.fee.management.current` (value: `"shareClass.fee.management.current"`)

* `-shareClass.fee.management.current` (value: `"-shareClass.fee.management.current"`)

* `shareClass.fee.initial.minimum` (value: `"shareClass.fee.initial.minimum"`)

* `-shareClass.fee.initial.minimum` (value: `"-shareClass.fee.initial.minimum"`)

* `shareClass.fee.initial.current` (value: `"shareClass.fee.initial.current"`)

* `-shareClass.fee.initial.current` (value: `"-shareClass.fee.initial.current"`)

* `shareClass.fee.initial.maximum` (value: `"shareClass.fee.initial.maximum"`)

* `-shareClass.fee.initial.maximum` (value: `"-shareClass.fee.initial.maximum"`)

* `shareClass.fee.distribution.maximum` (value: `"shareClass.fee.distribution.maximum"`)

* `-shareClass.fee.distribution.maximum` (value: `"-shareClass.fee.distribution.maximum"`)

* `shareClass.fee.handling.maximum` (value: `"shareClass.fee.handling.maximum"`)

* `-shareClass.fee.handling.maximum` (value: `"-shareClass.fee.handling.maximum"`)

* `shareClass.fee.redemption.current` (value: `"shareClass.fee.redemption.current"`)

* `-shareClass.fee.redemption.current` (value: `"-shareClass.fee.redemption.current"`)

* `shareClass.fee.redemption.maximum` (value: `"shareClass.fee.redemption.maximum"`)

* `-shareClass.fee.redemption.maximum` (value: `"-shareClass.fee.redemption.maximum"`)

* `shareClass.fee.custodianBank.current` (value: `"shareClass.fee.custodianBank.current"`)

* `-shareClass.fee.custodianBank.current` (value: `"-shareClass.fee.custodianBank.current"`)

* `shareClass.fee.12b.current` (value: `"shareClass.fee.12b.current"`)

* `-shareClass.fee.12b.current` (value: `"-shareClass.fee.12b.current"`)

* `shareClass.fee.switching.current` (value: `"shareClass.fee.switching.current"`)

* `-shareClass.fee.switching.current` (value: `"-shareClass.fee.switching.current"`)

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




