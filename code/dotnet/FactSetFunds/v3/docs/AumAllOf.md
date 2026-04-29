# FactSet.SDK.FactSetFunds.Model.AumAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**FundLevelAUM** | **double?** | Returns fund-level Assets Under Management (AUM) data. Fund-level AUM is the sum of the market values of the positions in the fund&#39;s portfolio. This represents all share classes. | [optional] 
**ShareClassAUMReported** | **double?** | As-Reported AUM. Calculated by using shares outstanding at previous close multiplied by NAV at previous close. This is typically the value seen on fund websites. As Reported AUM &#x3D; (Shares Outstanding t0 * NAV t0). | [optional] 
**ShareClassAUMActual** | **double?** | Actual AUM. Calculated by using shares outstanding at previous close multiplied by NAV of one day prior to close. This is the value used in calculating fund flows. Actual AUM &#x3D; (Shares Outstanding t0 * NAV t-1) | [optional] 
**Currency** | **string** | The Currency of the AUM values. By default it will be in the Funds Currency, unless otherwise requested via the currency parameter. This will be in ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**NumberOfSharesOutstanding** | **decimal?** | Returns the last available number of shares outstanding for the security.  | [optional] 
**Date** | **DateTime?** | The date of the AUM in YYYY-MM-DD format. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

