

# BondMeta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**date** | **LocalDate** | The date on which the price is calculated. |  [optional]
**classification** | **String** | Returns the top level sector classification of the instrument. |  [optional]
**maturityDate** | **LocalDate** | The date on which the principal amount of the security becomes due and payable, as stated in the terms of the security. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. |  [optional]
**assumedMaturityDate** | **LocalDate** | The assumed maturity date on which the principal amount of the security becomes due and payable. This is controlled by the evaluator and represents the maturity date being used in the market. Available only for &#x60;corporate bonds&#x60;. |  [optional]
**defaulted** | **String** | Indicates if an instrument is default or not. Available only for &#x60;corporate bonds&#x60;. |  [optional]
**isin** | **String** | The ISIN (International Securities Identification Number) to which the price data applies. |  [optional]
**cusip** | **String** | Unique CUSIP identifier for the instrument to which the price data applies. |  [optional]
**vendorId** | **String** | Returns the Vendor ID. |  [optional]
**ticker** | **String** | The IHS Markit ticker for the organization. Available only for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. |  [optional]
**setId** | **BigDecimal** | EVB internal identifier of instrumentSet. Available only for &#x60;corporate bonds&#x60;. |  [optional]
**benchmarkISIN** | **String** | The ISIN of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. |  [optional]
**benchmarkCUSIP** | **String** | The CUSIP of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. |  [optional]
**name** | **String** | Returns full bond name (issuer name-coupon rate-maturity year) |  [optional]
**issuerName** | **String** | Returns the short name of the issuer. Available only for &#x60;corporate bonds&#x60; and &#39;municipal bonds&#39;. |  [optional]
**benchmarkName** | **String** | The name of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. |  [optional]
**perpetual** | **String** | Shows that a maturity date is not specified for the instrument. Available only for &#x60;corporate bonds&#x60;. |  [optional]
**region** | **String** | Region of the coupon currency. Available only for &#x60;corporate bonds&#x60;. |  [optional]
**tier** | **String** | The code representing the bond seniority type. Available only for &#x60;corporate bonds&#x60;. |  [optional]
**issueName** | **String** | Name of the instrument. Available only for &#x60;municipal bonds&#x60;. |  [optional]
**bondTicker** | **String** | Returns the bond specific ticker. Available only for &#x60;asset-backed security bonds&#x60;. |  [optional]
**indexTrancheName** | **String** | The field shows Index Tranche Name. Available only for &#x60;asset-backed security bonds&#x60;. |  [optional]
**redemption** | **String** | Returns the indication of whether the bond is run to maturity or to the optional redemption/call. Available only for &#x60;asset-backed security bonds&#x60;. |  [optional]


## Implemented Interfaces

* Serializable


