# securitizedderivativesapifordigitalportals.PostSecuritizedDerivativeNotationScreenerSearchRequestMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | symbol | | -symbol | | market.name | | -market.name | | instrument.name | | -instrument.name | | instrument.shortName | | -instrument.shortName | | instrument.categorization.ddv.level1.name | | -instrument.categorization.ddv.level1.name | | instrument.categorization.ddv.level2.name | | -instrument.categorization.ddv.level2.name | | instrument.categorization.ddv.level3.name | | -instrument.categorization.ddv.level3.name | | instrument.categorization.eusipa.level1.name | | -instrument.categorization.eusipa.level1.name | | instrument.categorization.eusipa.level2.name | | -instrument.categorization.eusipa.level2.name | | instrument.categorization.eusipa.level3.name | | -instrument.categorization.eusipa.level3.name | | instrument.lifeCycle.maturity.date | | -instrument.lifeCycle.maturity.date | | instrument.lifeCycle.maturity.remainingTermDays | | -instrument.lifeCycle.maturity.remainingTermDays | | instrument.lifeCycle.maturity.perpetual | | -instrument.lifeCycle.maturity.perpetual | | instrument.lifeCycle.callable | | -instrument.lifeCycle.callable | | instrument.lifeCycle.valuation | | -instrument.lifeCycle.valuation | | instrument.lifeCycle.repayment | | -instrument.lifeCycle.repayment | | instrument.issuer.name | | -instrument.issuer.name | | instrument.issuer.group.name | | -instrument.issuer.group.name | | instrument.exercise.right | | -instrument.exercise.right | | instrument.exercise.style | | -instrument.exercise.style | | instrument.settlement | | -instrument.settlement | | instrument.quanto | | -instrument.quanto | | instrument.capitalProtection | | -instrument.capitalProtection | | instrument.underlying.name | | -instrument.underlying.name | | instrument.underlying.valueUnit.code | | -instrument.underlying.valueUnit.code | | instrument.underlying.notation.instrument.typeComposite | | -instrument.underlying.notation.instrument.typeComposite | | instrument.strike.value | | -instrument.strike.value | | instrument.strike.distance.absolute | | -instrument.strike.distance.absolute | | instrument.strike.distance.relative | | -instrument.strike.distance.relative | | instrument.bonusLevel.value | | -instrument.bonusLevel.value | | instrument.bonusLevel.distance.absolute | | -instrument.bonusLevel.distance.absolute | | instrument.bonusLevel.distance.relative | | -instrument.bonusLevel.distance.relative | | instrument.cap.value | | -instrument.cap.value | | instrument.cap.distance.absolute | | -instrument.cap.distance.absolute | | instrument.cap.distance.relative | | -instrument.cap.distance.relative | | instrument.cap.cashFlow | | -instrument.cap.cashFlow | | instrument.knockOut.observation.type | | -instrument.knockOut.observation.type | | instrument.knockOut.value | | -instrument.knockOut.value | | instrument.knockOut.distance.absolute | | -instrument.knockOut.distance.absolute | | instrument.knockOut.distance.relative | | -instrument.knockOut.distance.relative | | instrument.knockOut.breach.breached | | -instrument.knockOut.breach.breached | | instrument.knockOut.breach.datetime | | -instrument.knockOut.breach.datetime | | instrument.knockIn.observation.type | | -instrument.knockIn.observation.type | | instrument.knockIn.value | | -instrument.knockIn.value | | instrument.knockIn.distance.absolute | | -instrument.knockIn.distance.absolute | | instrument.knockIn.distance.relative | | -instrument.knockIn.distance.relative | | instrument.knockIn.breach.breached | | -instrument.knockIn.breach.breached | | instrument.knockIn.breach.datetime | | -instrument.knockIn.breach.datetime | | instrument.lockOut.observation.type | | -instrument.lockOut.observation.type | | instrument.lockOut.value | | -instrument.lockOut.value | | instrument.lockOut.distance.absolute | | -instrument.lockOut.distance.absolute | | instrument.lockOut.distance.relative | | -instrument.lockOut.distance.relative | | instrument.lockOut.cashFlow | | -instrument.lockOut.cashFlow | | instrument.lockIn.observation.type | | -instrument.lockIn.observation.type | | instrument.lockIn.value | | -instrument.lockIn.value | | instrument.lockIn.distance.absolute | | -instrument.lockIn.distance.absolute | | instrument.lockIn.distance.relative | | -instrument.lockIn.distance.relative | | instrument.lockIn.cashFlow | | -instrument.lockIn.cashFlow | | instrument.capitalGuarantee.value | | -instrument.capitalGuarantee.value | | instrument.capitalGuarantee.distance.absolute | | -instrument.capitalGuarantee.distance.absolute | | instrument.capitalGuarantee.distance.relative | | -instrument.capitalGuarantee.distance.relative | | instrument.capitalGuarantee.cashFlow | | -instrument.capitalGuarantee.cashFlow | | instrument.couponTriggerLevel.value | | -instrument.couponTriggerLevel.value | | instrument.couponTriggerLevel.distance.absolute | | -instrument.couponTriggerLevel.distance.absolute | | instrument.couponTriggerLevel.distance.relative | | -instrument.couponTriggerLevel.distance.relative | | instrument.couponTriggerLevel.cashFlow | | -instrument.couponTriggerLevel.cashFlow | | instrument.rangeKnockOut.observation.type | | -instrument.rangeKnockOut.observation.type | | instrument.rangeKnockOut.upper.value | | -instrument.rangeKnockOut.upper.value | | instrument.rangeKnockOut.lower.value | | -instrument.rangeKnockOut.lower.value | | instrument.rangeKnockOut.breach.breached | | -instrument.rangeKnockOut.breach.breached | | instrument.rangeKnockOut.breach.datetime | | -instrument.rangeKnockOut.breach.datetime | | instrument.rangeKnockOut.cashFlow | | -instrument.rangeKnockOut.cashFlow | | instrument.participation | | -instrument.participation | | instrument.constantLeverage | | -instrument.constantLeverage | | instrument.nominalCurrency.isoCode | | -instrument.nominalCurrency.isoCode | | instrument.currentInterestRate.type | | -instrument.currentInterestRate.type | | instrument.currentInterestRate.value | | -instrument.currentInterestRate.value | | keyFigures.bonusYield.absolute | | -keyFigures.bonusYield.absolute | | keyFigures.bonusYield.relative | | -keyFigures.bonusYield.relative | | keyFigures.bonusYield.annualized | | -keyFigures.bonusYield.annualized | | keyFigures.sidewaysYield.absolute | | -keyFigures.sidewaysYield.absolute | | keyFigures.sidewaysYield.relative | | -keyFigures.sidewaysYield.relative | | keyFigures.sidewaysYield.annualized | | -keyFigures.sidewaysYield.annualized | | keyFigures.maximumYield.absolute | | -keyFigures.maximumYield.absolute | | keyFigures.maximumYield.relative | | -keyFigures.maximumYield.relative | | keyFigures.maximumYield.annualized | | -keyFigures.maximumYield.annualized | | keyFigures.agio.absolute | | -keyFigures.agio.absolute | | keyFigures.agio.relative | | -keyFigures.agio.relative | | keyFigures.agio.annualized | | -keyFigures.agio.annualized | | keyFigures.discount.absolute | | -keyFigures.discount.absolute | | keyFigures.discount.relative | | -keyFigures.discount.relative | | keyFigures.breakEven.breakEvenPoint | | -keyFigures.breakEven.breakEvenPoint | | keyFigures.spread.harmonized | | -keyFigures.spread.harmonized | | keyFigures.spread.relative | | -keyFigures.spread.relative | | keyFigures.delta.effective | | -keyFigures.delta.effective | | keyFigures.delta.unadjusted | | -keyFigures.delta.unadjusted | | keyFigures.thetaOneWeek.effective | | -keyFigures.thetaOneWeek.effective | | keyFigures.thetaOneWeek.unadjusted | | -keyFigures.thetaOneWeek.unadjusted | | keyFigures.vega.effective | | -keyFigures.vega.effective | | keyFigures.vega.unadjusted | | -keyFigures.vega.unadjusted | | keyFigures.leverage | | -keyFigures.leverage | | keyFigures.omega | | -keyFigures.omega | | keyFigures.impliedVolatility | | -keyFigures.impliedVolatility | | keyFigures.intrinsicValue | | -keyFigures.intrinsicValue | | keyFigures.timeValue | | -keyFigures.timeValue | | keyFigures.outperformancePoint | | -keyFigures.outperformancePoint | | keyFigures.parity | | -keyFigures.parity | | performance.intraday | | -performance.intraday | | performance.sinceIssue.ask | | -performance.sinceIssue.ask | | performance.sinceIssue.bid | | -performance.sinceIssue.bid | | performance.endOfDay.day1 | | -performance.endOfDay.day1 | | performance.endOfDay.week1 | | -performance.endOfDay.week1 | | performance.endOfDay.month1 | | -performance.endOfDay.month1 | | performance.endOfDay.months3 | | -performance.endOfDay.months3 | | performance.endOfDay.months6 | | -performance.endOfDay.months6 | | performance.endOfDay.year1 | | -performance.endOfDay.year1 | | performance.endOfDay.years3 | | -performance.endOfDay.years3 | | performance.endOfDay.years5 | | -performance.endOfDay.years5 | | performance.endOfDay.yearToDate | | -performance.endOfDay.yearToDate | | volatility.week1 | | -volatility.week1 | | volatility.month1 | | -volatility.month1 | | volatility.months3 | | -volatility.months3 | | volatility.months6 | | -volatility.months6 | | volatility.year1 | | -volatility.year1 | | volatility.years3 | | -volatility.years3 | | volatility.years5 | | -volatility.years5 | | volatility.yearToDate | | -volatility.yearToDate |   | [optional] 
**pagination** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestMetaPagination**](PostSecuritizedDerivativeNotationScreenerSearchRequestMetaPagination.md) |  | [optional] 



