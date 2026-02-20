# FactSet.SDK.FactSetOwnership.Model.InstitutionalTransactions
institutionalTransactions response object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used in the request. | [optional] 
**FsymId** | **string** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**Currency** | **string** | Currency code. The service will default to the funds local currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**HolderName** | **string** | Returns the names of the institutions involved in the transactions that occurred between the specified start and end dates. | [optional] 
**PctOS** | **double?** | Returns position held as a percentage of total outstanding data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**PctChange** | **double?** | Returns change in position held as a percentage of total outstanding data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**PosChange** | **double?** | Returns position change data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**MarketVal** | **double?** | Returns market value data for the holders of the security whose ownership activity matches the specified change type. | [optional] 
**PeriodOfMeasure** | **string** | Returns the range over which the code calculates change for Percent Ownership and Position Change. | [optional] 
**ReportDate** | **DateTime?** | Returns the report date for the transactions that occurred between the specified start and end dates. | [optional] 
**AsOfDate** | **DateTime?** | Date on which the specified data or information is accurate or relevant. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

