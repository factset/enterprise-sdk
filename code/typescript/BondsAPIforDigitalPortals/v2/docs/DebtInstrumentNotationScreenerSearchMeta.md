# bondsapifordigitalportals.DebtInstrumentNotationScreenerSearchMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | [optional] 
**pagination** | [**DebtInstrumentNotationScreenerSearchMetaPagination**](DebtInstrumentNotationScreenerSearchMetaPagination.md) |  | [optional] 



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

* `instrument.categorization.level1.name` (value: `"instrument.categorization.level1.name"`)

* `-instrument.categorization.level1.name` (value: `"-instrument.categorization.level1.name"`)

* `instrument.categorization.level2.name` (value: `"instrument.categorization.level2.name"`)

* `-instrument.categorization.level2.name` (value: `"-instrument.categorization.level2.name"`)

* `instrument.categorization.level3.name` (value: `"instrument.categorization.level3.name"`)

* `-instrument.categorization.level3.name` (value: `"-instrument.categorization.level3.name"`)

* `instrument.lifeCycle.issue` (value: `"instrument.lifeCycle.issue"`)

* `-instrument.lifeCycle.issue` (value: `"-instrument.lifeCycle.issue"`)

* `instrument.lifeCycle.maturity.date` (value: `"instrument.lifeCycle.maturity.date"`)

* `-instrument.lifeCycle.maturity.date` (value: `"-instrument.lifeCycle.maturity.date"`)

* `instrument.lifeCycle.maturity.remainingTermYears` (value: `"instrument.lifeCycle.maturity.remainingTermYears"`)

* `-instrument.lifeCycle.maturity.remainingTermYears` (value: `"-instrument.lifeCycle.maturity.remainingTermYears"`)

* `instrument.lifeCycle.maturity.perpetual` (value: `"instrument.lifeCycle.maturity.perpetual"`)

* `-instrument.lifeCycle.maturity.perpetual` (value: `"-instrument.lifeCycle.maturity.perpetual"`)

* `instrument.lifeCycle.callable` (value: `"instrument.lifeCycle.callable"`)

* `-instrument.lifeCycle.callable` (value: `"-instrument.lifeCycle.callable"`)

* `instrument.subordinated` (value: `"instrument.subordinated"`)

* `-instrument.subordinated` (value: `"-instrument.subordinated"`)

* `instrument.ratingSystem1.rating.grade` (value: `"instrument.ratingSystem1.rating.grade"`)

* `-instrument.ratingSystem1.rating.grade` (value: `"-instrument.ratingSystem1.rating.grade"`)

* `instrument.ratingSystem2.rating.grade` (value: `"instrument.ratingSystem2.rating.grade"`)

* `-instrument.ratingSystem2.rating.grade` (value: `"-instrument.ratingSystem2.rating.grade"`)

* `instrument.issuer.name` (value: `"instrument.issuer.name"`)

* `-instrument.issuer.name` (value: `"-instrument.issuer.name"`)

* `instrument.issuer.country.name` (value: `"instrument.issuer.country.name"`)

* `-instrument.issuer.country.name` (value: `"-instrument.issuer.country.name"`)

* `instrument.issue.volume.currency.isoCode` (value: `"instrument.issue.volume.currency.isoCode"`)

* `-instrument.issue.volume.currency.isoCode` (value: `"-instrument.issue.volume.currency.isoCode"`)

* `instrument.tradingVolume.otc.minimum` (value: `"instrument.tradingVolume.otc.minimum"`)

* `-instrument.tradingVolume.otc.minimum` (value: `"-instrument.tradingVolume.otc.minimum"`)

* `instrument.compliance.germany.trusteeEligible` (value: `"instrument.compliance.germany.trusteeEligible"`)

* `-instrument.compliance.germany.trusteeEligible` (value: `"-instrument.compliance.germany.trusteeEligible"`)

* `instrument.coupon.occurrence.frequency.name` (value: `"instrument.coupon.occurrence.frequency.name"`)

* `-instrument.coupon.occurrence.frequency.name` (value: `"-instrument.coupon.occurrence.frequency.name"`)

* `instrument.coupon.currentInterestRate.type.name` (value: `"instrument.coupon.currentInterestRate.type.name"`)

* `-instrument.coupon.currentInterestRate.type.name` (value: `"-instrument.coupon.currentInterestRate.type.name"`)

* `instrument.coupon.currentInterestRate.value` (value: `"instrument.coupon.currentInterestRate.value"`)

* `-instrument.coupon.currentInterestRate.value` (value: `"-instrument.coupon.currentInterestRate.value"`)

* `yield.current` (value: `"yield.current"`)

* `-yield.current` (value: `"-yield.current"`)

* `yield.toMaturity` (value: `"yield.toMaturity"`)

* `-yield.toMaturity` (value: `"-yield.toMaturity"`)

* `yield.spread` (value: `"yield.spread"`)

* `-yield.spread` (value: `"-yield.spread"`)

* `macaulayDuration` (value: `"macaulayDuration"`)

* `-macaulayDuration` (value: `"-macaulayDuration"`)

* `sensitivities.basePointValue` (value: `"sensitivities.basePointValue"`)

* `-sensitivities.basePointValue` (value: `"-sensitivities.basePointValue"`)

* `sensitivities.modifiedDuration` (value: `"sensitivities.modifiedDuration"`)

* `-sensitivities.modifiedDuration` (value: `"-sensitivities.modifiedDuration"`)

* `sensitivities.elasticity` (value: `"sensitivities.elasticity"`)

* `-sensitivities.elasticity` (value: `"-sensitivities.elasticity"`)

* `sensitivities.convexity` (value: `"sensitivities.convexity"`)

* `-sensitivities.convexity` (value: `"-sensitivities.convexity"`)

* `tradedValue.days30.sum` (value: `"tradedValue.days30.sum"`)

* `-tradedValue.days30.sum` (value: `"-tradedValue.days30.sum"`)

* `tradedValue.days30.average` (value: `"tradedValue.days30.average"`)

* `-tradedValue.days30.average` (value: `"-tradedValue.days30.average"`)




