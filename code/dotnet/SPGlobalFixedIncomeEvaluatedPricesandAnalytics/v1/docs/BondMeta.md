# FactSet.SDK.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Model.BondMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Date** | **DateTime?** | The date on which the price is calculated. | [optional] 
**Classification** | **string** | Returns the top level sector classification of the instrument. | [optional] 
**MaturityDate** | **DateTime?** | The date on which the principal amount of the security becomes due and payable, as stated in the terms of the security. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**AssumedMaturityDate** | **DateTime?** | The assumed maturity date on which the principal amount of the security becomes due and payable. This is controlled by the evaluator and represents the maturity date being used in the market. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**Defaulted** | **string** | Indicates if an instrument is default or not. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**Isin** | **string** | The ISIN (International Securities Identification Number) to which the price data applies. | [optional] 
**Cusip** | **string** | Unique CUSIP identifier for the instrument to which the price data applies. | [optional] 
**VendorId** | **string** | Returns the Vendor ID. | [optional] 
**Ticker** | **string** | The IHS Markit ticker for the organization. Available only for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. | [optional] 
**SetId** | **decimal?** | EVB internal identifier of instrumentSet. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**BenchmarkISIN** | **string** | The ISIN of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**BenchmarkCUSIP** | **string** | The CUSIP of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**Name** | **string** | Returns full bond name (issuer name-coupon rate-maturity year) | [optional] 
**IssuerName** | **string** | Returns the short name of the issuer. Available only for &#x60;corporate bonds&#x60; and &#39;municipal bonds&#39;. | [optional] 
**BenchmarkName** | **string** | The name of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**Perpetual** | **string** | Shows that a maturity date is not specified for the instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**Region** | **string** | Region of the coupon currency. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**Tier** | **string** | The code representing the bond seniority type. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**IssueName** | **string** | Name of the instrument. Available only for &#x60;municipal bonds&#x60;. | [optional] 
**BondTicker** | **string** | Returns the bond specific ticker. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**IndexTrancheName** | **string** | The field shows Index Tranche Name. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**Redemption** | **string** | Returns the indication of whether the bond is run to maturity or to the optional redemption/call. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