## Enum: [SortEnum]


* `symbol` (value: `"symbol"`)

* `-symbol` (value: `"-symbol"`)

* `market.name` (value: `"market.name"`)

* `-market.name` (value: `"-market.name"`)

* `instrument.name` (value: `"instrument.name"`)

* `-instrument.name` (value: `"-instrument.name"`)

* `instrument.shortName` (value: `"instrument.shortName"`)

* `-instrument.shortName` (value: `"-instrument.shortName"`)

* `instrument.categorization.ddv.level1.name` (value: `"instrument.categorization.ddv.level1.name"`)

* `-instrument.categorization.ddv.level1.name` (value: `"-instrument.categorization.ddv.level1.name"`)

* `instrument.categorization.ddv.level2.name` (value: `"instrument.categorization.ddv.level2.name"`)

* `-instrument.categorization.ddv.level2.name` (value: `"-instrument.categorization.ddv.level2.name"`)

* `instrument.categorization.ddv.level3.name` (value: `"instrument.categorization.ddv.level3.name"`)

* `-instrument.categorization.ddv.level3.name` (value: `"-instrument.categorization.ddv.level3.name"`)

* `instrument.categorization.eusipa.level1.name` (value: `"instrument.categorization.eusipa.level1.name"`)

* `-instrument.categorization.eusipa.level1.name` (value: `"-instrument.categorization.eusipa.level1.name"`)

