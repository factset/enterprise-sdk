

# DebtInstrumentNotationScreenerSearchMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. |  [optional]
**pagination** | [**DebtInstrumentNotationScreenerSearchMetaPagination**](DebtInstrumentNotationScreenerSearchMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
VALUEUNIT_CODE | &quot;valueUnit.code&quot;
_VALUEUNIT_CODE | &quot;-valueUnit.code&quot;
MARKET_NAME | &quot;market.name&quot;
_MARKET_NAME | &quot;-market.name&quot;
SYMBOL | &quot;symbol&quot;
_SYMBOL | &quot;-symbol&quot;
INSTRUMENT_NAME | &quot;instrument.name&quot;
_INSTRUMENT_NAME | &quot;-instrument.name&quot;
INSTRUMENT_SHORTNAME | &quot;instrument.shortName&quot;
_INSTRUMENT_SHORTNAME | &quot;-instrument.shortName&quot;
INSTRUMENT_CATEGORIZATION_LEVEL1_NAME | &quot;instrument.categorization.level1.name&quot;
_INSTRUMENT_CATEGORIZATION_LEVEL1_NAME | &quot;-instrument.categorization.level1.name&quot;
INSTRUMENT_CATEGORIZATION_LEVEL2_NAME | &quot;instrument.categorization.level2.name&quot;
_INSTRUMENT_CATEGORIZATION_LEVEL2_NAME | &quot;-instrument.categorization.level2.name&quot;
INSTRUMENT_CATEGORIZATION_LEVEL3_NAME | &quot;instrument.categorization.level3.name&quot;
_INSTRUMENT_CATEGORIZATION_LEVEL3_NAME | &quot;-instrument.categorization.level3.name&quot;
INSTRUMENT_LIFECYCLE_ISSUE | &quot;instrument.lifeCycle.issue&quot;
_INSTRUMENT_LIFECYCLE_ISSUE | &quot;-instrument.lifeCycle.issue&quot;
INSTRUMENT_LIFECYCLE_MATURITY_DATE | &quot;instrument.lifeCycle.maturity.date&quot;
_INSTRUMENT_LIFECYCLE_MATURITY_DATE | &quot;-instrument.lifeCycle.maturity.date&quot;
INSTRUMENT_LIFECYCLE_MATURITY_REMAININGTERMYEARS | &quot;instrument.lifeCycle.maturity.remainingTermYears&quot;
_INSTRUMENT_LIFECYCLE_MATURITY_REMAININGTERMYEARS | &quot;-instrument.lifeCycle.maturity.remainingTermYears&quot;
INSTRUMENT_LIFECYCLE_MATURITY_PERPETUAL | &quot;instrument.lifeCycle.maturity.perpetual&quot;
_INSTRUMENT_LIFECYCLE_MATURITY_PERPETUAL | &quot;-instrument.lifeCycle.maturity.perpetual&quot;
INSTRUMENT_LIFECYCLE_CALLABLE | &quot;instrument.lifeCycle.callable&quot;
_INSTRUMENT_LIFECYCLE_CALLABLE | &quot;-instrument.lifeCycle.callable&quot;
INSTRUMENT_SUBORDINATED | &quot;instrument.subordinated&quot;
_INSTRUMENT_SUBORDINATED | &quot;-instrument.subordinated&quot;
INSTRUMENT_RATINGSYSTEM1_RATING_GRADE | &quot;instrument.ratingSystem1.rating.grade&quot;
_INSTRUMENT_RATINGSYSTEM1_RATING_GRADE | &quot;-instrument.ratingSystem1.rating.grade&quot;
INSTRUMENT_RATINGSYSTEM2_RATING_GRADE | &quot;instrument.ratingSystem2.rating.grade&quot;
_INSTRUMENT_RATINGSYSTEM2_RATING_GRADE | &quot;-instrument.ratingSystem2.rating.grade&quot;
INSTRUMENT_ISSUER_NAME | &quot;instrument.issuer.name&quot;
_INSTRUMENT_ISSUER_NAME | &quot;-instrument.issuer.name&quot;
INSTRUMENT_ISSUER_COUNTRY_NAME | &quot;instrument.issuer.country.name&quot;
_INSTRUMENT_ISSUER_COUNTRY_NAME | &quot;-instrument.issuer.country.name&quot;
INSTRUMENT_ISSUE_VOLUME_CURRENCY_ISOCODE | &quot;instrument.issue.volume.currency.isoCode&quot;
_INSTRUMENT_ISSUE_VOLUME_CURRENCY_ISOCODE | &quot;-instrument.issue.volume.currency.isoCode&quot;
INSTRUMENT_TRADINGVOLUME_OTC_MINIMUM | &quot;instrument.tradingVolume.otc.minimum&quot;
_INSTRUMENT_TRADINGVOLUME_OTC_MINIMUM | &quot;-instrument.tradingVolume.otc.minimum&quot;
INSTRUMENT_COMPLIANCE_GERMANY_TRUSTEEELIGIBLE | &quot;instrument.compliance.germany.trusteeEligible&quot;
_INSTRUMENT_COMPLIANCE_GERMANY_TRUSTEEELIGIBLE | &quot;-instrument.compliance.germany.trusteeEligible&quot;
INSTRUMENT_COUPON_OCCURRENCE_FREQUENCY_NAME | &quot;instrument.coupon.occurrence.frequency.name&quot;
_INSTRUMENT_COUPON_OCCURRENCE_FREQUENCY_NAME | &quot;-instrument.coupon.occurrence.frequency.name&quot;
INSTRUMENT_COUPON_CURRENTINTERESTRATE_TYPE_NAME | &quot;instrument.coupon.currentInterestRate.type.name&quot;
_INSTRUMENT_COUPON_CURRENTINTERESTRATE_TYPE_NAME | &quot;-instrument.coupon.currentInterestRate.type.name&quot;
INSTRUMENT_COUPON_CURRENTINTERESTRATE_VALUE | &quot;instrument.coupon.currentInterestRate.value&quot;
_INSTRUMENT_COUPON_CURRENTINTERESTRATE_VALUE | &quot;-instrument.coupon.currentInterestRate.value&quot;
YIELD_CURRENT | &quot;yield.current&quot;
_YIELD_CURRENT | &quot;-yield.current&quot;
YIELD_TOMATURITY | &quot;yield.toMaturity&quot;
_YIELD_TOMATURITY | &quot;-yield.toMaturity&quot;
YIELD_SPREAD | &quot;yield.spread&quot;
_YIELD_SPREAD | &quot;-yield.spread&quot;
MACAULAYDURATION | &quot;macaulayDuration&quot;
_MACAULAYDURATION | &quot;-macaulayDuration&quot;
SENSITIVITIES_BASEPOINTVALUE | &quot;sensitivities.basePointValue&quot;
_SENSITIVITIES_BASEPOINTVALUE | &quot;-sensitivities.basePointValue&quot;
SENSITIVITIES_MODIFIEDDURATION | &quot;sensitivities.modifiedDuration&quot;
_SENSITIVITIES_MODIFIEDDURATION | &quot;-sensitivities.modifiedDuration&quot;
SENSITIVITIES_ELASTICITY | &quot;sensitivities.elasticity&quot;
_SENSITIVITIES_ELASTICITY | &quot;-sensitivities.elasticity&quot;
SENSITIVITIES_CONVEXITY | &quot;sensitivities.convexity&quot;
_SENSITIVITIES_CONVEXITY | &quot;-sensitivities.convexity&quot;
TRADEDVALUE_DAYS30_SUM | &quot;tradedValue.days30.sum&quot;
_TRADEDVALUE_DAYS30_SUM | &quot;-tradedValue.days30.sum&quot;
TRADEDVALUE_DAYS30_AVERAGE | &quot;tradedValue.days30.average&quot;
_TRADEDVALUE_DAYS30_AVERAGE | &quot;-tradedValue.days30.average&quot;


## Implemented Interfaces

* Serializable


