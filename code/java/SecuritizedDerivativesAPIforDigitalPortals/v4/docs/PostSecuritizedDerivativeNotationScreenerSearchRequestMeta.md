

# PostSecuritizedDerivativeNotationScreenerSearchRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | symbol | | -symbol | | market.name | | -market.name | | instrument.name | | -instrument.name | | instrument.shortName | | -instrument.shortName | | instrument.categorization.ddv.level1.name | | -instrument.categorization.ddv.level1.name | | instrument.categorization.ddv.level2.name | | -instrument.categorization.ddv.level2.name | | instrument.categorization.ddv.level3.name | | -instrument.categorization.ddv.level3.name | | instrument.categorization.eusipa.level1.name | | -instrument.categorization.eusipa.level1.name | | instrument.categorization.eusipa.level2.name | | -instrument.categorization.eusipa.level2.name | | instrument.categorization.eusipa.level3.name | | -instrument.categorization.eusipa.level3.name | | instrument.lifeCycle.maturity.date | | -instrument.lifeCycle.maturity.date | | instrument.lifeCycle.maturity.remainingTermDays | | -instrument.lifeCycle.maturity.remainingTermDays | | instrument.lifeCycle.maturity.perpetual | | -instrument.lifeCycle.maturity.perpetual | | instrument.lifeCycle.callable | | -instrument.lifeCycle.callable | | instrument.lifeCycle.valuation | | -instrument.lifeCycle.valuation | | instrument.lifeCycle.repayment | | -instrument.lifeCycle.repayment | | instrument.issuer.name | | -instrument.issuer.name | | instrument.issuer.group.name | | -instrument.issuer.group.name | | instrument.exercise.right | | -instrument.exercise.right | | instrument.exercise.style | | -instrument.exercise.style | | instrument.settlement | | -instrument.settlement | | instrument.quanto | | -instrument.quanto | | instrument.capitalProtection | | -instrument.capitalProtection | | instrument.underlying.name | | -instrument.underlying.name | | instrument.underlying.valueUnit.code | | -instrument.underlying.valueUnit.code | | instrument.underlying.notation.instrument.typeComposite | | -instrument.underlying.notation.instrument.typeComposite | | instrument.strike.value | | -instrument.strike.value | | instrument.strike.distance.absolute | | -instrument.strike.distance.absolute | | instrument.strike.distance.relative | | -instrument.strike.distance.relative | | instrument.bonusLevel.value | | -instrument.bonusLevel.value | | instrument.bonusLevel.distance.absolute | | -instrument.bonusLevel.distance.absolute | | instrument.bonusLevel.distance.relative | | -instrument.bonusLevel.distance.relative | | instrument.cap.value | | -instrument.cap.value | | instrument.cap.distance.absolute | | -instrument.cap.distance.absolute | | instrument.cap.distance.relative | | -instrument.cap.distance.relative | | instrument.cap.cashFlow | | -instrument.cap.cashFlow | | instrument.knockOut.observation.type | | -instrument.knockOut.observation.type | | instrument.knockOut.value | | -instrument.knockOut.value | | instrument.knockOut.distance.absolute | | -instrument.knockOut.distance.absolute | | instrument.knockOut.distance.relative | | -instrument.knockOut.distance.relative | | instrument.knockOut.breach.breached | | -instrument.knockOut.breach.breached | | instrument.knockOut.breach.datetime | | -instrument.knockOut.breach.datetime | | instrument.knockIn.observation.type | | -instrument.knockIn.observation.type | | instrument.knockIn.value | | -instrument.knockIn.value | | instrument.knockIn.distance.absolute | | -instrument.knockIn.distance.absolute | | instrument.knockIn.distance.relative | | -instrument.knockIn.distance.relative | | instrument.knockIn.breach.breached | | -instrument.knockIn.breach.breached | | instrument.knockIn.breach.datetime | | -instrument.knockIn.breach.datetime | | instrument.lockOut.observation.type | | -instrument.lockOut.observation.type | | instrument.lockOut.value | | -instrument.lockOut.value | | instrument.lockOut.distance.absolute | | -instrument.lockOut.distance.absolute | | instrument.lockOut.distance.relative | | -instrument.lockOut.distance.relative | | instrument.lockOut.cashFlow | | -instrument.lockOut.cashFlow | | instrument.lockIn.observation.type | | -instrument.lockIn.observation.type | | instrument.lockIn.value | | -instrument.lockIn.value | | instrument.lockIn.distance.absolute | | -instrument.lockIn.distance.absolute | | instrument.lockIn.distance.relative | | -instrument.lockIn.distance.relative | | instrument.lockIn.cashFlow | | -instrument.lockIn.cashFlow | | instrument.capitalGuarantee.value | | -instrument.capitalGuarantee.value | | instrument.capitalGuarantee.distance.absolute | | -instrument.capitalGuarantee.distance.absolute | | instrument.capitalGuarantee.distance.relative | | -instrument.capitalGuarantee.distance.relative | | instrument.capitalGuarantee.cashFlow | | -instrument.capitalGuarantee.cashFlow | | instrument.couponTriggerLevel.value | | -instrument.couponTriggerLevel.value | | instrument.couponTriggerLevel.distance.absolute | | -instrument.couponTriggerLevel.distance.absolute | | instrument.couponTriggerLevel.distance.relative | | -instrument.couponTriggerLevel.distance.relative | | instrument.couponTriggerLevel.cashFlow | | -instrument.couponTriggerLevel.cashFlow | | instrument.rangeKnockOut.observation.type | | -instrument.rangeKnockOut.observation.type | | instrument.rangeKnockOut.upper.value | | -instrument.rangeKnockOut.upper.value | | instrument.rangeKnockOut.lower.value | | -instrument.rangeKnockOut.lower.value | | instrument.rangeKnockOut.breach.breached | | -instrument.rangeKnockOut.breach.breached | | instrument.rangeKnockOut.breach.datetime | | -instrument.rangeKnockOut.breach.datetime | | instrument.rangeKnockOut.cashFlow | | -instrument.rangeKnockOut.cashFlow | | instrument.participation | | -instrument.participation | | instrument.constantLeverage | | -instrument.constantLeverage | | instrument.nominalCurrency.isoCode | | -instrument.nominalCurrency.isoCode | | instrument.currentInterestRate.type | | -instrument.currentInterestRate.type | | instrument.currentInterestRate.value | | -instrument.currentInterestRate.value | | keyFigures.bonusYield.absolute | | -keyFigures.bonusYield.absolute | | keyFigures.bonusYield.relative | | -keyFigures.bonusYield.relative | | keyFigures.bonusYield.annualized | | -keyFigures.bonusYield.annualized | | keyFigures.sidewaysYield.absolute | | -keyFigures.sidewaysYield.absolute | | keyFigures.sidewaysYield.relative | | -keyFigures.sidewaysYield.relative | | keyFigures.sidewaysYield.annualized | | -keyFigures.sidewaysYield.annualized | | keyFigures.maximumYield.absolute | | -keyFigures.maximumYield.absolute | | keyFigures.maximumYield.relative | | -keyFigures.maximumYield.relative | | keyFigures.maximumYield.annualized | | -keyFigures.maximumYield.annualized | | keyFigures.agio.absolute | | -keyFigures.agio.absolute | | keyFigures.agio.relative | | -keyFigures.agio.relative | | keyFigures.agio.annualized | | -keyFigures.agio.annualized | | keyFigures.discount.absolute | | -keyFigures.discount.absolute | | keyFigures.discount.relative | | -keyFigures.discount.relative | | keyFigures.breakEven.breakEvenPoint | | -keyFigures.breakEven.breakEvenPoint | | keyFigures.spread.harmonized | | -keyFigures.spread.harmonized | | keyFigures.spread.relative | | -keyFigures.spread.relative | | keyFigures.delta.effective | | -keyFigures.delta.effective | | keyFigures.delta.unadjusted | | -keyFigures.delta.unadjusted | | keyFigures.thetaOneWeek.effective | | -keyFigures.thetaOneWeek.effective | | keyFigures.thetaOneWeek.unadjusted | | -keyFigures.thetaOneWeek.unadjusted | | keyFigures.vega.effective | | -keyFigures.vega.effective | | keyFigures.vega.unadjusted | | -keyFigures.vega.unadjusted | | keyFigures.leverage | | -keyFigures.leverage | | keyFigures.omega | | -keyFigures.omega | | keyFigures.impliedVolatility | | -keyFigures.impliedVolatility | | keyFigures.intrinsicValue | | -keyFigures.intrinsicValue | | keyFigures.timeValue | | -keyFigures.timeValue | | keyFigures.outperformancePoint | | -keyFigures.outperformancePoint | | keyFigures.parity | | -keyFigures.parity | | performance.intraday | | -performance.intraday | | performance.sinceIssue.ask | | -performance.sinceIssue.ask | | performance.sinceIssue.bid | | -performance.sinceIssue.bid | | performance.endOfDay.day1 | | -performance.endOfDay.day1 | | performance.endOfDay.week1 | | -performance.endOfDay.week1 | | performance.endOfDay.month1 | | -performance.endOfDay.month1 | | performance.endOfDay.months3 | | -performance.endOfDay.months3 | | performance.endOfDay.months6 | | -performance.endOfDay.months6 | | performance.endOfDay.year1 | | -performance.endOfDay.year1 | | performance.endOfDay.years3 | | -performance.endOfDay.years3 | | performance.endOfDay.years5 | | -performance.endOfDay.years5 | | performance.endOfDay.yearToDate | | -performance.endOfDay.yearToDate | | volatility.week1 | | -volatility.week1 | | volatility.month1 | | -volatility.month1 | | volatility.months3 | | -volatility.months3 | | volatility.months6 | | -volatility.months6 | | volatility.year1 | | -volatility.year1 | | volatility.years3 | | -volatility.years3 | | volatility.years5 | | -volatility.years5 | | volatility.yearToDate | | -volatility.yearToDate |   |  [optional]
**pagination** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestMetaPagination**](PostSecuritizedDerivativeNotationScreenerSearchRequestMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
SYMBOL | &quot;symbol&quot;
_SYMBOL | &quot;-symbol&quot;
MARKET_NAME | &quot;market.name&quot;
_MARKET_NAME | &quot;-market.name&quot;
INSTRUMENT_NAME | &quot;instrument.name&quot;
_INSTRUMENT_NAME | &quot;-instrument.name&quot;
INSTRUMENT_SHORTNAME | &quot;instrument.shortName&quot;
_INSTRUMENT_SHORTNAME | &quot;-instrument.shortName&quot;
INSTRUMENT_CATEGORIZATION_DDV_LEVEL1_NAME | &quot;instrument.categorization.ddv.level1.name&quot;
_INSTRUMENT_CATEGORIZATION_DDV_LEVEL1_NAME | &quot;-instrument.categorization.ddv.level1.name&quot;
INSTRUMENT_CATEGORIZATION_DDV_LEVEL2_NAME | &quot;instrument.categorization.ddv.level2.name&quot;
_INSTRUMENT_CATEGORIZATION_DDV_LEVEL2_NAME | &quot;-instrument.categorization.ddv.level2.name&quot;
INSTRUMENT_CATEGORIZATION_DDV_LEVEL3_NAME | &quot;instrument.categorization.ddv.level3.name&quot;
_INSTRUMENT_CATEGORIZATION_DDV_LEVEL3_NAME | &quot;-instrument.categorization.ddv.level3.name&quot;
INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL1_NAME | &quot;instrument.categorization.eusipa.level1.name&quot;
_INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL1_NAME | &quot;-instrument.categorization.eusipa.level1.name&quot;
INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL2_NAME | &quot;instrument.categorization.eusipa.level2.name&quot;
_INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL2_NAME | &quot;-instrument.categorization.eusipa.level2.name&quot;
INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL3_NAME | &quot;instrument.categorization.eusipa.level3.name&quot;
_INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL3_NAME | &quot;-instrument.categorization.eusipa.level3.name&quot;
INSTRUMENT_LIFECYCLE_MATURITY_DATE | &quot;instrument.lifeCycle.maturity.date&quot;
_INSTRUMENT_LIFECYCLE_MATURITY_DATE | &quot;-instrument.lifeCycle.maturity.date&quot;
INSTRUMENT_LIFECYCLE_MATURITY_REMAININGTERMDAYS | &quot;instrument.lifeCycle.maturity.remainingTermDays&quot;
_INSTRUMENT_LIFECYCLE_MATURITY_REMAININGTERMDAYS | &quot;-instrument.lifeCycle.maturity.remainingTermDays&quot;
INSTRUMENT_LIFECYCLE_MATURITY_PERPETUAL | &quot;instrument.lifeCycle.maturity.perpetual&quot;
_INSTRUMENT_LIFECYCLE_MATURITY_PERPETUAL | &quot;-instrument.lifeCycle.maturity.perpetual&quot;
INSTRUMENT_LIFECYCLE_CALLABLE | &quot;instrument.lifeCycle.callable&quot;
_INSTRUMENT_LIFECYCLE_CALLABLE | &quot;-instrument.lifeCycle.callable&quot;
INSTRUMENT_LIFECYCLE_VALUATION | &quot;instrument.lifeCycle.valuation&quot;
_INSTRUMENT_LIFECYCLE_VALUATION | &quot;-instrument.lifeCycle.valuation&quot;
INSTRUMENT_LIFECYCLE_REPAYMENT | &quot;instrument.lifeCycle.repayment&quot;
_INSTRUMENT_LIFECYCLE_REPAYMENT | &quot;-instrument.lifeCycle.repayment&quot;
INSTRUMENT_ISSUER_NAME | &quot;instrument.issuer.name&quot;
_INSTRUMENT_ISSUER_NAME | &quot;-instrument.issuer.name&quot;
INSTRUMENT_ISSUER_GROUP_NAME | &quot;instrument.issuer.group.name&quot;
_INSTRUMENT_ISSUER_GROUP_NAME | &quot;-instrument.issuer.group.name&quot;
INSTRUMENT_EXERCISE_RIGHT | &quot;instrument.exercise.right&quot;
_INSTRUMENT_EXERCISE_RIGHT | &quot;-instrument.exercise.right&quot;
INSTRUMENT_EXERCISE_STYLE | &quot;instrument.exercise.style&quot;
_INSTRUMENT_EXERCISE_STYLE | &quot;-instrument.exercise.style&quot;
INSTRUMENT_SETTLEMENT | &quot;instrument.settlement&quot;
_INSTRUMENT_SETTLEMENT | &quot;-instrument.settlement&quot;
INSTRUMENT_QUANTO | &quot;instrument.quanto&quot;
_INSTRUMENT_QUANTO | &quot;-instrument.quanto&quot;
INSTRUMENT_CAPITALPROTECTION | &quot;instrument.capitalProtection&quot;
_INSTRUMENT_CAPITALPROTECTION | &quot;-instrument.capitalProtection&quot;
INSTRUMENT_UNDERLYING_NAME | &quot;instrument.underlying.name&quot;
_INSTRUMENT_UNDERLYING_NAME | &quot;-instrument.underlying.name&quot;
INSTRUMENT_UNDERLYING_VALUEUNIT_CODE | &quot;instrument.underlying.valueUnit.code&quot;
_INSTRUMENT_UNDERLYING_VALUEUNIT_CODE | &quot;-instrument.underlying.valueUnit.code&quot;
INSTRUMENT_UNDERLYING_NOTATION_INSTRUMENT_TYPECOMPOSITE | &quot;instrument.underlying.notation.instrument.typeComposite&quot;
_INSTRUMENT_UNDERLYING_NOTATION_INSTRUMENT_TYPECOMPOSITE | &quot;-instrument.underlying.notation.instrument.typeComposite&quot;
INSTRUMENT_STRIKE_VALUE | &quot;instrument.strike.value&quot;
_INSTRUMENT_STRIKE_VALUE | &quot;-instrument.strike.value&quot;
INSTRUMENT_STRIKE_DISTANCE_ABSOLUTE | &quot;instrument.strike.distance.absolute&quot;
_INSTRUMENT_STRIKE_DISTANCE_ABSOLUTE | &quot;-instrument.strike.distance.absolute&quot;
INSTRUMENT_STRIKE_DISTANCE_RELATIVE | &quot;instrument.strike.distance.relative&quot;
_INSTRUMENT_STRIKE_DISTANCE_RELATIVE | &quot;-instrument.strike.distance.relative&quot;
INSTRUMENT_BONUSLEVEL_VALUE | &quot;instrument.bonusLevel.value&quot;
_INSTRUMENT_BONUSLEVEL_VALUE | &quot;-instrument.bonusLevel.value&quot;
INSTRUMENT_BONUSLEVEL_DISTANCE_ABSOLUTE | &quot;instrument.bonusLevel.distance.absolute&quot;
_INSTRUMENT_BONUSLEVEL_DISTANCE_ABSOLUTE | &quot;-instrument.bonusLevel.distance.absolute&quot;
INSTRUMENT_BONUSLEVEL_DISTANCE_RELATIVE | &quot;instrument.bonusLevel.distance.relative&quot;
_INSTRUMENT_BONUSLEVEL_DISTANCE_RELATIVE | &quot;-instrument.bonusLevel.distance.relative&quot;
INSTRUMENT_CAP_VALUE | &quot;instrument.cap.value&quot;
_INSTRUMENT_CAP_VALUE | &quot;-instrument.cap.value&quot;
INSTRUMENT_CAP_DISTANCE_ABSOLUTE | &quot;instrument.cap.distance.absolute&quot;
_INSTRUMENT_CAP_DISTANCE_ABSOLUTE | &quot;-instrument.cap.distance.absolute&quot;
INSTRUMENT_CAP_DISTANCE_RELATIVE | &quot;instrument.cap.distance.relative&quot;
_INSTRUMENT_CAP_DISTANCE_RELATIVE | &quot;-instrument.cap.distance.relative&quot;
INSTRUMENT_CAP_CASHFLOW | &quot;instrument.cap.cashFlow&quot;
_INSTRUMENT_CAP_CASHFLOW | &quot;-instrument.cap.cashFlow&quot;
INSTRUMENT_KNOCKOUT_OBSERVATION_TYPE | &quot;instrument.knockOut.observation.type&quot;
_INSTRUMENT_KNOCKOUT_OBSERVATION_TYPE | &quot;-instrument.knockOut.observation.type&quot;
INSTRUMENT_KNOCKOUT_VALUE | &quot;instrument.knockOut.value&quot;
_INSTRUMENT_KNOCKOUT_VALUE | &quot;-instrument.knockOut.value&quot;
INSTRUMENT_KNOCKOUT_DISTANCE_ABSOLUTE | &quot;instrument.knockOut.distance.absolute&quot;
_INSTRUMENT_KNOCKOUT_DISTANCE_ABSOLUTE | &quot;-instrument.knockOut.distance.absolute&quot;
INSTRUMENT_KNOCKOUT_DISTANCE_RELATIVE | &quot;instrument.knockOut.distance.relative&quot;
_INSTRUMENT_KNOCKOUT_DISTANCE_RELATIVE | &quot;-instrument.knockOut.distance.relative&quot;
INSTRUMENT_KNOCKOUT_BREACH_BREACHED | &quot;instrument.knockOut.breach.breached&quot;
_INSTRUMENT_KNOCKOUT_BREACH_BREACHED | &quot;-instrument.knockOut.breach.breached&quot;
INSTRUMENT_KNOCKOUT_BREACH_DATETIME | &quot;instrument.knockOut.breach.datetime&quot;
_INSTRUMENT_KNOCKOUT_BREACH_DATETIME | &quot;-instrument.knockOut.breach.datetime&quot;
INSTRUMENT_KNOCKIN_OBSERVATION_TYPE | &quot;instrument.knockIn.observation.type&quot;
_INSTRUMENT_KNOCKIN_OBSERVATION_TYPE | &quot;-instrument.knockIn.observation.type&quot;
INSTRUMENT_KNOCKIN_VALUE | &quot;instrument.knockIn.value&quot;
_INSTRUMENT_KNOCKIN_VALUE | &quot;-instrument.knockIn.value&quot;
INSTRUMENT_KNOCKIN_DISTANCE_ABSOLUTE | &quot;instrument.knockIn.distance.absolute&quot;
_INSTRUMENT_KNOCKIN_DISTANCE_ABSOLUTE | &quot;-instrument.knockIn.distance.absolute&quot;
INSTRUMENT_KNOCKIN_DISTANCE_RELATIVE | &quot;instrument.knockIn.distance.relative&quot;
_INSTRUMENT_KNOCKIN_DISTANCE_RELATIVE | &quot;-instrument.knockIn.distance.relative&quot;
INSTRUMENT_KNOCKIN_BREACH_BREACHED | &quot;instrument.knockIn.breach.breached&quot;
_INSTRUMENT_KNOCKIN_BREACH_BREACHED | &quot;-instrument.knockIn.breach.breached&quot;
INSTRUMENT_KNOCKIN_BREACH_DATETIME | &quot;instrument.knockIn.breach.datetime&quot;
_INSTRUMENT_KNOCKIN_BREACH_DATETIME | &quot;-instrument.knockIn.breach.datetime&quot;
INSTRUMENT_LOCKOUT_OBSERVATION_TYPE | &quot;instrument.lockOut.observation.type&quot;
_INSTRUMENT_LOCKOUT_OBSERVATION_TYPE | &quot;-instrument.lockOut.observation.type&quot;
INSTRUMENT_LOCKOUT_VALUE | &quot;instrument.lockOut.value&quot;
_INSTRUMENT_LOCKOUT_VALUE | &quot;-instrument.lockOut.value&quot;
INSTRUMENT_LOCKOUT_DISTANCE_ABSOLUTE | &quot;instrument.lockOut.distance.absolute&quot;
_INSTRUMENT_LOCKOUT_DISTANCE_ABSOLUTE | &quot;-instrument.lockOut.distance.absolute&quot;
INSTRUMENT_LOCKOUT_DISTANCE_RELATIVE | &quot;instrument.lockOut.distance.relative&quot;
_INSTRUMENT_LOCKOUT_DISTANCE_RELATIVE | &quot;-instrument.lockOut.distance.relative&quot;
INSTRUMENT_LOCKOUT_CASHFLOW | &quot;instrument.lockOut.cashFlow&quot;
_INSTRUMENT_LOCKOUT_CASHFLOW | &quot;-instrument.lockOut.cashFlow&quot;
INSTRUMENT_LOCKIN_OBSERVATION_TYPE | &quot;instrument.lockIn.observation.type&quot;
_INSTRUMENT_LOCKIN_OBSERVATION_TYPE | &quot;-instrument.lockIn.observation.type&quot;
INSTRUMENT_LOCKIN_VALUE | &quot;instrument.lockIn.value&quot;
_INSTRUMENT_LOCKIN_VALUE | &quot;-instrument.lockIn.value&quot;
INSTRUMENT_LOCKIN_DISTANCE_ABSOLUTE | &quot;instrument.lockIn.distance.absolute&quot;
_INSTRUMENT_LOCKIN_DISTANCE_ABSOLUTE | &quot;-instrument.lockIn.distance.absolute&quot;
INSTRUMENT_LOCKIN_DISTANCE_RELATIVE | &quot;instrument.lockIn.distance.relative&quot;
_INSTRUMENT_LOCKIN_DISTANCE_RELATIVE | &quot;-instrument.lockIn.distance.relative&quot;
INSTRUMENT_LOCKIN_CASHFLOW | &quot;instrument.lockIn.cashFlow&quot;
_INSTRUMENT_LOCKIN_CASHFLOW | &quot;-instrument.lockIn.cashFlow&quot;
INSTRUMENT_CAPITALGUARANTEE_VALUE | &quot;instrument.capitalGuarantee.value&quot;
_INSTRUMENT_CAPITALGUARANTEE_VALUE | &quot;-instrument.capitalGuarantee.value&quot;
INSTRUMENT_CAPITALGUARANTEE_DISTANCE_ABSOLUTE | &quot;instrument.capitalGuarantee.distance.absolute&quot;
_INSTRUMENT_CAPITALGUARANTEE_DISTANCE_ABSOLUTE | &quot;-instrument.capitalGuarantee.distance.absolute&quot;
INSTRUMENT_CAPITALGUARANTEE_DISTANCE_RELATIVE | &quot;instrument.capitalGuarantee.distance.relative&quot;
_INSTRUMENT_CAPITALGUARANTEE_DISTANCE_RELATIVE | &quot;-instrument.capitalGuarantee.distance.relative&quot;
INSTRUMENT_CAPITALGUARANTEE_CASHFLOW | &quot;instrument.capitalGuarantee.cashFlow&quot;
_INSTRUMENT_CAPITALGUARANTEE_CASHFLOW | &quot;-instrument.capitalGuarantee.cashFlow&quot;
INSTRUMENT_COUPONTRIGGERLEVEL_VALUE | &quot;instrument.couponTriggerLevel.value&quot;
_INSTRUMENT_COUPONTRIGGERLEVEL_VALUE | &quot;-instrument.couponTriggerLevel.value&quot;
INSTRUMENT_COUPONTRIGGERLEVEL_DISTANCE_ABSOLUTE | &quot;instrument.couponTriggerLevel.distance.absolute&quot;
_INSTRUMENT_COUPONTRIGGERLEVEL_DISTANCE_ABSOLUTE | &quot;-instrument.couponTriggerLevel.distance.absolute&quot;
INSTRUMENT_COUPONTRIGGERLEVEL_DISTANCE_RELATIVE | &quot;instrument.couponTriggerLevel.distance.relative&quot;
_INSTRUMENT_COUPONTRIGGERLEVEL_DISTANCE_RELATIVE | &quot;-instrument.couponTriggerLevel.distance.relative&quot;
INSTRUMENT_COUPONTRIGGERLEVEL_CASHFLOW | &quot;instrument.couponTriggerLevel.cashFlow&quot;
_INSTRUMENT_COUPONTRIGGERLEVEL_CASHFLOW | &quot;-instrument.couponTriggerLevel.cashFlow&quot;
INSTRUMENT_RANGEKNOCKOUT_OBSERVATION_TYPE | &quot;instrument.rangeKnockOut.observation.type&quot;
_INSTRUMENT_RANGEKNOCKOUT_OBSERVATION_TYPE | &quot;-instrument.rangeKnockOut.observation.type&quot;
INSTRUMENT_RANGEKNOCKOUT_UPPER_VALUE | &quot;instrument.rangeKnockOut.upper.value&quot;
_INSTRUMENT_RANGEKNOCKOUT_UPPER_VALUE | &quot;-instrument.rangeKnockOut.upper.value&quot;
INSTRUMENT_RANGEKNOCKOUT_LOWER_VALUE | &quot;instrument.rangeKnockOut.lower.value&quot;
_INSTRUMENT_RANGEKNOCKOUT_LOWER_VALUE | &quot;-instrument.rangeKnockOut.lower.value&quot;
INSTRUMENT_RANGEKNOCKOUT_BREACH_BREACHED | &quot;instrument.rangeKnockOut.breach.breached&quot;
_INSTRUMENT_RANGEKNOCKOUT_BREACH_BREACHED | &quot;-instrument.rangeKnockOut.breach.breached&quot;
INSTRUMENT_RANGEKNOCKOUT_BREACH_DATETIME | &quot;instrument.rangeKnockOut.breach.datetime&quot;
_INSTRUMENT_RANGEKNOCKOUT_BREACH_DATETIME | &quot;-instrument.rangeKnockOut.breach.datetime&quot;
INSTRUMENT_RANGEKNOCKOUT_CASHFLOW | &quot;instrument.rangeKnockOut.cashFlow&quot;
_INSTRUMENT_RANGEKNOCKOUT_CASHFLOW | &quot;-instrument.rangeKnockOut.cashFlow&quot;
INSTRUMENT_PARTICIPATION | &quot;instrument.participation&quot;
_INSTRUMENT_PARTICIPATION | &quot;-instrument.participation&quot;
INSTRUMENT_CONSTANTLEVERAGE | &quot;instrument.constantLeverage&quot;
_INSTRUMENT_CONSTANTLEVERAGE | &quot;-instrument.constantLeverage&quot;
INSTRUMENT_NOMINALCURRENCY_ISOCODE | &quot;instrument.nominalCurrency.isoCode&quot;
_INSTRUMENT_NOMINALCURRENCY_ISOCODE | &quot;-instrument.nominalCurrency.isoCode&quot;
INSTRUMENT_CURRENTINTERESTRATE_TYPE | &quot;instrument.currentInterestRate.type&quot;
_INSTRUMENT_CURRENTINTERESTRATE_TYPE | &quot;-instrument.currentInterestRate.type&quot;
INSTRUMENT_CURRENTINTERESTRATE_VALUE | &quot;instrument.currentInterestRate.value&quot;
_INSTRUMENT_CURRENTINTERESTRATE_VALUE | &quot;-instrument.currentInterestRate.value&quot;
KEYFIGURES_BONUSYIELD_ABSOLUTE | &quot;keyFigures.bonusYield.absolute&quot;
_KEYFIGURES_BONUSYIELD_ABSOLUTE | &quot;-keyFigures.bonusYield.absolute&quot;
KEYFIGURES_BONUSYIELD_RELATIVE | &quot;keyFigures.bonusYield.relative&quot;
_KEYFIGURES_BONUSYIELD_RELATIVE | &quot;-keyFigures.bonusYield.relative&quot;
KEYFIGURES_BONUSYIELD_ANNUALIZED | &quot;keyFigures.bonusYield.annualized&quot;
_KEYFIGURES_BONUSYIELD_ANNUALIZED | &quot;-keyFigures.bonusYield.annualized&quot;
KEYFIGURES_SIDEWAYSYIELD_ABSOLUTE | &quot;keyFigures.sidewaysYield.absolute&quot;
_KEYFIGURES_SIDEWAYSYIELD_ABSOLUTE | &quot;-keyFigures.sidewaysYield.absolute&quot;
KEYFIGURES_SIDEWAYSYIELD_RELATIVE | &quot;keyFigures.sidewaysYield.relative&quot;
_KEYFIGURES_SIDEWAYSYIELD_RELATIVE | &quot;-keyFigures.sidewaysYield.relative&quot;
KEYFIGURES_SIDEWAYSYIELD_ANNUALIZED | &quot;keyFigures.sidewaysYield.annualized&quot;
_KEYFIGURES_SIDEWAYSYIELD_ANNUALIZED | &quot;-keyFigures.sidewaysYield.annualized&quot;
KEYFIGURES_MAXIMUMYIELD_ABSOLUTE | &quot;keyFigures.maximumYield.absolute&quot;
_KEYFIGURES_MAXIMUMYIELD_ABSOLUTE | &quot;-keyFigures.maximumYield.absolute&quot;
KEYFIGURES_MAXIMUMYIELD_RELATIVE | &quot;keyFigures.maximumYield.relative&quot;
_KEYFIGURES_MAXIMUMYIELD_RELATIVE | &quot;-keyFigures.maximumYield.relative&quot;
KEYFIGURES_MAXIMUMYIELD_ANNUALIZED | &quot;keyFigures.maximumYield.annualized&quot;
_KEYFIGURES_MAXIMUMYIELD_ANNUALIZED | &quot;-keyFigures.maximumYield.annualized&quot;
KEYFIGURES_AGIO_ABSOLUTE | &quot;keyFigures.agio.absolute&quot;
_KEYFIGURES_AGIO_ABSOLUTE | &quot;-keyFigures.agio.absolute&quot;
KEYFIGURES_AGIO_RELATIVE | &quot;keyFigures.agio.relative&quot;
_KEYFIGURES_AGIO_RELATIVE | &quot;-keyFigures.agio.relative&quot;
KEYFIGURES_AGIO_ANNUALIZED | &quot;keyFigures.agio.annualized&quot;
_KEYFIGURES_AGIO_ANNUALIZED | &quot;-keyFigures.agio.annualized&quot;
KEYFIGURES_DISCOUNT_ABSOLUTE | &quot;keyFigures.discount.absolute&quot;
_KEYFIGURES_DISCOUNT_ABSOLUTE | &quot;-keyFigures.discount.absolute&quot;
KEYFIGURES_DISCOUNT_RELATIVE | &quot;keyFigures.discount.relative&quot;
_KEYFIGURES_DISCOUNT_RELATIVE | &quot;-keyFigures.discount.relative&quot;
KEYFIGURES_BREAKEVEN_BREAKEVENPOINT | &quot;keyFigures.breakEven.breakEvenPoint&quot;
_KEYFIGURES_BREAKEVEN_BREAKEVENPOINT | &quot;-keyFigures.breakEven.breakEvenPoint&quot;
KEYFIGURES_SPREAD_HARMONIZED | &quot;keyFigures.spread.harmonized&quot;
_KEYFIGURES_SPREAD_HARMONIZED | &quot;-keyFigures.spread.harmonized&quot;
KEYFIGURES_SPREAD_RELATIVE | &quot;keyFigures.spread.relative&quot;
_KEYFIGURES_SPREAD_RELATIVE | &quot;-keyFigures.spread.relative&quot;
KEYFIGURES_DELTA_EFFECTIVE | &quot;keyFigures.delta.effective&quot;
_KEYFIGURES_DELTA_EFFECTIVE | &quot;-keyFigures.delta.effective&quot;
KEYFIGURES_DELTA_UNADJUSTED | &quot;keyFigures.delta.unadjusted&quot;
_KEYFIGURES_DELTA_UNADJUSTED | &quot;-keyFigures.delta.unadjusted&quot;
KEYFIGURES_THETAONEWEEK_EFFECTIVE | &quot;keyFigures.thetaOneWeek.effective&quot;
_KEYFIGURES_THETAONEWEEK_EFFECTIVE | &quot;-keyFigures.thetaOneWeek.effective&quot;
KEYFIGURES_THETAONEWEEK_UNADJUSTED | &quot;keyFigures.thetaOneWeek.unadjusted&quot;
_KEYFIGURES_THETAONEWEEK_UNADJUSTED | &quot;-keyFigures.thetaOneWeek.unadjusted&quot;
KEYFIGURES_VEGA_EFFECTIVE | &quot;keyFigures.vega.effective&quot;
_KEYFIGURES_VEGA_EFFECTIVE | &quot;-keyFigures.vega.effective&quot;
KEYFIGURES_VEGA_UNADJUSTED | &quot;keyFigures.vega.unadjusted&quot;
_KEYFIGURES_VEGA_UNADJUSTED | &quot;-keyFigures.vega.unadjusted&quot;
KEYFIGURES_LEVERAGE | &quot;keyFigures.leverage&quot;
_KEYFIGURES_LEVERAGE | &quot;-keyFigures.leverage&quot;
KEYFIGURES_OMEGA | &quot;keyFigures.omega&quot;
_KEYFIGURES_OMEGA | &quot;-keyFigures.omega&quot;
KEYFIGURES_IMPLIEDVOLATILITY | &quot;keyFigures.impliedVolatility&quot;
_KEYFIGURES_IMPLIEDVOLATILITY | &quot;-keyFigures.impliedVolatility&quot;
KEYFIGURES_INTRINSICVALUE | &quot;keyFigures.intrinsicValue&quot;
_KEYFIGURES_INTRINSICVALUE | &quot;-keyFigures.intrinsicValue&quot;
KEYFIGURES_TIMEVALUE | &quot;keyFigures.timeValue&quot;
_KEYFIGURES_TIMEVALUE | &quot;-keyFigures.timeValue&quot;
KEYFIGURES_OUTPERFORMANCEPOINT | &quot;keyFigures.outperformancePoint&quot;
_KEYFIGURES_OUTPERFORMANCEPOINT | &quot;-keyFigures.outperformancePoint&quot;
KEYFIGURES_PARITY | &quot;keyFigures.parity&quot;
_KEYFIGURES_PARITY | &quot;-keyFigures.parity&quot;
PERFORMANCE_INTRADAY | &quot;performance.intraday&quot;
_PERFORMANCE_INTRADAY | &quot;-performance.intraday&quot;
PERFORMANCE_SINCEISSUE_ASK | &quot;performance.sinceIssue.ask&quot;
_PERFORMANCE_SINCEISSUE_ASK | &quot;-performance.sinceIssue.ask&quot;
PERFORMANCE_SINCEISSUE_BID | &quot;performance.sinceIssue.bid&quot;
_PERFORMANCE_SINCEISSUE_BID | &quot;-performance.sinceIssue.bid&quot;
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
VOLATILITY_WEEK1 | &quot;volatility.week1&quot;
_VOLATILITY_WEEK1 | &quot;-volatility.week1&quot;
VOLATILITY_MONTH1 | &quot;volatility.month1&quot;
_VOLATILITY_MONTH1 | &quot;-volatility.month1&quot;
VOLATILITY_MONTHS3 | &quot;volatility.months3&quot;
_VOLATILITY_MONTHS3 | &quot;-volatility.months3&quot;
VOLATILITY_MONTHS6 | &quot;volatility.months6&quot;
_VOLATILITY_MONTHS6 | &quot;-volatility.months6&quot;
VOLATILITY_YEAR1 | &quot;volatility.year1&quot;
_VOLATILITY_YEAR1 | &quot;-volatility.year1&quot;
VOLATILITY_YEARS3 | &quot;volatility.years3&quot;
_VOLATILITY_YEARS3 | &quot;-volatility.years3&quot;
VOLATILITY_YEARS5 | &quot;volatility.years5&quot;
_VOLATILITY_YEARS5 | &quot;-volatility.years5&quot;
VOLATILITY_YEARTODATE | &quot;volatility.yearToDate&quot;
_VOLATILITY_YEARTODATE | &quot;-volatility.yearToDate&quot;


## Implemented Interfaces

* Serializable