* `instrument.categorization.eusipa.level2.name` (value: `"instrument.categorization.eusipa.level2.name"`)

* `-instrument.categorization.eusipa.level2.name` (value: `"-instrument.categorization.eusipa.level2.name"`)

* `instrument.categorization.eusipa.level3.name` (value: `"instrument.categorization.eusipa.level3.name"`)

* `-instrument.categorization.eusipa.level3.name` (value: `"-instrument.categorization.eusipa.level3.name"`)

* `instrument.lifeCycle.maturity.date` (value: `"instrument.lifeCycle.maturity.date"`)

* `-instrument.lifeCycle.maturity.date` (value: `"-instrument.lifeCycle.maturity.date"`)

* `instrument.lifeCycle.maturity.remainingTermDays` (value: `"instrument.lifeCycle.maturity.remainingTermDays"`)

* `-instrument.lifeCycle.maturity.remainingTermDays` (value: `"-instrument.lifeCycle.maturity.remainingTermDays"`)

* `instrument.lifeCycle.maturity.perpetual` (value: `"instrument.lifeCycle.maturity.perpetual"`)

* `-instrument.lifeCycle.maturity.perpetual` (value: `"-instrument.lifeCycle.maturity.perpetual"`)

* `instrument.lifeCycle.callable` (value: `"instrument.lifeCycle.callable"`)

