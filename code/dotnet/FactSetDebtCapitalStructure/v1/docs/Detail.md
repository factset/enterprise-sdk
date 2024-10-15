# FactSet.SDK.FactSetDebtCapitalStructure.Model.Detail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InstrumentId** | **string** | Identifier for the debt instrument. | [optional] 
**InstrumentType** | **string** | Type of debt instrument. | [optional] 
**Description** | **string** | Desription of the debt instrument. | [optional] 
**Seniority** | **string** | Textual description of the instrument seniority type: * **Senior Unsecured** * **Senior Secured** * **Senior Subordinated** * **Collateralized** * **Subordinated** * **Junior** * **Junior Subordinated** * **Senior Conv.** &#x3D; Senior Convertible * **Senior Sub. Conv.** &#x3D; Senior Subordinated Convertible * **Sub. Conv.** &#x3D; Subordinated Convertible * **Junior Conv.** &#x3D; Junior Convertible * **Junior Sub. Conv.** &#x3D; Junior Subordinated Convertible * **Preferred** * **Other**  | [optional] 
**AmountOutstanding** | **decimal?** | Balance sheet amount outstanding. | [optional] 
**Currency** | **string** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**CouponRate** | **decimal?** | Coupon rate for the debt instrument. | [optional] 
**CouponType** | **string** | Type of debt instrument. | [optional] 
**YieldToWorst** | **decimal?** | Most recent annual yield to worst value for the debt instrument. | [optional] 
**IssueDate** | **DateTime?** | Issue date for the debt instrument. | [optional] 
**ReportDate** | **DateTime?** | Reporting date for the debt instrument. | [optional] 
**MaturityDate** | **DateTime?** | Maturity date for the debt instrument. | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

