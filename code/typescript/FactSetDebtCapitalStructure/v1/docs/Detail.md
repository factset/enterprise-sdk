# factsetdebtcapitalstructure.Detail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | Identifier for the debt instrument. | [optional] 
**instrumentType** | **String** | Type of debt instrument. | [optional] 
**description** | **String** | Desription of the debt instrument. | [optional] 
**seniority** | **String** | Textual description of the instrument seniority type: * **Senior Unsecured** * **Senior Secured** * **Senior Subordinated** * **Collateralized** * **Subordinated** * **Junior** * **Junior Subordinated** * **Senior Conv.** &#x3D; Senior Convertible * **Senior Sub. Conv.** &#x3D; Senior Subordinated Convertible * **Sub. Conv.** &#x3D; Subordinated Convertible * **Junior Conv.** &#x3D; Junior Convertible * **Junior Sub. Conv.** &#x3D; Junior Subordinated Convertible * **Preferred** * **Other**  | [optional] 
**amountOutstanding** | **Number** | Balance sheet amount outstanding. | [optional] 
**currency** | **String** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**couponRate** | **Number** | Coupon rate for the debt instrument. | [optional] 
**couponType** | **String** | Type of debt instrument. | [optional] 
**yieldToWorst** | **Number** | Most recent annual yield to worst value for the debt instrument. | [optional] 
**issueDate** | **Date** | Issue date for the debt instrument. | [optional] 
**reportDate** | **Date** | Reporting date for the debt instrument. | [optional] 
**maturityDate** | **Date** | Maturity date for the debt instrument. | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 



## Enum: InstrumentTypeEnum


* `Revolving Credit` (value: `"Revolving Credit"`)

* `Term Loans` (value: `"Term Loans"`)

* `ST Debt Total` (value: `"ST Debt Total"`)

* `Notes/Bonds` (value: `"Notes/Bonds"`)

* `Other` (value: `"Other"`)





## Enum: SeniorityEnum


* `Senior Unsecured` (value: `"Senior Unsecured"`)

* `Senior Secured` (value: `"Senior Secured"`)

* `Senior Subordinated` (value: `"Senior Subordinated"`)

* `Collateralized` (value: `"Collateralized"`)

* `Subordinated` (value: `"Subordinated"`)

* `Junior` (value: `"Junior"`)

* `Junion Subordinated` (value: `"Junion Subordinated"`)

* `Senior Conv.` (value: `"Senior Conv."`)

* `Senior Sub. Conv.` (value: `"Senior Sub. Conv."`)

* `Sub. Conv.` (value: `"Sub. Conv."`)

* `Junior Conv.` (value: `"Junior Conv."`)

* `Junion Sub. Conv.` (value: `"Junion Sub. Conv."`)

* `Preferred` (value: `"Preferred"`)

* `Other` (value: `"Other"`)





## Enum: CouponTypeEnum


* `Variable` (value: `"Variable"`)

* `Fixed` (value: `"Fixed"`)

* `Cond` (value: `"Cond"`)

* `Zero` (value: `"Zero"`)