* `-instrument.lifeCycle.callable` (value: `"-instrument.lifeCycle.callable"`)

* `instrument.lifeCycle.valuation` (value: `"instrument.lifeCycle.valuation"`)

* `-instrument.lifeCycle.valuation` (value: `"-instrument.lifeCycle.valuation"`)

* `instrument.lifeCycle.repayment` (value: `"instrument.lifeCycle.repayment"`)

* `-instrument.lifeCycle.repayment` (value: `"-instrument.lifeCycle.repayment"`)

* `instrument.issuer.name` (value: `"instrument.issuer.name"`)

* `-instrument.issuer.name` (value: `"-instrument.issuer.name"`)

* `instrument.issuer.group.name` (value: `"instrument.issuer.group.name"`)

* `-instrument.issuer.group.name` (value: `"-instrument.issuer.group.name"`)

* `instrument.exercise.right` (value: `"instrument.exercise.right"`)

* `-instrument.exercise.right` (value: `"-instrument.exercise.right"`)

* `instrument.exercise.style` (value: `"instrument.exercise.style"`)

* `-instrument.exercise.style` (value: `"-instrument.exercise.style"`)

* `instrument.settlement` (value: `"instrument.settlement"`)

* `-instrument.settlement` (value: `"-instrument.settlement"`)

* `instrument.quanto` (value: `"instrument.quanto"`)

* `-instrument.quanto` (value: `"-instrument.quanto"`)

* `instrument.capitalProtection` (value: `"instrument.capitalProtection"`)

* `-instrument.capitalProtection` (value: `"-instrument.capitalProtection"`)

* `instrument.underlying.name` (value: `"instrument.underlying.name"`)

* `-instrument.underlying.name` (value: `"-instrument.underlying.name"`)

* `instrument.underlying.valueUnit.code` (value: `"instrument.underlying.valueUnit.code"`)

* `-instrument.underlying.valueUnit.code` (value: `"-instrument.underlying.valueUnit.code"`)

* `instrument.underlying.notation.instrument.typeComposite` (value: `"instrument.underlying.notation.instrument.typeComposite"`)

* `-instrument.underlying.notation.instrument.typeComposite` (value: `"-instrument.underlying.notation.instrument.typeComposite"`)

* `instrument.strike.value` (value: `"instrument.strike.value"`)

* `-instrument.strike.value` (value: `"-instrument.strike.value"`)

* `instrument.strike.distance.absolute` (value: `"instrument.strike.distance.absolute"`)

* `-instrument.strike.distance.absolute` (value: `"-instrument.strike.distance.absolute"`)

* `instrument.strike.distance.relative` (value: `"instrument.strike.distance.relative"`)

* `-instrument.strike.distance.relative` (value: `"-instrument.strike.distance.relative"`)

* `instrument.bonusLevel.value` (value: `"instrument.bonusLevel.value"`)

* `-instrument.bonusLevel.value` (value: `"-instrument.bonusLevel.value"`)

* `instrument.bonusLevel.distance.absolute` (value: `"instrument.bonusLevel.distance.absolute"`)

* `-instrument.bonusLevel.distance.absolute` (value: `"-instrument.bonusLevel.distance.absolute"`)

