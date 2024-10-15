

# Detail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | Identifier for the debt instrument. |  [optional]
**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) | Type of debt instrument. |  [optional]
**description** | **String** | Desription of the debt instrument. |  [optional]
**seniority** | [**SeniorityEnum**](#SeniorityEnum) | Textual description of the instrument seniority type: * **Senior Unsecured** * **Senior Secured** * **Senior Subordinated** * **Collateralized** * **Subordinated** * **Junior** * **Junior Subordinated** * **Senior Conv.** &#x3D; Senior Convertible * **Senior Sub. Conv.** &#x3D; Senior Subordinated Convertible * **Sub. Conv.** &#x3D; Subordinated Convertible * **Junior Conv.** &#x3D; Junior Convertible * **Junior Sub. Conv.** &#x3D; Junior Subordinated Convertible * **Preferred** * **Other**  |  [optional]
**amountOutstanding** | **BigDecimal** | Balance sheet amount outstanding. |  [optional]
**currency** | **String** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**couponRate** | **BigDecimal** | Coupon rate for the debt instrument. |  [optional]
**couponType** | [**CouponTypeEnum**](#CouponTypeEnum) | Type of debt instrument. |  [optional]
**yieldToWorst** | **BigDecimal** | Most recent annual yield to worst value for the debt instrument. |  [optional]
**issueDate** | **LocalDate** | Issue date for the debt instrument. |  [optional]
**reportDate** | **LocalDate** | Reporting date for the debt instrument. |  [optional]
**maturityDate** | **LocalDate** | Maturity date for the debt instrument. |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]



## Enum: InstrumentTypeEnum

Name | Value
---- | -----
REVOLVING_CREDIT | &quot;Revolving Credit&quot;
TERM_LOANS | &quot;Term Loans&quot;
ST_DEBT_TOTAL | &quot;ST Debt Total&quot;
NOTES_BONDS | &quot;Notes/Bonds&quot;
OTHER | &quot;Other&quot;



## Enum: SeniorityEnum

Name | Value
---- | -----
SENIOR_UNSECURED | &quot;Senior Unsecured&quot;
SENIOR_SECURED | &quot;Senior Secured&quot;
SENIOR_SUBORDINATED | &quot;Senior Subordinated&quot;
COLLATERALIZED | &quot;Collateralized&quot;
SUBORDINATED | &quot;Subordinated&quot;
JUNIOR | &quot;Junior&quot;
JUNION_SUBORDINATED | &quot;Junion Subordinated&quot;
SENIOR_CONV_ | &quot;Senior Conv.&quot;
SENIOR_SUB_CONV_ | &quot;Senior Sub. Conv.&quot;
SUB_CONV_ | &quot;Sub. Conv.&quot;
JUNIOR_CONV_ | &quot;Junior Conv.&quot;
JUNION_SUB_CONV_ | &quot;Junion Sub. Conv.&quot;
PREFERRED | &quot;Preferred&quot;
OTHER | &quot;Other&quot;



## Enum: CouponTypeEnum

Name | Value
---- | -----
VARIABLE | &quot;Variable&quot;
FIXED | &quot;Fixed&quot;
COND | &quot;Cond&quot;
ZERO | &quot;Zero&quot;


## Implemented Interfaces

* Serializable


