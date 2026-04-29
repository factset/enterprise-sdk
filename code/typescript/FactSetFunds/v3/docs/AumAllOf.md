# factsetfunds.AumAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**fundLevelAUM** | **Number** | Returns fund-level Assets Under Management (AUM) data. Fund-level AUM is the sum of the market values of the positions in the fund&#39;s portfolio. This represents all share classes. | [optional] 
**shareClassAUMReported** | **Number** | As-Reported AUM. Calculated by using shares outstanding at previous close multiplied by NAV at previous close. This is typically the value seen on fund websites. As Reported AUM &#x3D; (Shares Outstanding t0 * NAV t0). | [optional] 
**shareClassAUMActual** | **Number** | Actual AUM. Calculated by using shares outstanding at previous close multiplied by NAV of one day prior to close. This is the value used in calculating fund flows. Actual AUM &#x3D; (Shares Outstanding t0 * NAV t-1) | [optional] 
**currency** | **String** | The Currency of the AUM values. By default it will be in the Funds Currency, unless otherwise requested via the currency parameter. This will be in ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**numberOfSharesOutstanding** | **Number** | Returns the last available number of shares outstanding for the security.  | [optional] 
**date** | **Date** | The date of the AUM in YYYY-MM-DD format. | [optional] 