* `instrument.bonusLevel.distance.relative` (value: `"instrument.bonusLevel.distance.relative"`)

* `-instrument.bonusLevel.distance.relative` (value: `"-instrument.bonusLevel.distance.relative"`)

* `instrument.cap.value` (value: `"instrument.cap.value"`)

* `-instrument.cap.value` (value: `"-instrument.cap.value"`)

* `instrument.cap.distance.absolute` (value: `"instrument.cap.distance.absolute"`)

* `-instrument.cap.distance.absolute` (value: `"-instrument.cap.distance.absolute"`)

* `instrument.cap.distance.relative` (value: `"instrument.cap.distance.relative"`)

* `-instrument.cap.distance.relative` (value: `"-instrument.cap.distance.relative"`)

* `instrument.cap.cashFlow` (value: `"instrument.cap.cashFlow"`)

* `-instrument.cap.cashFlow` (value: `"-instrument.cap.cashFlow"`)

* `instrument.knockOut.observation.type` (value: `"instrument.knockOut.observation.type"`)

* `-instrument.knockOut.observation.type` (value: `"-instrument.knockOut.observation.type"`)

* `instrument.knockOut.value` (value: `"instrument.knockOut.value"`)

* `-instrument.knockOut.value` (value: `"-instrument.knockOut.value"`)

* `instrument.knockOut.distance.absolute` (value: `"instrument.knockOut.distance.absolute"`)

* `-instrument.knockOut.distance.absolute` (value: `"-instrument.knockOut.distance.absolute"`)

* `instrument.knockOut.distance.relative` (value: `"instrument.knockOut.distance.relative"`)

* `-instrument.knockOut.distance.relative` (value: `"-instrument.knockOut.distance.relative"`)

* `instrument.knockOut.breach.breached` (value: `"instrument.knockOut.breach.breached"`)

* `-instrument.knockOut.breach.breached` (value: `"-instrument.knockOut.breach.breached"`)

* `instrument.knockOut.breach.datetime` (value: `"instrument.knockOut.breach.datetime"`)

* `-instrument.knockOut.breach.datetime` (value: `"-instrument.knockOut.breach.datetime"`)

* `instrument.knockIn.observation.type` (value: `"instrument.knockIn.observation.type"`)

* `-instrument.knockIn.observation.type` (value: `"-instrument.knockIn.observation.type"`)

* `instrument.knockIn.value` (value: `"instrument.knockIn.value"`)

* `-instrument.knockIn.value` (value: `"-instrument.knockIn.value"`)

* `instrument.knockIn.distance.absolute` (value: `"instrument.knockIn.distance.absolute"`)

* `-instrument.knockIn.distance.absolute` (value: `"-instrument.knockIn.distance.absolute"`)

* `instrument.knockIn.distance.relative` (value: `"instrument.knockIn.distance.relative"`)

* `-instrument.knockIn.distance.relative` (value: `"-instrument.knockIn.distance.relative"`)

* `instrument.knockIn.breach.breached` (value: `"instrument.knockIn.breach.breached"`)

* `-instrument.knockIn.breach.breached` (value: `"-instrument.knockIn.breach.breached"`)

* `instrument.knockIn.breach.datetime` (value: `"instrument.knockIn.breach.datetime"`)

* `-instrument.knockIn.breach.datetime` (value: `"-instrument.knockIn.breach.datetime"`)

* `instrument.lockOut.observation.type` (value: `"instrument.lockOut.observation.type"`)

* `-instrument.lockOut.observation.type` (value: `"-instrument.lockOut.observation.type"`)

* `instrument.lockOut.value` (value: `"instrument.lockOut.value"`)

* `-instrument.lockOut.value` (value: `"-instrument.lockOut.value"`)

* `instrument.lockOut.distance.absolute` (value: `"instrument.lockOut.distance.absolute"`)

* `-instrument.lockOut.distance.absolute` (value: `"-instrument.lockOut.distance.absolute"`)

* `instrument.lockOut.distance.relative` (value: `"instrument.lockOut.distance.relative"`)

