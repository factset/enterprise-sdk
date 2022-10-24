# DividendAdjust

Controls the dividend reinvestment for the returns calculation.   * **PRICE** = Price Change - Dividends Excluded.   * **EXDATE** = Simple Return - Dividends Received on exdate but not reinvested.   * **PAYDATE** = Simple Return - Dividends Received on paydate but not reinvested.   * **EXDATE_C** = Compound Return - Dividends reinvested on exdate.   * **PAYDATE_C** = Compound Return - Dividends reinvested on paydate. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Controls the dividend reinvestment for the returns calculation.   * **PRICE** &#x3D; Price Change - Dividends Excluded.   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested.   * **PAYDATE** &#x3D; Simple Return - Dividends Received on paydate but not reinvested.   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate.   * **PAYDATE_C** &#x3D; Compound Return - Dividends reinvested on paydate.  | defaults to "EXDATE_C",  must be one of ["PRICE", "EXDATE", "PAYDATE", "EXDATE_C", "PAYDATE_C", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


