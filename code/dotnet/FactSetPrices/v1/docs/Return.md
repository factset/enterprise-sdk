# FactSet.SDK.FactSetPrices.Model.Return

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Date** | **DateTime?** | End date of the return. Date in YYYY-MM-DD format. Depending on Frequency and Calendar settings, this could represent the entire return period requested. | [optional] 
**AdjDate** | **DateTime?** | Date of last split for which return has been adjusted. | [optional] 
**Currency** | **string** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**TotalReturn** | **double?** | The simple or compound return for the requested &#x60;frequency&#x60; and/or &#x60;rolling_period&#x60;. Depending on the input parameters the return will adjust accordingly. If you simply use &#x60;frequency&#x60; and no &#x60;rolling_period&#x60;, the return value will represent the frequency period. If you use &#x60;rolling_period&#x60;, the values will be returned in actual period ends (e.g. actual month, actual week, daily, etc.). General Return Calculation Details found on [Online Assistant Page #8748](https://oa.apps.factset.com/pages/8748) | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