* `-instrument.lockOut.distance.relative` (value: `"-instrument.lockOut.distance.relative"`)

* `instrument.lockOut.cashFlow` (value: `"instrument.lockOut.cashFlow"`)

* `-instrument.lockOut.cashFlow` (value: `"-instrument.lockOut.cashFlow"`)

* `instrument.lockIn.observation.type` (value: `"instrument.lockIn.observation.type"`)

* `-instrument.lockIn.observation.type` (value: `"-instrument.lockIn.observation.type"`)

* `instrument.lockIn.value` (value: `"instrument.lockIn.value"`)

* `-instrument.lockIn.value` (value: `"-instrument.lockIn.value"`)

* `instrument.lockIn.distance.absolute` (value: `"instrument.lockIn.distance.absolute"`)

* `-instrument.lockIn.distance.absolute` (value: `"-instrument.lockIn.distance.absolute"`)

* `instrument.lockIn.distance.relative` (value: `"instrument.lockIn.distance.relative"`)

* `-instrument.lockIn.distance.relative` (value: `"-instrument.lockIn.distance.relative"`)

* `instrument.lockIn.cashFlow` (value: `"instrument.lockIn.cashFlow"`)

* `-instrument.lockIn.cashFlow` (value: `"-instrument.lockIn.cashFlow"`)

* `instrument.capitalGuarantee.value` (value: `"instrument.capitalGuarantee.value"`)

* `-instrument.capitalGuarantee.value` (value: `"-instrument.capitalGuarantee.value"`)

* `instrument.capitalGuarantee.distance.absolute` (value: `"instrument.capitalGuarantee.distance.absolute"`)

* `-instrument.capitalGuarantee.distance.absolute` (value: `"-instrument.capitalGuarantee.distance.absolute"`)

* `instrument.capitalGuarantee.distance.relative` (value: `"instrument.capitalGuarantee.distance.relative"`)

* `-instrument.capitalGuarantee.distance.relative` (value: `"-instrument.capitalGuarantee.distance.relative"`)

* `instrument.capitalGuarantee.cashFlow` (value: `"instrument.capitalGuarantee.cashFlow"`)

* `-instrument.capitalGuarantee.cashFlow` (value: `"-instrument.capitalGuarantee.cashFlow"`)

* `instrument.couponTriggerLevel.value` (value: `"instrument.couponTriggerLevel.value"`)

* `-instrument.couponTriggerLevel.value` (value: `"-instrument.couponTriggerLevel.value"`)

* `instrument.couponTriggerLevel.distance.absolute` (value: `"instrument.couponTriggerLevel.distance.absolute"`)

* `-instrument.couponTriggerLevel.distance.absolute` (value: `"-instrument.couponTriggerLevel.distance.absolute"`)

* `instrument.couponTriggerLevel.distance.relative` (value: `"instrument.couponTriggerLevel.distance.relative"`)

* `-instrument.couponTriggerLevel.distance.relative` (value: `"-instrument.couponTriggerLevel.distance.relative"`)

* `instrument.couponTriggerLevel.cashFlow` (value: `"instrument.couponTriggerLevel.cashFlow"`)

* `-instrument.couponTriggerLevel.cashFlow` (value: `"-instrument.couponTriggerLevel.cashFlow"`)

* `instrument.rangeKnockOut.observation.type` (value: `"instrument.rangeKnockOut.observation.type"`)

* `-instrument.rangeKnockOut.observation.type` (value: `"-instrument.rangeKnockOut.observation.type"`)

* `instrument.rangeKnockOut.upper.value` (value: `"instrument.rangeKnockOut.upper.value"`)

* `-instrument.rangeKnockOut.upper.value` (value: `"-instrument.rangeKnockOut.upper.value"`)

* `instrument.rangeKnockOut.lower.value` (value: `"instrument.rangeKnockOut.lower.value"`)

* `-instrument.rangeKnockOut.lower.value` (value: `"-instrument.rangeKnockOut.lower.value"`)

* `instrument.rangeKnockOut.breach.breached` (value: `"instrument.rangeKnockOut.breach.breached"`)

