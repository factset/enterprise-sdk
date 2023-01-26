# BondMeta


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **date, none_type** | The date on which the price is calculated. | [optional] 
**classification** | **str, none_type** | Returns the top level sector classification of the instrument. | [optional] 
**maturity_date** | **date, none_type** | The date on which the principal amount of the security becomes due and payable, as stated in the terms of the security. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**assumed_maturity_date** | **date, none_type** | The assumed maturity date on which the principal amount of the security becomes due and payable. This is controlled by the evaluator and represents the maturity date being used in the market. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**defaulted** | **str, none_type** | Indicates if an instrument is default or not. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**isin** | **str, none_type** | The ISIN (International Securities Identification Number) to which the price data applies. | [optional] 
**cusip** | **str, none_type** | Unique CUSIP identifier for the instrument to which the price data applies. | [optional] 
**vendor_id** | **str, none_type** | Returns the Vendor ID. | [optional] 
**ticker** | **str, none_type** | The IHS Markit ticker for the organization. Available only for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. | [optional] 
**set_id** | **float, none_type** | EVB internal identifier of instrumentSet. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**benchmark_isin** | **str, none_type** | The ISIN of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**benchmark_cusip** | **str, none_type** | The CUSIP of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**name** | **str, none_type** | Returns full bond name (issuer name-coupon rate-maturity year) | [optional] 
**issuer_name** | **str, none_type** | Returns the short name of the issuer. Available only for &#x60;corporate bonds&#x60; and &#39;municipal bonds&#39;. | [optional] 
**benchmark_name** | **str, none_type** | The name of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**perpetual** | **str, none_type** | Shows that a maturity date is not specified for the instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**region** | **str, none_type** | Region of the coupon currency. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**tier** | **str, none_type** | The code representing the bond seniority type. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**issue_name** | **str, none_type** | Name of the instrument. Available only for &#x60;municipal bonds&#x60;. | [optional] 
**bond_ticker** | **str, none_type** | Returns the bond specific ticker. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**index_tranche_name** | **str, none_type** | The field shows Index Tranche Name. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**redemption** | **str, none_type** | Returns the indication of whether the bond is run to maturity or to the optional redemption/call. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


