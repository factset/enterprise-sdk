# realtimeoptions.PostOptionByClassListRequestMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | instrument.normalizedSymbol | | -instrument.normalizedSymbol | | instrument.name | | -instrument.name | | instrument.exercise.right | | -instrument.exercise.right | | instrument.exercise.style | | -instrument.exercise.style | | instrument.strikePrice.level | | -instrument.strikePrice.level | | instrument.lifeCycle.maturity.date | | -instrument.lifeCycle.maturity.date | | instrument.lifeCycle.maturity.interval | | -instrument.lifeCycle.maturity.interval | | instrument.lifeCycle.expiration.month | | -instrument.lifeCycle.expiration.month | | instrument.lifeCycle.expiration.year | | -instrument.lifeCycle.expiration.year | | instrument.contractSize | | -instrument.contractSize | | openInterest | | -openInterest | | keyFigures.moneyness | | -keyFigures.moneyness | | keyFigures.impliedVolatility | | -keyFigures.impliedVolatility | | keyFigures.omega | | -keyFigures.omega | | keyFigures.leverage | | -keyFigures.leverage | | keyFigures.delta | | -keyFigures.delta | | keyFigures.thetaOneWeek | | -keyFigures.thetaOneWeek | | keyFigures.vega | | -keyFigures.vega | | keyFigures.gamma | | -keyFigures.gamma | | keyFigures.rho | | -keyFigures.rho |   | [optional] 
**pagination** | [**PostOptionByClassListRequestMetaPagination**](PostOptionByClassListRequestMetaPagination.md) |  | [optional] 



## Enum: [SortEnum]


* `instrument.normalizedSymbol` (value: `"instrument.normalizedSymbol"`)

* `-instrument.normalizedSymbol` (value: `"-instrument.normalizedSymbol"`)

* `instrument.name` (value: `"instrument.name"`)

* `-instrument.name` (value: `"-instrument.name"`)

* `instrument.exercise.right` (value: `"instrument.exercise.right"`)

* `-instrument.exercise.right` (value: `"-instrument.exercise.right"`)

* `instrument.exercise.style` (value: `"instrument.exercise.style"`)

* `-instrument.exercise.style` (value: `"-instrument.exercise.style"`)

* `instrument.strikePrice.level` (value: `"instrument.strikePrice.level"`)

* `-instrument.strikePrice.level` (value: `"-instrument.strikePrice.level"`)

* `instrument.lifeCycle.maturity.date` (value: `"instrument.lifeCycle.maturity.date"`)

* `-instrument.lifeCycle.maturity.date` (value: `"-instrument.lifeCycle.maturity.date"`)

* `instrument.lifeCycle.maturity.interval` (value: `"instrument.lifeCycle.maturity.interval"`)

* `-instrument.lifeCycle.maturity.interval` (value: `"-instrument.lifeCycle.maturity.interval"`)

* `instrument.lifeCycle.expiration.month` (value: `"instrument.lifeCycle.expiration.month"`)

* `-instrument.lifeCycle.expiration.month` (value: `"-instrument.lifeCycle.expiration.month"`)

* `instrument.lifeCycle.expiration.year` (value: `"instrument.lifeCycle.expiration.year"`)

* `-instrument.lifeCycle.expiration.year` (value: `"-instrument.lifeCycle.expiration.year"`)

* `instrument.contractSize` (value: `"instrument.contractSize"`)

* `-instrument.contractSize` (value: `"-instrument.contractSize"`)

* `openInterest` (value: `"openInterest"`)

* `-openInterest` (value: `"-openInterest"`)

* `keyFigures.moneyness` (value: `"keyFigures.moneyness"`)

* `-keyFigures.moneyness` (value: `"-keyFigures.moneyness"`)

* `keyFigures.impliedVolatility` (value: `"keyFigures.impliedVolatility"`)

* `-keyFigures.impliedVolatility` (value: `"-keyFigures.impliedVolatility"`)

* `keyFigures.omega` (value: `"keyFigures.omega"`)

* `-keyFigures.omega` (value: `"-keyFigures.omega"`)

* `keyFigures.leverage` (value: `"keyFigures.leverage"`)

* `-keyFigures.leverage` (value: `"-keyFigures.leverage"`)

* `keyFigures.delta` (value: `"keyFigures.delta"`)

* `-keyFigures.delta` (value: `"-keyFigures.delta"`)

* `keyFigures.thetaOneWeek` (value: `"keyFigures.thetaOneWeek"`)

* `-keyFigures.thetaOneWeek` (value: `"-keyFigures.thetaOneWeek"`)

* `keyFigures.vega` (value: `"keyFigures.vega"`)

* `-keyFigures.vega` (value: `"-keyFigures.vega"`)

* `keyFigures.gamma` (value: `"keyFigures.gamma"`)

* `-keyFigures.gamma` (value: `"-keyFigures.gamma"`)

* `keyFigures.rho` (value: `"keyFigures.rho"`)

* `-keyFigures.rho` (value: `"-keyFigures.rho"`)