* `-instrument.rangeKnockOut.breach.breached` (value: `"-instrument.rangeKnockOut.breach.breached"`)

* `instrument.rangeKnockOut.breach.datetime` (value: `"instrument.rangeKnockOut.breach.datetime"`)

* `-instrument.rangeKnockOut.breach.datetime` (value: `"-instrument.rangeKnockOut.breach.datetime"`)

* `instrument.rangeKnockOut.cashFlow` (value: `"instrument.rangeKnockOut.cashFlow"`)

* `-instrument.rangeKnockOut.cashFlow` (value: `"-instrument.rangeKnockOut.cashFlow"`)

* `instrument.participation` (value: `"instrument.participation"`)

* `-instrument.participation` (value: `"-instrument.participation"`)

* `instrument.constantLeverage` (value: `"instrument.constantLeverage"`)

* `-instrument.constantLeverage` (value: `"-instrument.constantLeverage"`)

* `instrument.nominalCurrency.isoCode` (value: `"instrument.nominalCurrency.isoCode"`)

* `-instrument.nominalCurrency.isoCode` (value: `"-instrument.nominalCurrency.isoCode"`)

* `instrument.currentInterestRate.type` (value: `"instrument.currentInterestRate.type"`)

* `-instrument.currentInterestRate.type` (value: `"-instrument.currentInterestRate.type"`)

* `instrument.currentInterestRate.value` (value: `"instrument.currentInterestRate.value"`)

* `-instrument.currentInterestRate.value` (value: `"-instrument.currentInterestRate.value"`)

* `keyFigures.bonusYield.absolute` (value: `"keyFigures.bonusYield.absolute"`)

* `-keyFigures.bonusYield.absolute` (value: `"-keyFigures.bonusYield.absolute"`)

* `keyFigures.bonusYield.relative` (value: `"keyFigures.bonusYield.relative"`)

* `-keyFigures.bonusYield.relative` (value: `"-keyFigures.bonusYield.relative"`)

* `keyFigures.bonusYield.annualized` (value: `"keyFigures.bonusYield.annualized"`)

* `-keyFigures.bonusYield.annualized` (value: `"-keyFigures.bonusYield.annualized"`)

* `keyFigures.sidewaysYield.absolute` (value: `"keyFigures.sidewaysYield.absolute"`)

* `-keyFigures.sidewaysYield.absolute` (value: `"-keyFigures.sidewaysYield.absolute"`)

* `keyFigures.sidewaysYield.relative` (value: `"keyFigures.sidewaysYield.relative"`)

* `-keyFigures.sidewaysYield.relative` (value: `"-keyFigures.sidewaysYield.relative"`)

* `keyFigures.sidewaysYield.annualized` (value: `"keyFigures.sidewaysYield.annualized"`)

* `-keyFigures.sidewaysYield.annualized` (value: `"-keyFigures.sidewaysYield.annualized"`)

* `keyFigures.maximumYield.absolute` (value: `"keyFigures.maximumYield.absolute"`)

* `-keyFigures.maximumYield.absolute` (value: `"-keyFigures.maximumYield.absolute"`)

* `keyFigures.maximumYield.relative` (value: `"keyFigures.maximumYield.relative"`)

* `-keyFigures.maximumYield.relative` (value: `"-keyFigures.maximumYield.relative"`)

* `keyFigures.maximumYield.annualized` (value: `"keyFigures.maximumYield.annualized"`)

* `-keyFigures.maximumYield.annualized` (value: `"-keyFigures.maximumYield.annualized"`)

* `keyFigures.agio.absolute` (value: `"keyFigures.agio.absolute"`)

* `-keyFigures.agio.absolute` (value: `"-keyFigures.agio.absolute"`)

* `keyFigures.agio.relative` (value: `"keyFigures.agio.relative"`)

* `-keyFigures.agio.relative` (value: `"-keyFigures.agio.relative"`)

* `keyFigures.agio.annualized` (value: `"keyFigures.agio.annualized"`)

