# FactSet.SDK.Formula.Model.TimeSeriesResultObjectNonflattenedScalar

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**TimeSeriesScalarValue**](TimeSeriesScalarValue.md) |  | [optional] 
**Error** | **int** | Indicates that there was an error in the execution of the FQL Formula. * Zero - success * Non-zero - failure  | 
**ErrorMessage** | **string** | If error is non-zero, errorMessage will display the FQL formula error. | [optional] 
**Formula** | **string** | FQL formula requested. | 
**DisplayName** | **string** | Display Name. | [optional] 
**RequestId** | **string** | Identifier requested. | 
**FsymId** | **string** | The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security&#39;s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the &#x60;fsymId&#x60; parameter is set to Y.  | [optional] 
**DataType** | **string** | Type of data returned in &#x60;result&#x60; | 
**ObjectType** | **string** | Type of object returned in &#x60;result&#x60; | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

