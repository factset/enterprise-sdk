

# BondSpread


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**date** | **LocalDate** | The date on which the price is calculated. |  [optional]
**actualCDSBondBasisMid** | **Double** | The difference between the CDS spread interpolated to the bond maturity and the asset swap spread of the bond .Available only  for &#x60;corporate bonds&#x60; |  [optional]
**actualIMMCDSBondBasis** | **Double** | The difference between the CDS spread interpolated to the IMM date immediately following the bond maturity,and the asset swap spread of the bond .Available only  for &#x60;corporate bonds&#x60; |  [optional]
**cdSBondBasisDate** | **LocalDate** | The date of the CDS Bond Basis .Available only  for &#x60;corporate bonds&#x60; |  [optional]
**bidDiscountMargin** | **Double** | The discount margin of a Floating Rate Note,denominated in basis points, based on the evaluated bid price. Discount margin is the return earned in addition to the index underlying the floating rate security .Available only  for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. |  [optional]
**midDiscountMargin** | **Double** | The discount margin of a Floating RateNote, denominate in basis points, based on the evaluated mid price. Discount margin is the return earned in addition to the index underlying the floating rate security .Available only  for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. |  [optional]
**askDiscountMargin** | **Double** | The discount margin of a Floating Rate Note, denominated in basis points, based on the evaluated ask price. Discount margin is the return earned in addition to the index underlying the floating rate security. Available only  for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. |  [optional]
**bidOAS** | **Double** | The Option Adjusted Spread (OAS), based on the bid price. OAS is the flat spread which has to be added to the treasury yield curve in a pricing model (that accounts for embedded options) to discount a security payment to match its market price. Available only  for &#x60;corporate bonds&#x60; |  [optional]
**midOAS** | **Double** | The Option Adjusted Spread (OAS), based on the mid price. OAS is the flat spread which has to be added to the treasury yield curve in a pricing model (that accounts for embedded options) to discount a security payment to match its market price .Available only  for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. |  [optional]
**askOAS** | **Double** | The Option Adjusted Spread (OAS), based on the ask price. OAS is the flat spread which has to be added to the treasury yield curve in a pricing model (that accounts for embedded options) to discount a security payment to match its market price. Available only  for &#x60;corporate bonds&#x60; |  [optional]
**bidAssetSwapSpread** | **Double** | The bid asset swap spread in the currency of the instrument. Asset Swap Spread is the difference between the yield of an instrument and the LIBOR curve .Available only  for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. |  [optional]
**midAssetSwapSpread** | **Double** | The mid asset swap spread in the currency of the instrument. Asset Swap Spread is the difference between the yield of an instrument and the LIBOR curve .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**askAssetSwapSpread** | **Double** | The ask asset swap spread in the currency of the instrument. Asset Swap Spread is the difference between the yield of an instrument and the LIBOR curve .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**bidZSpread** | **Double** | The bid Z spread of the instrument, based on the bid price. Z spread is the constant spread that will make the price of an instrument equal to the present value of its cash flows, when added to the yield at each point on the spot rate treasury curve, where a cash flow is received. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**midZSpread** | **Double** | The bid Z spread of the instrument, based on the mid price. Z spread is the constant spread that will make the price of an instrument equal to the present value of its cash flows, when added to the yield at each point on the spot rate treasury curve, where a cash flow is received .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**askZSpread** | **Double** | The bid Z spread of the instrument, based on the ask price. Z spread is the constant spread that will make the price of an instrument equal to the present value of its cash flows, when added to the yield at each point on the spot rate treasury curve, where a cash flow is received .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**bidGSpread** | **Double** | The G spread of the instrument, based on the bid price. G spread is the difference between the yield to maturity of the bond and the linearly interpolated yield to the same maturity on an appropriate government curve. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**midGSpread** | **Double** | The G spread of the instrument, based on the mid price. G spread is the difference between the yield to maturity of the bond and the linearly interpolated yield to the same maturity on an appropriate government curve. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**askGSpread** | **Double** | The G spread of the instrument, based on the ask price. G spread is the difference between the yield to maturity of the bond and the linearly interpolated yield to the same maturity on an appropriate government curve. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**bidYieldSpreadvBenchmark** | **Double** | The spread of the instrument bid yield against the assigned benchmark bid yield. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**midYieldSpreadvBenchmark** | **Double** | The spread of the instrument mid yield against the assigned benchmark mid yield. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**askYieldSpreadvBenchmark** | **Double** | The spread of the instrument ask yield against the assigned benchmark ask yield. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**bidAskPriceSpread** | **Double** | The difference between the ask price and the bid price. |  [optional]
**bidAskYieldSpread** | **Double** | The difference between the ask yield and bid yield .Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**bidSTWSpread** | **Double** | The difference, in terms of spread, between the bid yield to worst and the yield to maturity of the treasury bond with the closest maturity to the yieldToWorstDate. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**midISpread** | **Double** | The I spread of the bond, based on the mid price. I spread is the difference between the yield to maturity of the bond and the linearly interpolated yield to the same maturity on an appropriate reference curve. Available only  for &#x60;corporate bonds&#x60;. |  [optional]
**midWALTreasurySpread** | **Double** | The value of Mid Spread to treasuries at same WAL of the bond. Available only  for &#x60;asset-backed security bonds&#x60;. |  [optional]
**midEDSFSpread** | **Double** | The mid spread to the Euro Dollar Synthetic Futures(EDSF) curve used in evaluated price of the instrument. Available only  for &#x60;asset-backed security bonds&#x60;. |  [optional]
**treasurySwapSpread** | **Double** | Swap spread to treasuries for same maturity of the treasury bond and swap. Available only  for &#x60;asset-backed security bonds&#x60;. |  [optional]
**midSwapSpread** | **Double** | The mid spread to swaps .Available only  for &#x60;asset-backed security bonds&#x60;. |  [optional]


## Implemented Interfaces

* Serializable