* `-keyFigures.agio.annualized` (value: `"-keyFigures.agio.annualized"`)

* `keyFigures.discount.absolute` (value: `"keyFigures.discount.absolute"`)

* `-keyFigures.discount.absolute` (value: `"-keyFigures.discount.absolute"`)

* `keyFigures.discount.relative` (value: `"keyFigures.discount.relative"`)

* `-keyFigures.discount.relative` (value: `"-keyFigures.discount.relative"`)

* `keyFigures.breakEven.breakEvenPoint` (value: `"keyFigures.breakEven.breakEvenPoint"`)

* `-keyFigures.breakEven.breakEvenPoint` (value: `"-keyFigures.breakEven.breakEvenPoint"`)

* `keyFigures.spread.harmonized` (value: `"keyFigures.spread.harmonized"`)

* `-keyFigures.spread.harmonized` (value: `"-keyFigures.spread.harmonized"`)

* `keyFigures.spread.relative` (value: `"keyFigures.spread.relative"`)

* `-keyFigures.spread.relative` (value: `"-keyFigures.spread.relative"`)

* `keyFigures.delta.effective` (value: `"keyFigures.delta.effective"`)

* `-keyFigures.delta.effective` (value: `"-keyFigures.delta.effective"`)

* `keyFigures.delta.unadjusted` (value: `"keyFigures.delta.unadjusted"`)

* `-keyFigures.delta.unadjusted` (value: `"-keyFigures.delta.unadjusted"`)

* `keyFigures.thetaOneWeek.effective` (value: `"keyFigures.thetaOneWeek.effective"`)

* `-keyFigures.thetaOneWeek.effective` (value: `"-keyFigures.thetaOneWeek.effective"`)

* `keyFigures.thetaOneWeek.unadjusted` (value: `"keyFigures.thetaOneWeek.unadjusted"`)

* `-keyFigures.thetaOneWeek.unadjusted` (value: `"-keyFigures.thetaOneWeek.unadjusted"`)

* `keyFigures.vega.effective` (value: `"keyFigures.vega.effective"`)

* `-keyFigures.vega.effective` (value: `"-keyFigures.vega.effective"`)

* `keyFigures.vega.unadjusted` (value: `"keyFigures.vega.unadjusted"`)

* `-keyFigures.vega.unadjusted` (value: `"-keyFigures.vega.unadjusted"`)

* `keyFigures.leverage` (value: `"keyFigures.leverage"`)

* `-keyFigures.leverage` (value: `"-keyFigures.leverage"`)

* `keyFigures.omega` (value: `"keyFigures.omega"`)

* `-keyFigures.omega` (value: `"-keyFigures.omega"`)

* `keyFigures.impliedVolatility` (value: `"keyFigures.impliedVolatility"`)

* `-keyFigures.impliedVolatility` (value: `"-keyFigures.impliedVolatility"`)

* `keyFigures.intrinsicValue` (value: `"keyFigures.intrinsicValue"`)

* `-keyFigures.intrinsicValue` (value: `"-keyFigures.intrinsicValue"`)

* `keyFigures.timeValue` (value: `"keyFigures.timeValue"`)

* `-keyFigures.timeValue` (value: `"-keyFigures.timeValue"`)

* `keyFigures.outperformancePoint` (value: `"keyFigures.outperformancePoint"`)

* `-keyFigures.outperformancePoint` (value: `"-keyFigures.outperformancePoint"`)

* `keyFigures.parity` (value: `"keyFigures.parity"`)

* `-keyFigures.parity` (value: `"-keyFigures.parity"`)

* `performance.intraday` (value: `"performance.intraday"`)

* `-performance.intraday` (value: `"-performance.intraday"`)

* `performance.sinceIssue.ask` (value: `"performance.sinceIssue.ask"`)

* `-performance.sinceIssue.ask` (value: `"-performance.sinceIssue.ask"`)

* `performance.sinceIssue.bid` (value: `"performance.sinceIssue.bid"`)

* `-performance.sinceIssue.bid` (value: `"-performance.sinceIssue.bid"`)

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




