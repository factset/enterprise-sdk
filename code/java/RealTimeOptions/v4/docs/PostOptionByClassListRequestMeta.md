

# PostOptionByClassListRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | instrument.normalizedSymbol | | -instrument.normalizedSymbol | | instrument.name | | -instrument.name | | instrument.exercise.right | | -instrument.exercise.right | | instrument.exercise.style | | -instrument.exercise.style | | instrument.strikePrice.level | | -instrument.strikePrice.level | | instrument.lifeCycle.maturity.date | | -instrument.lifeCycle.maturity.date | | instrument.lifeCycle.maturity.interval | | -instrument.lifeCycle.maturity.interval | | instrument.lifeCycle.expiration.month | | -instrument.lifeCycle.expiration.month | | instrument.lifeCycle.expiration.year | | -instrument.lifeCycle.expiration.year | | instrument.contractSize | | -instrument.contractSize | | openInterest | | -openInterest | | keyFigures.moneyness | | -keyFigures.moneyness | | keyFigures.impliedVolatility | | -keyFigures.impliedVolatility | | keyFigures.omega | | -keyFigures.omega | | keyFigures.leverage | | -keyFigures.leverage | | keyFigures.delta | | -keyFigures.delta | | keyFigures.thetaOneWeek | | -keyFigures.thetaOneWeek | | keyFigures.vega | | -keyFigures.vega | | keyFigures.gamma | | -keyFigures.gamma | | keyFigures.rho | | -keyFigures.rho |   |  [optional]
**pagination** | [**PostOptionByClassListRequestMetaPagination**](PostOptionByClassListRequestMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
INSTRUMENT_NORMALIZEDSYMBOL | &quot;instrument.normalizedSymbol&quot;
_INSTRUMENT_NORMALIZEDSYMBOL | &quot;-instrument.normalizedSymbol&quot;
INSTRUMENT_NAME | &quot;instrument.name&quot;
_INSTRUMENT_NAME | &quot;-instrument.name&quot;
INSTRUMENT_EXERCISE_RIGHT | &quot;instrument.exercise.right&quot;
_INSTRUMENT_EXERCISE_RIGHT | &quot;-instrument.exercise.right&quot;
INSTRUMENT_EXERCISE_STYLE | &quot;instrument.exercise.style&quot;
_INSTRUMENT_EXERCISE_STYLE | &quot;-instrument.exercise.style&quot;
INSTRUMENT_STRIKEPRICE_LEVEL | &quot;instrument.strikePrice.level&quot;
_INSTRUMENT_STRIKEPRICE_LEVEL | &quot;-instrument.strikePrice.level&quot;
INSTRUMENT_LIFECYCLE_MATURITY_DATE | &quot;instrument.lifeCycle.maturity.date&quot;
_INSTRUMENT_LIFECYCLE_MATURITY_DATE | &quot;-instrument.lifeCycle.maturity.date&quot;
INSTRUMENT_LIFECYCLE_MATURITY_INTERVAL | &quot;instrument.lifeCycle.maturity.interval&quot;
_INSTRUMENT_LIFECYCLE_MATURITY_INTERVAL | &quot;-instrument.lifeCycle.maturity.interval&quot;
INSTRUMENT_LIFECYCLE_EXPIRATION_MONTH | &quot;instrument.lifeCycle.expiration.month&quot;
_INSTRUMENT_LIFECYCLE_EXPIRATION_MONTH | &quot;-instrument.lifeCycle.expiration.month&quot;
INSTRUMENT_LIFECYCLE_EXPIRATION_YEAR | &quot;instrument.lifeCycle.expiration.year&quot;
_INSTRUMENT_LIFECYCLE_EXPIRATION_YEAR | &quot;-instrument.lifeCycle.expiration.year&quot;
INSTRUMENT_CONTRACTSIZE | &quot;instrument.contractSize&quot;
_INSTRUMENT_CONTRACTSIZE | &quot;-instrument.contractSize&quot;
OPENINTEREST | &quot;openInterest&quot;
_OPENINTEREST | &quot;-openInterest&quot;
KEYFIGURES_MONEYNESS | &quot;keyFigures.moneyness&quot;
_KEYFIGURES_MONEYNESS | &quot;-keyFigures.moneyness&quot;
KEYFIGURES_IMPLIEDVOLATILITY | &quot;keyFigures.impliedVolatility&quot;
_KEYFIGURES_IMPLIEDVOLATILITY | &quot;-keyFigures.impliedVolatility&quot;
KEYFIGURES_OMEGA | &quot;keyFigures.omega&quot;
_KEYFIGURES_OMEGA | &quot;-keyFigures.omega&quot;
KEYFIGURES_LEVERAGE | &quot;keyFigures.leverage&quot;
_KEYFIGURES_LEVERAGE | &quot;-keyFigures.leverage&quot;
KEYFIGURES_DELTA | &quot;keyFigures.delta&quot;
_KEYFIGURES_DELTA | &quot;-keyFigures.delta&quot;
KEYFIGURES_THETAONEWEEK | &quot;keyFigures.thetaOneWeek&quot;
_KEYFIGURES_THETAONEWEEK | &quot;-keyFigures.thetaOneWeek&quot;
KEYFIGURES_VEGA | &quot;keyFigures.vega&quot;
_KEYFIGURES_VEGA | &quot;-keyFigures.vega&quot;
KEYFIGURES_GAMMA | &quot;keyFigures.gamma&quot;
_KEYFIGURES_GAMMA | &quot;-keyFigures.gamma&quot;
KEYFIGURES_RHO | &quot;keyFigures.rho&quot;
_KEYFIGURES_RHO | &quot;-keyFigures.rho&quot;


## Implemented Interfaces

* Serializable


